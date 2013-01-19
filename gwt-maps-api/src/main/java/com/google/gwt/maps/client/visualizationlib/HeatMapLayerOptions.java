package com.google.gwt.maps.client.visualizationlib;

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
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.mvc.MVCArray;

/**
 * This object defines the properties that can be set on a HeatmapLayer object. <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#HeatmapLayerOptions"
 * >HeapMapLayerOptions API Doc</a>
 */
public class HeatMapLayerOptions extends JavaScriptObject {

  /**
   * See {@link #newInstance()}
   */
  protected HeatMapLayerOptions() {
  }

  /**
   * creates - This object defines the properties that can be set on a HeatmapLayer object.
   */
  public static final HeatMapLayerOptions newInstance() {
    HeatMapLayerOptions options = newInstanceDefault();
    setDefaults(options);
    return options;
  }

  private static final void setDefaults(HeatMapLayerOptions options) {
    options.setOpacity(0.6d);
    options.setGradient(null);
    // options.setData(null); // don't set data null, cannot be null or map won't init
    options.setMap(null);
  }

  /**
   * Setup a Javascript object to store the values in
   * 
   * @return WeightedLocation
   */
  private final static HeatMapLayerOptions newInstanceDefault() {
    JavaScriptObject jso = HeatMapLayerOptions.createObject();
    // WorkAroundUtils.removeGwtObjectId(jso); TODO Still needed?
    return jso.cast();
  }

  /**
   * The data points to display. Required.<br>
   * <b>NOTE:</b> To clear the map points, set equal to an empty array.
   * 
   * @param dataPoints
   */
  public final native void setData(MVCArray<LatLng> dataPoints) /*-{
    this.data = dataPoints;
  }-*/;

  /**
   * Get the data points to display. Required.
   * 
   * @return dataPoints
   */
  public final native MVCArray<LatLng> getData() /*-{
    return this.data;
  }-*/;

  /**
   * Specifies whether heatmaps dissipate on zoom. By default, the radius of influence of a data point is specified by
   * the radius option only. When dissipating is disabled, the radius option is intepreted as a radius at zoom level 0.
   * 
   * @param dissipating enables/disables dissipating
   */
  public final native void setDissipating(boolean dissipating) /*-{
    this.dissipating = dissipating;
  }-*/;

  /**
   * Get the dissipating property
   * 
   * @return dissipating state
   */
  public final native boolean getDissipating() /*-{
    return this.dissipating;
  }-*/;

  /**
   * The color gradient of the heatmap, specified as an array of CSS color strings. All CSS3 colors are supported except
   * for extended named colors.
   * 
   * @param gradient
   */
  public final native void setGradient(JsArrayString gradient) /*-{
    this.gradient = gradient;
  }-*/;

  /**
   * Get color gradient of the heatmap.
   * 
   * @return gradient
   */
  public final native JsArrayString getGradient() /*-{
    return this.gradient;
  }-*/;

  /**
   * Renders the heatmap on the specified map. If map is set to null, the heatmap will be removed.
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
   * Gets map layer is rendered to, or NULL if not associated with map.
   * 
   * @return NULL if not associated with map
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }

  private final native MapImpl getMapImpl() /*-{
    return this.map;
  }-*/;

  /**
   * The maximum intensity of the heatmap. By default, heatmap colors are dynamically scaled according to the greatest
   * concentration of points at any particular pixel on the map. This property allows you to specify a fixed maximum.
   * Setting the maximum intensity can be helpful when your dataset contains a few outliers with an unusually high
   * intensity.
   * 
   * @param maxIntensity
   */
  public final native void setMaxIntensity(double maxIntensity) /*-{
    this.maxIntensity = maxIntensity;
  }-*/;

  /**
   * Get maximum intensity
   * 
   * @return maxIntensity
   */
  public final native double getMaxIntensity() /*-{
    return this.maxIntensity;
  }-*/;

  /**
   * The opacity of the heatmap, expressed as a number between 0 and 1. Defaults to 0.6.
   * 
   * @param opacity [0-1]
   */
  public final native void setOpacity(double opacity) /*-{
    this.opacity = opacity;
  }-*/;

  /**
   * Get layer opacity
   * 
   * @return opacity
   */
  public final native double getOpacity() /*-{
    return this.opacity;
  }-*/;

  /**
   * The radius of influence for each data point, in pixels.
   * 
   * @param radius (pixels)
   */
  public final native void setRadius(double radius) /*-{
    this.radius = radius;
  }-*/;

  /**
   * Get data point influence in pixels.
   * 
   * @return radius (pixels)
   */
  public final native double getRadius() /*-{
    return this.radius;
  }-*/;
}