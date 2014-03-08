package com.google.gwt.maps.client.placeslib;

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

public enum PlacesServiceStatus {

  /**
   * This request was invalid.
   */
  INVALID_REQUEST,

  /**
   * The response contains a valid result.
   */
  OK,

  /**
   * The application has gone over its request quota.
   */
  OVER_QUERY_LIMIT,

  /**
   * The application is not allowed to use the PlacesService.
   */
  REQUEST_DENIED,

  /**
   * The PlacesService request could not be processed due to a server error. The request may succeed if you try again.
   */
  UNKNOWN_ERROR,

  /**
   * No result was found for this request.
   */
  ZERO_RESULTS,

  /**
   * Undocumented in API but is returned by service in some cases.
   */
  NOT_FOUND;

  public String value() {
    return name().toLowerCase();
  }

  public static PlacesServiceStatus fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  public String toString() {
    return name();
  }
}
