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
import com.google.gwt.maps.client.services.DirectionsStatus;

public class DirectionsStatusGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.PLACES };
  }

  public void testUse1() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsStatus o = DirectionsStatus.INVALID_REQUEST;
        assertEquals("invalid_request", o.value());
        assertEquals(DirectionsStatus.INVALID_REQUEST, DirectionsStatus.fromValue("invalid_request"));
        finishTest();
      }
    });
  }

  public void testUse2() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsStatus o = DirectionsStatus.MAX_WAYPOINTS_EXCEEDED;
        assertEquals("max_waypoints_exceeded", o.value());
        assertEquals(DirectionsStatus.MAX_WAYPOINTS_EXCEEDED, DirectionsStatus.fromValue("max_waypoints_exceeded"));
        finishTest();
      }
    });
  }

  public void testUse3() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsStatus o = DirectionsStatus.NOT_FOUND;
        assertEquals("not_found", o.value());
        assertEquals(DirectionsStatus.NOT_FOUND, DirectionsStatus.fromValue("not_found"));
        finishTest();
      }
    });
  }

  public void testUse4() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsStatus o = DirectionsStatus.OK;
        assertEquals("ok", o.value());
        assertEquals(DirectionsStatus.OK, DirectionsStatus.fromValue("ok"));
        finishTest();
      }
    });
  }

  public void testUse5() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsStatus o = DirectionsStatus.OVER_QUERY_LIMIT;
        assertEquals("over_query_limit", o.value());
        assertEquals(DirectionsStatus.OVER_QUERY_LIMIT, DirectionsStatus.fromValue("over_query_limit"));
        finishTest();
      }
    });
  }

  public void testUse6() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsStatus o = DirectionsStatus.REQUEST_DENIED;
        assertEquals("request_denied", o.value());
        assertEquals(DirectionsStatus.REQUEST_DENIED, DirectionsStatus.fromValue("request_denied"));
        finishTest();
      }
    });
  }

  public void testUse7() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsStatus o = DirectionsStatus.UNKNOWN_ERROR;
        assertEquals("unknown_error", o.value());
        assertEquals(DirectionsStatus.UNKNOWN_ERROR, DirectionsStatus.fromValue("unknown_error"));
        finishTest();
      }
    });
  }

  public void testUse8() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsStatus o = DirectionsStatus.ZERO_RESULTS;
        assertEquals("zero_results", o.value());
        assertEquals(DirectionsStatus.ZERO_RESULTS, DirectionsStatus.fromValue("zero_results"));
        finishTest();
      }
    });
  }

}
