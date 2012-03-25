package com.google.gwt.maps.client.overlays;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.events.MapEventType;
import com.google.gwt.maps.client.events.MapHandlerRegistration;
import com.google.gwt.maps.client.events.click.ClickEventFormatter;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.maps.client.events.dblclick.DblClickEventFormatter;
import com.google.gwt.maps.client.events.dblclick.DblClickMapHandler;
import com.google.gwt.maps.client.events.mousedown.MouseDownEventFormatter;
import com.google.gwt.maps.client.events.mousedown.MouseDownMapHandler;
import com.google.gwt.maps.client.events.mousemove.MouseMoveEventFormatter;
import com.google.gwt.maps.client.events.mousemove.MouseMoveMapHandler;
import com.google.gwt.maps.client.events.mouseout.MouseOutEventFormatter;
import com.google.gwt.maps.client.events.mouseout.MouseOutMapHandler;
import com.google.gwt.maps.client.events.mouseover.MouseOverEventFormatter;
import com.google.gwt.maps.client.events.mouseover.MouseOverMapHandler;
import com.google.gwt.maps.client.events.mouseup.MouseUpEventFormatter;
import com.google.gwt.maps.client.events.mouseup.MouseUpMapHandler;
import com.google.gwt.maps.client.events.rightclick.RightClickEventFormatter;
import com.google.gwt.maps.client.events.rightclick.RightClickMapHandler;
import com.google.gwt.maps.client.mvc.MVCArray;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * A polyline is a linear overlay of connected line segments on the map. This class extends MVCObject.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#Polyline} 
 */
public class Polyline extends MVCObject<Polyline> {

  /**
   * use newInstance();
   * 
   */
  protected Polyline() {}

  /**
   * Create a polyline using the passed PolylineOptions, which specify both the path of the polyline and the stroke style to use when drawing the polyline. You may pass either an array of LatLngs or an MVCArray of LatLngs when constructing a polyline, though simple arrays are converted to MVCArrays within the polyline upon instantiation.
   * @param options {@link PolylineOptions}
   * @return
   */
  public static final Polyline newInstance(PolylineOptions options) {
    return createJso(options).cast();
  }

  private static native JavaScriptObject createJso(PolylineOptions options) /*-{
    return new $wnd.google.maps.Polyline(options);
  }-*/;
  
  /**
   * Returns whether this shape can be edited by the user.
   * @return
   */
  public final native boolean getEditable() /*-{
    return this.getEditable();
  }-*/;
  
  /**
   * Returns the map on which this shape is attached.
   * @return
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }
  
  private final native MapImpl getMapImpl() /*-{
    return this.getMap();
  }-*/;
  
  /**
   * Retrieves the first path.
   * @return
   */
  public final native MVCArray<LatLng> getPath() /*-{
    return this.getPath();
  }-*/;
  
  /**
   * If set to true, the user can edit this shape by dragging the control points shown at the vertices and on each segment.
   * @param editable
   */
  public final native void setEditable(boolean editable) /*-{
    this.setEditable(editable);
  }-*/;
  
  /**
   * Renders this shape on the specified map. If map is set to null, the shape will be removed.
   * @param mapWidget
   */
  public final void setMap(MapWidget mapWidget) {
    setMapImpl(mapWidget.getJso());
  }
 
  private final native void setMapImpl(MapImpl impl) /*-{
    this.setMap(impl);
  }-*/;
  
  /**
   * set Options
   * @param options
   */
  public final native void setOptions(PolylineOptions options) /*-{
    this.setOptions(options);
  }-*/;
  
  /**
   * Sets the first path. See {@link PolylineOptions} for more details.
   * @param path
   */
  public final native void setPath(MVCArray<LatLng> path) /*-{
    this.setPath(path);
  }-*/;
  
  /**
   * Sets the first path. See {@link PolylineOptions} for more details.
   * @param path
   */
  public final native void setPath(JsArray<LatLng> path) /*-{
    this.setPath(path);
  }-*/;
  
  /**
   * This event is fired when the DOM click event is fired on the Polyline.
   * @param handler
   * @return
   */
  public final HandlerRegistration addClickHandler(ClickMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.CLICK, handler, new ClickEventFormatter());
  }
  
  /**
   * This event is fired when the DOM dblclick event is fired on the Polyline.
   * @param handler
   * @return
   */
  public final HandlerRegistration addDblClickHandler(DblClickMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.DBLCLICK, handler, new DblClickEventFormatter());
  }
  
  /**
   * This event is fired when the DOM mousedown event is fired on the Polyline.
   * @param handler
   * @return
   */
  public final HandlerRegistration addMouseDownHandler(MouseDownMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEDOWN, handler, new MouseDownEventFormatter());
  }
  
  /**
   * This event is fired when the DOM mousemove event is fired on the Polyline.
   * @param handler
   * @return
   */
  public final HandlerRegistration addMouseMoveHandler(MouseMoveMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEMOVE, handler, new MouseMoveEventFormatter());
  }
  
  /**
   * This event is fired on Polyline mouseout.
   * @param handler
   * @return
   */
  public final HandlerRegistration addMouseOutMoveHandler(MouseOutMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEOUT, handler, new MouseOutEventFormatter());
  }
  
  /**
   * This event is fired on Polyline mouseover.
   * @param handler
   * @return
   */
  public final HandlerRegistration addMouseOverHandler(MouseOverMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEOVER, handler, new MouseOverEventFormatter());
  }
  
  /**
   * This event is fired when the DOM mouseup event is fired on the Polyline.
   * @param handler
   * @return
   */
  public final HandlerRegistration addMouseUpHandler(MouseUpMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEUP, handler, new MouseUpEventFormatter());
  }
  
  /**
   * This event is fired when the Polyline is right-clicked on.
   * @param handler
   * @return
   */
  public final HandlerRegistration addRightClickHandler(RightClickMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.RIGHTCLICK, handler, new RightClickEventFormatter());
  }
  
}
