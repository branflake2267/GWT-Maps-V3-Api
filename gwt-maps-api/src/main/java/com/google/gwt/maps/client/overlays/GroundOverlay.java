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
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.events.MapEventType;
import com.google.gwt.maps.client.events.MapHandlerRegistration;
import com.google.gwt.maps.client.events.click.ClickEventFormatter;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * A groundoverlay overlay. This class extends MVCObject. <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#GroundOverlay" >GroundOverlay API
 * Doc</a>
 */
public class GroundOverlay extends MVCObject<GroundOverlay> {

  /**
   * use newInstance();
   */
  protected GroundOverlay() {
  }

  /**
   * Creates a ground overlay from the provided image URL and its LatLngBounds. The image is scaled to fit the current
   * bounds, and projected using the current map projection.
   * 
   * @param url
   * @param bounds
   * @param options
   */
  public final static GroundOverlay newInstance(String url, LatLngBounds bounds, GroundOverlayOptions options) {
    return createJso(url, bounds, options).cast();
  }

  private final static native JavaScriptObject createJso(String url, LatLngBounds bounds, GroundOverlayOptions options) /*-{
    return new $wnd.google.maps.GroundOverlay(url, bounds, options);
  }-*/;

  /**
   * Returns the bounds of this groundoverlay.
   */
  public final native LatLngBounds getBounds() /*-{
    return this.getBounds();
  }-*/;

  /**
   * Renders the groundoverlay on the specified map. If map is set to null, the groundoverlay will be removed.
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
   * Returns the map on which this groundoverlay is displayed.
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }

  private final native MapImpl getMapImpl() /*-{
    return this.getMap();
  }-*/;

  /**
   * Sets the opacity of this ground overlay.
   */
  public final native void setOpacity(double opacityValue) /*-{
    this.setOpacity(opacityValue);
  }-*/;

  /**
   * Gets the opacity of this ground overlay.
   */
  public final native double getOpacity() /*-{
    return this.getOpacity();
  }-*/;

  /**
   * Gets the url of the projected image.
   */
  public final native String getUrl() /*-{
    this.getUrl();
  }-*/;

  /**
   * This event is fired when the DOM click event is fired on the GroundOverlay.
   * 
   * @param handler
   */
  public final HandlerRegistration addClickHandler(ClickMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.CLICK, handler, new ClickEventFormatter());
  }

}
