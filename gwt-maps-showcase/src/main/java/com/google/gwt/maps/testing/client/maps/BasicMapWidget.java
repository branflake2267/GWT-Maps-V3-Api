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
import com.google.gwt.maps.client.overlays.Animation;
import com.google.gwt.maps.client.overlays.InfoWindow;
import com.google.gwt.maps.client.overlays.InfoWindowOptions;
import com.google.gwt.maps.client.overlays.Marker;
import com.google.gwt.maps.client.overlays.MarkerOptions;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class BasicMapWidget extends Composite {

  private final VerticalPanel pWidget;
  private MapWidget mapWidget;

  private Marker markerBasic;
  private Marker markerBouncing;
  private Marker markerDrop;
  
  public BasicMapWidget() {
    pWidget = new VerticalPanel();
    initWidget(pWidget);

    draw();
  }

  private void draw() {
    Button addBounceMarkerButton = new Button("Add Marker with Bounce");
    addBounceMarkerButton.addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        if (markerBouncing != null) {
          markerBouncing.clear();
        }
        drawMarkerWithBounceAnimation();
      }
    });
    
    Button addDropMarkerButton = new Button("Add Marker with Drop");
    addDropMarkerButton.addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        if (markerDrop != null) {
          markerDrop.clear();
        }
        drawMarkerWithDropAnimation();
      }
    });
    
    Button stopAnimationsButton = new Button("Stop Animations");
    stopAnimationsButton.addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        if (markerBasic != null) {
          markerBasic.setAnimation(Animation.STOPANIMATION);
        }
        if (markerBouncing != null) {
          markerBouncing.setAnimation(Animation.STOPANIMATION);
        }
        if (markerDrop != null) {
          markerDrop.setAnimation(Animation.STOPANIMATION);
        }
      }
    });
    
    Button startAnimationsButton = new Button("Start Animations");
    startAnimationsButton.addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        if (markerBasic != null) {
          markerBasic.setAnimation(Animation.BOUNCE);
        }
        if (markerBouncing != null) {
          markerBouncing.setAnimation(Animation.BOUNCE);
        }
        if (markerDrop != null) { 
          markerDrop.setAnimation(Animation.DROP);
        }
      }
    });
    
    // basic controls to test markers
    HorizontalPanel hp = new HorizontalPanel();
    hp.add(new HTML("<br>Basic Map Example. With an AdUnit"));
    hp.add(addBounceMarkerButton);
    hp.add(new HTML("&nbsp;"));
    hp.add(addDropMarkerButton);
    hp.add(new HTML("&nbsp;"));
    hp.add(startAnimationsButton);
    hp.add(new HTML("&nbsp;"));
    hp.add(stopAnimationsButton);
    hp.setCellVerticalAlignment(addBounceMarkerButton, VerticalPanel.ALIGN_BOTTOM);
    hp.setCellVerticalAlignment(addDropMarkerButton, VerticalPanel.ALIGN_BOTTOM);
    hp.setCellVerticalAlignment(startAnimationsButton, VerticalPanel.ALIGN_BOTTOM);
    hp.setCellVerticalAlignment(stopAnimationsButton, VerticalPanel.ALIGN_BOTTOM);

    pWidget.clear();
    pWidget.add(hp);

    drawMap();
    drawMapAds();
    drawBasicMarker();
  }

  private void drawBasicMarker() {
    LatLng center = LatLng.newInstance(47.8, -121.4);
    MarkerOptions options = MarkerOptions.newInstance();
    options.setPosition(center);
    options.setTitle("Hello World");

    markerBasic = Marker.newInstance(options);
    markerBasic.setMap(mapWidget);

    markerBasic.addClickHandler(new ClickMapHandler() {
      @Override
      public void onEvent(ClickMapEvent event) {
        drawInfoWindow(markerBasic, event.getMouseEvent());
      }
    });
  }

  private void drawMarkerWithBounceAnimation() {
    LatLng center = LatLng.newInstance(46.33, -113.81);
    MarkerOptions options = MarkerOptions.newInstance();
    options.setPosition(center);
    options.setTitle("Hi I'm marker 2. Thanks for clicking on me.");
    options.setAnimation(Animation.BOUNCE);

    markerBouncing = Marker.newInstance(options);
    markerBouncing.setMap(mapWidget);
  }
  
  private void drawMarkerWithDropAnimation() {
    LatLng center = LatLng.newInstance(42.33, -120.81);
    MarkerOptions options = MarkerOptions.newInstance();
    options.setPosition(center);
    options.setTitle("Thanks for clicking on me.");
    options.setAnimation(Animation.DROP);

    markerDrop = Marker.newInstance(options);
    markerDrop.setMap(mapWidget);
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
