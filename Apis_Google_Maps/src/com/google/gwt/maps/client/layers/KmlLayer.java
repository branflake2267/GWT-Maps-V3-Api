package com.google.gwt.maps.client.layers;

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

/**
 * A KmlLayer adds geographic markup to the map from a KML, KMZ or GeoRSS file that is hosted on a publicly accessible web server. A KmlFeatureData object is provided for each feature when clicked. This class extends MVCObject.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#KmlLayer}
 */
public class KmlLayer extends JavaScriptObject {
  
  /**
   * use newInstance();
   */
  protected KmlLayer() {}
  
  /**
   * Creates a KmlLayer which renders the contents of the specified KML/KMZ file ({@link http://code.google.com/apis/kml/documentation/kmlreference.html}) or GeoRSS file ({@link http://www.georss.org}). 
   * @param url 
   * @param options {@link KmlLayerOptions}
   * @return {@link KmlLayerOptions}
   */
  public final static KmlLayer newInstance(String url, KmlLayerOptions options) {
    return createJso(url, options).cast();
  }

  /**
   * Creates a KmlLayer which renders the contents of the specified KML/KMZ file ({@link http://code.google.com/apis/kml/documentation/kmlreference.html}) or GeoRSS file ({@link http://www.georss.org}).
   * @param url
   * @return
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
   * @return
   */
  public final native LatLngBounds getDefaultViewport() /*-{
    return this.getDefaultViewport();
  }-*/;
  
  /**
   * Renders the KML Layer on the specified map. If map is set to null, the layer is removed.
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
   * @return
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }

  private final native MapImpl getMapImpl() /*-{
    return this.getMap();
  }-*/;
  
  /**
   * Get the metadata associated with this layer, as specified in the layer markup.
   * @return
   */
  public final native KmlLayerMetadata getMetadata() /*-{
    return this.getMetadata();
  }-*/;
  
  /**
   * Get the URL of the geographic markup which is being displayed.
   * @return
   */
  public final native String getUrl() /*-{
    return this.getUrl();
  }-*/;
  
  /**
   * This event is fired when a feature in the layer is clicked.
   * @param handler
   * @return
   */
  public final HandlerRegistration addClickHandler(KmlMouseMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.CLICK, handler, new KmlMouseEventFormatter());
  }
  
  /**
   * This event is fired when the KML layers default viewport has changed.
   * @param handler
   * @return
   */
  public final HandlerRegistration addDefaultViewportChangeHandler(DefaultViewportChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.DEFAULTVIEWPORT_CHANGED, handler, new DefaultViewportChangeEventFormatter());
  }
  
  /**
   * erase kml layer
   */
  public final native void close() /*-{
    this.setMap();
  }-*/;
}
