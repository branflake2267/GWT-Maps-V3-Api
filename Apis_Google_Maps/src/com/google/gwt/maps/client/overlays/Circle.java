package com.google.gwt.maps.client.overlays;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.events.MapEventType;
import com.google.gwt.maps.client.events.MapHandlerRegistration;
import com.google.gwt.maps.client.events.center.CenterChangeEventFormatter;
import com.google.gwt.maps.client.events.center.CenterChangeMapHandler;
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
import com.google.gwt.maps.client.events.radius.RadiusChangeEventFormatter;
import com.google.gwt.maps.client.events.radius.RadiusChangeMapHandler;
import com.google.gwt.maps.client.events.rightclick.RightClickEventFormatter;
import com.google.gwt.maps.client.events.rightclick.RightClickMapHandler;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * A circle overlay. This class extends MVCObject.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#Circle}
 */
public class Circle extends MVCObject<Circle> {

  /**
   * use newInstance();
   */
  protected Circle() {}

  /**
   * Create a circle using the passed CircleOptions, which specify the bounds and style.
   * @param options
   * @return
   */
  public final static Circle newInstance(CircleOptions options) {
    return createJso(options).cast();
  }

  private final static native JavaScriptObject createJso(CircleOptions options) /*-{
    return new $wnd.google.maps.Circle(options);
  }-*/;

  /**
   * Returns the bounds of this circle.
   * @return
   */
  public final native LatLngBounds getBounds() /*-{
    return this.getBounds();
  }-*/;
  
  /**
   * Returns the center of this circle.
   * @return
   */
  public final native LatLng getCenter() /*-{
    return this.getCenter();
  }-*/;

  /**
   * Returns whether this circle can be edited by the user.
   * @return
   */
  public final native boolean getEditable() /*-{
    return this.getEditable();
  }-*/;

  /**
   * Renders the circle on the specified map. If map is set to null, the circle will be removed.
   * @param mapWidget
   */
  public final void setMap(MapWidget mapWidget) {
    setMapImpl(mapWidget.getJso());
  }

  private final native void setMapImpl(MapImpl map) /*-{
    this.map = map;
  }-*/;

  /**
   * Returns the map on which this circle is displayed.
   * @return
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }

  private final native MapImpl getMapImpl() /*-{
    return this.map;
  }-*/;

  /**
   * If set to true, the user can edit this circle by dragging the control points shown at the corners and on each edge.
   * @param editable
   */
  public final native void setEditable(boolean editable) /*-{
    this.setEditable(editable);
  }-*/;

  /**
   * sets the Circle options
   * @param options
   */
  public final native void setOptions(CircleOptions options) /*-{
    this.options = options;
  }-*/;
  
  /**
   * Sets the radius of this circle (in meters).
   * @param radius
   */
  public final native void setRadius(double radius) /*-{
    this.setRadius(radius);
  }-*/;
  
  /**
   * Returns the radius of this circle (in meters).
   * @return
   */
  public final native double getRadius() /*-{
    return this.getRadius();
  }-*/;
  
  /**
   * add center change handler
   * @param handler
   * @return
   */
  public final HandlerRegistration addCenterChangeHandler(CenterChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.CENTER_CHANGED, handler, new CenterChangeEventFormatter());
  }

  /**
   * This event is fired when the DOM click event is fired on the Circle.
   * @param handler
   * @return
   */
  public final HandlerRegistration addClickHandler(ClickMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.CLICK, handler, new ClickEventFormatter());
  }
  
  /**
   * This event is fired when the DOM dblclick event is fired on the Circle.
   * @param handler
   * @return
   */
  public final HandlerRegistration addDblClickHandler(DblClickMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.DBLCLICK, handler, new DblClickEventFormatter());
  }
  
  /**
   * This event is fired when the DOM mousedown event is fired on the Circle.
   * @param handler
   * @return
   */
  public final HandlerRegistration addMouseDownHandler(MouseDownMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEDOWN, handler, new MouseDownEventFormatter());
  }
  
  /**
   * This event is fired when the DOM mousemove event is fired on the Circle.
   * @param handler
   * @return
   */
  public final HandlerRegistration addMouseMoveHandler(MouseMoveMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEMOVE, handler, new MouseMoveEventFormatter());
  }
  
  /**
   * This event is fired on Circle mouseout.
   * @param handler
   * @return
   */
  public final HandlerRegistration addMouseOutMoveHandler(MouseOutMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEOUT, handler, new MouseOutEventFormatter());
  }
  
  /**
   * This event is fired on Circle mouseover.
   * @param handler
   * @return
   */
  public final HandlerRegistration addMouseOverHandler(MouseOverMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEOVER, handler, new MouseOverEventFormatter());
  }
  
  /**
   * This event is fired when the DOM mouseup event is fired on the Circle.
   * @param handler
   * @return
   */
  public final HandlerRegistration addMouseUpHandler(MouseUpMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEUP, handler, new MouseUpEventFormatter());
  }
  
  /**
   * This event is fired when the circle's radius is changed.
   * @param handler
   * @return
   */
  public final HandlerRegistration addRadiusChangeHandler(RadiusChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.RADIUS_CHANGED, handler, new RadiusChangeEventFormatter());
  }
  
  /**
   * This event is fired when the Circle is right-clicked on.
   * @param handler
   * @return
   */
  public final HandlerRegistration addRightClickHandler(RightClickMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.RIGHTCLICK, handler, new RightClickEventFormatter());
  }
  
} 
