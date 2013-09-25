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
 * A polyline is a linear overlay of connected line segments on the map. This class extends MVCObject. <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#Polyline" >Polyline API Doc</a>
 */
public class Polyline extends MVCObject<Polyline> {

  /**
   * use newInstance();
   * 
   */
  protected Polyline() {
  }

  /**
   * Create a polyline using the passed PolylineOptions, which specify both the path of the polyline and the stroke
   * style to use when drawing the polyline. You may pass either an array of LatLngs or an MVCArray of LatLngs when
   * constructing a polyline, though simple arrays are converted to MVCArrays within the polyline upon instantiation.
   * 
   * @param options {@link PolylineOptions}
   */
  public static final Polyline newInstance(PolylineOptions options) {
    return createJso(options).cast();
  }

  private static native JavaScriptObject createJso(PolylineOptions options) /*-{
    return new $wnd.google.maps.Polyline(options);
  }-*/;

  /**
   * Hides this polyline if set to <code>false</code>.
   * 
   * @param visible
   */
  public final native void setVisible(boolean visible) /*-{
    this.setVisible(visible);
  }-*/;

  /**
   * Returns whether this polyline is visible on the map.<br>
   * Do not call unless first associated with a map as undefined return will cause error.
   */
  public final native boolean getVisible() /*-{
    return this.getVisible();
  }-*/;

  /**
   * Returns whether this shape can be edited by the user.
   */
  public final native boolean getEditable() /*-{
    return this.getEditable();
  }-*/;

  /**
   * Returns the map on which this shape is attached.
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }

  private final native MapImpl getMapImpl() /*-{
    return this.getMap();
  }-*/;

  /**
   * Retrieves the first path.
   */
  public final native MVCArray<LatLng> getPath() /*-{
    return this.getPath();
  }-*/;

  /**
   * If set to true, the user can edit this shape by dragging the control points shown at the vertices and on each
   * segment.
   * 
   * @param editable
   */
  public final native void setEditable(boolean editable) /*-{
    this.setEditable(editable);
  }-*/;

  /**
   * Renders this shape on the specified map. If map is set to null, the shape will be removed.
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

  private final native void setMapImpl(MapImpl impl) /*-{
    this.setMap(impl);
  }-*/;

  /**
   * set Options
   * 
   * @param options
   */
  public final native void setOptions(PolylineOptions options) /*-{
    this.setOptions(options);
  }-*/;

  /**
   * Sets the first path. See {@link PolylineOptions} for more details.
   * 
   * @param path
   */
  public final native void setPath(MVCArray<LatLng> path) /*-{
    this.setPath(path);
  }-*/;

  /**
   * Sets the first path. See {@link PolylineOptions} for more details.
   * 
   * @param path
   */
  public final native void setPath(JsArray<LatLng> path) /*-{
    this.setPath(path);
  }-*/;

  /**
   * This event is fired when the DOM click event is fired on the Polyline.
   * 
   * @param handler
   */
  public final HandlerRegistration addClickHandler(ClickMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.CLICK, handler, new ClickEventFormatter());
  }

  /**
   * This event is fired when the DOM dblclick event is fired on the Polyline.
   * 
   * @param handler
   */
  public final HandlerRegistration addDblClickHandler(DblClickMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.DBLCLICK, handler, new DblClickEventFormatter());
  }

  /**
   * This event is fired when the DOM mousedown event is fired on the Polyline.
   * 
   * @param handler
   */
  public final HandlerRegistration addMouseDownHandler(MouseDownMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEDOWN, handler, new MouseDownEventFormatter());
  }

  /**
   * This event is fired when the DOM mousemove event is fired on the Polyline.
   * 
   * @param handler
   */
  public final HandlerRegistration addMouseMoveHandler(MouseMoveMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEMOVE, handler, new MouseMoveEventFormatter());
  }

  /**
   * This event is fired on Polyline mouseout.
   * 
   * @param handler
   */
  public final HandlerRegistration addMouseOutMoveHandler(MouseOutMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEOUT, handler, new MouseOutEventFormatter());
  }

  /**
   * This event is fired on Polyline mouseover.
   * 
   * @param handler
   */
  public final HandlerRegistration addMouseOverHandler(MouseOverMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEOVER, handler, new MouseOverEventFormatter());
  }

  /**
   * This event is fired when the DOM mouseup event is fired on the Polyline.
   * 
   * @param handler
   */
  public final HandlerRegistration addMouseUpHandler(MouseUpMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEUP, handler, new MouseUpEventFormatter());
  }

  /**
   * This event is fired when the Polyline is right-clicked on.
   * 
   * @param handler
   */
  public final HandlerRegistration addRightClickHandler(RightClickMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.RIGHTCLICK, handler, new RightClickEventFormatter());
  }

}
