package com.google.gwt.maps.client.services;

/**
 * The element-level status about a particular origin-destination pairing returned by the DistanceMatrixService upon completion of a distance matrix request.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#DistanceMatrixElementStatus}
 */
public enum DistanceMatrixElementStatus {

  /**
   * The origin and/or destination of this pairing could not be geocoded.
   */
  NOT_FOUND,
  
  /**
   * The response contains a valid result. 
   */
  OK,
  
  /**
   * No route could be found between the origin and destination.
   */
  ZERO_RESULTS;
  
  
  public String value() {
    return name().toLowerCase();
  }
  
  public static DistanceMatrixElementStatus fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  public String toString() {
    return name();
  }
}
