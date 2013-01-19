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
import com.google.gwt.maps.client.base.Point;
import com.google.gwt.maps.client.base.Size;

/**
 * This class is used to create a MapType that renders image tiles. <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#ImageMapTypeOptions"
 * >ImageMapTypeOptions API Doc</a>
 */
public class ImageMapTypeOptions extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected ImageMapTypeOptions() {
  }

  /**
   * This class is used to create a MapType that renders image tiles.
   */
  public final static ImageMapTypeOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * set Alt text to display when this MapType's button is hovered over in the MapTypeControl.
   * 
   * @param alt
   */
  public final native void setAlt(String alt) /*-{
    this.alt = alt;
  }-*/;

  /**
   * get Alt text to display when this MapType's button is hovered over in the MapTypeControl.
   */
  public final native String getAlt() /*-{
    return this.alt;
  }-*/;

  /**
   * setup a callback to process the url creation Returns a string (URL) for given tile coordinate (x, y) and zoom
   * level. This function should have a signature of: getTileUrl(Point, number):string
   * 
   * @param callback
   */
  public final native void setTileUrl(TileUrlCallBack callback) /*-{
    this.getTileUrl = function(point, zoomLevel) {
      return @com.google.gwt.maps.client.maptypes.ImageMapTypeOptions::processTileUrlCallBack(Lcom/google/gwt/maps/client/base/Point;ILcom/google/gwt/maps/client/maptypes/TileUrlCallBack;)(point, zoomLevel, callback);
    };
  }-*/;

  /**
   * process the callback internally
   * 
   * @param point
   * @param zoomLevel
   * @param callback
   */
  private final static String processTileUrlCallBack(Point point, int zoomLevel, TileUrlCallBack callback) {
    return callback.getTileUrl(point, zoomLevel);
  }

  /**
   * sets The maximum zoom level for the map when displaying this MapType.
   * 
   * @param maxZoom
   */
  public final native void setMaxZoom(int maxZoom) /*-{
    this.maxZoom = maxZoom;
  }-*/;

  /**
   * gets The maximum zoom level for the map when displaying this MapType.
   */
  public final native int getMaxZoom() /*-{
    return this.maxZoom;
  }-*/;

  /**
   * sets The minimum zoom level for the map when displaying this MapType. Optional.
   * 
   * @param minZoom
   */
  public final native void setMinZoom(int minZoom) /*-{
    this.minZoom = minZoom;
  }-*/;

  /**
   * gets The minimum zoom level for the map when displaying this MapType. Optional.
   */
  public final native int getMinZoom() /*-{
    return this.minZoom;
  }-*/;

  /**
   * set Name to display in the MapTypeControl.
   * 
   * @param name
   */
  public final native void setName(String name) /*-{
    this.name = name;
  }-*/;

  /**
   * gets Name to display in the MapTypeControl.
   */
  public final native String getName() /*-{
    return this.name;
  }-*/;

  /**
   * The opacity to apply to the tiles. The opacity should be specified as a float value between 0 and 1.0, where 0 is
   * fully transparent and 1 is fully opaque.
   * 
   * @param opacity
   */
  public final native void setOpacity(double opacity) /*-{
    this.opacity = opacity;
  }-*/;

  /**
   * gets The opacity to apply to the tiles. The opacity should be specified as a float value between 0 and 1.0, where 0
   * is fully transparent and 1 is fully opaque.
   */
  public final native double getOpacity() /*-{
    return this.opacity;
  }-*/;

  /**
   * sets The tile size.
   * 
   * @param size
   */
  public final native void setTileSize(Size size) /*-{
    this.tileSize = size;
  }-*/;

  /**
   * gets The tile size.
   */
  public final native Size getTileSize() /*-{
    return this.tileSize;
  }-*/;

}
