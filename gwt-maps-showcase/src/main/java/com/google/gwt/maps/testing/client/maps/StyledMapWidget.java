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
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.controls.MapTypeControlOptions;
import com.google.gwt.maps.client.controls.MapTypeStyle;
import com.google.gwt.maps.client.maptypes.MapTypeStyleElementType;
import com.google.gwt.maps.client.maptypes.MapTypeStyleFeatureType;
import com.google.gwt.maps.client.maptypes.MapTypeStyler;
import com.google.gwt.maps.client.maptypes.StyledMapType;
import com.google.gwt.maps.client.maptypes.StyledMapTypeOptions;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Example of using styled maps. <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#StyledMapType"
 * >Styled Map API Doc</a>
 */
public class StyledMapWidget extends Composite {

  // give your new map type a name
  public final static String MY_COOL_MAPTYPE = "eyeBleedMap";

  private final VerticalPanel pWidget;
  private MapWidget mapWidget;

  public StyledMapWidget() {
    pWidget = new VerticalPanel();
    initWidget(pWidget);

    draw();
  }

  private void draw() {

    pWidget.clear();
    pWidget
        .add(new HTML(
            "<br><div class='styledExample'>Styled Map Example w/ <span>Blue highways</span>, <span>Black landscape</span>, and <span>Red roads</span></div>"));
    drawMap();
  }

  private void drawMap() {

    /** Create all your styles **/
    // Style the roads
    MapTypeStyle style1 = MapTypeStyle.newInstance();
    style1.setElementType(MapTypeStyleElementType.GEOMETRY);
    style1.setFeatureType(MapTypeStyleFeatureType.ROAD);
    style1.setStylers(new MapTypeStyler[] { MapTypeStyler.newHueStyler("#CC3232"),
        MapTypeStyler.newSaturationStyler(100), MapTypeStyler.newLightnessStyler(-45) });

    // Style the landscape

    MapTypeStyle style2 = MapTypeStyle.newInstance();
    style2.setElementType(MapTypeStyleElementType.GEOMETRY);
    style2.setFeatureType(MapTypeStyleFeatureType.LANDSCAPE);
    style2.setStylers(new MapTypeStyler[] { MapTypeStyler.newHueStyler("#000000"),
        MapTypeStyler.newSaturationStyler(75), MapTypeStyler.newLightnessStyler(-100) });

    // Style the highways
    MapTypeStyle style3 = MapTypeStyle.newInstance();
    style3.setElementType(MapTypeStyleElementType.GEOMETRY);
    style3.setFeatureType(MapTypeStyleFeatureType.ROAD__HIGHWAY);
    style3.setStylers(new MapTypeStyler[] { MapTypeStyler.newHueStyler("#0000FF"),
        MapTypeStyler.newSaturationStyler(5), });

    // consolidate all style information
    MapTypeStyle[] array = { style1, style2, style3 };

    JsArray<MapTypeStyle> styles = ArrayHelper.toJsArray(array); // JS needs
                                                                 // JSArray,
                                                                 // convert
    StyledMapTypeOptions options = StyledMapTypeOptions.newInstance();
    options.setName("My Eyes Hurt!");// the name that appears on map controls
    options.setAlt("Hold onto your retinas!");
    StyledMapType customMapType = StyledMapType.newInstance(styles, options); // apply
                                                                              // to
                                                                              // new
                                                                              // styled
                                                                              // map

    /** Create you map **/
    // basic map options
    LatLng center = LatLng.newInstance(40.6743890, -73.9455);
    MapOptions opts = MapOptions.newInstance();
    opts.setZoom(12);
    opts.setCenter(center);
    opts.setMapTypeId(MapTypeId.ROADMAP);

    // NOTE: using the xString methods here on Map options b/c it can handle
    // either MapTypeId|string, but Java cannot.
    // If using custom id's, make sure to use the String methods (i.e. in below
    // block)
    MapTypeControlOptions controlOptions = MapTypeControlOptions.newInstance();
    controlOptions.setMapTypeIds(new String[] { MapTypeId.ROADMAP.toString(), MY_COOL_MAPTYPE });
    opts.setMapTypeControlOptions(controlOptions);
    opts.setMapTypeId(MY_COOL_MAPTYPE);

    mapWidget = new MapWidget(opts);
    pWidget.add(mapWidget);
    mapWidget.setSize("750px", "500px");

    // finally add the map to the type registry
    mapWidget.setCustomMapType(MY_COOL_MAPTYPE, customMapType);

  }

}
