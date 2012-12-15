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
import com.google.gwt.maps.client.adsense.AdFormat;
import com.google.gwt.maps.client.adsense.AdUnitOptions;
import com.google.gwt.maps.client.adsense.AdUnitWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.controls.ControlPosition;
import com.google.gwt.maps.client.events.MouseEvent;
import com.google.gwt.maps.client.events.channelnumber.ChannelNumberChangeMapEvent;
import com.google.gwt.maps.client.events.channelnumber.ChannelNumberChangeMapHandler;
import com.google.gwt.maps.client.events.click.ClickMapEvent;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.maps.client.events.format.FormatChangeMapEvent;
import com.google.gwt.maps.client.events.format.FormatChangeMapHandler;
import com.google.gwt.maps.client.events.mapchange.MapChangeMapEvent;
import com.google.gwt.maps.client.events.mapchange.MapChangeMapHandler;
import com.google.gwt.maps.client.events.position.PositionChangeMapEvent;
import com.google.gwt.maps.client.events.position.PositionChangeMapHandler;
import com.google.gwt.maps.client.overlays.InfoWindow;
import com.google.gwt.maps.client.overlays.InfoWindowOptions;
import com.google.gwt.maps.client.overlays.Marker;
import com.google.gwt.maps.client.overlays.MarkerOptions;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * 
 * <br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/layers.html#FusionTables"
 * >FusionTables API Doc</a>
 */
public class BasicMapWidget extends Composite {

  private final VerticalPanel pWidget;

  private MapWidget mapWidget;

  public BasicMapWidget() {
    pWidget = new VerticalPanel();
    initWidget(pWidget);

    draw();
  }

  private void draw() {

    pWidget.clear();

    pWidget.add(new HTML("<br>Basic Map Example. With an AdUnit"));

    drawMap();

    drawMapAds();

    drawMarker();
  }

  private void drawMarker() {
    LatLng center = LatLng.newInstance(47.8, -121.4);
    MarkerOptions options = MarkerOptions.newInstance();
    options.setPosition(center);
    options.setTitle("Hello World");

    final Marker marker = Marker.newInstance(options);
    marker.setMap(mapWidget);

    marker.addClickHandler(new ClickMapHandler() {
      @Override
      public void onEvent(ClickMapEvent event) {
        drawInfoWindow(marker, event.getMouseEvent());
      }
    });
  }

  // TODO implement this method or drop it
  @SuppressWarnings("unused")
  private void drawMarker2() {
    LatLng center = LatLng.newInstance(47.8, -121.4);
    MarkerOptions options = MarkerOptions.newInstance();
    options.setPosition(center);
    options.setTitle("Hello World");

    final Marker marker = Marker.newInstance(options);

  }

  protected void drawInfoWindow(Marker marker, MouseEvent mouseEvent) {
    if (marker == null || mouseEvent == null) {
      return;
    }

    HTML html = new HTML("You clicked on: " + mouseEvent.getLatLng().getToString());

    InfoWindowOptions options = InfoWindowOptions.newInstance();
    options.setContent(html);
    InfoWindow iw = InfoWindow.newInstance(options);
    iw.open(mapWidget, marker);
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
      @Override
      public void onEvent(ClickMapEvent event) {
        // TODO fix the event getting, getting ....
        GWT.log("clicked on latlng=" + event.getMouseEvent().getLatLng());
      }
    });
  }

  private void drawMapAds() {

    AdUnitOptions options = AdUnitOptions.newInstance();
    options.setFormat(AdFormat.HALF_BANNER);
    options.setPosition(ControlPosition.RIGHT_CENTER);
    options.setMap(mapWidget);
    options.setPublisherId("pub-0032065764310410");
    options.setChannelNumber("4000893900");

    AdUnitWidget adUnit = new AdUnitWidget(options);

    adUnit.addChannelNumberChangeHandler(new ChannelNumberChangeMapHandler() {
      @Override
      public void onEvent(ChannelNumberChangeMapEvent event) {
      }
    });

    adUnit.addFormatChangeHandler(new FormatChangeMapHandler() {
      @Override
      public void onEvent(FormatChangeMapEvent event) {
      }
    });

    adUnit.addMapChangeHandler(new MapChangeMapHandler() {
      @Override
      public void onEvent(MapChangeMapEvent event) {
      }
    });

    adUnit.addPositionChangeHandler(new PositionChangeMapHandler() {
      @Override
      public void onEvent(PositionChangeMapEvent event) {
      }
    });

  }

}
