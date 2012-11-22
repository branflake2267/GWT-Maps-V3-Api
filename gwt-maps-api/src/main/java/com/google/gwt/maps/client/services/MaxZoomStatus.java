package com.google.gwt.maps.client.services;

/**
 * The status returned by the MaxZoomService on the completion of a call to getMaxZoomAtLatLng().
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#MaxZoomStatus">MaxZoomStatus API Doc</a>
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

