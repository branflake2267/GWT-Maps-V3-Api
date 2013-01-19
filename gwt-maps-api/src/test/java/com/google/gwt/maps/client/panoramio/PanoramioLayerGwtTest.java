package com.google.gwt.maps.client.panoramio;

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
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Size;
import com.google.gwt.maps.client.events.panoramiomouse.PanoramioMouseMapEvent;
import com.google.gwt.maps.client.events.panoramiomouse.PanoramioMouseMapHandler;
import com.google.gwt.maps.client.panoramiolib.PanoramioFeature;
import com.google.gwt.maps.client.panoramiolib.PanoramioLayer;
import com.google.gwt.maps.client.panoramiolib.PanoramioLayerOptions;
import com.google.gwt.user.client.ui.RootPanel;

public class PanoramioLayerGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.PANORAMIO };
  }

  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        MapOptions optionsMap = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(optionsMap);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        PanoramioLayerOptions optionsPano = PanoramioLayerOptions.newInstance();
        optionsPano.setClickable(true);
        optionsPano.setMap(mapWidget);
        optionsPano.setSuppressInfoWindows(false);
        optionsPano.setTag("hawaii");
        optionsPano.setUserId("2597317");
        PanoramioLayer pano = PanoramioLayer.newInstance(optionsPano);

        pano.addClickHandler(new PanoramioMouseMapHandler() {
          @Override
          @SuppressWarnings("unused")
          public void onEvent(PanoramioMouseMapEvent event) {
            PanoramioFeature feature = event.getFeatureDetails();
            String info = event.getInfoWindowHtml();
            LatLng latlng = event.getLatLng();
            Size pixeloffset = event.getPixelOffset();
          }
        });

        finishTest();
      }
    });
  }

  public void testMap() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        MapOptions optionsMap = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(optionsMap);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        PanoramioLayerOptions optionsPano = PanoramioLayerOptions.newInstance();
        optionsPano.setClickable(true);
        optionsPano.setMap(mapWidget);
        optionsPano.setSuppressInfoWindows(false);
        optionsPano.setTag("hawaii");
        optionsPano.setUserId("2597317");
        PanoramioLayer pano = PanoramioLayer.newInstance(optionsPano);

        MapWidget right = pano.getMap();
        assertEquals(mapWidget.getCenter().getToString(), right.getCenter().getToString());

        LatLng center = LatLng.newInstance(47.19, -121.51);
        mapWidget.setCenter(center);
        pano.setMap(mapWidget);

        MapWidget right2 = pano.getMap();
        assertEquals(mapWidget.getCenter().getToString(), right2.getCenter().getToString());

        finishTest();
      }
    });
  }

  public void testTag() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        MapOptions optionsMap = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(optionsMap);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        PanoramioLayerOptions optionsPano = PanoramioLayerOptions.newInstance();
        optionsPano.setClickable(true);
        optionsPano.setMap(mapWidget);
        optionsPano.setSuppressInfoWindows(false);
        optionsPano.setTag("hawaii");
        optionsPano.setUserId("2597317"); // 2597317?
        PanoramioLayer pano = PanoramioLayer.newInstance(optionsPano);

        String tag = pano.getTag();
        assertEquals("hawaii", tag);

        pano.setTag("france");
        assertEquals("france", pano.getTag());

        finishTest();
      }
    });
  }

  public void testUserId() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        MapOptions optionsMap = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(optionsMap);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        PanoramioLayerOptions optionsPano = PanoramioLayerOptions.newInstance();
        optionsPano.setClickable(true);
        optionsPano.setMap(mapWidget);
        optionsPano.setSuppressInfoWindows(false);
        optionsPano.setTag("hawaii");
        optionsPano.setUserId("2597317"); // 2597317?
        PanoramioLayer pano = PanoramioLayer.newInstance(optionsPano);

        String tag = pano.getUserId();
        assertEquals("2597317", tag);

        pano.setUserId("4128216");
        assertEquals("hawaii", pano.getTag());

        finishTest();
      }
    });
  }

  public void testOptions() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        MapOptions optionsMap = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(optionsMap);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        PanoramioLayerOptions optionsPano = PanoramioLayerOptions.newInstance();
        optionsPano.setClickable(true);
        optionsPano.setMap(mapWidget);
        optionsPano.setSuppressInfoWindows(false);
        optionsPano.setTag("hawaii");
        optionsPano.setUserId("2597317"); // 2597317?
        PanoramioLayer pano = PanoramioLayer.newInstance(optionsPano);

        pano.setOption(optionsPano);

        finishTest();
      }
    });
  }

}
