package com.google.gwt.maps.client.services;

public interface DirectionsResultHandler {

  void onCallback(DirectionsResult result, DirectionsStatus status);
  
}
