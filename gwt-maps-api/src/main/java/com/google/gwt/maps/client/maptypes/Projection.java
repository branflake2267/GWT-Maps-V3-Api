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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Point;

/**
 * Map Projection Util relating to screen <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#Projection">Projection API Doc</a>
 */
public class Projection extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected Projection() {
  }

  /**
   * Translates from the LatLng cylinder to the Point plane. This interface specifies a function which implements
   * translation from given LatLng values to world coordinates on the map projection. The Maps API calls this method
   * when it needs to plot locations on screen. Projection objects must implement this method.
   * 
   * @param latlng {@link LatLng}
   * @param point {@link Point}
   */
  public final native Point fromLatLngToPoint(LatLng latlng, Point point) /*-{
    return this.fromLatLngToPoint(latlng, point);
  }-*/;

  /**
   * This interface specifies a function which implements translation from world coordinates on a map projection to
   * LatLng values. The Maps API calls this method when it needs to translate actions on screen to positions on the map.
   * Projection objects must implement this method.
   * 
   * @param pixel {@link Point}
   * @param nowrap
   */
  public final native LatLng fromPointToLatLng(Point pixel, boolean nowrap) /*-{
    return this.fromPointToLatLng(pixel, nowrap);
  }-*/;

}
