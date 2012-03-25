package com.google.gwt.maps.client.services;

/**
 * The status returned by the DirectionsService on the completion of a call to route().
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#DirectionsStatus}
 */
public enum DirectionsStatus {

  /**
   * The DirectionsRequest provided was invalid.
   */
  INVALID_REQUEST,
  
  /**
   * Too many DirectionsWaypoints were provided in the DirectionsRequest. The total allowed waypoints is 8, plus the origin and destination.
   */
  MAX_WAYPOINTS_EXCEEDED,
  
  /**
   * At least one of the origin, destination, or waypoints could not be geocoded.
   */
  NOT_FOUND,
  
  /**
   * The response contains a valid DirectionsResult. 
   */
  OK,
  
  /**
   * The webpage has gone over the requests limit in too short a period of time.
   */
  OVER_QUERY_LIMIT,
  
  /**
   * The webpage is not allowed to use the directions service.
   */
  REQUEST_DENIED,
  
  /**
   * A directions request could not be processed due to a server error. The request may succeed if you try again.
   */
  UNKNOWN_ERROR,
  
  /**
   * No route could be found between the origin and destination.
   */
  ZERO_RESULTS; 
  
  public String value() {
    return name().toLowerCase();
  }
  
  public static DirectionsStatus fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  public String toString() {
    return name();
  }
}
