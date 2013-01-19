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
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.events.MapEventType;
import com.google.gwt.maps.client.events.MapHandlerRegistration;
import com.google.gwt.maps.client.events.fusiontablemouse.FusionTablesMouseEventFormatter;
import com.google.gwt.maps.client.events.fusiontablemouse.FusionTablesMouseMapHandler;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * A FusionTablesLayer allows you to display data from a Google Fusion Table on a map, as a rendered layer. (See <a
 * href="https://developers.google.com/fusiontables/">Fusion Table site</a>). Table data can be queried using the same
 * query language as is used in the Fusion Tables API. This class extends MVCObject. <br>
 * <br>
 * See <a
 * href="https://developers.google.com/maps/documentation/javascript/reference#FusionTablesLayer">FusionTablesLayer API
 * Doc</a>
 */
public class FusionTablesLayer extends MVCObject<FusionTablesLayer> {

  /**
   * use newInstance();
   */
  protected FusionTablesLayer() {
  }

  /**
   * A layer that displays data from a Fusion Table.
   * 
   * @param options
   */
  public final static FusionTablesLayer newInstance(FusionTablesLayerOptions options) {
    return createJso(options).cast();
  }

  private static native JavaScriptObject createJso(FusionTablesLayerOptions options) /*-{
    return new $wnd.google.maps.FusionTablesLayer(options);
  }-*/;

  /**
   * Renders the layer on the specified map. If map is set to null, the layer will be removed.
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
   * Returns the map on which this layer is displayed.
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }

  private final native MapImpl getMapImpl() /*-{
    return this.getMap();
  }-*/;

  /**
   * set Options
   * 
   * @param options
   */
  public final native void setOptions(FusionTablesLayerOptions options) /*-{
    this.setOptions(options);
  }-*/;

  /**
   * This event is fired when a feature in the layer is clicked.
   * 
   * @param handler
   */
  public final HandlerRegistration addClickHandler(FusionTablesMouseMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.CLICK, handler, new FusionTablesMouseEventFormatter());
  }
}
