package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.base.LatLng;

/**
 * A single leg consisting of a set of steps in a DirectionsResult. Some fields in the leg may not be returned for all requests. (This object was formerly known as "DirectionsRoute".) Note that though this result is "JSON-like," it is not strictly JSON, as it directly and indirectly includes LatLng objects.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#DirectionsLeg}
 */
public class DirectionsLeg extends JavaScriptObject {
  
  /**
   * use newInstance();
   */
  protected DirectionsLeg() {}
  
  /**
   * A single leg consisting of a set of steps in a DirectionsResult. Some fields in the leg may not be returned for all requests. (This object was formerly known as "DirectionsRoute".) Note that though this result is "JSON-like," it is not strictly JSON, as it directly and indirectly includes LatLng objects.
   * @return
   */
  public static final DirectionsLeg newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * The total distance covered by this leg. This property may be undefined as the distance may be unknown.
   * @param distance
   */
  public final native void setDistance(Distance distance) /*-{
    this.distance = distance;
  }-*/;
  
  /**
   * The total distance covered by this leg. This property may be undefined as the distance may be unknown.
   * @return
   */
  public final native Distance getDistance() /*-{
    return this.distance;
  }-*/;
  
  /**
   * The total duration of this leg. This property may be undefined as the duration may be unknown.
   * @param duration
   */
  public final native void setDuration(Duration duration) /*-{
    this.duration = duration;
  }-*/;
  
  /**
   * The total duration of this leg. This property may be undefined as the duration may be unknown.
   * @return
   */
  public final native Duration getDuration() /*-{
    return this.duration;
  }-*/;
  
  /**
   * The address of the destination of this leg.
   * @param end_address
   */
  public final native void setEnd_Address(String end_address) /*-{
    this.end_address = end_address;
  }-*/;
  
  /**
   * The address of the destination of this leg.
   * @return
   */
  public final native String getEnd_Address() /*-{
    return this.end_address;
  }-*/;

  /**
   * The DirectionsService calculates directions between locations by using the nearest transportation option (usually a road) at the start and end locations. end_location indicates the actual geocoded destination, which may be different than the end_location of the last step if, for example, the road is not near the destination of this leg.
   * @param end_location
   */
  public final native void setEnd_Location(LatLng end_location) /*-{
    this.end_location = end_location;
  }-*/;
  
  /**
   * The DirectionsService calculates directions between locations by using the nearest transportation option (usually a road) at the start and end locations. end_location indicates the actual geocoded destination, which may be different than the end_location of the last step if, for example, the road is not near the destination of this leg.
   * @return
   */
  public final native LatLng getEnd_Location() /*-{
    return this.end_location;
  }-*/;
  
  /**
   * The address of the origin of this leg.
   * @param start_address
   */
  public final native void setStart_Address(String start_address) /*-{
    this.start_address = start_address;
  }-*/;
  
  /**
   * The address of the origin of this leg.
   * @return
   */
  public final native String getStart_Address() /*-{
    return this.start_address;
  }-*/;
  
  /**
   * The DirectionsService calculates directions between locations by using the nearest transportation option (usually a road) at the start and end locations. start_location indicates the actual geocoded origin, which may be different than the start_location of the first step if, for example, the road is not near the origin of this leg.
   * @param start_location
   */
  public final native void setStart_Location(LatLng start_location) /*-{
    this.start_location = start_location;
  }-*/;
  
  /**
   * The DirectionsService calculates directions between locations by using the nearest transportation option (usually a road) at the start and end locations. start_location indicates the actual geocoded origin, which may be different than the start_location of the first step if, for example, the road is not near the origin of this leg.
   * @return
   */
  public final native LatLng getStart_Location() /*-{
    return this.start_location;
  }-*/;
  
  /**
   * An array of DirectionsSteps, each of which contains information about the individual steps in this leg.
   * @param steps
   */
  public final native void setSteps(JsArray<DirectionsStep> steps) /*-{
    this.steps = steps;
  }-*/;
  
  /**
   * An array of DirectionsSteps, each of which contains information about the individual steps in this leg.
   * @return
   */
  public final native JsArray<DirectionsStep> getSteps() /*-{
    return this.steps;
  }-*/;
  
  /**
   * An array of waypoints along this leg that were not specified in the original request, either as a result of a user dragging the polyline or selecting an alternate route.
   * @param via_waypoints
   */
  public final native void setVia_Waypoints(JsArray<LatLng> via_waypoints) /*-{
    this.via_waypoints = via_waypoints;
  }-*/;
 
  /**
   * An array of waypoints along this leg that were not specified in the original request, either as a result of a user dragging the polyline or selecting an alternate route.
   * @return
   */
  public final native JsArray<LatLng> getVia_Waypoints() /*-{
    return this.via_waypoints;
  }-*/;
  
}
