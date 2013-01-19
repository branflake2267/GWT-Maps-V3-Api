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

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.services.GeocoderAddressComponent;

public class GeocoderAddressComponentGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.PLACES };
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GeocoderAddressComponent o = GeocoderAddressComponent.newInstace();
        finishTest();
      }
    });
  }

  public void testLong_Name() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GeocoderAddressComponent o = GeocoderAddressComponent.newInstace();
        String left = "test";
        o.setLong_Name(left);
        String right = o.getLong_Name();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testShort_Name() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GeocoderAddressComponent o = GeocoderAddressComponent.newInstace();
        String left = "test";
        o.setShort_Name(left);
        String right = o.getShort_Name();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testTypes() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GeocoderAddressComponent o = GeocoderAddressComponent.newInstace();
        String[] a = new String[3];
        a[0] = "0";
        a[1] = "1";
        a[2] = "2";
        JsArrayString left = ArrayHelper.toJsArrayString(a);
        o.setTypes(left);
        JsArrayString right = o.getTypes();
        assertEquals(left.length(), right.length());
        assertEquals(left.get(0), right.get(0));
        finishTest();
      }
    });
  }
}
