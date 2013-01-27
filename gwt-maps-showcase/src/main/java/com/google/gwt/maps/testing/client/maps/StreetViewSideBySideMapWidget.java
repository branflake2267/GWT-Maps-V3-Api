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

import com.google.gwt.core.client.GWT;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.events.click.ClickMapEvent;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.maps.client.overlays.Marker;
import com.google.gwt.maps.client.overlays.MarkerOptions;
import com.google.gwt.maps.client.streetview.PanoramaByLocationHandler;
import com.google.gwt.maps.client.streetview.PanoramaIdHandler;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaData;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaOptions;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaWidget;
import com.google.gwt.maps.client.streetview.StreetViewPov;
import com.google.gwt.maps.client.streetview.StreetViewService;
import com.google.gwt.maps.client.streetview.StreetViewStatus;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * 
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/streetview"
 * >StreetView API Doc</a>
 */
public class StreetViewSideBySideMapWidget extends Composite {

  private VerticalPanel pWidget;

  private HorizontalPanel hp;

  private MapWidget mapWidget;

  private StreetViewPanoramaWidget wStreetPano;

  private StreetViewService service;

  public StreetViewSideBySideMapWidget() {
    pWidget = new VerticalPanel();
    initWidget(pWidget);

    setup();

    draw();
  }

  private void setup() {
    // setup streetview finding and searching service
    service = StreetViewService.newInstance();
  }

  /**
   * render the components in the widget
   */
  private void draw() {
    pWidget.clear();

    pWidget.add(new HTML("<br>Street View Demo - click on the map"));

    hp = new HorizontalPanel();
    pWidget.add(hp);

    drawMap();

    drawStreeView();

    // allow for things to setup, otherwise getting pano gets null
    Timer t = new Timer() {
      public void run() {
        setupStartingMarker();
      }
    };
    t.schedule(1500); // b/c this widget is first and I have so many loading on
                      // page.
  }

  /**
   * setup the map on the left
   */
  private void drawMap() {
    LatLng berkley = LatLng.newInstance(21.271525, -157.822731);
    MapOptions opts = MapOptions.newInstance();
    opts.setZoom(16);
    opts.setCenter(berkley);
    opts.setMapTypeId(MapTypeId.ROADMAP);

    mapWidget = new MapWidget(opts);
    hp.add(mapWidget);
    mapWidget.setSize("375px", "500px");

    mapWidget.addClickHandler(new ClickMapHandler() {
      public void onEvent(ClickMapEvent event) {
        GWT.log("clicked on latlng=" + event.getMouseEvent().getLatLng());
        processClick(event.getMouseEvent().getLatLng());
      }
    });
  }

  /**
   * setup the street view map on the right
   */
  private void drawStreeView() {
    LatLng position = LatLng.newInstance(21.271525, -157.822731);

    StreetViewPov pov = StreetViewPov.newInstance();
    pov.setHeading(250);
    pov.setZoom(1);
    pov.setPitch(10);

    StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
    options.setPosition(position);
    options.setStreeViewPov(pov);

    wStreetPano = new StreetViewPanoramaWidget(options);
    hp.add(wStreetPano);
    wStreetPano.setSize("375px", "500px");
  }

  private void setupStartingMarker() {
    String pano = wStreetPano.getPano();
    if (pano == null) {
      // TODO hmmmm.... i need a slight delay while everything sets up
      return;
    }
    service.getPanoramaById(pano, new PanoramaIdHandler() {
      public void onCallback(StreetViewPanoramaData data, StreetViewStatus status) {
        LatLng latlng = wStreetPano.getPosition();
        processPanoSearch(latlng, data, status);
      }
    });
  }

  /**
   * get pano data for nearest position
   * 
   * @param latlng
   */
  private void processClick(final LatLng latlng) {
    double radius = 50;

    service.getPanoramaByLocation(latlng, radius, new PanoramaByLocationHandler() {
      public void onCallback(StreetViewPanoramaData data, StreetViewStatus status) {
        processPanoSearch(latlng, data, status);
      }
    });
  }

  private void processPanoSearch(LatLng latlng, final StreetViewPanoramaData data, StreetViewStatus status) {
    if (status != StreetViewStatus.OK) {
      // TODO error
      return;
    }

    if (data == null) {
      // TODO error
      return;
    }

    // setup marker for location clicked
    MarkerOptions options = MarkerOptions.newInstance();
    options.setClickable(true);
    options.setPosition(latlng);
    options.setMap(mapWidget);
    options.setTitle(data.getLocation().getDescription());

    Marker marker = Marker.newInstance(options);

    // move back on click
    marker.addClickHandler(new ClickMapHandler() {
      public void onEvent(ClickMapEvent event) {
        moveStreetView(data);
      }
    });

    // move
    moveStreetView(data);
  }

  protected void moveStreetView(StreetViewPanoramaData data) {
    String markerPanoId = data.getLocation().getPano();

    StreetViewPov pov = StreetViewPov.newInstance();
    pov.setHeading(270);
    pov.setPitch(0);
    pov.setZoom(1);

    wStreetPano.setPano(markerPanoId);
    wStreetPano.setPov(pov);
    wStreetPano.setVisible(true);
  }

}
