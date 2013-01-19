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
 * Elevation Status constant. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#ElevationStatus">ElevationStatus
 * API Doc</a>
 */
public enum ElevationStatus {

  /**
   * This request was invalid.
   */
  INVALID_REQUEST,

  /**
   * The request did not encounter any errors.
   */
  OK,

  /**
   * The webpage has gone over the requests limit in too short a period of time.
   */
  OVER_QUERY_LIMIT,

  /**
   * The webpage is not allowed to use the elevation service for some reason.
   */
  REQUEST_DENIED,

  /**
   * A geocoding, directions or elevation request could not be successfully processed, yet the exact reason for the
   * failure is not known.
   */
  UNKNOWN_ERROR;

  public String value() {
    return name().toLowerCase();
  }

  public static ElevationStatus fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  public String toString() {
    return name();
  }

}
