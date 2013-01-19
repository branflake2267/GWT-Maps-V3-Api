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
import com.google.gwt.maps.client.services.ElevationResult;

public class ElevationResultGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.PLACES };
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ElevationResult o = ElevationResult.newInstance();
        finishTest();
      }
    });
  }

  public void testElevation() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ElevationResult o = ElevationResult.newInstance();
        int left = 10;
        o.setElevation(left);
        double right = o.getElevation();
        assertEquals(left, right, getEqualsEpsilon());
        finishTest();
      }
    });
  }

  public void testLocation() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ElevationResult o = ElevationResult.newInstance();
        LatLng left = LatLng.newInstance(25, 26);
        o.setLocation(left);
        LatLng right = o.getLocation();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    });
  }

  public void testResolution() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ElevationResult o = ElevationResult.newInstance();
        double left = 10;
        o.setResolution(left);
        double right = o.getResolution();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

}
