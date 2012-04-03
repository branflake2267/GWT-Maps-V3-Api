package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JsArray;

/**
 * google.maps.Geocoder
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#Geocoder">Geocoder API Doc</a>
 */
public interface GeocoderRequestHandler {

  /**
   * returns a result after on geocode callback
   * @param results
   * @param status
   */
  void onCallback(JsArray<GeocoderResult> results, GeocoderStatus status);
  
}
