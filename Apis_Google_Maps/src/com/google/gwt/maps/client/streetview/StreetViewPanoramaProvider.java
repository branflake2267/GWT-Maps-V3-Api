package com.google.gwt.maps.client.streetview;

/** 
 * {@link StreetViewPanoramaOptions}
 */
public interface StreetViewPanoramaProvider {
  
  /**
   * This is called when a pano's data is wanted
   * @param pano name of
   * @param zoom
   * @param tileX
   * @param tileY
   * @return
   */
  public StreetViewPanoramaData getPanoData(String pano, int zoom, int tileX, int tileY);
  
}
