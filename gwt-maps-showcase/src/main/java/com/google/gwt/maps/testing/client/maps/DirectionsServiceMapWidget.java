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

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.events.click.ClickMapEvent;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.maps.client.services.DirectionsRenderer;
import com.google.gwt.maps.client.services.DirectionsRendererOptions;
import com.google.gwt.maps.client.services.DirectionsRequest;
import com.google.gwt.maps.client.services.DirectionsResult;
import com.google.gwt.maps.client.services.DirectionsResultHandler;
import com.google.gwt.maps.client.services.DirectionsService;
import com.google.gwt.maps.client.services.DirectionsStatus;
import com.google.gwt.maps.client.services.DirectionsWaypoint;
import com.google.gwt.maps.client.services.Distance;
import com.google.gwt.maps.client.services.DistanceMatrixElementStatus;
import com.google.gwt.maps.client.services.DistanceMatrixRequest;
import com.google.gwt.maps.client.services.DistanceMatrixRequestHandler;
import com.google.gwt.maps.client.services.DistanceMatrixResponse;
import com.google.gwt.maps.client.services.DistanceMatrixResponseElement;
import com.google.gwt.maps.client.services.DistanceMatrixResponseRow;
import com.google.gwt.maps.client.services.DistanceMatrixService;
import com.google.gwt.maps.client.services.DistanceMatrixStatus;
import com.google.gwt.maps.client.services.Duration;
import com.google.gwt.maps.client.services.TravelMode;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/layers.html#FusionTables"
 * >FusionTables API Doc</a>
 */
public class DirectionsServiceMapWidget extends Composite {

  private VerticalPanel pWidget;
  private MapWidget mapWidget;
  private HTML htmlDistanceMatrixService = new HTML("&nbsp;");

  public DirectionsServiceMapWidget() {
    pWidget = new VerticalPanel();
    initWidget(pWidget);

    draw();
  }

  private void draw() {
    pWidget.clear();
    pWidget.add(new HTML("<br/>"));

    HorizontalPanel hp = new HorizontalPanel();
    pWidget.add(hp);
    hp.add(new HTML("Directions Service&nbsp;&nbsp;&nbsp;&nbsp;"));
    hp.add(htmlDistanceMatrixService);

    drawMap();
    drawDirectionsWithMidPoint();
  }

  private void drawMap() {
    LatLng center = LatLng.newInstance(48.11, -123.24);
    MapOptions opts = MapOptions.newInstance();
    opts.setZoom(8);
    opts.setCenter(center);
    opts.setMapTypeId(MapTypeId.HYBRID);

    mapWidget = new MapWidget(opts);
    pWidget.add(mapWidget);
    mapWidget.setSize("750px", "500px");

    mapWidget.addClickHandler(new ClickMapHandler() {
      public void onEvent(ClickMapEvent event) {
      }
    });
  }

  private void drawDirectionsWithMidPoint() {
    DirectionsRendererOptions options = DirectionsRendererOptions.newInstance();
    final DirectionsRenderer directionsDisplay = DirectionsRenderer.newInstance(options);
    directionsDisplay.setMap(mapWidget);

    String origin = "Arlington, WA";
    String destination = "Seattle, WA";

    DirectionsRequest request = DirectionsRequest.newInstance();
    request.setOrigin(origin);
    request.setDestination(destination);
    request.setTravelMode(TravelMode.DRIVING);
    request.setOptimizeWaypoints(true);

    // Stop over
    LatLng stopOverWayPoint = LatLng.newInstance(47.8587, -121.9697);
    DirectionsWaypoint waypoint = DirectionsWaypoint.newInstance();
    waypoint.setStopOver(true);
    waypoint.setLocation(stopOverWayPoint);

    JsArray<DirectionsWaypoint> waypoints = JsArray.createArray().cast();
    waypoints.push(waypoint);
    request.setWaypoints(waypoints);

    DirectionsService o = DirectionsService.newInstance();
    o.route(request, new DirectionsResultHandler() {
      public void onCallback(DirectionsResult result, DirectionsStatus status) {
        if (status == DirectionsStatus.OK) {
          directionsDisplay.setDirections(result);
          getDistance();
        } else if (status == DirectionsStatus.INVALID_REQUEST) {

        } else if (status == DirectionsStatus.MAX_WAYPOINTS_EXCEEDED) {

        } else if (status == DirectionsStatus.NOT_FOUND) {

        } else if (status == DirectionsStatus.OVER_QUERY_LIMIT) {

        } else if (status == DirectionsStatus.REQUEST_DENIED) {

        } else if (status == DirectionsStatus.UNKNOWN_ERROR) {

        } else if (status == DirectionsStatus.ZERO_RESULTS) {

        }

      }
    });
  }

  private void getDistance() {
    String origin = "Arlington, WA";
    String destination = "Seattle, WA";

    String[] ao = new String[1];
    ao[0] = origin;
    JsArrayString origins = ArrayHelper.toJsArrayString(ao);

    String[] ad = new String[1];
    ad[0] = destination;
    JsArrayString destinations = ArrayHelper.toJsArrayString(ad);

    DistanceMatrixRequest request = DistanceMatrixRequest.newInstance();
    request.setOrigins(origins);
    request.setDestinations(destinations);
    request.setTravelMode(TravelMode.DRIVING);

    DistanceMatrixService o = DistanceMatrixService.newInstance();
    o.getDistanceMatrix(request, new DistanceMatrixRequestHandler() {
      public void onCallback(DistanceMatrixResponse response, DistanceMatrixStatus status) {
        GWT.log("status=" + status.value());

        if (status == DistanceMatrixStatus.INVALID_REQUEST) {

        } else if (status == DistanceMatrixStatus.MAX_DIMENSIONS_EXCEEDED) {

        } else if (status == DistanceMatrixStatus.MAX_ELEMENTS_EXCEEDED) {

        } else if (status == DistanceMatrixStatus.OK) {

          @SuppressWarnings("unused")
          JsArrayString dest = response.getDestinationAddresses();
          @SuppressWarnings("unused")
          JsArrayString org = response.getOriginAddresses();
          JsArray<DistanceMatrixResponseRow> rows = response.getRows();

          GWT.log("rows.length=" + rows.length());
          DistanceMatrixResponseRow d = rows.get(0);
          JsArray<DistanceMatrixResponseElement> elements = d.getElements();
          for (int i = 0; i < elements.length(); i++) {
            DistanceMatrixResponseElement e = elements.get(i);
            Distance distance = e.getDistance();
            Duration duration = e.getDuration();

            @SuppressWarnings("unused")
            DistanceMatrixElementStatus st = e.getStatus();
            GWT.log("distance=" + distance.getText() + " value=" + distance.getValue());
            GWT.log("duration=" + duration.getText() + " value=" + duration.getValue());

            String html = "&nbsp;&nbsp;Distance=" + distance.getText() + " Duration=" + duration.getText() + " ";
            htmlDistanceMatrixService.setHTML(html);
          }

        } else if (status == DistanceMatrixStatus.OVER_QUERY_LIMIT) {

        } else if (status == DistanceMatrixStatus.REQUEST_DENIED) {

        } else if (status == DistanceMatrixStatus.UNKNOWN_ERROR) {

        }

      }
    });

  }

}
