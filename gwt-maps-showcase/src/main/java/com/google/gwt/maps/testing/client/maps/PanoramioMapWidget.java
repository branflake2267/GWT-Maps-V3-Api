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
import com.google.gwt.maps.client.base.Size;
import com.google.gwt.maps.client.controls.ControlPosition;
import com.google.gwt.maps.client.events.channelnumber.ChannelNumberChangeMapEvent;
import com.google.gwt.maps.client.events.channelnumber.ChannelNumberChangeMapHandler;
import com.google.gwt.maps.client.events.click.ClickMapEvent;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.maps.client.events.format.FormatChangeMapEvent;
import com.google.gwt.maps.client.events.format.FormatChangeMapHandler;
import com.google.gwt.maps.client.events.mapchange.MapChangeMapEvent;
import com.google.gwt.maps.client.events.mapchange.MapChangeMapHandler;
import com.google.gwt.maps.client.events.panoramiomouse.PanoramioMouseMapEvent;
import com.google.gwt.maps.client.events.panoramiomouse.PanoramioMouseMapHandler;
import com.google.gwt.maps.client.events.position.PositionChangeMapEvent;
import com.google.gwt.maps.client.events.position.PositionChangeMapHandler;
import com.google.gwt.maps.client.panoramiolib.PanoramioFeature;
import com.google.gwt.maps.client.panoramiolib.PanoramioLayer;
import com.google.gwt.maps.client.panoramiolib.PanoramioLayerOptions;
import com.google.gwt.user.client.ui.Button;
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
public class PanoramioMapWidget extends Composite {

  private final VerticalPanel pWidget;

  private MapWidget mapWidget;

  private PanoramioLayer panoramioLayer;

  public PanoramioMapWidget() {
    pWidget = new VerticalPanel();
    initWidget(pWidget);

    draw();
  }

  private void draw() {

    pWidget.clear();

    pWidget.add(new HTML("<br>Panoramio"));

    final Button toggleButton = new Button();
    toggleButton.setText("Show Brandon's Pictures");

    // on click clear to show everyone, or set to a specific user
    toggleButton.addClickHandler(new ClickHandler() {

      @Override
      public void onClick(ClickEvent event) {
        if (panoramioLayer.getUserId() == null) {
          panoramioLayer.setUserId("2597317");
          toggleButton.setText("Show Everyone's Pictures");
        } else {
          panoramioLayer.setUserId(null);
          toggleButton.setText("Show Brandon's Pictures");
        }

      }
    });
    pWidget.add(toggleButton);

    drawMap();

    drawPanoramio();
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
      @Override
      public void onEvent(ClickMapEvent event) {
        // TODO fix the event getting, getting ....
        GWT.log("clicked on latlng=" + event.getMouseEvent().getLatLng());
      }
    });
  }

  private void drawPanoramio() {
    PanoramioLayerOptions optionsPano = PanoramioLayerOptions.newInstance();
    optionsPano.setClickable(true);
    optionsPano.setMap(mapWidget);
    optionsPano.setSuppressInfoWindows(false);
    // optionsPano.setTag("hawaii");
    // optionsPano.setUserId("2597317");
    panoramioLayer = PanoramioLayer.newInstance(optionsPano);

    panoramioLayer.addClickHandler(new PanoramioMouseMapHandler() {
      @Override
      public void onEvent(PanoramioMouseMapEvent event) {

        @SuppressWarnings("unused")
        PanoramioFeature feature = event.getFeatureDetails();

        @SuppressWarnings("unused")
        String info = event.getInfoWindowHtml();

        @SuppressWarnings("unused")
        LatLng latlng = event.getLatLng();

        @SuppressWarnings("unused")
        Size pixeloffset = event.getPixelOffset();
      }
    });
  }

  // TODO implement this or drop the code
  @SuppressWarnings("unused")
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
