package com.google.gwt.maps.client.base;

import java.math.BigDecimal;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * LatLng is a point in geographical coordinates, latitude and longitude.
 * 
 * Notice that although usual map projections associate longitude with the x-coordinate of the map, and latitude with the y-coordinate, the latitude coordinate is always written first, followed by the longitude.
 * Notice also that you cannot modify the coordinates of a LatLng. If you want to compute another point, you have to create a new one.
 * 
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#LatLng}
 */
public class LatLng extends JavaScriptObject {

  /**
   * LatLng is a point in geographical coordinates, latitude and longitude.
   */
  protected LatLng() {}

  /**
   * Notice the ordering of latitude and longitude. If the noWrap flag is true, then the numbers will be used as passed, otherwise latitude will be clamped to lie between -90 degrees and +90 degrees, and longitude will be wrapped to lie between -180 degrees and +180 degrees.
   * @param lat
   * @param lng
   * @param noWrap
   * @return LatLng
   */
  public static LatLng newInstance(BigDecimal lat, BigDecimal lng) {
    return newInstance(lat, lng, false);
  }
  
  /**
   * Notice the ordering of latitude and longitude. If the noWrap flag is true, then the numbers will be used as passed, otherwise latitude will be clamped to lie between -90 degrees and +90 degrees, and longitude will be wrapped to lie between -180 degrees and +180 degrees.
   * @param lat
   * @param lng
   * @return
   */
  public static LatLng newInstance(double lat, double lng) {
    return newInstance(new BigDecimal(lat), new BigDecimal(lng), false);
  }

  /**
   * Notice the ordering of latitude and longitude. If the noWrap flag is true, then the numbers will be used as passed, otherwise latitude will be clamped to lie between -90 degrees and +90 degrees, and longitude will be wrapped to lie between -180 degrees and +180 degrees.
   * @param lat
   * @param lng
   * @param noWrap
   * @return
   */
  public static LatLng newInstance(BigDecimal lat, BigDecimal lng, boolean noWrap) {
    String slat = null;
    if (lat != null) {
      slat = lat.toPlainString();
    }
    String slng = null;
    if (lng != null) {
      slng = lng.toPlainString();
    }
    return createJso(slat, slng, noWrap);
  }

  /**
   * Notice the ordering of latitude and longitude. If the noWrap flag is true, then the numbers will be used as passed, otherwise latitude will be clamped to lie between -90 degrees and +90 degrees, and longitude will be wrapped to lie between -180 degrees and +180 degrees.
   * LatLng(lat:number, lng:number, noWrap?:boolean)
   * @return LatLng
   */
  private static native LatLng createJso(String lat, String lng, boolean noWrap) /*-{
    if (lat != null) {
      lat = new Number(lat);
    }
    if (lng != null) {
      lng = new Number(lng);
    }
    return new $wnd.google.maps.LatLng(lat, lng, noWrap);
  }-*/;

  /**
   * is equal?
   * @param other
   */
  public final native boolean equals(LatLng other) /*-{
    return this.equals(other);
  }-*/;

  /**
   * get latitude
   * @return BigDecimal
   */
  public final BigDecimal getLatitude() {
    return new BigDecimal(getLat());
  }

  /**
   * Returns the latitude in degrees.
   * @return
   */
  public final native String getLat() /*-{
    return this.lat().toString();
  }-*/;

  /**
   * Returns the longitude in degrees.
   * @return BigDecimal
   */
  public final BigDecimal getLongitude() {
    return new BigDecimal(getLng());
  }

  /**
   * Returns the latitude in degrees.
   * @return String
   */
  private final native String getLng() /*-{
    return this.lng().toString();
  }-*/;

  /**
   * Converts to string representation.
   */
  public final native String getToString() /*-{
    return this.toString();
  }-*/;

  /**
   * Returns a string of the form "lat,lng" for this LatLng. We round the lat/lng values to 6 decimal places by default.
   * @param precision
   * @return String
   */
  public final native String getToUrlValue(int precision) /*-{
    return this.toUrlValue(precision);
  }-*/;

}
