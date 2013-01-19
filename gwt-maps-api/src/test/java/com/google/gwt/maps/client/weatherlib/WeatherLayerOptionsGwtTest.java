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

public class WeatherLayerOptionsGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.WEATHER };
  }

  public void testValueOf() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        WeatherLayerOptions opts = WeatherLayerOptions.newInstance();

        // test all sets/gets
        opts.setClickable(true);
        assertTrue(opts.getClickable());
        opts.setClickable(false);
        assertFalse(opts.getClickable());

        for (LabelColor color : LabelColor.values()) {
          opts.setLabelColor(color);
          assertEquals(color, opts.getLabelColor());
        }

        opts.setSuppressInfoWindows(true);
        assertTrue(opts.getSuppressInfoWindows());
        opts.setSuppressInfoWindows(false);
        assertFalse(opts.getSuppressInfoWindows());

        for (TemperatureUnit unit : TemperatureUnit.values()) {
          opts.setTemperatureUnits(unit);
          assertEquals(unit, opts.getTemperatureUnits());
        }

        for (WindSpeedUnit unit : WindSpeedUnit.values()) {
          opts.setWindSpeedUnits(unit);
          assertEquals(unit, opts.getWindSpeedUnits());
        }

        // and setting the map
        MapOptions options = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(options);
        mapWidget.setSize("500px", "500px");
        RootPanel.get().add(mapWidget);

        // test getting null map
        assertNull(opts.getMap());
        // apply to map and read back
        opts.setMap(mapWidget);
        assertEquals(mapWidget.getCenter().getToString(), mapWidget.getCenter().getToString());

        // test clearing from map
        opts.setMap(null);
        assertNull(opts.getMap());

        finishTest();
      }
    });

  }

}
