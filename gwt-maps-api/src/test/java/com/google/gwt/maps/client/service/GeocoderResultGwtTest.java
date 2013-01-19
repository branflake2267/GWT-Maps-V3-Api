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

import java.util.ArrayList;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.services.GeocoderAddressComponent;
import com.google.gwt.maps.client.services.GeocoderGeometry;
import com.google.gwt.maps.client.services.GeocoderResult;

public class GeocoderResultGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.PLACES };
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GeocoderResult o = GeocoderResult.newInstance();
        finishTest();
      }
    });
  }

  public void testAddressCom() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GeocoderResult o = GeocoderResult.newInstance();
        GeocoderAddressComponent[] a = new GeocoderAddressComponent[3];
        a[0] = GeocoderAddressComponent.newInstace();
        a[1] = GeocoderAddressComponent.newInstace();
        a[2] = GeocoderAddressComponent.newInstace();

        JsArray<GeocoderAddressComponent> left = ArrayHelper.toJsArray();
        o.setAddress_Components(left);
        JsArray<GeocoderAddressComponent> right = o.getAddress_Components();
        assertEquals(left.length(), right.length());
        finishTest();
      }
    });
  }

  public void testFormattedAddress() {
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GeocoderResult o = GeocoderResult.newInstance();
        String left = "test";
        o.setFormatted_Address(left);
        String right = o.getFormatted_Address();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testGeometry() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GeocoderResult o = GeocoderResult.newInstance();
        GeocoderGeometry left = GeocoderGeometry.newInstance();
        left.setLocation(LatLng.newInstance(25, 26));
        o.setGeometry(left);
        GeocoderGeometry right = o.getGeometry();
        assertEquals(left.getLocation().getToString(), right.getLocation().getToString());
        finishTest();
      }
    });
  }

  public void testTypes() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GeocoderResult o = GeocoderResult.newInstance();
        String[] a = new String[3];
        a[0] = "0";
        a[1] = "1";
        a[2] = "2";
        JsArrayString left = ArrayHelper.toJsArrayString(a);
        o.setTypes(left);
        JsArrayString right = o.getTypes();
        assertEquals(left.length(), right.length());
        finishTest();
      }
    });
  }
}
