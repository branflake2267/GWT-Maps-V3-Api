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
import com.google.gwt.maps.client.controls.MapTypeControlOptions;
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
public class ControlsMapWidget extends Composite {

  private VerticalPanel pWidget;

  private MapWidget mapWidget;

  public ControlsMapWidget() {
    pWidget = new VerticalPanel();
    initWidget(pWidget);

    draw();
  }

  private void draw() {

    pWidget.clear();

    pWidget.add(new HTML("<br>Basic Map Controls Position Example"));

    drawMap();

    drawMapAds();
  }

  private void drawMap() {

    MapTypeControlOptions controlOptions = MapTypeControlOptions.newInstance();
    controlOptions.setMapTypeIds(MapTypeId.values()); // use all of them
    controlOptions.setPosition(ControlPosition.RIGHT_CENTER);

    LatLng center = LatLng.newInstance(49.496675, -102.65625);
    MapOptions options = MapOptions.newInstance();
    options.setZoom(4);
    options.setCenter(center);
    options.setMapTypeId(MapTypeId.HYBRID);
    options.setMapTypeControlOptions(controlOptions);

    mapWidget = new MapWidget(options);
    pWidget.add(mapWidget);
    mapWidget.setSize("750px", "500px");

    mapWidget.addClickHandler(new ClickMapHandler() {
      public void onEvent(ClickMapEvent event) {
        // TODO fix the event getting, getting ....
        GWT.log("clicked on latlng=" + event.getMouseEvent().getLatLng());
      }
    });
  }

  private void drawMapAds() {

    AdUnitOptions options = AdUnitOptions.newInstance();
    options.setFormat(AdFormat.LEADERBOARD);
    options.setPosition(ControlPosition.BOTTOM_CENTER);
    options.setMap(mapWidget);
    options.setPublisherId("pub-0032065764310410");
    options.setChannelNumber("4000893900");

    AdUnitWidget adUnit = new AdUnitWidget(options);

    adUnit.addChannelNumberChangeHandler(new ChannelNumberChangeMapHandler() {
      public void onEvent(ChannelNumberChangeMapEvent event) {
      }
    });

    adUnit.addFormatChangeHandler(new FormatChangeMapHandler() {
      public void onEvent(FormatChangeMapEvent event) {
      }
    });

    adUnit.addMapChangeHandler(new MapChangeMapHandler() {
      public void onEvent(MapChangeMapEvent event) {
      }
    });

    adUnit.addPositionChangeHandler(new PositionChangeMapHandler() {
      public void onEvent(PositionChangeMapEvent event) {
      }
    });

  }

}
