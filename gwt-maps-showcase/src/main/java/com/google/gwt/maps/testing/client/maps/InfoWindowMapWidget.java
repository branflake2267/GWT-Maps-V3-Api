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
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.events.MouseEvent;
import com.google.gwt.maps.client.events.click.ClickMapEvent;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.maps.client.events.tiles.TilesLoadedMapEvent;
import com.google.gwt.maps.client.events.tiles.TilesLoadedMapHandler;
import com.google.gwt.maps.client.overlays.InfoWindow;
import com.google.gwt.maps.client.overlays.InfoWindowOptions;
import com.google.gwt.maps.client.overlays.Marker;
import com.google.gwt.maps.client.overlays.MarkerOptions;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

public class InfoWindowMapWidget extends Composite {

  private VerticalPanel pWidget;
  private MapWidget mapWidget;

  public InfoWindowMapWidget() {
    pWidget = new VerticalPanel();
    initWidget(pWidget);

    draw();
  }

  private void draw() {
    pWidget.clear();
    pWidget.add(new HTML("<br>Maps with Info Windows - click on marker"));

    drawMap();
    drawInfoWindowOnMapCenter();
    drawMarker1();
  }

  private void drawInfoWindowOnMapCenter() {
    HTML html = new HTML("Center: " + mapWidget.getCenter().getToString());

    InfoWindowOptions options = InfoWindowOptions.newInstance();
    options.setContent(html);
    options.setPosition(mapWidget.getCenter());

    InfoWindow iw = InfoWindow.newInstance(options);
    iw.open(mapWidget);
  }

  private void drawMarker1() {
    LatLng center = LatLng.newInstance(47.8, -121.4);
    MarkerOptions options = MarkerOptions.newInstance();
    options.setPosition(center);
    options.setTitle("Hello World");

    final Marker marker = Marker.newInstance(options);
    marker.setMap(mapWidget);

    marker.addClickHandler(new ClickMapHandler() {
      public void onEvent(ClickMapEvent event) {
        drawInfoWindow(marker, event.getMouseEvent());
      }
    });
  }

  protected void drawInfoWindow(final Marker marker, MouseEvent mouseEvent) {
    if (marker == null || mouseEvent == null) {
      return;
    }

    HTML html = new HTML("Why did you click on me? <br/> You clicked on: " + mouseEvent.getLatLng().getToString());

    Button b1 = new Button("b1");
    b1.addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        Window.alert("b1 clicked");
      }
    });

    Button b2 = new Button("b2");
    b2.addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        Window.alert("b2 clicked");
      }
    });

    VerticalPanel vp = new VerticalPanel();
    vp.add(html);
    vp.add(b1);
    vp.add(b2);

    InfoWindowOptions options = InfoWindowOptions.newInstance();
    options.setContent(vp);

    InfoWindow iw = InfoWindow.newInstance(options);
    iw.open(mapWidget, marker);

    // If you want to clear widgets, Use options.clear() to remove the widgets
    // from map
    // options.clear();
  }

  private void drawMap() {
    LatLng center = LatLng.newInstance(49.496675, -102.65625);
    MapOptions opts = MapOptions.newInstance();
    opts.setZoom(4);
    opts.setCenter(center);
    opts.setMapTypeId(MapTypeId.HYBRID);

    mapWidget = new MapWidget(opts);
    pWidget.add(mapWidget);
    mapWidget.setSize("750px", "500px");

    mapWidget.addClickHandler(new ClickMapHandler() {
      public void onEvent(ClickMapEvent event) {
        GWT.log("clicked on latlng=" + event.getMouseEvent().getLatLng());
      }
    });

    mapWidget.addTilesLoadedHandler(new TilesLoadedMapHandler() {
      public void onEvent(TilesLoadedMapEvent event) {
        // Load something after the tiles load
      }
    });
  }

}
