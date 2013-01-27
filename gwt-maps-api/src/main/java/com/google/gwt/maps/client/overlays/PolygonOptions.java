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

public class PolygonOptions extends JavaScriptObject {

  protected PolygonOptions() {
  }

  public final static PolygonOptions newInstance() {
    PolygonOptions obj = JavaScriptObject.createObject().cast();
    obj.setDefaults();
    return obj;
  }

  /**
   * Set expected defaults
   */
  private void setDefaults() {
    setEditable(false);
    setGeodesic(false);
    setVisible(true);
    setClickable(true);
  }

  /**
   * Whether this polygon is visible on the map. Defaults to <code>true</code>
   * 
   * @param visible
   */
  public final native void setVisible(boolean visible) /*-{
    this.visible = visible;
  }-*/;

  /**
   * Whether this polygon is visible on the map. Defaults to <code>true</code> .
   * 
   */
  public final native boolean getVisible() /*-{
    return this.visible;
  }-*/;

  /**
   * If set to true, the user can edit this shape by dragging the control points shown at the vertices and on each
   * segment. Defaults to false.
   * 
   * @param isEditable
   */
  public final native void setEditable(boolean isEditable) /*-{
    this.editable = isEditable;
  }-*/;

  /**
   * Whether the user can edit this shape by dragging the control points shown at the vertices and on each segment.
   * 
   */
  public final native boolean getEditable() /*-{
    return this.editable;
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
   * Renders the Polygone on the map
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
   * The ordered sequence of coordinates that designates a closed loop. Unlike polygons, a polygon may consist of one or
   * more paths. As a result, the paths property may specify one or more arrays of LatLng coordinates. Simple polygons
   * may be defined using a single array of LatLngs. More complex polygons may specify an array of arrays. Any simple
   * arrays are convered into MVCArrays. Inserting or removing LatLngs from the MVCArray will automatically update the
   * polygon on the map.
   * 
   * @param paths
   */
  public final native void setPaths(MVCArray<LatLng> paths) /*-{
    this.paths = paths;
  }-*/;

  public final native MVCArray<LatLng> getPaths_MVCArray() /*-{
    return this.paths;
  }-*/;

  /**
   * The ordered sequence of coordinates that designates a closed loop. Unlike polygons, a polygon may consist of one or
   * more paths. As a result, the paths property may specify one or more arrays of LatLng coordinates. Simple polygons
   * may be defined using a single array of LatLngs. More complex polygons may specify an array of arrays. Any simple
   * arrays are convered into MVCArrays. Inserting or removing LatLngs from the MVCArray will automatically update the
   * polygon on the map.
   * 
   * @param paths
   */
  public final native void setPathss(MVCArray<MVCArray<LatLng>> paths) /*-{
    this.paths = paths;
  }-*/;

  public final native MVCArray<MVCArray<LatLng>> getPathss_MVCArray() /*-{
    return this.paths;
  }-*/;

  /**
   * The ordered sequence of coordinates that designates a closed loop. Unlike polygons, a polygon may consist of one or
   * more paths. As a result, the paths property may specify one or more arrays of LatLng coordinates. Simple polygons
   * may be defined using a single array of LatLngs. More complex polygons may specify an array of arrays. Any simple
   * arrays are convered into MVCArrays. Inserting or removing LatLngs from the MVCArray will automatically update the
   * polygon on the map.
   * 
   * @param paths
   */
  public final native void setPaths(JsArray<LatLng> paths) /*-{
    this.paths = paths;
  }-*/;

  public final native JsArray<LatLng> getPaths_JsArray() /*-{
    return this.paths;
  }-*/;

  /**
   * The ordered sequence of coordinates that designates a closed loop. Unlike polygons, a polygon may consist of one or
   * more paths. As a result, the paths property may specify one or more arrays of LatLng coordinates. Simple polygons
   * may be defined using a single array of LatLngs. More complex polygons may specify an array of arrays. Any simple
   * arrays are convered into MVCArrays. Inserting or removing LatLngs from the MVCArray will automatically update the
   * polygon on the map.
   * 
   * @param paths
   */
  public final native void setPathss(JsArray<JsArray<LatLng>> paths) /*-{
    this.paths = paths;
  }-*/;

  public final native JsArray<JsArray<LatLng>> getPathss_JsArray() /*-{
    return this.paths;
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
