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
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLngBounds;

/**
 * {@link Rectangle} Options <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#RectangleOptions"
 * >RectangleOptions API Doc</a>
 */
public class RectangleOptions extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected RectangleOptions() {
  }

  /**
   * creates Rectangle options
   */
  public final static RectangleOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * sets The bounds.
   * 
   * @param bounds
   */
  public final native void setBounds(LatLngBounds bounds) /*-{
    this.bounds = bounds;
  }-*/;

  /**
   * gets The bounds.
   */
  public final native LatLngBounds getBounds() /*-{
    return this.bounds;
  }-*/;

  /**
   * sets Indicates whether this Polyline handles click events. Defaults to true.
   * 
   * @param clickable
   */
  public final native void setClickable(boolean clickable) /*-{
    this.clickable = clickable;
  }-*/;

  /**
   * gets Indicates whether this Polyline handles click events. Defaults to true.
   */
  public final native boolean getClickable() /*-{
    return this.clickable;
  }-*/;

  /**
   * The fill color. All CSS3 colors are supported except for extended named colors.
   * 
   * @param fillColor
   */
  public final native void setFillColor(String fillColor) /*-{
    this.fillColor = fillColor;
  }-*/;

  /**
   * The fill color. All CSS3 colors are supported except for extended named colors.
   */
  public final native String getFillColor() /*-{
    return this.fillColor;
  }-*/;

  /**
   * The fill opacity between 0.0 and 1.0
   * 
   * @param fillOpacity
   */
  public final native void setFillOpacity(double fillOpacity) /*-{
    this.fillOpacity = fillOpacity;
  }-*/;

  /**
   * The fill opacity between 0.0 and 1.0
   */
  public final native double getFillOpacity() /*-{
    return this.fillOpacity;
  }-*/;

  /**
   * sets Map on which to display Polyline.
   * 
   * @param mapWidget
   */
  public final void setMap(MapWidget mapWidget) {
    if (mapWidget == null) {
      setMapImpl(null);
    } else {
      setMapImpl(mapWidget.getJso());
    }
  }

  private final native void setMapImpl(MapImpl map) /*-{
    this.map = map;
  }-*/;

  /**
   * Gets Map on which to display Polyline.
   */
  public final MapWidget getMap() {
    MapImpl obj = getMapImpl();
    return obj != null ? MapWidget.newInstance(obj) : null;
  }

  /**
   * Gets Map on which to display Polyline. <br>
   * See {@link #getMap()}.<br>
   * Method will be removed in version 3.11
   */
  @Deprecated
  public final MapWidget getMapWidget() {
    MapImpl obj = getMapImpl();
    return obj != null ? MapWidget.newInstance(obj) : null;
  }

  private final native MapImpl getMapImpl() /*-{
    return this.map;
  }-*/;

  /**
   * sets The stroke color. All CSS3 colors are supported except for extended named colors.
   * 
   * @param strokeColor
   */
  public final native void setStrokeColor(String strokeColor) /*-{
    this.strokeColor = strokeColor;
  }-*/;

  /**
   * gets The stroke color. All CSS3 colors are supported except for extended named colors.
   */
  public final native String getStrokeColor() /*-{
    return this.strokeColor;
  }-*/;

  /**
   * sets The stroke opacity between 0.0 and 1.0
   * 
   * @param strokeOpacity
   */
  public final native void setStrokeOpacity(double strokeOpacity) /*-{
    this.strokeOpacity = strokeOpacity;
  }-*/;

  /**
   * gets The stroke opacity between 0.0 and 1.0
   */
  public final native double getStrokeOpacity() /*-{
    return this.strokeOpacity;
  }-*/;

  /**
   * sets The stroke width in pixels.
   * 
   * @param strokeWeight
   */
  public final native void setStrokeWeight(int strokeWeight) /*-{
    this.strokeWeight = strokeWeight;
  }-*/;

  /**
   * gets The stroke width in pixels.
   */
  public final native int getStrokeWeight() /*-{
    return this.strokeWeight;
  }-*/;

  /**
   * sets The zIndex compared to other rectangles.
   * 
   * @param zIndex
   */
  public final native void setZindex(int zIndex) /*-{
    this.zIndex = zIndex;
  }-*/;

  /**
   * gets The zIndex compared to other rectangles.
   */
  public final native int getZindex() /*-{
    return this.zIndex;
  }-*/;
  
}
