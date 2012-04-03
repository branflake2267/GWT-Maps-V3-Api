package com.google.gwt.maps.client.streetview;


/**
 * The status returned by the StreetViewService on completion of a Street View request.
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#StreetViewStatus">StreetViewStatus API Doc</a>
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
