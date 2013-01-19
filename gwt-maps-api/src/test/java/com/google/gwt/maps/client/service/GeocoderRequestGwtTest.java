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
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.services.GeocoderRequest;

public class GeocoderRequestGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.PLACES };
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GeocoderRequest o = GeocoderRequest.newInstance();
        finishTest();
      }
    });
  }

  public void testAddress() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GeocoderRequest o = GeocoderRequest.newInstance();
        String left = "test";
        o.setAddress(left);
        String right = o.getAddress();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testBounds() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GeocoderRequest o = GeocoderRequest.newInstance();
        LatLng sw = LatLng.newInstance(-31.203405d, 125.244141d);
        LatLng ne = LatLng.newInstance(-25.363882d, 131.044922d);
        LatLngBounds left = LatLngBounds.newInstance(sw, ne);
        o.setBounds(left);
        LatLngBounds right = o.getBounds();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    });
  }

  public void testLocation() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GeocoderRequest o = GeocoderRequest.newInstance();
        LatLng left = LatLng.newInstance(-31.203405d, 125.244141d);
        o.setLocation(left);
        LatLng right = o.getLocation();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    });
  }

  public void testRegion() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GeocoderRequest o = GeocoderRequest.newInstance();
        String left = "test";
        o.setRegion(left);
        String right = o.getRegion();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

}
