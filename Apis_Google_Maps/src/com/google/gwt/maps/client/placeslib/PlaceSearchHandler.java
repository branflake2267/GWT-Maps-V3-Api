package com.google.gwt.maps.client.placeslib;

import com.google.gwt.core.client.JsArray;

public interface PlaceSearchHandler {

  public void onCallback(JsArray<PlaceResult> results, PlacesServiceStatus status); 
  
}
