package com.google.gwt.maps.client.weatherlib;

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
import com.google.gwt.maps.client.events.weatherlibmouse.WeatherMouseEventFormatter;
import com.google.gwt.maps.client.events.weatherlibmouse.WeatherMouseMapHandler;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * A layer showing current weather conditions. This class extends MVCObject. <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/layers#WeatherLayer" >WeatherLayer API
 * Doc</a>
 */
public class WeatherLayer extends MVCObject<WeatherLayer> {

  /**
   * use newInstance();
   */
  protected WeatherLayer() {
  }

  /**
   * A layer that displays graphics showing current weather conditions.
   * 
   * @param options {@link WeatherLayerOptions} configuration for layer (units, style, behaviors)
   * @return WeatherLayer object
   */
  public static final WeatherLayer newInstance(WeatherLayerOptions options) {
    return createJso(options).cast();
  }

  private static final native JavaScriptObject createJso(WeatherLayerOptions options) /*-{
    return new $wnd.google.maps.weather.WeatherLayer(options);
  }-*/;

  /**
   * Renders the layer on the specified map. If map is set to NULL, the layer will be removed.
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
   * Sets the WeatherLayer's options.
   */
  public final native void setOptions(WeatherLayerOptions options) /*-{
    this.setOptions(options);
  }-*/;

  /**
   * Returns the map on which this layer is displayed.
   * 
   * @return NULL if not on any map
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }

  private final native MapImpl getMapImpl() /*-{
    return this.getMap();
  }-*/;

  /**
   * This event is fired when a feature in the layer is clicked.
   * 
   * @param handler
   */
  public final HandlerRegistration addClickHandler(WeatherMouseMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.CLICK, handler, new WeatherMouseEventFormatter());
  }
}
