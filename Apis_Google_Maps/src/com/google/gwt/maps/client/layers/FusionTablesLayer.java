package com.google.gwt.maps.client.layers;

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
 * A FusionTablesLayer allows you to display data from a Google Fusion Table on a map, as a rendered layer. (See http://code.google.com/apis/fusiontables for more information about Fusion Tables). Table data can be queried using the same query language as is used in the Fusion Tables API. This class extends MVCObject.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#FusionTablesLayer}
 */
public class FusionTablesLayer extends MVCObject<FusionTablesLayer> {
  
  /**
   * use newInstance();
   */
  protected FusionTablesLayer() {}

  /**
   * A layer that displays data from a Fusion Table.
   * @param options
   * @return
   */
  public final static FusionTablesLayer newInstance(FusionTablesLayerOptions options) {
    return createJso(options).cast();
  }

  private static native JavaScriptObject createJso(FusionTablesLayerOptions options) /*-{
    return new $wnd.google.maps.FusionTablesLayer(options);
  }-*/;
  
  /**
   * Renders the layer on the specified map. If map is set to null, the layer will be removed.
   * @param mapWidget
   */
  public final void setMap(MapWidget mapWidget) {
    setMapImpl(mapWidget.getJso());
  }

  private final native void setMapImpl(MapImpl map) /*-{
    this.map = map;
  }-*/;
  
  /**
   * Returns the map on which this layer is displayed.
   * @return
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }

  private final native MapImpl getMapImpl() /*-{
    return this.map;
  }-*/;
  
  /**
   * set Options
   * @param options
   */
  public final native void setOptions(FusionTablesLayerOptions options) /*-{
    this.setOptions(options);
  }-*/;
  
  /**
   * This event is fired when a feature in the layer is clicked.
   * @param handler
   * @return
   */
  public final HandlerRegistration addClickHandler(FusionTablesMouseMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.CLICK, handler, new FusionTablesMouseEventFormatter());
  }
}
