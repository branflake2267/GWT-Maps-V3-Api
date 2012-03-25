package com.google.gwt.maps.client.services;

/**
 * Describes the type of location returned from a geocode.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#GeocoderLocationType}
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
   * The returned result reflects an approximation (usually on a road) interpolated between two precise points (such as intersections). Interpolated results are generally returned when rooftop geocodes are unavilable for a street address. 
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
