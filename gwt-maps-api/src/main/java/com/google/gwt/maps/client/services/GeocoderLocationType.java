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
 * Describes the type of location returned from a geocode. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#GeocoderLocationType">
 * GeocoderLocationType API Doc</a>
 */
public enum GeocoderLocationType {

  /**
   * The returned result is approximate.
   */
  APPROXIMATE,

  /**
   * The returned result is the geometric center of a result such a line (e.g. street) or polygon (region).
   */
  GEOMETRIC_CENTER,

  /**
   * The returned result reflects an approximation (usually on a road) interpolated between two precise points (such as
   * intersections). Interpolated results are generally returned when rooftop geocodes are unavilable for a street
   * address.
   */
  RANGE_INTERPOLATED,

  /**
   * The returned result reflects a precise geocode.
   */
  ROOFTOP;

  public String value() {
    return name().toLowerCase();
  }

  public static GeocoderLocationType fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  public String toString() {
    return name();
  }
  
}
