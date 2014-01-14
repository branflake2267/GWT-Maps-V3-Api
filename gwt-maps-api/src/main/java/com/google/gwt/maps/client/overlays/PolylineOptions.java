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
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.mvc.MVCArray;

/**
 * polyline options <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#PolylineOptions">PolylineOptions
 * API Doc</a>
 */
public class PolylineOptions extends JavaScriptObject {
  /**
   * use newInstance();
   */
  protected PolylineOptions() {
  }

  /**
   * creates a new instance of options
   */
  public final static PolylineOptions newInstance() {
    PolylineOptions obj = JavaScriptObject.createObject().cast();
    obj.setDefaults();
    return obj;
  }

  /**
   * Set expected defaults
   */
  private void setDefaults() {
    this.setGeodesic(false);
    this.setVisible(true);
    this.setClickable(true);
  }

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
   * sets When true, render each edge as a geodesic (a segment of a "great circle"). A geodesic is the shortest path
   * between two points along the surface of the Earth. When false, render each edge as a straight line on screen.
   * Defaults to false.
   * 
   * @param geodesic
   */
  public final native void setGeodesic(boolean geodesic) /*-{
    this.geodesic = geodesic;
  }-*/;

  /**
   * gets When true, render each edge as a geodesic (a segment of a "great circle"). A geodesic is the shortest path
   * between two points along the surface of the Earth. When false, render each edge as a straight line on screen.
   * Defaults to false.
   */
  public final native boolean getGeodesic() /*-{
    return this.geodesic;
  }-*/;
  
  /**
   * Set the icons to be rendered along the polyline.
   * 
   * @param sequence
   */
  public final native void setIcons(JsArray<IconSequence> sequence) /*-{
    this.icons = sequence;
  }-*/;
  
  /**
   * Get the icons to be rendered along the polyline.
   */
  public final native JsArray<IconSequence> getIcons() /*-{
    return this.icons;
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
   * sets The ordered sequence of coordinates of the Polyline. This path may be specified using either a simple array of
   * LatLngs, or an MVCArray of LatLngs. Note that if you pass a simple array, it will be converted to an MVCArray
   * Inserting or removing LatLngs in the MVCArray will automatically update the polyline on the map.
   * 
   * @param path
   */
  public final native void setPath(MVCArray<LatLng> path) /*-{
    this.path = path;
  }-*/;

  /**
   * sets The ordered sequence of coordinates of the Polyline. This path may be specified using either a simple array of
   * LatLngs, or an MVCArray of LatLngs. Note that if you pass a simple array, it will be converted to an MVCArray
   * Inserting or removing LatLngs in the MVCArray will automatically update the polyline on the map.
   * 
   * @param path
   */
  public final native void setPath(JsArray<LatLng> path) /*-{
    this.path = path;
  }-*/;

  /**
   * gets The ordered sequence of coordinates of the Polyline. This path may be specified using either a simple array of
   * LatLngs, or an MVCArray of LatLngs. Note that if you pass a simple array, it will be converted to an MVCArray
   * Inserting or removing LatLngs in the MVCArray will automatically update the polyline on the map.
   */
  public final native MVCArray<LatLng> getPath_MVCArray() /*-{
    return this.path;
  }-*/;

  /**
   * gets The ordered sequence of coordinates of the Polyline. This path may be specified using either a simple array of
   * LatLngs, or an MVCArray of LatLngs. Note that if you pass a simple array, it will be converted to an MVCArray
   * Inserting or removing LatLngs in the MVCArray will automatically update the polyline on the map.
   */
  public final native JsArray<LatLng> getPath_JsArray() /*-{
    return this.path;
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
   * Whether this polyline is visible on the map. Defaults to <code>true</code>.
   * 
   * @param isVisible
   */
  public final native void setVisible(boolean isVisible) /*-{
    this.visible = isVisible;
  }-*/;

  /**
   * Whether this polyline is visible on the map. Defaults to <code>true</code>.
   * 
   */
  public final native boolean getVisible() /*-{
    return this.visible;
  }-*/;

  /**
   * sets The zIndex compared to other polys.
   * 
   * @param zIndex
   */
  public final native void setZindex(int zIndex) /*-{
    this.zIndex = zIndex;
  }-*/;

  /**
   * gets The zIndex compared to other polys.
   */
  public final native int getZindex() /*-{
    return this.zIndex;
  }-*/;
  
}
