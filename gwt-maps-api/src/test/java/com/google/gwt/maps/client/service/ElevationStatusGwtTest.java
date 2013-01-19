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
import com.google.gwt.maps.client.services.ElevationStatus;

public class ElevationStatusGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.PLACES };
  }

  public void testUse1() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ElevationStatus o = ElevationStatus.INVALID_REQUEST;
        assertEquals("invalid_request", o.value());
        assertEquals(ElevationStatus.INVALID_REQUEST, ElevationStatus.fromValue("invalid_request"));
        finishTest();
      }
    });
  }

  public void testUse4() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ElevationStatus o = ElevationStatus.OK;
        assertEquals("ok", o.value());
        assertEquals(ElevationStatus.OK, ElevationStatus.fromValue("ok"));
        finishTest();
      }
    });
  }

  public void testUse5() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ElevationStatus o = ElevationStatus.OVER_QUERY_LIMIT;
        assertEquals("over_query_limit", o.value());
        assertEquals(ElevationStatus.OVER_QUERY_LIMIT, ElevationStatus.fromValue("over_query_limit"));
        finishTest();
      }
    });
  }

  public void testUse6() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ElevationStatus o = ElevationStatus.REQUEST_DENIED;
        assertEquals("request_denied", o.value());
        assertEquals(ElevationStatus.REQUEST_DENIED, ElevationStatus.fromValue("request_denied"));
        finishTest();
      }
    });
  }

  public void testUse7() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ElevationStatus o = ElevationStatus.UNKNOWN_ERROR;
        assertEquals("unknown_error", o.value());
        assertEquals(ElevationStatus.UNKNOWN_ERROR, ElevationStatus.fromValue("unknown_error"));
        finishTest();
      }
    });
  }

}
