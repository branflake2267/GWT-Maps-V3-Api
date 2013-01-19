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
import com.google.gwt.maps.client.services.GeocoderStatus;

public class GeocoderStatusGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.PLACES };
  }

  public void testUse1() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GeocoderStatus o = GeocoderStatus.ERROR;
        assertEquals("error", o.value());
        assertEquals(GeocoderStatus.ERROR, GeocoderStatus.fromValue("error"));
        finishTest();
      }
    });
  }

  public void testUse2() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GeocoderStatus o = GeocoderStatus.INVALID_REQUEST;
        assertEquals("invalid_request", o.value());
        assertEquals(GeocoderStatus.INVALID_REQUEST, GeocoderStatus.fromValue("invalid_request"));
        finishTest();
      }
    });
  }

  public void testUse3() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GeocoderStatus o = GeocoderStatus.OK;
        assertEquals("ok", o.value());
        assertEquals(GeocoderStatus.OK, GeocoderStatus.fromValue("ok"));
        finishTest();
      }
    });
  }

  public void testUse4() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GeocoderStatus o = GeocoderStatus.OVER_QUERY_LIMIT;
        assertEquals("over_query_limit", o.value());
        assertEquals(GeocoderStatus.OVER_QUERY_LIMIT, GeocoderStatus.fromValue("over_query_limit"));
        finishTest();
      }
    });
  }

  public void testUse5() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GeocoderStatus o = GeocoderStatus.REQUEST_DENIED;
        assertEquals("request_denied", o.value());
        assertEquals(GeocoderStatus.REQUEST_DENIED, GeocoderStatus.fromValue("request_denied"));
        finishTest();
      }
    });
  }

  public void testUse6() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GeocoderStatus o = GeocoderStatus.UNKNOWN_ERROR;
        assertEquals("unknown_error", o.value());
        assertEquals(GeocoderStatus.UNKNOWN_ERROR, GeocoderStatus.fromValue("unknown_error"));
        finishTest();
      }
    });
  }

  public void testUse7() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GeocoderStatus o = GeocoderStatus.ZERO_RESULTS;
        assertEquals("zero_results", o.value());
        assertEquals(GeocoderStatus.ZERO_RESULTS, GeocoderStatus.fromValue("zero_results"));
        finishTest();
      }
    });
  }

}
