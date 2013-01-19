package com.google.gwt.maps.client.visualizationlib;

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

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.mvc.MVCArray;
import com.google.gwt.user.client.ui.RootPanel;

public class HeatMapLayerOptionsGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.VISUALIZATION };
  }

  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        HeatMapLayerOptions options = HeatMapLayerOptions.newInstance();
        @SuppressWarnings("unused")
        HeatMapLayer layer = HeatMapLayer.newInstance(options);
        finishTest();
        finishTest();
      }
    });
  }

  public void testGetSetMap() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        HeatMapLayerOptions options = HeatMapLayerOptions.newInstance();
        assertNotNull(options);

        // getting/setting map
        MapOptions mapOptions = MapOptions.newInstance();
        mapOptions.setMapTypeId(MapTypeId.TERRAIN);
        MapWidget mapWidget = new MapWidget(mapOptions);
        mapWidget.setSize("500px", "500px");
        RootPanel.get().add(mapWidget);

        assertNull(options.getMap());

        options.setMap(mapWidget);
        MapWidget actual = options.getMap();
        assertEquals(mapWidget.getMapTypeId(), actual.getMapTypeId());

        options.setMap(null);
        assertNull(options.getMap());
        finishTest();
        finishTest();
      }
    });
  }

  public void testGetSetData() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        HeatMapLayerOptions options = HeatMapLayerOptions.newInstance();
        assertNotNull(options);

        // getting/setting data

        assertNull(options.getData());

        MVCArray<LatLng> expected = HeatMapLayerGwtTest.getMVCLatLngData();
        options.setData(expected);

        // test set
        MVCArray<LatLng> actual = options.getData();
        assertEquals(expected.getLength(), actual.getLength());
        assertEquals(expected.get(0).toString(), actual.get(0).toString());

        // test clear
        MVCArray<LatLng> emptySet = MVCArray.newInstance();
        options.setData(emptySet);
        actual = options.getData();
        assertEquals(0, actual.getLength());

        finishTest();
        finishTest();
      }
    });
  }

  public void testGetSetOthers() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        HeatMapLayerOptions options = HeatMapLayerOptions.newInstance();
        assertNotNull(options);

        // dissipating
        // assertFalse(options.getDissipating());
        boolean expected = true;
        options.setDissipating(expected);
        assertEquals(expected, options.getDissipating());

        // gradient
        assertNull(options.getGradient());
        String[] colors = new String[] { "red", "blue", "orange", "green" };
        JsArrayString expectedGradient = ArrayHelper.toJsArrayString(colors);
        options.setGradient(expectedGradient);
        assertEquals(expectedGradient, options.getGradient());

        // maxIntensity
        // assertNotNull(options.getMaxIntensity());
        double expectedMax = 554.45d;
        options.setMaxIntensity(expectedMax);
        assertEquals(expectedMax, options.getMaxIntensity());

        // opacity
        assertEquals(0.6d, options.getOpacity());
        double expectedOpacity = 0.45d;
        options.setOpacity(expectedOpacity);
        assertEquals(expectedOpacity, options.getOpacity());

        // radius
        // assertNotNull(options.getRadius());
        double expectedRadius = 0.45d;
        options.setRadius(expectedRadius);
        assertEquals(expectedRadius, options.getRadius());

        finishTest();
        finishTest();
      }
    });
  }
}
