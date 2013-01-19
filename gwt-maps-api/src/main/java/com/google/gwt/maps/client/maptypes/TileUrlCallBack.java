package com.google.gwt.maps.client.maptypes;

/*
 * #%L
 * GWT Maps API V3 - Core API
 * %%
 * Copyright (C) 2011 - 2012 GWT Maps API V3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.google.gwt.maps.client.base.Point;

public interface TileUrlCallBack {

  /**
   * Returns a string (URL) for given tile coordinate (x, y) and zoom level. This function should have a signature of:
   * getTileUrl(Point, number):string <br>
   * <br>
   * See <a href="https://developers.google.com/maps/documentation/javascript/maptypes">MapTypes API Doc</a> Something
   * like can be done: "http://mt3.google.com/mapstt?zoom=" + zoomLevel + "&x=" + point.getX() + "&y=" + point.getY() +
   * "&client=api";
   * 
   * @param point x,y coordinates
   * @param zoomLevel zoomLevel
   */
  public String getTileUrl(Point point, int zoomLevel);
}
