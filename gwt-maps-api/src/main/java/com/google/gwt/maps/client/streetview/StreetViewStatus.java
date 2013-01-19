package com.google.gwt.maps.client.streetview;

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
 * The status returned by the StreetViewService on completion of a Street View request. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#StreetViewStatus">StreetViewStatus
 * API Doc</a>
 */
public enum StreetViewStatus {

  /**
   * The request was successful.
   */
  OK,

  /**
   * The request could not be successfully processed, yet the exact reason for failure is unknown.
   */
  UNKNOWN_ERROR,

  /**
   * There are no nearby panoramas.
   */
  ZERO_RESULTS;

  public String value() {
    return name().toLowerCase();
  }

  public static StreetViewStatus fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  public String toString() {
    return name();
  }

}
