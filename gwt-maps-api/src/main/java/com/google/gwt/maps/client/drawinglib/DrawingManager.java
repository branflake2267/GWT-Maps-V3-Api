package com.google.gwt.maps.client.drawinglib;

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
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.events.MapEventType;
import com.google.gwt.maps.client.events.MapHandlerRegistration;
import com.google.gwt.maps.client.events.overlaycomplete.OverlayCompleteEventFormatter;
import com.google.gwt.maps.client.events.overlaycomplete.OverlayCompleteMapHandler;
import com.google.gwt.maps.client.events.overlaycomplete.circle.CircleCompleteEventFormatter;
import com.google.gwt.maps.client.events.overlaycomplete.circle.CircleCompleteMapHandler;
import com.google.gwt.maps.client.events.overlaycomplete.marker.MarkerCompleteEventFormatter;
import com.google.gwt.maps.client.events.overlaycomplete.marker.MarkerCompleteMapHandler;
import com.google.gwt.maps.client.events.overlaycomplete.polygon.PolygonCompleteEventFormatter;
import com.google.gwt.maps.client.events.overlaycomplete.polygon.PolygonCompleteMapHandler;
import com.google.gwt.maps.client.events.overlaycomplete.polyline.PolylineCompleteEventFormatter;
import com.google.gwt.maps.client.events.overlaycomplete.polyline.PolylineCompleteMapHandler;
import com.google.gwt.maps.client.events.overlaycomplete.rectangle.RectangleCompleteEventFormatter;
import com.google.gwt.maps.client.events.overlaycomplete.rectangle.RectangleCompleteMapHandler;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * Allows users to draw markers, polygons, polylines, rectangles, and circles on the map. The DrawingManager's drawing
 * mode defines the type of overlay that will be created by the user. Adds a control to the map, allowing the user to
 * switch drawing mode. This class extends MVCObject. <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#DrawingManager" >DrawingManager
 * API Doc</a>
 */
public class DrawingManager extends MVCObject<DrawingManager> {

  /**
   * use newInstance();
   */
  protected DrawingManager() {
  }

  /**
   * Creates a DrawingManager that allows users to draw overlays on the map, and switch between the type of overlay to
   * be drawn with a drawing control.
   * 
   * @param options
   */
  public static final DrawingManager newInstance(DrawingManagerOptions options) {
    return createJso(options).cast();
  }

  private static native JavaScriptObject createJso(DrawingManagerOptions options) /*-{
    return new $wnd.google.maps.drawing.DrawingManager(options);
  }-*/;

  /**
   * Returns the DrawingManager's drawing mode.
   */
  public final OverlayType getDrawingMode() {
    String type = getDrawingModeImpl();
    if (type == null) {
      return null;
    } else {
      return OverlayType.fromValue(type);
    }
  }

  private final native String getDrawingModeImpl() /*-{
    return this.getDrawingMode();
  }-*/;

  /**
   * Changes the DrawingManager's drawing mode, which defines the type of overlay to be added on the map. Accepted
   * values are MARKER, POLYGON, POLYLINE, RECTANGLE, CIRCLE, or null. A drawing mode of null means that the user can
   * interact with the map as normal, and clicks do not draw anything.
   * 
   * @param drawingMode
   */
  public final void setDrawingMode(OverlayType drawingMode) {
    String value = (drawingMode != null) ? drawingMode.value() : null;
    setDrawingModeImpl(value);
  }

  private final native void setDrawingModeImpl(String drawingMode) /*-{
    this.setDrawingMode(drawingMode);
  }-*/;

  /**
   * Attaches the DrawingManager object to the specified Map.
   * 
   * @param mapWidget
   */
  public final void setMap(MapWidget mapWidget) {
    MapImpl value = (mapWidget != null) ? mapWidget.getJso() : null;
    setMapImpl(value);
  }

  private final native void setMapImpl(MapImpl map) /*-{
    this.setMap(map);
  }-*/;

  /**
   * Returns the Map to which the DrawingManager is attached, which is the Map on which the overlays created will be
   * placed.
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }

  private final native MapImpl getMapImpl() /*-{
    return this.getMap();
  }-*/;

  /**
   * This event is fired when the user has finished drawing a circle.
   * 
   * @param handler
   */
  public final HandlerRegistration addCircleCompleteHandler(CircleCompleteMapHandler handler) {
    return MapHandlerRegistration.addHandlerDrawing(this, MapEventType.CIRCLECOMPLETE, handler,
        new CircleCompleteEventFormatter());
  }

  /**
   * This event is fired when the user has finished drawing a marker.
   * 
   * @param handler
   */
  public final HandlerRegistration addMarkerCompleteHandler(MarkerCompleteMapHandler handler) {
    return MapHandlerRegistration.addHandlerDrawing(this, MapEventType.MARKERCOMPLETE, handler,
        new MarkerCompleteEventFormatter());
  }

  /**
   * This event is fired when the user has finished drawing an overlay of any type.
   * 
   * @param handler
   */
  public final HandlerRegistration addOverlayCompleteHandler(OverlayCompleteMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.OVERLAYCOMPLETE, handler,
        new OverlayCompleteEventFormatter());
  }

  /**
   * This event is fired when the user has finished drawing a polygon.
   * 
   * @param handler
   */
  public final HandlerRegistration addPolygonCompleteHandler(PolygonCompleteMapHandler handler) {
    return MapHandlerRegistration.addHandlerDrawing(this, MapEventType.POLYGONCOMPLETE, handler,
        new PolygonCompleteEventFormatter());
  }

  /**
   * This event is fired when the user has finished drawing a polyline.
   * 
   * @param handler
   */
  public final HandlerRegistration addPolylineCompleteHandler(PolylineCompleteMapHandler handler) {
    return MapHandlerRegistration.addHandlerDrawing(this, MapEventType.POLYLINECOMPLETE, handler,
        new PolylineCompleteEventFormatter());
  }

  /**
   * This event is fired when the user has finished drawing a rectangle.
   * 
   * @param handler
   */
  public final HandlerRegistration addRectangleCompleteHandler(RectangleCompleteMapHandler handler) {
    return MapHandlerRegistration.addHandlerDrawing(this, MapEventType.RECTANGLECOMPLETE, handler,
        new RectangleCompleteEventFormatter());
  }

}
