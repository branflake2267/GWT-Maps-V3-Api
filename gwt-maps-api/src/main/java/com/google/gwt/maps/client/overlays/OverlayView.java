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
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.mvc.MVCObject;
import com.google.gwt.maps.client.overlays.overlayhandlers.OverlayViewMethods;
import com.google.gwt.maps.client.overlays.overlayhandlers.OverlayViewOnAddHandler;
import com.google.gwt.maps.client.overlays.overlayhandlers.OverlayViewOnDrawHandler;
import com.google.gwt.maps.client.overlays.overlayhandlers.OverlayViewOnRemoveHandler;

/**
 * You can implement this class if you want to display custom types of overlay objects on the map. This class extends
 * MVCObject. <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#OverlayView" >OverlayView API
 * Doc</a>
 */
public class OverlayView extends MVCObject<OverlayView> {

  /**
   * use newInstance();
   */
  protected OverlayView() {
  }

  /**
   * You should inherit from this class by setting your overlay's prototype to new OverlayView.prototype. You must
   * implement three methods: onAdd(), draw(), and onRemove(). In the add() method, you should create DOM objects and
   * append them as children of the panes. In the draw() method, you should position these elements. In the onRemove()
   * method, you should remove the objects from the DOM. You must call setMap() with a valid Map object to trigger the
   * call to the onAdd() method and setMap(null) in order to trigger the onRemove() method. The setMap() method can be
   * called at the time of construction or at any point afterward when the overlay should be re-shown after removing.
   * The draw() method will then be called whenever a map property changes that could change the position of the
   * element, such as zoom, center, or map type.
   * 
   * draw(): Implement this method to draw or update the overlay. This method is called after onAdd() and when the
   * position from projection.fromLatLngToPixel() would return a new value for a given LatLng. This can happen on change
   * of zoom, center, or map type. It is not necessarily called on drag or resize.
   * 
   * onAdd(): Implement this method to initialize the overlay DOM elements. This method is called once after setMap() is
   * called with a valid map. At this point, panes and projection will have been initialized.
   * 
   * onRemove(): Implement this method to remove your elements from the DOM. This method is called once following a call
   * to setMap(null).
   * 
   * @return {@link OverlayView}
   */
  public final static OverlayView newInstance(MapWidget mapWidget, OverlayViewOnDrawHandler onDrawHandler,
      OverlayViewOnAddHandler onAddDandler, OverlayViewOnRemoveHandler onRemoveHandler) {
    return createJso(mapWidget.getJso(), onDrawHandler, onAddDandler, onRemoveHandler).cast();
  }

  private final static native JavaScriptObject createJso() /*-{
    return new new $wnd.google.maps.OverlayView();
  }-*/;

  private final static native JavaScriptObject createJso(MapImpl map, OverlayViewOnDrawHandler onDrawHandler,
      OverlayViewOnAddHandler onAddHandler, OverlayViewOnRemoveHandler onRemoveHandler) /*-{
    function MapOverlay(map) {
      this.setMap(map);
    }

    MapOverlay.prototype = new $wnd.google.maps.OverlayView();

    MapOverlay.prototype.onAdd = function() {
      $entry(@com.google.gwt.maps.client.overlays.OverlayView::onAddCallback(Lcom/google/gwt/maps/client/overlays/overlayhandlers/OverlayViewOnAddHandler;Lcom/google/gwt/maps/client/overlays/overlayhandlers/OverlayViewMethods;)(onAddHandler, this));
    };

    MapOverlay.prototype.onRemove = function() {
      $entry(@com.google.gwt.maps.client.overlays.OverlayView::onRemoveCallback(Lcom/google/gwt/maps/client/overlays/overlayhandlers/OverlayViewOnRemoveHandler;Lcom/google/gwt/maps/client/overlays/overlayhandlers/OverlayViewMethods;)(onRemoveHandler, this));
    };

    MapOverlay.prototype.draw = function() {
      $entry(@com.google.gwt.maps.client.overlays.OverlayView::onDrawCallback(Lcom/google/gwt/maps/client/overlays/overlayhandlers/OverlayViewOnDrawHandler;Lcom/google/gwt/maps/client/overlays/overlayhandlers/OverlayViewMethods;)(onDrawHandler, this));
    };

    var jso = new MapOverlay(map);
    return jso;
  }-*/;

  private final static void onDrawCallback(OverlayViewOnDrawHandler handler, OverlayViewMethods methods) {
    handler.onDraw(methods);
  }

  private final static void onAddCallback(OverlayViewOnAddHandler handler, OverlayViewMethods methods) {
    handler.onAdd(methods);
  }

  private final static void onRemoveCallback(OverlayViewOnRemoveHandler handler, OverlayViewMethods methods) {
    handler.onRemove(methods);
  }

  /**
   * set Map
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

  /**
   * Invokes this.setMap()
   */
  public final native void close() /*-{
    this.setMap();
  }-*/;

  /**
   * Invokes this.setMap()
   */
  public final native void clear() /*-{
    this.setMap();
  }-*/;

  /**
   * Returns the MapCanvasProjection object associated with this OverlayView. The projection is not initialized until
   * onAdd is called by the API.
   */
  public final native MapCanvasProjection getProjection() /*-{
    return this.getProjection();
  }-*/;
  
  private final native void setMapImpl(MapImpl map) /*-{
    this.setMap(map);
  }-*/;

}
