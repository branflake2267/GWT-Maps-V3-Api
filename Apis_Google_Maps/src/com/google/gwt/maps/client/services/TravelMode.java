package com.google.gwt.maps.client.services;

/**
 * The valid travel modes that can be specified in a DirectionsRequest as well as the travel modes returned in a DirectionsStep.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#TravelMode}
 */
public enum TravelMode {

  /**
   * Specifies a bicycling directions request.
   */
  BICYCLING,
  
  /**
   * Specifies a driving directions request.
   */
  DRIVING,
  
  /**
   * Specifies a walking directions request.
   */
  WALKING;
    
  public String value() {
    return name();
  }
  
  public static TravelMode fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  public String toString() {
    return name();
  }
  
}
