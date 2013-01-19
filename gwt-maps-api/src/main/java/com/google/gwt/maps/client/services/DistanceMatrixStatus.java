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
 * The top-level status about the request in general returned by the DistanceMatrixService upon completion of a distance
 * matrix request. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#DistanceMatrixStatus">
 * DistanceMatrixStatus API Doc</a>
 */
public enum DistanceMatrixStatus {

  /**
   * The provided request was invalid.
   */
  INVALID_REQUEST,

  /**
   * The request contains more than 25 origins, or more than 25 destinations.
   */
  MAX_DIMENSIONS_EXCEEDED,

  /**
   * The product of origins and destinations exceeds the per-query limit.
   */
  MAX_ELEMENTS_EXCEEDED,

  /**
   * The response contains a valid result.
   */
  OK,

  /**
   * Too many elements have been requested within the allowed time period. The request should succeed if you try again
   * after a reasonable amount of time.
   */
  OVER_QUERY_LIMIT,

  /**
   * The service denied use of the Distance Matrix service by your web page.
   */
  REQUEST_DENIED,

  /**
   * A Distance Matrix request could not be processed due to a server error. The request may succeed if you try again.
   */
  UNKNOWN_ERROR;

  public String value() {
    return name().toLowerCase();
  }

  public static DistanceMatrixStatus fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  public String toString() {
    return name();
  }
}
