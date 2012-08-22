package com.google.gwt.maps.client.layers;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.interfaces.HasMapWidget;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * A layer showing bike lanes and paths. This class extends MVCObject.
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#BicyclingLayer">BicyclingLayer API Doc</a>
 */
public class BicyclingLayer extends MVCObject<BicyclingLayer> implements HasMapWidget {

  /**
   * use newInstance();
   */
  protected BicyclingLayer() {} 
  
  /**
   * A layer that displays bike lanes and paths and demotes large roads.
   */
  public static final BicyclingLayer newInstance() {
    return createJso().cast();
  }

  private final static native JavaScriptObject createJso() /*-{
    return new $wnd.google.maps.BicyclingLayer();
  }-*/;
  
  @Override
  public final void setMap(MapWidget mapWidget) {
    setMapImpl(mapWidget.getJso());
  }

  private final native void setMapImpl(MapImpl map) /*-{
    this.map = map;
  }-*/;
  
  @Override
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }

  private final native MapImpl getMapImpl() /*-{
    return this.map;
  }-*/;
  
}
