package com.google.gwt.maps.client.maptypes;

import com.google.gwt.maps.client.base.Point;

public interface TileUrlCallBack {

  /**
   * Returns a string (URL) for given tile coordinate (x, y) and zoom level. This function should have a signature of: getTileUrl(Point, number):string
   * <br><br>
   * See <a href="https://developers.google.com/maps/documentation/javascript/maptypes">MapTypes API Doc</a>
   * Something like can be done:
   * "http://mt3.google.com/mapstt?zoom=" + zoomLevel + "&x=" + point.getX() + "&y=" + point.getY() + "&client=api";
   * 
   * @param point x,y coordinates
   * @param zoomLevel zoomLevel
   */
  public String getTileUrl(Point point, int zoomLevel);
}
