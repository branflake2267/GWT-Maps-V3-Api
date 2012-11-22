package com.google.gwt.maps.client.placeslib;

import com.google.gwt.core.client.JsArray;

public interface PlaceTextSearchHandler {

  void onCallback(JsArray<PlaceResult> results, PlacesServiceStatus status);

}
