package com.google.gwt.maps.client.placelib;

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
import com.google.gwt.maps.client.placeslib.PlacesServiceStatus;

public class PlaceServiceStatusGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.PLACES };
  }

  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlacesServiceStatus o = PlacesServiceStatus.INVALID_REQUEST;
        assertEquals("invalid_request", o.value());
        finishTest();
      }
    });
  }

  public void testUse2() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlacesServiceStatus o = PlacesServiceStatus.OK;
        assertEquals("ok", o.value());
        finishTest();
      }
    });
  }

  public void testUse3() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlacesServiceStatus o = PlacesServiceStatus.OVER_QUERY_LIMIT;
        assertEquals("over_query_limit", o.value());
        finishTest();
      }
    });
  }

  public void testUse4() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlacesServiceStatus o = PlacesServiceStatus.REQUEST_DENIED;
        assertEquals("request_denied", o.value());
        finishTest();
      }
    });
  }

  public void testUse5() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlacesServiceStatus o = PlacesServiceStatus.UNKNOWN_ERROR;
        assertEquals("unknown_error", o.value());
        finishTest();
      }
    });
  }

  public void testUse6() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlacesServiceStatus o = PlacesServiceStatus.ZERO_RESULTS;
        assertEquals("zero_results", o.value());
        finishTest();
      }
    });
  }

}
