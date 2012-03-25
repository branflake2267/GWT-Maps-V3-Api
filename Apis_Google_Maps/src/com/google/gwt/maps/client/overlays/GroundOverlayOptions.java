package com.google.gwt.maps.client.overlays;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;

/**
 * {@link GroundOverlay} Options
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#GroundOverlayOptions} 
 */
public class GroundOverlayOptions extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected GroundOverlayOptions() {}
  
  /**
   * creates GroundOverlay options
   * @return
   */
  public final static GroundOverlayOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * sets Indicates whether this Polyline handles click events. Defaults to true.
   * @param clickable
   */
  public final native void setClickable(boolean clickable) /*-{
    this.clickable = clickable;
  }-*/;
  
  /**
   * gets Indicates whether this Polyline handles click events. Defaults to true.
   * @return
   */
  public final native boolean getClickable() /*-{
    return this.clickable;
  }-*/;

  /**
   * sets Map on which to display Polyline.
   * @param mapWidget
   */
  public final void setMap(MapWidget mapWidget) {
    setMapImpl(mapWidget.getJso());
  }

  private final native void setMapImpl(MapImpl map) /*-{
    this.map = map;
  }-*/;
  
  /**
   * gets Map on which to display Polyline.
   * @return
   */
  public final MapWidget getMapWidget() {
    return MapWidget.newInstance(getMapImpl());
  }
  
  private final native MapImpl getMapImpl() /*-{
    return this.map;
  }-*/;
  
}
