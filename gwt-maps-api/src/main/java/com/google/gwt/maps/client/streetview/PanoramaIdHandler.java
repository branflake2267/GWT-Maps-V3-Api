package com.google.gwt.maps.client.streetview;

/**
 * Handler for the getPanoramaById callback
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#StreetViewService">StreetViewService API Doc</a>
 */
public interface PanoramaIdHandler {

  /**
   * Retrieves the data for the given pano id and passes it to the provided callback as a StreetViewPanoramaData object. Pano ids are unique per panorama and stable for the lifetime of a session, but are liable to change between sessions.
   * @param data
   * @param status
   */
  public void onCallback(StreetViewPanoramaData data, StreetViewStatus status);
  
}
