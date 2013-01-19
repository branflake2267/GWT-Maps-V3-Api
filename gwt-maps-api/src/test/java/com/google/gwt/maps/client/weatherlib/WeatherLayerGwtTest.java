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

public class WeatherLayerGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.WEATHER };
  }

  @SuppressWarnings("unused")
  public void testWeatherLayerUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        WeatherLayerOptions options = WeatherLayerOptions.newInstance();
        options.setTemperatureUnits(TemperatureUnit.FAHRENHEIT);
        options.setWindSpeedUnits(WindSpeedUnit.MILES_PER_HOUR);
        options.setLabelColor(LabelColor.BLACK);

        WeatherLayer o = WeatherLayer.newInstance(options);
        finishTest();
      }
    });

  }

  public void testSetOptions() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        WeatherLayerOptions options = WeatherLayerOptions.newInstance();
        options.setTemperatureUnits(TemperatureUnit.FAHRENHEIT);
        options.setWindSpeedUnits(WindSpeedUnit.MILES_PER_HOUR);
        options.setLabelColor(LabelColor.BLACK);

        WeatherLayer o = WeatherLayer.newInstance(options);

        // now set different options
        WeatherLayerOptions options2 = WeatherLayerOptions.newInstance();
        options.setTemperatureUnits(TemperatureUnit.CELSIUS);
        options.setWindSpeedUnits(WindSpeedUnit.METERS_PER_SECOND);
        options.setLabelColor(LabelColor.WHITE);
        o.setOptions(options2);

        finishTest();
      }
    });
  }

  public void testWeatherLayerOnMap() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapOptions opts = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(opts);
        mapWidget.setSize("500px", "500px");
        RootPanel.get().add(mapWidget);

        WeatherLayerOptions options = WeatherLayerOptions.newInstance();
        options.setTemperatureUnits(TemperatureUnit.FAHRENHEIT);
        options.setWindSpeedUnits(WindSpeedUnit.MILES_PER_HOUR);
        options.setLabelColor(LabelColor.BLACK);

        WeatherLayer o = WeatherLayer.newInstance(options);

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
