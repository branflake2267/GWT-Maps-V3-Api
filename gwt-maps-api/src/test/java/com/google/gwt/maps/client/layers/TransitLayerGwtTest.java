package com.google.gwt.maps.client.layers;

/*
 * #%L
 * GWT Maps API V3 - Core API
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

import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#TransitLayer" >TransitLayer API
 * Doc</a>
 */
public class TransitLayerGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  public void testLayerOnMap() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng center = LatLng.newInstance(49.496675, -102.65625);
        MapOptions opts = MapOptions.newInstance();
        opts.setZoom(4);
        opts.setCenter(center);
        opts.setMapTypeId(MapTypeId.ROADMAP);

        MapWidget mapWidget = new MapWidget(opts);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        TransitLayer o = TransitLayer.newInstance();

        // test clearing from map
        o.setMap(null);
        assertNull(o.getMap());

        o.setMap(mapWidget);
        MapWidget expected = o.getMap();
        assertEquals(mapWidget.getCenter().getToString(), expected.getCenter().getToString());

        // test clearing from map
        o.setMap(null);
        assertNull(o.getMap());

        finishTest();
      }
    });

  }

  public void testLoadNewInstance() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        @SuppressWarnings("unused")
        TransitLayer o = TransitLayer.newInstance();
        finishTest();
      }
    });

  }
}
