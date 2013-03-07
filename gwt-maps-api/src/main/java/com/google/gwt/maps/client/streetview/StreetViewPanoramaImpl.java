package com.google.gwt.maps.client.streetview;

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
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.events.MapEventType;
import com.google.gwt.maps.client.events.MapHandlerRegistration;
import com.google.gwt.maps.client.events.closeclick.CloseClickEventFormatter;
import com.google.gwt.maps.client.events.closeclick.CloseClickMapHandler;
import com.google.gwt.maps.client.events.links.LinksChangeEventFormatter;
import com.google.gwt.maps.client.events.links.LinksChangeMapHandler;
import com.google.gwt.maps.client.events.pano.PanoChangeEventFormatter;
import com.google.gwt.maps.client.events.pano.PanoChangeMapHandler;
import com.google.gwt.maps.client.events.position.PositionChangeEventFormatter;
import com.google.gwt.maps.client.events.position.PositionChangeMapHandler;
import com.google.gwt.maps.client.events.pov.PovChangeEventFormatter;
import com.google.gwt.maps.client.events.pov.PovChangeMapHandler;
import com.google.gwt.maps.client.events.resize.ResizeEventFormatter;
import com.google.gwt.maps.client.events.resize.ResizeMapHandler;
import com.google.gwt.maps.client.events.visible.VisibleChangeEventFormatter;
import com.google.gwt.maps.client.events.visible.VisibleChangeMapHandler;
import com.google.gwt.maps.client.mvc.MVCArray;
import com.google.gwt.maps.client.mvc.MVCObject;
import com.google.gwt.maps.client.workaround.WorkAroundUtils;

/**
 * Displays the panorama for a given LatLng or panorama ID. A StreetViewPanorama object provides a Street View "viewer"
 * which can be stand-alone within a separate <code>&lt;div&gt;</code> or bound to a Map. This class extends MVCObject. <br>
 * <br>
 * See <a
 * href="https://developers.google.com/maps/documentation/javascript/reference#StreetViewPanorama">StreetViewPanorama
 * API Doc</a>
 */
public class StreetViewPanoramaImpl extends MVCObject<StreetViewPanoramaImpl> {

  /**
   * Displays the panorama for a given LatLng or panorama ID. A StreetViewPanorama object provides a Street View
   * "viewer" which can be stand-alone within a separate <code>&lt;div&gt;</code> or bound to a Map. This class extends
   * MVCObject. use newInstance();
   */
  protected StreetViewPanoramaImpl() {
  }

  /**
   * creates Displays the panorama for a given LatLng or panorama ID. A StreetViewPanorama object provides a Street View
   * "viewer" which can be stand-alone within a separate <code>&lt;div&gt;</code> or bound to a Map. This class extends
   * MVCObject.
   * 
   * @param element {@link Element}
   * @param options {@link StreetViewPanoramaOptions}
   * @return {@link StreetViewPanoramaImpl}
   */
  public static StreetViewPanoramaImpl newInstance(Element element, StreetViewPanoramaOptions options) {
    JavaScriptObject jso = createJso(element, options);
    WorkAroundUtils.removeGwtObjectId(jso);
    return jso.cast();
  }

  private final static native JavaScriptObject createJso(Element container, StreetViewPanoramaOptions opts) /*-{
    return new $wnd.google.maps.StreetViewPanorama(container, opts)
  }-*/;

  /**
   * Returns the set of navigation links for the Street View panorama.
   */
  public final native JsArray<StreetViewLink> getLinks() /*-{
    return this.getLinks();
  }-*/;

  /**
   * Returns the current panorama ID for the Street View panorama. This id is stable within the browser's current
   * session only.
   */
  public final native String getPano() /*-{
    return this.getPano();
  }-*/;

  /**
   * Returns the current LatLng position for the Street View panorama.
   */
  public final native LatLng getPosition() /*-{
    return this.getPosition();
  }-*/;

  /**
   * Returns the current point of view for the Street View panorama.
   */
  public final native StreetViewPov getPov() /*-{
    return this.getPov();
  }-*/;

  /**
   * Returns true if the panorama is visible. It does not specify whether Street View imagery is available at the
   * specified position.
   */
  public final native boolean getVisible() /*-{
    return this.getVisible();
  }-*/;

