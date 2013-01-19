package com.google.gwt.maps.client.layers;

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
 * This object defines the properties that can be set on a KmlLayer object. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#KmlLayerOptions">KmlLayerOptions
 * API Doc</a>
 */
public class KmlLayerOptions extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected KmlLayerOptions() {
  }

  /**
   * This object defines the properties that can be set on a KmlLayer object.
   */
  public static final KmlLayerOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * If true, the layer receives mouse events. Default value is true.
   * 
   * @param clickable
   */
  public final native void setClickable(boolean clickable) /*-{
    this.clickable = clickable;
  }-*/;

  /**
   * If true, the layer receives mouse events. Default value is true.
   */
  public final native boolean getClickable() /*-{
    return this.clickable;
  }-*/;

  /**
   * Renders the KML Layer on the specified map. If map is set to null, the layer is removed.
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
   * Get the map on which the KML Layer is being rendered.
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }

  private final native MapImpl getMapImpl() /*-{
    return this.map;
  }-*/;

  /**
   * By default, the input map is centered and zoomed to the bounding box of the contents of the layer. If this option
   * is set to true, the viewport is left unchanged, unless the map's center and zoom were never set.
   * 
   * @param preserveViewport
   */
  public final native void setPreserveViewport(boolean preserveViewport) /*-{
    this.preserveViewport = preserveViewport;
  }-*/;

  /**
   * By default, the input map is centered and zoomed to the bounding box of the contents of the layer. If this option
   * is set to true, the viewport is left unchanged, unless the map's center and zoom were never set.
   */
  public final native boolean getPreserveViewport() /*-{
    return this.preserveViewport;
  }-*/;

  /**
   * Suppress the rendering of info windows when layer features are clicked.
   * 
   * @param suppressInfoWindows
   */
  public final native void setSuppressInfoWindows(boolean suppressInfoWindows) /*-{
    this.suppressInfoWindows = suppressInfoWindows;
  }-*/;

  /**
   * Suppress the rendering of info windows when layer features are clicked.
   */
  public final native boolean getSuppressInfoWindows() /*-{
    return this.suppressInfoWindows;
  }-*/;

}
