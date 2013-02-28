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

/**
 * {@link GroundOverlay} Options <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#GroundOverlayOptions"
 * >GroundOverlayOptions API Doc</a>
 */
public class GroundOverlayOptions extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected GroundOverlayOptions() {
  }

  /**
   * creates GroundOverlay options
   */
  public final static GroundOverlayOptions newInstance() {
    GroundOverlayOptions obj = JavaScriptObject.createObject().cast();
    obj.setDefaults();
    return obj;
  }

  /**
   * Set all expected default values
   */
  private void setDefaults() {
    setOpacity(1);
    setClickable(true);
    setMap(null);
  }

  /**
   * The opacity of the overlay, expressed as a number between 0 and 1.<br>
   * Optional. Defaults to 1.
   * 
   * @param opacity
   */
  public final native void setOpacity(double opacity) /*-{
    this.opacity = opacity;
  }-*/;

  /**
   * The opacity of the overlay, expressed as a number between 0 and 1.
   * 
   */
  public final native double getOpacity() /*-{
    return this.opacity;
  }-*/;

  /**
   * sets Indicates whether this Polyline handles click events. Defaults to true.
   * 
   * @param clickable
   */
  public final native void setClickable(boolean clickable) /*-{
    this.clickable = clickable;
  }-*/;

  /**
   * gets Indicates whether this Polyline handles click events. Defaults to true.
   */
  public final native boolean getClickable() /*-{
    return this.clickable;
  }-*/;

  /**
   * sets Map on which to display Polyline.
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
    this.map = map;
  }-*/;

  /**
   * gets Map on which to display Polyline.
   */
  public final MapWidget getMap() {
    MapImpl obj = getMapImpl();
    return obj != null ? MapWidget.newInstance(obj) : null;
  }

  /**
   * gets Map on which to display Polyline. <br>
   * <br>
   * See {@link #getMap()}.<br>
   * Method will be removed in version 3.11
   */
  @Deprecated
  public final MapWidget getMapWidget() {
    MapImpl obj = getMapImpl();
    return obj != null ? MapWidget.newInstance(obj) : null;
  }

  private final native MapImpl getMapImpl() /*-{
    return this.map;
  }-*/;

}
