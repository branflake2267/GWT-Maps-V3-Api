package com.google.gwt.maps.client.streetview;

public interface TileUrlHandler {

  public String getTileUrl(String pano, int zoom, int tileX, int tileY);
  
}
