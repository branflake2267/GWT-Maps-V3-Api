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
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.mvc.MVCArray;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * A layer showing a heatmap of the provided points. Extends the MVCObject. <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#HeatmapLayer" >HeatMapLayer API
 * Doc</a>
 */
public class HeatMapLayer extends MVCObject<HeatMapLayer> {

  /**
   * use newInstance();
   */
  protected HeatMapLayer() {
  }

  /**
   * A layer that provides a client-side rendered heatmap, depicting the intensity of data at geographical points.
   * 
   * @param options {@link HeatMapLayerOptions} configuration for layer (data, rendering options)
   * @return new WeatherLayer instance
   */
  public static final HeatMapLayer newInstance(HeatMapLayerOptions options) {
    return createJso(options).cast();
  }

  private static final native JavaScriptObject createJso(HeatMapLayerOptions options) /*-{
    return new $wnd.google.maps.visualization.HeatmapLayer(options);
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
    this.setMap(map);
  }-*/;

  /**
   * Gets map layer is rendered to, or NULL if not associated with map.
   * 
   * @return NULL if no associated map
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }

  private final native MapImpl getMapImpl() /*-{
    return this.getMap();
  }-*/;

  /**
   * Sets the data points to be displayed by this heatmap.<br>
   * <b>NOTE:</b> To clear the map points, set equal to an empty array.
   * 
   * @param dataPoints
   */
  public final native void setDataWeighted(JsArray<WeightedLocation> dataPoints)/*-{
    this.setData(dataPoints);
  }-*/;

  /**
   * Sets the data points to be displayed by this heatmap.<br>
   * <b>NOTE:</b> To clear the map points, set equal to an empty array.
   * 
   * @param dataPoints
   */
  public final native void setDataWeighted(MVCArray<WeightedLocation> dataPoints)/*-{
    this.setData(dataPoints);
  }-*/;

  /**
   * Sets the data points to be displayed by this heatmap.<br>
   * <b>NOTE:</b> To clear the map points, set equal to an empty array.
   * 
   * @param dataPoints
   */
  public final native void setData(JsArray<LatLng> dataPoints)/*-{
    this.setData(dataPoints);
  }-*/;

  /**
   * Sets the data points to be displayed by this heatmap.<br>
   * <b>NOTE:</b> To clear the map points, set equal to an empty array.
   * 
   * @param dataPoints
   */
  public final native void setData(MVCArray<LatLng> dataPoints)/*-{
    this.setData(dataPoints);
  }-*/;

  /**
   * Returns the data points currently displayed by this heatmap.
   * 
   * @return data points as MVCArray<LatLng>
   */
  public final native MVCArray<LatLng> getData()/*-{
    return this.getData();
  }-*/;

  /**
   * Returns the data points currently displayed by this heatmap.
   * 
   * @return data points as MVCArray<LatLng>
   */
  public final native MVCArray<WeightedLocation> getDataWeighted()/*-{
    return this.getData();
  }-*/;
}
