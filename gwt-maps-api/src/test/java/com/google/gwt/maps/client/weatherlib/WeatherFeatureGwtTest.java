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

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class WeatherFeatureGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.WEATHER };
  }

  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        WeatherFeature.newInstance();

        finishTest();
      }
    });
  }

  public void testCurrent() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        WeatherFeature feature = WeatherFeature.newInstance();

        assertNull(feature.getCurrent());

        WeatherConditions expected = WeatherConditions.newInstance();
        expected.setDay("Monday");
        feature.setCurrent(expected);
        assertEquals("Current condiitons should match", expected.getDay(), feature.getCurrent().getDay());

        finishTest();
      }
    });
  }

  public void testLocation() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        WeatherFeature feature = WeatherFeature.newInstance();

        String expected = "Fooville";
        feature.setLocation(expected);
        assertEquals(expected, feature.getLocation());

        finishTest();
      }
    });
  }

  public void testTemperatureUnit() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        WeatherFeature feature = WeatherFeature.newInstance();

        assertNull(feature.getTemperatureUnits());

        TemperatureUnit expected = TemperatureUnit.FAHRENHEIT;
        feature.setTemperatureUnits(expected);
        assertEquals(expected, feature.getTemperatureUnits());

        finishTest();
      }
    });
  }

  public void testWindSpeedUnit() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        WeatherFeature feature = WeatherFeature.newInstance();

        assertNull(feature.getWindSpeedUnits());

        WindSpeedUnit expected = WindSpeedUnit.METERS_PER_SECOND;
        feature.setWindSpeedUnits(expected);
        assertEquals(expected, feature.getWindSpeedUnits());

        finishTest();
      }
    });
  }

  public void testForecast() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        WeatherFeature feature = WeatherFeature.newInstance();

        WeatherForecast[] forecasts = new WeatherForecast[] { WeatherForecast.newInstance(),
            WeatherForecast.newInstance() };
        forecasts[0].setDescription("Foo0");
        forecasts[1].setDescription("Foo1");

        JsArray<WeatherForecast> forecastJsArray = ArrayHelper.toJsArray(forecasts);
        feature.setForecast(forecastJsArray);

        // check that we can pull them out
        JsArray<WeatherForecast> actual = feature.getForecast();
        assertEquals("Should get same array we put in", forecastJsArray.length(), actual.length());
        assertEquals(forecasts[0].getDescription(), forecastJsArray.get(0).getDescription());
        assertEquals(forecasts[1].getDescription(), forecastJsArray.get(1).getDescription());

        finishTest();
      }
    });
  }
}
