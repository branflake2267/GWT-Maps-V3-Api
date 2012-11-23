package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JsArray;

/**
 * 
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#ElevationService">ElevationService API Doc</a>
 */
public interface ElevationServiceHandler {

  /**
   * on ElevationService result
   * @param result
   * @param status
   */
  void onCallback(JsArray<ElevationResult> result, ElevationStatus status);
  
}
