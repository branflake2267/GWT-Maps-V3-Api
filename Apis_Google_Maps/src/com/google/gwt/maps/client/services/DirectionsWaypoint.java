package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.LatLng;

/**
 * A DirectionsWaypoint represents a location between origin and destination through which the trip should be routed.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#DirectionsWaypoint}
 */
public class DirectionsWaypoint extends JavaScriptObject {
  
  /**
   * use newInstance();
   */
  protected DirectionsWaypoint() {}
  
  /**
   * A DirectionsWaypoint represents a location between origin and destination through which the trip should be routed.
   * @return
   */
  public static final DirectionsWaypoint newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * Waypoint location. Can be an address string or LatLng. Optional.
   * @param location
   */
  public final native void setLocation(String location) /*-{
    this.location = location;
  }-*/;
  
  /**
   * Waypoint location. Can be an address string or LatLng. Optional.
   * @return
   */
  public final native String getLocation_String() /*-{
    return this.location;
  }-*/;
  
  /**
   * Waypoint location. Can be an address string or LatLng. Optional.
   * @param location
   */
  public final native void setLocation(LatLng location) /*-{
    this.location = location;
  }-*/;
  
  /**
   * Waypoint location. Can be an address string or LatLng. Optional.
   * @return
   */
  public final native LatLng getLocation_LatLng() /*-{
    return this.location;
  }-*/;
  
  /**
   * If true, indicates that this waypoint is a stop between the origin and destination. This has the effect of splitting the route into two. This value is true by default. Optional.
   * @param stopover
   */
  public final native void setStopOver(boolean stopover) /*-{
    this.stopover = stopover;
  }-*/;
  
  /**
   * If true, indicates that this waypoint is a stop between the origin and destination. This has the effect of splitting the route into two. This value is true by default. Optional.
   * @return
   */
  public final native boolean getStopOver() /*-{
    return this.stopover;
  }-*/;
  
}
