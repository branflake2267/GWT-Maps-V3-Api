package com.google.gwt.maps.client.streetview;

/**
 * 
 * {@link }
 */
public interface PanoramaByLocationHandler {

  /**
   * Retrieves the StreetViewPanoramaData for a panorama within a given radius of the given LatLng. The StreetViewPanoramaData is passed to the provided callback. If the radius is less than 50 meters, the nearest panorama will be returned.
   * @param data
   * @param status
   */
  public void onCallback(StreetViewPanoramaData data, StreetViewStatus status);
  
}