  /**
   * Set the custom panorama provider called on pano change to load custom panoramas.
   * 
   * @param provider
   */
  public final native void registerPanoProvider(StreetViewPanoramaProvider provider) /*-{
    this.panoProvider = function(pano, zoom, tileX, tileY) {
      provider.@com.google.gwt.maps.client.streetview.StreetViewPanoramaProvider::getPanoData(Ljava/lang/String;III)(pano, zoom, tileX, tileY);
    }
  }-*/;

  /**
   * Sets the current panorama ID for the Street View panorama.
   * 
   * @param pano
   */
  public final native void setPano(String pano) /*-{
    this.setPano(pano);
  }-*/;

  /**
   * Sets the current LatLng position for the Street View panorama.
   * 
   * @param latLng
   */
  public final native void setPosition(LatLng latLng) /*-{
    this.setPosition(latLng);
  }-*/;

  /**
   * Sets the point of view for the Street View panorama.
   * 
   * @param pov
   */
  public final native void setPov(StreetViewPov pov) /*-{
    this.setPov(pov);
  }-*/;

  /**
   * Sets to true to make the panorama visible. If set to false, the panorama will be hidden whether it is embedded in
   * the map or in its own <code>&lt;div&gt;</code>.
   * 
   * @param visible
   */
  public final native void setVisible(boolean visible) /*-{
    this.setVisible(visible);
  }-*/;

  /**
   * TODO Additional controls to attach to the panorama. To add a control to the panorama, add the control's
   * <code>&lt;div&gt;</code> to the MVCArray corresponding to the ControlPosition where it should be rendered.
   * 
   * @param controls
   */
  public final native void setControls(MVCArray<Element> controls) /*-{
    this.controls = controls;
  }-*/;

  /**
   * This event is fired when the close button is clicked.
   * 
   * @param handler
   */
  public final HandlerRegistration addCloseClickHandler(CloseClickMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.CLOSECLICK, handler, new CloseClickEventFormatter());
  }

  /**
   * This event is fired when the panorama's links change. The links change asynchronously following a pano id change.
   * 
   * @param handler
   */
  public final HandlerRegistration addLinksChangeHandler(LinksChangeMapHandler handler) {
    return MapHandlerRegistration
        .addHandler(this, MapEventType.LINKS_CHANGED, handler, new LinksChangeEventFormatter());
  }

  /**
   * This event is fired when the panorama's pano id changes. The pano may change as the user navigates through the
   * panorama or the position is manually set. Note that not all position changes trigger a pano_changed.
   * 
   * @param handler
   */
  public final HandlerRegistration addPanoChangeHandler(PanoChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.PANO_CHANGED, handler, new PanoChangeEventFormatter());
  }

  /**
   * This event is fired when the panorama's position changes. The position changes as the user navigates through the
   * panorama or the position is set manually.
   * 
   * @param handler
   */
  public final HandlerRegistration addPositionChangeHandler(PositionChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.POSITION_CHANGED, handler,
        new PositionChangeEventFormatter());
  }

  /**
   * This event is fired when the panorama's point-of-view changes. The point of view changes as the pitch, zoom, or
   * heading changes.
   * 
   * @param handler
   */
  public final HandlerRegistration addPovChangeHandler(PovChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.POV_CHANGED, handler, new PovChangeEventFormatter());
  }

  /**
   * Developers should trigger this event on the panorama when its div changes size: google.maps.event.trigger(panorama,
   * 'resize').
   * 
   * @param handler
   */
  public final HandlerRegistration addResizeHandler(ResizeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.RESIZE, handler, new ResizeEventFormatter());
  }

  /**
   * This event is fired when the panorama's visibility changes. The visibility is changed when the Pegman id dragged
   * onto the map, the close button is clicked, or setVisible() is called.
   * 
   * @param handler
   */
  public final HandlerRegistration addVisibleChangeHandler(VisibleChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.VISIBLE_CHANGED, handler,
        new VisibleChangeEventFormatter());
  }

  /**
   * Has to be called to resize the panorama if the canvas has changed.
   */
  public final native void triggerResize() /*-{
    $wnd.google.maps.event.trigger(this, 'resize');
  }-*/;

}
