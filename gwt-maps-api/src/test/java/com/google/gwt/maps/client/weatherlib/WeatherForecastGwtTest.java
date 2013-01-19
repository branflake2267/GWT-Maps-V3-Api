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

public class WeatherForecastGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.WEATHER };
  }

  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        WeatherForecast.newInstance();

        finishTest();
      }
    });
  }

  public void testDay() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        WeatherForecast conditions = WeatherForecast.newInstance();

        assertNull("Should be empty", conditions.getDay());

        String expected = "Tuesday";
        conditions.setDay(expected);
        assertEquals("Days should match", expected, conditions.getDay());

        finishTest();
      }
    });
  }

  public void testShortDay() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        WeatherForecast conditions = WeatherForecast.newInstance();

        assertNull("Should be empty", conditions.getShortDay());

        String expected = "T";
        conditions.setShortDay(expected);
        assertEquals("Days should match", expected, conditions.getShortDay());

        finishTest();
      }
    });
  }

  public void testDescription() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        WeatherForecast conditions = WeatherForecast.newInstance();

        assertNull("Should be empty", conditions.getDescription());

        String expected = "Foo Description";
        conditions.setDescription(expected);
        assertEquals(expected, conditions.getDescription());

        finishTest();
      }
    });
  }

  public void testHigh() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        WeatherForecast conditions = WeatherForecast.newInstance();

        double expected = 95d;
        conditions.setHigh(expected);
        assertEquals(expected, conditions.getHigh());

        finishTest();
      }
    });
  }

  public void testLow() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        WeatherForecast conditions = WeatherForecast.newInstance();

        double expected = -12d;
        conditions.setLow(expected);
        assertEquals(expected, conditions.getLow());

        finishTest();
      }
    });
  }

}
