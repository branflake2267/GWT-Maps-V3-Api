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
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.events.MapEventType;
import com.google.gwt.maps.client.events.MapHandlerRegistration;
import com.google.gwt.maps.client.events.directions.DirectionsChangeEventFormatter;
import com.google.gwt.maps.client.events.directions.DirectionsChangeMapHandler;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * Renders directions retrieved in the form of a DirectionsResult object retrieved from the DirectionsService. This
 * class extends MVCObject. <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#DirectionsRenderer"
 * >DirectionsRenderer API Doc</a>
 */
public class DirectionsRenderer extends MVCObject<DirectionsRenderer> {

  /**
   * use newInstance();
   */
  protected DirectionsRenderer() {
  }

  /**
   * Renders directions retrieved in the form of a DirectionsResult object retrieved from the DirectionsService. This
   * class extends MVCObject.
   * 
   * @param options
   */
  public static final DirectionsRenderer newInstance(DirectionsRendererOptions options) {
    JavaScriptObject jso = createJso(options);
    return jso.cast();
  }

  private static final native JavaScriptObject createJso(DirectionsRendererOptions options) /*-{
    return new $wnd.google.maps.DirectionsRenderer(options);
  }-*/;

  /**
   * Returns the renderer's current set of directions.
   */
  public final native DirectionsResult getDirections() /*-{
    return this.getDirections();
  }-*/;

  /**
   * This method specifies the map on which directions will be rendered. Pass null to remove the directions from the
   * map.
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
    this.setMap(map);
  }-*/;

  /**
   * Returns the map on which the DirectionsResult is rendered.
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }

  private final native MapImpl getMapImpl() /*-{
    return this.getMap();
  }-*/;

  /**
   * Returns the panel <code>&lt;div&gt;</code> in which the DirectionsResult is rendered.
   */
  public final native Element getPanel() /*-{
    return this.getPanel();
  }-*/;

  /**
   * Returns the current (zero-based) route index in use by this DirectionsRenderer object.
   */
  public final native int getRouteIndex() /*-{
    return this.getRouteIndex();
  }-*/;

  /**
   * Set the renderer to use the result from the DirectionsService. Setting a valid set of directions in this manner
   * will display the directions on the renderer's designated map and panel.
   * 
   * @param directions
   */
  public final native void setDirections(DirectionsResult directions) /*-{
    this.setDirections(directions);
  }-*/;

  /**
   * Change the options settings of this DirectionsRenderer after initialization.
   * 
   * @param options
   */
  public final native void setOptions(DirectionsRendererOptions options) /*-{
    this.setOptions(options);
  }-*/;

  /**
   * This method renders the directions in a <code>&lt;div&gt;</code>. Pass null to remove the content from the panel.
   * 
   * @param element
   */
  public final native void setPanel(Element element) /*-{
    this.setPanel(element);
  }-*/;

  /**
   * Set the (zero-based) index of the route in the DirectionsResult object to render. By default, the first route in
   * the array will be rendered.
   * 
   * @param routeIndex
   */
  public final native void setRouteIndex(int routeIndex) /*-{
    this.setRouteIndex(routeIndex);
  }-*/;

  /**
   * This event is fired when the rendered directions change, either when a new DirectionsResult is set or when the user
   * finishes dragging a change to the directions path.
   * 
   * @param handler
   */
  public final HandlerRegistration addDirectionsChangeHandler(DirectionsChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.DIRECTIONS_CHANGED, handler,
        new DirectionsChangeEventFormatter());
  }

}
