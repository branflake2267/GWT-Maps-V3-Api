package com.google.gwt.maps.client.placeslib;


public enum PlacesServiceStatus {
  
  /**
   *  This request was invalid.
   */
  INVALID_REQUEST,
  
  /**
   * The response contains a valid result.
   */
  OK,
  
  /**
   * The application has gone over its request quota.
   */
  OVER_QUERY_LIMIT,
  
  /**
   * The application is not allowed to use the PlacesService.
   */
  REQUEST_DENIED,
  
  /**
   * The PlacesService request could not be processed due to a server error. The request may succeed if you try again.
   */
  UNKNOWN_ERROR, 
  
  /**
   * No result was found for this request.
   */
  ZERO_RESULTS;  
  
  public String value() {
    return name().toLowerCase();
  }
  
  public static PlacesServiceStatus fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  public String toString() {
    return name();
  }
}
