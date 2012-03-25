package com.google.gwt.maps.client.placeslib;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;

/**
 * Defines information about the geometry of a Place.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#PlaceGeometry}
 */
public class PlaceGeometry extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected PlaceGeometry() {}
  
  /**
   * Defines information about the geometry of a Place.
   * @return
   */
  public static final PlaceGeometry newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * The Place's position.
   * @param location
   */
  public final native void setLocation(LatLng location) /*-{
    this.location = location;
  }-*/;
  
  /**
   * The Place's position.
   * @return
   */
  public final native LatLng getLocation() /*-{
    return this.location;
  }-*/;
  
  /**
   * The preferred viewport when displaying this Place on a map. This property will be null if the preferred viewport for the Place is not known. 
   * @param viewport
   */
  public final native void setViewPort(LatLngBounds viewport) /*-{
    this.viewport = viewport;
  }-*/;
  
  /**
   * The preferred viewport when displaying this Place on a map. This property will be null if the preferred viewport for the Place is not known.
   * @return
   */
  public final native LatLngBounds getViewPort() /*-{
    return this.viewport;
  }-*/;
  
}
