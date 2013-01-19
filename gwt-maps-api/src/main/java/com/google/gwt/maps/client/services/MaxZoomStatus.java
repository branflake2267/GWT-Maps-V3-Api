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
 * The status returned by the MaxZoomService on the completion of a call to getMaxZoomAtLatLng(). <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#MaxZoomStatus">MaxZoomStatus API
 * Doc</a>
 */
public enum MaxZoomStatus {

  /**
   * There was a problem contacting the Google servers.
   */
  ERROR,

  /**
   * The response contains a valid MaxZoomResult.
   */
  OK;

  public String value() {
    return name().toLowerCase();
  }

  public static MaxZoomStatus fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  public String toString() {
    return name();
  }

}
