package com.google.gwt.maps.client.services;

/**
 * 
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#DistanceMatrixService">DistanceMatrixService API Doc</a>
 */
public interface DistanceMatrixRequestHandler {

  /**
   * response from callback for Distance Matrix Request
   * @param response
   * @param status
   */
  void onCallback(DistanceMatrixResponse response, DistanceMatrixStatus status);
  
}
