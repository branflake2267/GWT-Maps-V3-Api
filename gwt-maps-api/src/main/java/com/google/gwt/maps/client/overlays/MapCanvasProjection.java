package com.google.gwt.maps.client.overlays;

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
 * This object is made available to the OverlayView from within the draw method. It is not guaranteed to be initialized
 * until draw is called. <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#MapCanvasProjection"
 * >MapCanvasProjection API Doc</a>
 */
public class MapCanvasProjection extends JavaScriptObject {

  /**
   * returns from another object only
   */
  protected MapCanvasProjection() {
  }

  /**
   * returns from another object only
   */
  public final static MapCanvasProjection newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * Computes the geographical coordinates from pixel coordinates in the map's container.
   * 
   * @param pixel
   */
  public final native LatLng fromContainerPixelToLatLng(Point pixel) /*-{
    return this.fromContainerPixelToLatLng(pixel);
  }-*/;

  /**
   * Computes the geographical coordinates from pixel coordinates in the map's container.
   * 
   * @param pixel
   * @param noWrap
   */
  public final native LatLng fromContainerPixelToLatLng(Point pixel, boolean noWrap) /*-{
    return this.fromContainerPixelToLatLng(pixel, noWrap);
  }-*/;

  /**
   * Computes the geographical coordinates from pixel coordinates in the div that holds the draggable map.
   * 
   * @param pixel
   */
  public final native LatLng fromDivPixelToLatLng(Point pixel) /*-{
    return this.fromDivPixelToLatLng(pixel);
  }-*/;

  /**
   * Computes the geographical coordinates from pixel coordinates in the div that holds the draggable map.
   * 
   * @param pixel
   * @param noWrap
   */
  public final native LatLng fromDivPixelToLatLng(Point pixel, boolean noWrap) /*-{
    return this.fromDivPixelToLatLng(pixel, noWrap);
  }-*/;

  /**
   * Computes the pixel coordinates of the given geographical location in the DOM element the map's outer container.
   * 
   * @param latlng
   */
  public final native Point fromLatLngToContainerPixel(LatLng latlng) /*-{
    return this.fromLatLngToContainerPixel(latlng);
  }-*/;

  /**
   * Computes the pixel coordinates of the given geographical location in the DOM element that holds the draggable map.
   * 
   * @param latlng
   */
  public final native Point fromLatLngToDivPixel(LatLng latlng) /*-{
    return this.fromLatLngToDivPixel(latlng);
  }-*/;

  /**
   * The width of the world in pixels in the current zoom level. For projections with a heading angle of either 90 or
   * 270 degrees, this corresponds to the pixel span in the Y-axis.
   */
  public final native double getWorldWidth() /*-{
    return this.getWorldWidth();
  }-*/;

}
