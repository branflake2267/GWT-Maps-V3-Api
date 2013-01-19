package com.google.gwt.maps.client.streetview;

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

public class StreetViewLocationGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewLocation o = StreetViewLocation.newInstance();
        finishTest();
      }
    });

  }

  public void testDescription() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewLocation o = StreetViewLocation.newInstance();
        String left = "desc";
        o.setDescription(left);
        String right = o.getDescription();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testLatLng() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewLocation o = StreetViewLocation.newInstance();
        LatLng left = LatLng.newInstance(38d, 35d);
        o.setLatLng(left);
        LatLng right = o.getLatLng();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    });

  }

  public void testPanon() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewLocation o = StreetViewLocation.newInstance();
        String left = "pano";
        o.setPano(left);
        String right = o.getPano();
        assertEquals(left, right);
        finishTest();
      }
    });

  }
}
