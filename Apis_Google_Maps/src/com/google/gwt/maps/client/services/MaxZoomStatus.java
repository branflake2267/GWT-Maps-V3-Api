package com.google.gwt.maps.client.services;

/**
 * The status returned by the MaxZoomService on the completion of a call to getMaxZoomAtLatLng().
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#MaxZoomStatus}
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

