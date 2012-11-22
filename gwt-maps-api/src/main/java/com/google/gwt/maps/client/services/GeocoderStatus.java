package com.google.gwt.maps.client.services;

/**
 * The status returned by the Geocoder on the completion of a call to geocode().
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#GeocoderStatus">GeocoderStatus API Doc</a>
 */
public enum GeocoderStatus {

  /**
   * There was a problem contacting the Google servers.
   */
  ERROR,
  
  /**
   * This GeocoderRequest was invalid.
   */
  INVALID_REQUEST,
  
  /**
   * The response contains a valid GeocoderResponse.
   */
  OK,
  
  /**
   * The webpage has gone over the requests limit in too short a period of time.
   */
  OVER_QUERY_LIMIT,
  
  /**
   * The webpage is not allowed to use the geocoder. 
   */
  REQUEST_DENIED,
  
  /**
   * A geocoding request could not be processed due to a server error. The request may succeed if you try again.
   */
  UNKNOWN_ERROR,
  
  /**
   * No result was found for this GeocoderRequest.
   */
  ZERO_RESULTS; 
  
  public String value() {
    return name().toLowerCase();
  }
  
  public static GeocoderStatus fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  public String toString() {
    return name();
  }
}
