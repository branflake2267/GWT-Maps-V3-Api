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
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.events.MapEventType;
import com.google.gwt.maps.client.events.MapHandlerRegistration;
import com.google.gwt.maps.client.events.closeclick.CloseClickEventFormatter;
import com.google.gwt.maps.client.events.closeclick.CloseClickMapHandler;
import com.google.gwt.maps.client.events.content.ContentChangeEventFormatter;
import com.google.gwt.maps.client.events.content.ContentChangeMapHandler;
import com.google.gwt.maps.client.events.domready.DomReadyEventFormatter;
import com.google.gwt.maps.client.events.domready.DomReadyMapHandler;
import com.google.gwt.maps.client.events.position.PositionChangeEventFormatter;
import com.google.gwt.maps.client.events.position.PositionChangeMapHandler;
import com.google.gwt.maps.client.events.zindex.ZindexChangeEventFormatter;
import com.google.gwt.maps.client.events.zindex.ZindexChangeMapHandler;
import com.google.gwt.maps.client.mvc.MVCObject;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaImpl;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaWidget;
import com.google.gwt.user.client.ui.Widget;

/**
 * An overlay that looks like a bubble and is often connected to a marker. <br>
 * Extends {@link MVCObject}.
 * 
 */
public class InfoWindow extends MVCObject<InfoWindow> {

  /**
   * use newInstance(); Creates an info window with the given options. An InfoWindow can be placed on a map at a
   * particular position or above a marker, depending on what is specified in the options. Unless auto-pan is disabled,
   * an InfoWindow will pan the map to make itself visible when it is opened. After constructing an InfoWindow, you must
   * call open to display it on the map. The user can click the close button on the InfoWindow to remove it from the
   * map, or the developer can call close() for the same effect.
   */
  protected InfoWindow() {
  }

  /**
   * Creates an info window with the given options. An InfoWindow can be placed on a map at a particular position or
   * above a marker, depending on what is specified in the options. Unless auto-pan is disabled, an InfoWindow will pan
   * the map to make itself visible when it is opened. After constructing an InfoWindow, you must call open to display
   * it on the map. The user can click the close button on the InfoWindow to remove it from the map, or the developer
   * can call close() for the same effect.
   * 
   * @param options {@link InfoWindowOptions}
   */
  public static final InfoWindow newInstance(InfoWindowOptions options) {
    return createJso(options).cast();
  }

  private static final native JavaScriptObject createJso(InfoWindowOptions options) /*-{
    return new $wnd.google.maps.InfoWindow(options);
  }-*/;

  /**
   * Closes this InfoWindow by removing it from the DOM structure.
   */
  public final native void close() /*-{
    this.close();
  }-*/;

  /**
   * get content if its a string
   * 
   * @return String
   */
  public final native String getContent_String() /*-{
    return this.getContent();
  }-*/;

  /**
   * get content if its a node
   * 
   * @return {@link Element}
   */
  public final native Element getContent_Node() /*-{
    return this.getContent();
  }-*/;

  /**
   * get Position
   */
  public final native LatLng getPosition() /*-{
    return this.getPosition();
  }-*/;

  /**
   * get Z index
   */
  public final native int getZindex() /*-{
    return this.getZIndex();
  }-*/;

  /**
   * Opens this InfoWindow on the given map. Optionally, an InfoWindow can be associated with an anchor. In the core
   * API, the only anchor is the Marker class. However, an anchor can be any MVCObject that exposes the position
   * property and optionally anchorPoint for calculating the pixelOffset (see InfoWindowOptions). The anchorPoint is the
   * offset from the anchor's position to the tip of the InfoWindow.
   * 
   * @param mapWidget
   */
  public final void open(MapWidget mapWidget) {
    open(mapWidget.getJso(), null);
  }

  /**
   * Opens this InfoWindow on the given map. Optionally, an InfoWindow can be associated with an anchor. In the core
   * API, the only anchor is the Marker class. However, an anchor can be any MVCObject that exposes the position
   * property and optionally anchorPoint for calculating the pixelOffset (see InfoWindowOptions). The anchorPoint is the
   * offset from the anchor's position to the tip of the InfoWindow.
   * 
   * @param mapWidget
   * @param anchor
   */
  public final void open(MapWidget mapWidget, MVCObject<?> anchor) {
    open(mapWidget.getJso(), anchor);
  }

