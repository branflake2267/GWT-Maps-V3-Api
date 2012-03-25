package com.google.gwt.maps.client.services;

/**
 * The top-level status about the request in general returned by the DistanceMatrixService upon completion of a distance matrix request.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#DistanceMatrixStatus}
 */
public enum DistanceMatrixStatus {

  /**
   * The provided request was invalid.
   */
  INVALID_REQUEST,
  
  /**
   * The request contains more than 25 origins, or more than 25 destinations.
   */
  MAX_DIMENSIONS_EXCEEDED,
  
  /**
   * The product of origins and destinations exceeds the per-query limit. 
   */
  MAX_ELEMENTS_EXCEEDED,
  
  /**
   * The response contains a valid result.
   */
  OK,
  
  /**
   * Too many elements have been requested within the allowed time period. The request should succeed if you try again after a reasonable amount of time. 
   */
  OVER_QUERY_LIMIT,
  
  /**
   * The service denied use of the Distance Matrix service by your web page.
   */
  REQUEST_DENIED,
  
  /**
   * A Distance Matrix request could not be processed due to a server error. The request may succeed if you try again.
   */
  UNKNOWN_ERROR;
  
  public String value() {
    return name().toLowerCase();
  }
  
  public static DistanceMatrixStatus fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  public String toString() {
    return name();
  }
}
