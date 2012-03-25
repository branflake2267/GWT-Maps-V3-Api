package com.google.gwt.maps.client.maptypes;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Point;

/**
 * Map Projection Util relating to screen
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#Projection}
 */
public class Projection extends JavaScriptObject {
  
  /**
   * use newInstance();
   */
  protected Projection() {}
  
//  public final static Projection newInstance() {
//    JavaScriptObject jso = createJso();
//    return jso.cast();
//  }
//  
//  private final static native JavaScriptObject createJso() /*-{
//    return new $wnd.google.maps.Projection();
//  }-*/;

  /**
   * Translates from the LatLng cylinder to the Point plane. This interface specifies a function which implements translation from given LatLng values to world coordinates on the map projection. The Maps API calls this method when it needs to plot locations on screen. Projection objects must implement this method.
   * @param latlng {@link LatLng}
   * @param point {@link Point}
   * @return
   */
  public final native Point fromLatLngToPoint(LatLng latlng, Point point) /*-{
    return this.fromLatLngToPoint(latlng, point);
  }-*/;
  
  /**
   * This interface specifies a function which implements translation from world coordinates on a map projection to LatLng values. The Maps API calls this method when it needs to translate actions on screen to positions on the map. Projection objects must implement this method.
   * @param pixel {@link Point}
   * @param nowrap 
   * @return
   */
  public final native Point fromPointToLatLng(Point pixel, boolean nowrap) /*-{
    return this.fromPointToLatLng(pixel, nowrap);
  }-*/;
  
  
}
