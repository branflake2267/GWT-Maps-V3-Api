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
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.events.MapEventType;
import com.google.gwt.maps.client.events.MapHandlerRegistration;
import com.google.gwt.maps.client.events.kmlmouse.KmlMouseEventFormatter;
import com.google.gwt.maps.client.events.kmlmouse.KmlMouseMapHandler;
import com.google.gwt.maps.client.events.kmlviewport.DefaultViewportChangeEventFormatter;
import com.google.gwt.maps.client.events.kmlviewport.DefaultViewportChangeMapHandler;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * A KmlLayer adds geographic markup to the map from a KML, KMZ or GeoRSS file that is hosted on a publicly accessible
 * web server. A KmlFeatureData object is provided for each feature when clicked. This class extends MVCObject. <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#KmlLayer" >KmlLayer API Doc</a>
 */
public class KmlLayer extends MVCObject<KmlLayer> {

  /**
   * use newInstance();
   */
  protected KmlLayer() {
  }

  /**
   * Creates a KmlLayer which renders the contents of the specified KML/KMZ file (<a
   * href="https://developers.google.com/kml/documentation/kmlreference">KML API Doc</a>) or GeoRSS file (<a
   * href="http://www.georss.org">GeoRSS API Doc</a>).
   * 
   * @param url
   * @param options {@link KmlLayerOptions}
   * @return {@link KmlLayerOptions}
   */
  public final static KmlLayer newInstance(String url, KmlLayerOptions options) {
    return createJso(url, options).cast();
  }

  /**
   * Creates a KmlLayer which renders the contents of the specified KML/KMZ file (<a
   * href="https://developers.google.com/kml/documentation/kmlreference">KML API Doc</a>) or GeoRSS file (<a
   * href="http://www.georss.org">GeoRSS API Doc</a>).
   * 
   * @param url
   */
  public final static KmlLayer newInstance(String url) {
    return createJso(url).cast();
  }

  private static native JavaScriptObject createJso(String url) /*-{
    return new $wnd.google.maps.KmlLayer(url);
  }-*/;

  private static native JavaScriptObject createJso(String url, KmlLayerOptions options) /*-{
    return new $wnd.google.maps.KmlLayer(url, options);
  }-*/;

  /**
   * Get the default viewport for the layer being displayed.
   */
  public final native LatLngBounds getDefaultViewport() /*-{
    return this.getDefaultViewport();
  }-*/;

  /**
   * Renders the KML Layer on the specified map. If map is set to null, the layer is removed.
   * 
   * @param mapWidget
   */
  public final void setMap(MapWidget mapWidget) {
    if (mapWidget == null) {
      close();
    } else {
      setMapImpl(mapWidget.getJso());
    }
  }

  private final native void setMapImpl(MapImpl map) /*-{
    this.setMap(map);
  }-*/;

  /**
   * Get the map on which the KML Layer is being rendered.
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }

  private final native MapImpl getMapImpl() /*-{
    return this.getMap();
  }-*/;

  /**
   * Get the metadata associated with this layer, as specified in the layer markup.
   */
  public final native KmlLayerMetadata getMetadata() /*-{
    return this.getMetadata();
  }-*/;

  /**
   * Get the URL of the geographic markup which is being displayed.
   * 
   * @return url
   */
  public final native String getUrl() /*-{
    return this.getUrl();
  }-*/;

  /**
   * Get the status of the layer, set once the requested document has loaded.
   * 
   * @return NULL if requested document not yet loaded
   */
  public final KmlLayerStatus getStatus() {
    String val = getStatusImpl();
    return val == null ? null : KmlLayerStatus.fromValue(val);
  }

  private native String getStatusImpl() /*-{
    return this.getStatus();
  }-*/;

  /**
   * This event is fired when a feature in the layer is clicked.
   * 
   * @param handler
   */
  public final HandlerRegistration addClickHandler(KmlMouseMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.CLICK, handler, new KmlMouseEventFormatter());
  }

  /**
   * This event is fired when the KML layers default viewport has changed.
   * 
   * @param handler
   */
  public final HandlerRegistration addDefaultViewportChangeHandler(DefaultViewportChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.DEFAULTVIEWPORT_CHANGED, handler,
        new DefaultViewportChangeEventFormatter());
  }

  /**
   * erase kml layer
   */
  public final native void close() /*-{
    this.setMap();
  }-*/;

}
