package com.google.gwt.maps.client.services;

/**
 * 
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#DistanceMatrixService}
 */
public interface DistanceMatrixRequestHandler {

  /**
   * response from callback for Distance Matrix Request
   * @param response
   * @param status
   */
  void onCallback(DistanceMatrixResponse response, DistanceMatrixStatus status);
  
}
