package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.workaround.WorkAroundUtils;

/**
 * A directions query to be sent to the DirectionsService.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#DirectionsRequest}
 */
public class DirectionsRequest extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected DirectionsRequest() {}
  
  /**
   * A directions query to be sent to the DirectionsService.
   * @return
   */
  public static final DirectionsRequest newInstance() {
    JavaScriptObject jso = JavaScriptObject.createObject();
    WorkAroundUtils.removeGwtObjectId(jso);
    return jso.cast();
  }
  
//  public final native void test() /*-{
//    this.origin = "Arlington, WA";
//    this.destination = "Seattle, WA";
//    this.travelMode = $wnd.google.maps.TravelMode.DRIVING;
//  }-*/;
  
  
  /**
   * If true, instructs the Directions service to avoid highways where possible. Optional.
   * @param avoidHighways
   */
  public final native void setAvoidHighways(boolean avoidHighways) /*-{
    this.avoidHighways = avoidHighways;
  }-*/;
  
  /**
   * If true, instructs the Directions service to avoid highways where possible. Optional.
   * @return
   */
  public final native boolean getAvoidHighways() /*-{
    return this.avoidHighways;
  }-*/;
  
  /**
   * If true, instructs the Directions service to avoid toll roads where possible. Optional.
   * @param avoidTolls
   */
  public final native void setAvoidTolls(boolean avoidTolls) /*-{
    this.avoidTolls = avoidTolls;
  }-*/;
  
  /**
   * If true, instructs the Directions service to avoid toll roads where possible. Optional.
   * @return
   */
  public final native boolean getAvoidTolls() /*-{
    return this.avoidTolls;
  }-*/;

  /**
   * Location of destination. This can be specified as either a string to be geocoded or a LatLng. Required.
   * @param destination
   */
  public final native void setDestination(String destination) /*-{
    this.destination = destination;
  }-*/;
  
  /**
   * Location of destination. This can be specified as either a string to be geocoded or a LatLng.
   */
  public final native String getDestination_String() /*-{
    return this.destination;
  }-*/;
  
  /**
   * Location of destination. This can be specified as either a string to be geocoded or a LatLng. Required.
   * @param destination
   */
  public final native void setDestination(LatLng destination) /*-{
    this.destination = destination;
  }-*/;
  
  /**
   * Location of destination. This can be specified as either a string to be geocoded or a LatLng.
   * @return
   */
  public final native LatLng getDestination_LatLng() /*-{
    return this.destination;
  }-*/;
  
  /**
   * If set to true, the DirectionService will attempt to re-order the supplied intermediate waypoints to minimize overall cost of the route. If waypoints are optimized, inspect DirectionsRoute.waypoint_order in the response to determine the new ordering.
   * @param optimizeWaypoints
   */
  public final native void setOptimizeWaypoints(boolean optimizeWaypoints) /*-{
    this.optimizeWaypoints = optimizeWaypoints;
  }-*/;
  
  /**
   * If set to true, the DirectionService will attempt to re-order the supplied intermediate waypoints to minimize overall cost of the route. If waypoints are optimized, inspect DirectionsRoute.waypoint_order in the response to determine the new ordering.
   * @return
   */
  public final native boolean getOptimizeWaypoints() /*-{
    return this.optimizeWaypoints;
  }-*/;
  
  /**
   * Location of origin. This can be specified as either a string to be geocoded or a LatLng. Required.
   * @param orgin
   */
  public final native void setOrigin(String origin) /*-{
    this.origin = origin;
  }-*/;
  
  /**
   * Location of origin. This can be specified as either a string to be geocoded or a LatLng. 
   * @return
   */
  public final native String getOrigin_String() /*-{
    return this.origin;
  }-*/;
  
  /**
   * Location of origin. This can be specified as either a string to be geocoded or a LatLng. Required.
   * @param origin
   */
  public final native void setOrigin(LatLng origin) /*-{
    this.origin = origin;
  }-*/;
  
  /**
   * Location of origin. This can be specified as either a string to be geocoded or a LatLng.
   */
  public final native LatLng getOrigin_LatLng() /*-{
    return this.origin;
  }-*/;
  
  /**
   * Whether or not route alternatives should be provided. Optional.
   * @param provideRouteAlternatives
   */
  public final native void setProvideRouteAlternatives(boolean provideRouteAlternatives) /*-{
    this.provideRouteAlternatives = provideRouteAlternatives;
  }-*/;
  
  /**
   * Whether or not route alternatives should be provided. Optional.
   * @return
   */
  public final native boolean getProvideRouteAlternatives() /*-{
    return this.provideRouteAlternatives;
  }-*/;
  
  /**
   * Region code used as a bias for geocoding requests. Optional.
   * @param region
   */
  public final native void setRegion(String region) /*-{
    this.region = region;
  }-*/;
  
  /**
   * Region code used as a bias for geocoding requests. Optional.
   * @return
   */
  public final native String getRegion() /*-{
    return this.region;
  }-*/;
  
  /**
   * Type of routing requested. Required.
   * @param travelMode
   */
  public final void setTravelMode(TravelMode travelMode) {
    setTravelModeImpl(travelMode.value());
  }

  private final native void setTravelModeImpl(String travelMode) /*-{
    this.travelMode = "DRIVING";
  }-*/;
  
  /**
   * Type of routing requested. Required.
   * @return
   */
  public final TravelMode getTravelMode() {
    return TravelMode.fromValue(getTravelModeImpl());
  }

  private final native String getTravelModeImpl() /*-{
    return this.travelMode;
  }-*/;
  
  /**
   * Preferred unit system to use when displaying distance. Defaults to the unit system used in the country of origin.
   * @param unitSystem
   */
  public final void setUnitSystem(UnitSystem unitSystem) {
    setUnitSystemImpl(unitSystem.value());
  }
  
  private final native void setUnitSystemImpl(int unitSystem) /*-{
    this.unitSystem = unitSystem;
  }-*/;
  
  /**
   * Preferred unit system to use when displaying distance. Defaults to the unit system used in the country of origin.
   * @return
   */
  public final UnitSystem getUnitSystem() {
    return UnitSystem.fromValue(getUnitSystemImpl());
  }
  
  private final native int getUnitSystemImpl() /*-{
    return this.unitSystem;
  }-*/;
  
  /**
   * Array of intermediate waypoints. Directions will be calculated from the origin to the destination by way of each waypoint in this array. Optional.
   * @param waypoints
   */
  public final native void setWaypoints(JsArray<DirectionsWaypoint> waypoints) /*-{
    this.waypoints = waypoints;
  }-*/; 
  
  /**
   * Array of intermediate waypoints. Directions will be calculated from the origin to the destination by way of each waypoint in this array. Optional.
   * @return
   */
  public final native JsArray<DirectionsWaypoint> getWaypoints() /*-{
    return this.waypoints;
  }-*/;
  
}
