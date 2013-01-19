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

import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;

public class WeightedLocationGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.VISUALIZATION };
  }

  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        @SuppressWarnings("unused")
        WeightedLocation location = WeightedLocation.newInstance(LatLng.newInstance(37.782551d, -122.445368d), 9d);

        finishTest();
      }
    });
  }

  public void testGetSetValue() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        LatLng expectedLatLng = LatLng.newInstance(37.782551d, -122.445368d);
        double expectedWeight = 9.4d;

        WeightedLocation location = WeightedLocation.newInstance(expectedLatLng, expectedWeight);
        assertNotNull(location);

        // test get/set
        assertEquals(expectedLatLng.toString(), location.getLocation().toString());
        assertEquals(expectedWeight, location.getWeight(), 1e-5);

        finishTest();
      }
    });
  }

}
