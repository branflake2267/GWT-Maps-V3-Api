package com.google.gwt.maps.client.layers;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * A layer showing bike lanes and paths. This class extends MVCObject.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#BicyclingLayer}
 */
public class BicyclingLayer extends MVCObject<BicyclingLayer> {

  /**
   * use newInstance();
   */
  protected BicyclingLayer() {} 
  
  /**
   * A layer that displays bike lanes and paths and demotes large roads.
   * @return
   */
  public static final BicyclingLayer newInstance() {
    return createJso().cast();
  }

  private final static native JavaScriptObject createJso() /*-{
    return new $wnd.google.maps.BicyclingLayer();
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
  
}
