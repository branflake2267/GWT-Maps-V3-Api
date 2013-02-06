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
 * The valid travel modes that can be specified in a DirectionsRequest as well as the travel modes returned in a
 * DirectionsStep. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#TravelMode">TravelMode API Doc</a>
 */
public enum TravelMode {

  /**
   * Specifies a bicycling directions request.
   */
  BICYCLING,

  /**
   * Specifies a driving directions request.
   */
  DRIVING,

  /**
   * Specifies a transit directions request.
   */
  TRANSIT,

  /**
   * Specifies a walking directions request.
   */
  WALKING;

  public String value() {
    return name();
  }

  public static TravelMode fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  public String toString() {
    return name();
  }

}
