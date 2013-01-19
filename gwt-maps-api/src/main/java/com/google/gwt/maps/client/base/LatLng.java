package com.google.gwt.maps.client.base;

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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * LatLng is a point in geographical coordinates, latitude and longitude.
 * 
 * Notice that although usual map projections associate longitude with the x-coordinate of the map, and latitude with
 * the y-coordinate, the latitude coordinate is always written first, followed by the longitude. Notice also that you
 * cannot modify the coordinates of a LatLng. If you want to compute another point, you have to create a new one.
 * 
 * <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#LatLng">LatLng API Doc</a>
 */
public class LatLng extends JavaScriptObject {

  /**
   * LatLng is a point in geographical coordinates, latitude and longitude.
   */
  protected LatLng() {
  }

  /**
   * Notice the ordering of latitude and longitude. If the noWrap flag is true, then the numbers will be used as passed,
   * otherwise latitude will be clamped to lie between -90&deg; and +90 &deg;, and longitude will be wrapped to lie
   * between -180 &deg; and +180 &deg;.
   * 
   * @param lat
   * @param lng
   */
  public static LatLng newInstance(double lat, double lng) {
    return newInstance(lat, lng, false);
  }

  /**
   * Notice the ordering of latitude and longitude. If the noWrap flag is true, then the numbers will be used as passed,
   * otherwise latitude will be clamped to lie between -90&deg; and +90 &deg;, and longitude will be wrapped to lie
   * between -180 &deg; and +180 &deg;.
   * 
   * @param lat
   * @param lng
   * @param noWrap
   */
  public static LatLng newInstance(double lat, double lng, boolean noWrap) {
    return createJso(lat, lng, noWrap);
  }

  /**
   * Notice the ordering of latitude and longitude. If the noWrap flag is true, then the numbers will be used as passed,
   * otherwise latitude will be clamped to lie between -90&deg; and +90&deg;, and longitude will be wrapped to lie
   * between -180&deg; and +180&deg;. LatLng(lat:number, lng:number, noWrap?:boolean)
   * 
   * @return LatLng
   */
  private static native LatLng createJso(double lat, double lng, boolean noWrap) /*-{
    return new $wnd.google.maps.LatLng(lat, lng, noWrap);
  }-*/;

  /**
   * is equal?
   * 
   * @param other
   */
  public final native boolean equals(LatLng other) /*-{
    return this.equals(other);
  }-*/;

  /**
   * get latitude
   * 
   * @return double
   */
  public final double getLatitude() {
    return getLat();
  }

  /**
   * Returns the latitude in degrees.
   * 
   * @return double
   */
  private final native double getLat() /*-{
    return this.lat();
  }-*/;

  /**
   * Returns the longitude in degrees.
   * 
   * @return double
   */
  public final double getLongitude() {
    return getLng();
  }

  /**
   * Returns the latitude in degrees.
   * 
   * @return double
   */
  private final native double getLng() /*-{
    return this.lng();
  }-*/;

  /**
   * Converts to string representation.
   */
  public final native String getToString() /*-{
    return this.toString();
  }-*/;

  /**
   * Returns a string of the form "lat,lng" for this LatLng. We round the lat/lng values to 6 decimal places by default.
   * 
   * @param precision
   * @return String
   */
  public final native String getToUrlValue(int precision) /*-{
    return this.toUrlValue(precision);
  }-*/;

}
