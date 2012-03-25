package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JsArray;

/**
 * google.maps.Geocoder
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#Geocoder}
 */
public interface GeocoderRequestHandler {

  /**
   * returns a result after on geocode callback
   * @param results
   * @param status
   */
  void onCallback(JsArray<GeocoderResult> results, GeocoderStatus status);
  
}
