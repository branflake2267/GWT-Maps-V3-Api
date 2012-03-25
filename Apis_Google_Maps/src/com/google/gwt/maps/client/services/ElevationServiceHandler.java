package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JsArray;

/**
 * 
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#ElevationService}
 */
public interface ElevationServiceHandler {

  /**
   * on ElevationService result
   * @param result
   * @param status
   */
  void onCallback(JsArray<ElevationResult> result, ElevationStatus status);
  
}
