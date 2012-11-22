package com.google.gwt.maps.client.streetview;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.LatLng;

/** 
 * A representation of a location in the Street View panorama.
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#StreetViewLocation">StreetViewLocation API Doc</a>
 */
public class StreetViewLocation extends JavaScriptObject {
  
  /**
   * A representation of a location in the Street View panorama.
   * use newInstance();
   */
  protected StreetViewLocation() {}
  
  /**
   * creates A representation of a location in the Street View panorama.
   */
  public final static StreetViewLocation newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * sets A localized string describing the location.
   * @param description
   */
  public final native void setDescription(String description) /*-{
    this.description = description;
  }-*/;
  
  /**
   * gets A localized string describing the location.
   */
  public final native String getDescription() /*-{
    return this.description;
  }-*/;
  
  /**
   * sets The latlng of the panorama.
   * @param latLng
   */
  public final native void setLatLng(LatLng latLng) /*-{
    this.latLng = latLng;
  }-*/;
  
  /**
   * gets The latlng of the panorama.
   */
  public final native LatLng getLatLng() /*-{
    return this.latLng;
  }-*/;
  
  /**
   * sets A unique identifier for the panorama. This is stable within a session but unstable across sessions.
   * @param pano
   */
  public final native void setPano(String pano) /*-{
    this.pano = pano;
  }-*/;
  
  /**
   * gets A unique identifier for the panorama. This is stable within a session but unstable across sessions.
   */
  public final native String getPano() /*-{
    return this.pano;
  }-*/;
  
  
}
