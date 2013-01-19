package com.google.gwt.maps.client.weatherlib;

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
import com.google.gwt.user.client.ui.RootPanel;

public class CloudLayerGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.WEATHER };
  }

  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        CloudLayer o = CloudLayer.newInstance();
        assertNotNull("CloudLayer should have been created.", o);

        finishTest();
      }
    });

  }

  public void testCloudLayer() {

    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapOptions options = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(options);
        mapWidget.setSize("500px", "500px");
        RootPanel.get().add(mapWidget);

        CloudLayer o = CloudLayer.newInstance();

        // test getting null map
        assertNull(o.getMap());

        o.setMap(mapWidget);
        MapWidget right = o.getMap();

        assertEquals(mapWidget.getCenter().getToString(), right.getCenter().getToString());

        // test clearing from map
        o.setMap(null);
        assertNull(o.getMap());

        finishTest();
      }
    });

  }
}
