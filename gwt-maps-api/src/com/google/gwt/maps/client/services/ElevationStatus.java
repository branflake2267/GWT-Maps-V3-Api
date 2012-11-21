package com.google.gwt.maps.client.services;

/**
 * Elevation Status constant.
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#ElevationStatus">ElevationStatus API Doc</a>
 */
public enum ElevationStatus {

  /**
   * This request was invalid.
   */
  INVALID_REQUEST,
  
  /**
   * The request did not encounter any errors.
   */
  OK,
  
  /**
   * The webpage has gone over the requests limit in too short a period of time. 
   */
  OVER_QUERY_LIMIT,
  
  /**
   * The webpage is not allowed to use the elevation service for some reason. 
   */
  REQUEST_DENIED,
  
  /**
   * A geocoding, directions or elevation request could not be successfully processed, yet the exact reason for the failure is not known.
   */
  UNKNOWN_ERROR;
  
  public String value() {
    return name().toLowerCase();
  }
  
  public static ElevationStatus fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  public String toString() {
    return name();
  }
  
}
