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

public class TemperatureUnitGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.WEATHER };
  }

  public void testValueOf() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        for (TemperatureUnit windUnit : TemperatureUnit.values()) {
          assertEquals(windUnit, TemperatureUnit.valueOf(windUnit.toString()));
        }

        finishTest();
      }
    });

  }

  public void testReverseEngineer() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        reverseEngineerValues();
        finishTest();
      }
    });

  }

  protected void reverseEngineerValues() {

    for (TemperatureUnit tempUnit : TemperatureUnit.values()) {
      String expected = reverseEngineer(tempUnit.toString());
      assertEquals(expected, tempUnit.value());
    }
  }

  private native String reverseEngineer(String type) /*-{
                                                     return $wnd.google.maps.weather.TemperatureUnit.valueOf()[type];
                                                     }-*/;

}
