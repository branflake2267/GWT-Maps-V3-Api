package com.google.gwt.maps.client.drawinglib;

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
 *  Allows users to draw markers, polygons, polylines, rectangles, and circles on the map. The DrawingManager's drawing mode defines the type of overlay that will be created by the user. Adds a control to the map, allowing the user to switch drawing mode. This class extends MVCObject.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#DrawingManager}
 */
public class DrawingManager extends MVCObject<DrawingManager> {
  
  /**
   * use newInstance();
   */
  protected DrawingManager() {}
  
  /**
   * Creates a DrawingManager that allows users to draw overlays on the map, and switch between the type of overlay to be drawn with a drawing control.
   * @param options
   * @return
   */
  public static final DrawingManager newInstance(DrawingManagerOptions options) {
    return createJso(options).cast();
  }

  private static native JavaScriptObject createJso(DrawingManagerOptions options) /*-{
    return new $wnd.google.maps.drawing.DrawingManager(options);
  }-*/;
  
  /**
   * Returns the DrawingManager's drawing mode.
   * @return
   */
  public final OverlayType getDrawingMode() {
    return OverlayType.fromValue(getDrawingModeImpl());
  }
  
  private final native String getDrawingModeImpl() /*-{
    return this.getDrawingMode();
  }-*/;
  
  /**
   * Changes the DrawingManager's drawing mode, which defines the type of overlay to be added on the map. Accepted values are MARKER, POLYGON, POLYLINE, RECTANGLE, CIRCLE, or null. A drawing mode of null means that the user can interact with the map as normal, and clicks do not draw anything.
   * @param drawingMode
   */
  public final void setDrawingMode(OverlayType drawingMode) {
    setDrawingModeImpl(drawingMode.value());
  }
  
  private final native void setDrawingModeImpl(String drawingMode) /*-{
    this.setDrawingMode(drawingmode);
  }-*/;
  
  /**
   * Attaches the DrawingManager object to the specified Map.
   * @param mapWidget
   */
  public final void setMap(MapWidget mapWidget) {
    setMapImpl(mapWidget.getJso());
  }
  
  private final native void setMapImpl(MapImpl map) /*-{
    this.setMap(map);
  }-*/;
  
  /**
   * Returns the Map to which the DrawingManager is attached, which is the Map on which the overlays created will be placed.
   * @return
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }

  private final native MapImpl getMapImpl() /*-{
    return this.getMap();
  }-*/;
  
  /**
   * This event is fired when the user has finished drawing a circle.
   * @param handler
   * @return
   */
  public final HandlerRegistration addCircleCompleteHandler(CircleCompleteMapHandler handler) {
    return MapHandlerRegistration.addHandlerDrawing(this, MapEventType.CIRCLECOMPLETE, handler, new CircleCompleteEventFormatter());
  }
  
  /**
   * This event is fired when the user has finished drawing a marker.
   * @param handler
   * @return
   */
  public final HandlerRegistration addMarkerCompleteHandler(MarkerCompleteMapHandler handler) {
    return MapHandlerRegistration.addHandlerDrawing(this, MapEventType.MARKERCOMPLETE, handler, new MarkerCompleteEventFormatter());
  }
  
  /**
   * This event is fired when the user has finished drawing an overlay of any type.
   * @param handler
   * @return
   */
  public final HandlerRegistration addOverlayCompleteHandler(OverlayCompleteMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.OVERLAYCOMPLETE, handler, new OverlayCompleteEventFormatter());
  }
  
  /**
   * This event is fired when the user has finished drawing a polygon.
   * @param handler
   * @return
   */
  public final HandlerRegistration addPolygonCompleteHandler(PolygonCompleteMapHandler handler) {
    return MapHandlerRegistration.addHandlerDrawing(this, MapEventType.POLYGONCOMPLETE, handler, new PolygonCompleteEventFormatter());
  }
  
  /**
   * This event is fired when the user has finished drawing a polyline.
   * @param handler
   * @return
   */
  public final HandlerRegistration addPolylineCompleteHandler(PolylineCompleteMapHandler handler) {
    return MapHandlerRegistration.addHandlerDrawing(this, MapEventType.POLYLINECOMPLETE, handler, new PolylineCompleteEventFormatter());
  }
  
  /**
   * This event is fired when the user has finished drawing a rectangle.
   * @param handler
   * @return
   */
  public final HandlerRegistration addRectangleCompleteHandler(RectangleCompleteMapHandler handler) {
    return MapHandlerRegistration.addHandlerDrawing(this, MapEventType.RECTANGLECOMPLETE, handler, new RectangleCompleteEventFormatter());
  }
  
}
