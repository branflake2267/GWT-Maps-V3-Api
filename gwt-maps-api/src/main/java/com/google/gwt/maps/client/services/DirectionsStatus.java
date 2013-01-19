package com.google.gwt.maps.client.services;

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

/**
 * The status returned by the DirectionsService on the completion of a call to route(). <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#DirectionsStatus">DirectionsStatus
 * API Doc</a>
 */
public enum DirectionsStatus {

  /**
   * The DirectionsRequest provided was invalid.
   */
  INVALID_REQUEST,

  /**
   * Too many DirectionsWaypoints were provided in the DirectionsRequest. The total allowed waypoints is 8, plus the
   * origin and destination.
   */
  MAX_WAYPOINTS_EXCEEDED,

  /**
   * At least one of the origin, destination, or waypoints could not be geocoded.
   */
  NOT_FOUND,

  /**
   * The response contains a valid DirectionsResult.
   */
  OK,

  /**
   * The webpage has gone over the requests limit in too short a period of time.
   */
  OVER_QUERY_LIMIT,

  /**
   * The webpage is not allowed to use the directions service.
   */
  REQUEST_DENIED,

  /**
   * A directions request could not be processed due to a server error. The request may succeed if you try again.
   */
  UNKNOWN_ERROR,

  /**
   * No route could be found between the origin and destination.
   */
  ZERO_RESULTS;

  public String value() {
    return name().toLowerCase();
  }

  public static DirectionsStatus fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  public String toString() {
    return name();
  }
}
