package com.google.gwt.maps.client.services;

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
import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.overlays.InfoWindow;
import com.google.gwt.maps.client.overlays.MarkerOptions;
import com.google.gwt.maps.client.overlays.PolylineOptions;

/**
 * This object defines the properties that can be set on a DirectionsRenderer object. <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#DirectionsRendererOptions"
 * >DirectionsRendererOptions API Doc</a>
 */
public class DirectionsRendererOptions extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected DirectionsRendererOptions() {
  }

  /**
   * This object defines the properties that can be set on a DirectionsRenderer object.
   */
  public static final DirectionsRendererOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * The directions to display on the map and/or in a <code>&lt;div&gt;</code> panel, retrieved as a DirectionsResult
   * object from DirectionsService.
   * 
   * @param directions
   */
  public final native void setDirections(DirectionsResult directions) /*-{
    this.directions = directions;
  }-*/;

  /**
   * The directions to display on the map and/or in a <code>&lt;div&gt;</code> panel, retrieved as a DirectionsResult
   * object from DirectionsService.
   */
  public final native DirectionsResult getDirections() /*-{
    return this.directions;
  }-*/;

  /**
   * If true, allows the user to drag and modify the paths of routes rendered by this DirectionsRenderer.
   * 
   * @param draggable
   */
  public final native void setDraggable(boolean draggable) /*-{
    this.draggable = draggable;
  }-*/;

  /**
   * If true, allows the user to drag and modify the paths of routes rendered by this DirectionsRenderer.
   */
  public final native boolean getDraggable() /*-{
    return this.draggable;
  }-*/;

  /**
   * This property indicates whether the renderer should provide UI to select amongst alternative routes. By default,
   * this flag is false and a user-selectable list of routes will be shown in the directions' associated panel. To hide
   * that list, set hideRouteList to true.
   * 
   * @param hideRouteList
   */
  public final native void setHideRouteList(boolean hideRouteList) /*-{
    this.hideRouteList = hideRouteList;
  }-*/;

  /**
   * This property indicates whether the renderer should provide UI to select amongst alternative routes. By default,
   * this flag is false and a user-selectable list of routes will be shown in the directions' associated panel. To hide
   * that list, set hideRouteList to true.
   */
  public final native boolean getHideRouteList() /*-{
    return this.hideRouteList;
  }-*/;

  /**
   * The InfoWindow in which to render text information when a marker is clicked. Existing info window content will be
   * overwritten and its position moved. If no info window is specified, the DirectionsRenderer will create and use its
   * own info window. This property will be ignored if suppressInfoWindows is set to true.
   * 
   * @param infoWindow
   */
  public final native void setInfoWindow(InfoWindow infoWindow) /*-{
    this.infoWindow = infoWindow;
  }-*/;

  /**
   * The InfoWindow in which to render text information when a marker is clicked. Existing info window content will be
   * overwritten and its position moved. If no info window is specified, the DirectionsRenderer will create and use its
   * own info window. This property will be ignored if suppressInfoWindows is set to true.
   */
  public final native InfoWindow getInfoWindow() /*-{
    return this.infoWindow;
  }-*/;

  /**
   * Map on which to display the directions.
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
   * Map on which to display the directions.
   */
  public final MapWidget getMap() {
    MapImpl obj = getMapImpl();
    return obj != null ? MapWidget.newInstance(obj) : null;
  }

  /**
   * Map on which to display the directions. <br>
   * <br>
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
   * Options for the markers. All markers rendered by the DirectionsRenderer will use these options.
   * 
   * @param markerOptions
   */
  public final native void setMarkerOptions(MarkerOptions markerOptions) /*-{
    this.markerOptions = markerOptions;
  }-*/;

  /**
   * Options for the markers. All markers rendered by the DirectionsRenderer will use these options.
   */
  public final native MarkerOptions getMarkerOptions() /*-{
    return this.markerOptions;
  }-*/;

  /**
   * The <code>&lt;div&gt;</code> in which to display the directions steps.
   * 
   * @param panel
   */
  public final native void setPanel(Element panel) /*-{
    this.panel = panel;
  }-*/;

  /**
   * The <code>&lt;div&gt;</code> in which to display the directions steps.
   */
  public final native Element getPanel() /*-{
    return this.panel;
  }-*/;

  /**
   * Options for the polylines. All polylines rendered by the DirectionsRenderer will use these options.
   * 
   * @param polylineOptions
   */
  public final native void setPolylineOptions(PolylineOptions polylineOptions) /*-{
    this.polylineOptions = polylineOptions;
  }-*/;

  /**
   * Options for the polylines. All polylines rendered by the DirectionsRenderer will use these options.
   */
  public final native PolylineOptions getPolylineOptions() /*-{
    return this.polylineOptions;
  }-*/;

  /**
   * By default, the input map is centered and zoomed to the bounding box of this set of directions. If this option is
   * set to true, the viewport is left unchanged, unless the map's center and zoom were never set.
   * 
   * @param preserveViewport
   */
  public final native void setPreserveViewport(boolean preserveViewport) /*-{
    this.preserveViewport = preserveViewport;
  }-*/;

  /**
   * By default, the input map is centered and zoomed to the bounding box of this set of directions. If this option is
   * set to true, the viewport is left unchanged, unless the map's center and zoom were never set.
   */
  public final native boolean getPreserveViewport() /*-{
    return this.preserveViewport;
  }-*/;

  /**
   * The index of the route within the DirectionsResult object. The default value is 0.
   * 
   * @param routeIndex
   */
  public final native void setRouteIndex(int routeIndex) /*-{
    this.routeIndex = routeIndex;
  }-*/;

  /**
   * The index of the route within the DirectionsResult object. The default value is 0.
   */
  public final native int getRouteIndex() /*-{
    return this.routeIndex;
  }-*/;

  /**
   * Suppress the rendering of the BicyclingLayer when bicycling directions are requested.
   * 
   * @param suppressBicyclingLayer
   */
  public final native void setSuppressBicyclingLayer(boolean suppressBicyclingLayer) /*-{
    this.suppressBicyclingLayer = suppressBicyclingLayer;
  }-*/;

  /**
   * Suppress the rendering of the BicyclingLayer when bicycling directions are requested.
   */
  public final native boolean getSuppressBicyclingLayer() /*-{
    return this.suppressBicyclingLayer;
  }-*/;

  /**
   * Suppress the rendering of info windows.
   * 
   * @param suppressInfoWindows
   */
  public final native void setSuppressInfoWindows(boolean suppressInfoWindows) /*-{
    this.suppressInfoWindows = suppressInfoWindows;
  }-*/;

  /**
   * Suppress the rendering of info windows.
   */
  public final native boolean getSuppressInfoWindows() /*-{
    return this.suppressInfoWindows;
  }-*/;

  /**
   * Suppress the rendering of markers.
   * 
   * @param suppressMarkers
   */
  public final native void setSuppressMarkers(boolean suppressMarkers) /*-{
    this.suppressMarkers = suppressMarkers;
  }-*/;

  /**
   * Suppress the rendering of markers.
   */
  public final native boolean getSuppressMarkers() /*-{
    return this.suppressMarkers;
  }-*/;

  /**
   * Suppress the rendering of polylines.
   * 
   * @param suppressPolylines
   */
  public final native void setSuppressPolylines(boolean suppressPolylines) /*-{
    this.suppressPolylines = suppressPolylines;
  }-*/;

  /**
   * Suppress the rendering of polylines.
   */
  public final native boolean getSuppressPolylines() /*-{
    return this.suppressPolylines;
  }-*/;

}