  private final native void open(MapImpl impl) /*-{
    this.open(impl);
  }-*/;

  private final native void open(MapImpl impl, MVCObject<?> anchor) /*-{
    this.open(impl, anchor);
  }-*/;

  private final native void open(MapImpl impl, JavaScriptObject anchor) /*-{
    this.open(impl, anchor);
  }-*/;

  /**
   * Opens this InfoWindow on the given map. Optionally, an InfoWindow can be associated with an anchor. In the core
   * API, the only anchor is the Marker class. However, an anchor can be any MVCObject that exposes the position
   * property and optionally anchorPoint for calculating the pixelOffset (see InfoWindowOptions). The anchorPoint is the
   * offset from the anchor's position to the tip of the InfoWindow.
   * 
   * @param streetViewPanoRamaWidget
   */
  public final void open(StreetViewPanoramaWidget streetViewPanoRamaWidget) {
    open(streetViewPanoRamaWidget.getJso());
  }

  /**
   * Opens this InfoWindow on the given map. Optionally, an InfoWindow can be associated with an anchor. In the core
   * API, the only anchor is the Marker class. However, an anchor can be any MVCObject that exposes the position
   * property and optionally anchorPoint for calculating the pixelOffset (see InfoWindowOptions). The anchorPoint is the
   * offset from the anchor's position to the tip of the InfoWindow.
   * 
   * @param streetViewPanoRamaWidget
   * @param anchor
   */
  public final void open(StreetViewPanoramaWidget streetViewPanoRamaWidget, MVCObject<?> anchor) {
    open(streetViewPanoRamaWidget.getJso(), anchor);
  }

  private final native void open(StreetViewPanoramaImpl impl) /*-{
    this.open(impl);
  }-*/;

  private final native void open(StreetViewPanoramaImpl impl, MVCObject<?> anchor) /*-{
    this.open(impl, anchor);
  }-*/;

  public final void setContent(Widget widget) {
    setContent(widget.getElement());
  }

  /**
   * set Content
   * 
   * @param content
   */
  public final native void setContent(String content) /*-{
    this.setContent(content);
  }-*/;

  /**
   * set Content
   * 
   * @param element
   */
  public final native void setContent(Element element) /*-{
    this.setContent(element);
  }-*/;

  /**
   * set Options
   * 
   * @param options
   */
  public final native void setOptions(InfoWindowOptions options) /*-{
    this.setOptions(options);
  }-*/;

  /**
   * set Position
   * 
   * @param position
   */
  public final native void setPosition(LatLng position) /*-{
    this.setPosition(position);
  }-*/;

  /**
   * set Z index
   * 
   * @param index
   */
  public final native void setZindex(int index) /*-{
    this.setZIndex(index);
  }-*/;

  /**
   * This event is fired when the close button was clicked.
   * 
   * @param handler
   */
  public final HandlerRegistration addCloseClickHandler(CloseClickMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.CLOSECLICK, handler, new CloseClickEventFormatter());
  }

  /**
   * This event is fired when the content property changes.
   * 
   * @param handler
   */
  public final HandlerRegistration addContentChangeHandler(ContentChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.CONTENT_CHANGED, handler,
        new ContentChangeEventFormatter());
  }

  /**
   * This event is fired when the <code>&lt;div&gt;</code> containing the InfoWindow's content is attached to the DOM.
   * You may wish to monitor this event if you are building out your info window content dynamically.
   * 
   * @param handler
   */
  public final HandlerRegistration addDomReadyHandler(DomReadyMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.DOMREADY, handler, new DomReadyEventFormatter());
  }

  /**
   * This event is fired when the position property changes.
   * 
   * @param handler
   */
  public final HandlerRegistration addPositionChangeHandler(PositionChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.POSITION_CHANGED, handler,
        new PositionChangeEventFormatter());
  }

  /**
   * This event is fired when the InfoWindow's zIndex changes.
   * 
   * @param handler
   */
  public final HandlerRegistration addZindexChangedHandler(ZindexChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.ZINDEX_CHANGED, handler,
        new ZindexChangeEventFormatter());
  }

}
