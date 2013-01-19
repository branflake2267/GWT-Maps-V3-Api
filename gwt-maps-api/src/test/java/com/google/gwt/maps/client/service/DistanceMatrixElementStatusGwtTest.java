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
import com.google.gwt.maps.client.services.DistanceMatrixElementStatus;

public class DistanceMatrixElementStatusGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.PLACES };
  }

  public void testUse1() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DistanceMatrixElementStatus o = DistanceMatrixElementStatus.NOT_FOUND;
        assertEquals("not_found", o.value());
        assertEquals(DistanceMatrixElementStatus.NOT_FOUND, DistanceMatrixElementStatus.fromValue("not_found"));
        finishTest();
      }
    });
  }

  public void testUse2() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DistanceMatrixElementStatus o = DistanceMatrixElementStatus.OK;
        assertEquals("ok", o.value());
        assertEquals(DistanceMatrixElementStatus.OK, DistanceMatrixElementStatus.fromValue("ok"));
        finishTest();
      }
    });
  }

  public void testUse3() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DistanceMatrixElementStatus o = DistanceMatrixElementStatus.ZERO_RESULTS;
        assertEquals("zero_results", o.value());
        assertEquals(DistanceMatrixElementStatus.ZERO_RESULTS, DistanceMatrixElementStatus.fromValue("zero_results"));
        finishTest();
      }
    });
  }

}
