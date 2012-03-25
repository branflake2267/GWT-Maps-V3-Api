package com.google.gwt.maps.client.streetview;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.workaround.WorkAroundUtils;

/**
 * A point of view object which specifies the camera's orientation at the Street View panorama's position. The point of view is defined as heading, pitch and zoom.
 * {@link }
 */
public class StreetViewPov extends JavaScriptObject {
  
  /**
   * A point of view object which specifies the camera's orientation at the Street View panorama's position. The point of view is defined as heading, pitch and zoom.
   * use newInstance();
   */
  protected StreetViewPov() {}

  /**
   * creates A point of view object which specifies the camera's orientation at the Street View panorama's position. The point of view is defined as heading, pitch and zoom.
   * @return
   */
  public final static StreetViewPov newInstance() {
    JavaScriptObject jso = JavaScriptObject.createObject();
    WorkAroundUtils.removeGwtObjectId(jso);
    return jso.cast(); 
  }
  
  /**
   * sets The camera heading in degrees relative to true north. True north is 0¡, east is 90¡, south is 180¡, west is 270¡.
   * @param heading
   */
  public final native void setHeading(int heading) /*-{
    this.heading = heading;
  }-*/;
  
  /**
   * gets The camera heading in degrees relative to true north. True north is 0¡, east is 90¡, south is 180¡, west is 270¡.
   * @return
   */
  public final native int getHeading() /*-{
    return this.heading;
  }-*/;
  
  /**
   * sets The camera pitch in degrees, relative to the street view vehicle. Ranges from 90¡ (directly upwards) to -90¡ (directly downwards).
   * @param pitch
   */
  public final native void setPitch(int pitch) /*-{
    this.pitch = pitch;
  }-*/;
  
  /**
   * gets The camera pitch in degrees, relative to the street view vehicle. Ranges from 90¡ (directly upwards) to -90¡ (directly downwards).
   * @return
   */
  public final native int getPitch() /*-{
    return this.pitch;
  }-*/;
  
  /**
   * sets The zoom level. Fully zoomed-out is level 0, zooming in increases the zoom level.
   * @param zoom
   */
  public final native void setZoom(int zoom) /*-{
    this.zoom = zoom;
  }-*/;
 
  /**
   * gets The zoom level. Fully zoomed-out is level 0, zooming in increases the zoom level.
   * @return
   */
  public final native int getZoom() /*-{
    return this.zoom;
  }-*/;
  
}
