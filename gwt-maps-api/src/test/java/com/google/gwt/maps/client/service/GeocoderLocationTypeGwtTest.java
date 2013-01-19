package com.google.gwt.maps.client.service;

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
import com.google.gwt.maps.client.services.GeocoderLocationType;

public class GeocoderLocationTypeGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.PLACES };
  }

  public void testUse1() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GeocoderLocationType o = GeocoderLocationType.APPROXIMATE;
        assertEquals("approximate", o.value());
        assertEquals(GeocoderLocationType.APPROXIMATE, GeocoderLocationType.fromValue("approximate"));
        finishTest();
      }
    });
  }

  public void testUse2() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GeocoderLocationType o = GeocoderLocationType.GEOMETRIC_CENTER;
        assertEquals("geometric_center", o.value());
        assertEquals(GeocoderLocationType.GEOMETRIC_CENTER, GeocoderLocationType.fromValue("geometric_center"));
        finishTest();
      }
    });
  }

  public void testUse3() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GeocoderLocationType o = GeocoderLocationType.RANGE_INTERPOLATED;
        assertEquals("range_interpolated", o.value());
        assertEquals(GeocoderLocationType.RANGE_INTERPOLATED, GeocoderLocationType.fromValue("range_interpolated"));
        finishTest();
      }
    });
  }

  public void testUse4() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GeocoderLocationType o = GeocoderLocationType.ROOFTOP;
        assertEquals("rooftop", o.value());
        assertEquals(GeocoderLocationType.ROOFTOP, GeocoderLocationType.fromValue("rooftop"));
        finishTest();
      }
    });
  }

}
