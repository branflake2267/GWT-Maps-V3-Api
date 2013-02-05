package com.google.gwt.maps.testing.client.maps;

/*
 * #%L
 * GWT Maps API V3 - Showcase
 * %%
 * Copyright (C) 2011 - 2012 GWT Maps API V3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.util.Date;

import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.services.DirectionsLeg;
import com.google.gwt.maps.client.services.DirectionsRenderer;
import com.google.gwt.maps.client.services.DirectionsRendererOptions;
import com.google.gwt.maps.client.services.DirectionsRequest;
import com.google.gwt.maps.client.services.DirectionsResult;
import com.google.gwt.maps.client.services.DirectionsResultHandler;
import com.google.gwt.maps.client.services.DirectionsRoute;
import com.google.gwt.maps.client.services.DirectionsService;
import com.google.gwt.maps.client.services.DirectionsStatus;
import com.google.gwt.maps.client.services.TransitOptions;
import com.google.gwt.maps.client.services.TravelMode;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Demo showcase for the direction service, using TRANSIT mode.
 */
public class TransitDirectionsServiceMapWidget extends Composite {

  private VerticalPanel pWidget;
  private MapWidget mapWidget;
  private DirectionsRenderer directionsDisplay;
  private HTML htmlStatus = new HTML("&nbsp;");
  private HTML htmlSummary = new HTML();
  private int nRequests;

  private static final double MIN_LAT = 44.77;
  private static final double MAX_LAT = 44.90;
  private static final double MIN_LON = -0.70;
  private static final double MAX_LON = -0.49;
  private static final long DELTA_TIME_MS = 10 * 3600 * 1000;

  public TransitDirectionsServiceMapWidget() {
    pWidget = new VerticalPanel();
    initWidget(pWidget);

    draw();
  }

  private void draw() {
    pWidget.clear();
    pWidget.add(new HTML("<br/>"));

    HorizontalPanel hp = new HorizontalPanel();
    pWidget.add(hp);
    hp.add(new HTML("Transit Directions Service&nbsp;&nbsp;&nbsp;&nbsp;"));
    hp.add(htmlStatus);
    drawMap();
    htmlSummary = new HTML();
    pWidget.add(htmlSummary);

    nRequests = 0;
    Timer directionsTimer = new Timer() {
      @Override
      public void run() {
        drawRandomDirections();
        /*
         * We do not want to make the client to be blacklisted by Google if its browser window is left open for too
         * long... :)
         */
        if (nRequests++ > 10)
          cancel();
      }
    };
    directionsTimer.scheduleRepeating(10000);
    drawRandomDirections();
  }

  private void drawMap() {
    LatLng center = LatLng.newInstance((MAX_LAT + MIN_LAT) / 2.0, (MIN_LON + MAX_LON) / 2.0);
    MapOptions opts = MapOptions.newInstance();
    opts.setZoom(10);
    opts.setCenter(center);
    opts.setMapTypeId(MapTypeId.ROADMAP);

    mapWidget = new MapWidget(opts);
    pWidget.add(mapWidget);
    mapWidget.setSize("750px", "500px");

    DirectionsRendererOptions options = DirectionsRendererOptions.newInstance();
    directionsDisplay = DirectionsRenderer.newInstance(options);
    directionsDisplay.setMap(mapWidget);
  }

  private void drawRandomDirections() {
    /* Compute a direction with random from, to */
    LatLng origin = LatLng.newInstance(Math.random() * (MAX_LAT - MIN_LAT) + MIN_LAT, Math.random()
        * (MAX_LON - MIN_LON) + MIN_LON);
    LatLng destination = LatLng.newInstance(Math.random() * (MAX_LAT - MIN_LAT) + MIN_LAT, Math.random()
        * (MAX_LON - MIN_LON) + MIN_LON);

    DirectionsRequest request = DirectionsRequest.newInstance();
    request.setOrigin(origin);
    request.setDestination(destination);
    request.setTravelMode(TravelMode.TRANSIT);
    TransitOptions transitOptions = TransitOptions.newInstance();
    long departure = System.currentTimeMillis() + Math.round(Math.random() * DELTA_TIME_MS) - DELTA_TIME_MS / 2;
    final Date departureDateTime = new Date(departure);
    transitOptions.setDepartureTime(departureDateTime);
    request.setTransitOptions(transitOptions);
    request.setOptimizeWaypoints(true);

    DirectionsService o = DirectionsService.newInstance();
    o.route(request, new DirectionsResultHandler() {
      public void onCallback(DirectionsResult result, DirectionsStatus status) {
        if (status == DirectionsStatus.OK) {
          directionsDisplay.setDirections(result);
          DirectionsRoute route = result.getRoutes().get(0);
          htmlStatus.setHTML("Request OK");
          updateStatus(route, departureDateTime);
        } else {
          htmlStatus.setHTML("Request error: " + status.value());
        }
      }
    });
  }

  private void updateStatus(DirectionsRoute route, Date departureDateTime) {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < route.getLegs().length(); i++) {
      DirectionsLeg leg = route.getLegs().get(i);
      sb.append(leg.getStart_Address()).append(" &rarr; ").append(leg.getEnd_Address());
      sb.append("<br/>");
      Date arrivalDate = null;
      if (leg.getDuration() != null) {
        sb.append(leg.getDuration().getText()).append(" / ");
        arrivalDate = new Date(departureDateTime.getTime() + leg.getDuration().getValue() * 1000);
      }
      sb.append(leg.getDistance().getText());
      sb.append(" (");
      sb.append(departureDateTime.toString());
      if (arrivalDate != null)
        sb.append(" &rarr; ").append(arrivalDate.toString());
      sb.append(")<br/>");
    }
    htmlSummary.setHTML(sb.toString());
  }
}
