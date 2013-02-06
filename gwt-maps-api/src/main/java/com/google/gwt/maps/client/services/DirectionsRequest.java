package com.google.gwt.maps.client.services;

/*
 * #%L
 * GWT Maps API V3 - Core API
 * %%
 * Copyright (C) 2011 - 2012 GWT Maps API V3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.workaround.WorkAroundUtils;

/**
 * A directions query to be sent to the DirectionsService. <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#DirectionsRequest"
 * >DirectionsRequest API Doc</a>
 */
public class DirectionsRequest extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected DirectionsRequest() {
  }

  /**
   * A directions query to be sent to the DirectionsService.
   */
  public static final DirectionsRequest newInstance() {
    JavaScriptObject jso = JavaScriptObject.createObject();
    WorkAroundUtils.removeGwtObjectId(jso);
    return jso.cast();
  }

  /**
   * If true, instructs the Directions service to avoid highways where possible. Optional.
   * 
   * @param avoidHighways
   */
  public final native void setAvoidHighways(boolean avoidHighways) /*-{
    this.avoidHighways = avoidHighways;
  }-*/;

  /**
   * If true, instructs the Directions service to avoid highways where possible. Optional.
   */
  public final native boolean getAvoidHighways() /*-{
    return this.avoidHighways;
  }-*/;

  /**
   * If true, instructs the Directions service to avoid toll roads where possible. Optional.
   * 
   * @param avoidTolls
   */
  public final native void setAvoidTolls(boolean avoidTolls) /*-{
    this.avoidTolls = avoidTolls;
  }-*/;

  /**
   * If true, instructs the Directions service to avoid toll roads where possible. Optional.
   */
  public final native boolean getAvoidTolls() /*-{
    return this.avoidTolls;
  }-*/;

  /**
   * Location of destination. This can be specified as either a string to be geocoded or a LatLng. Required.
   * 
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
   * 
   * @param destination
   */
  public final native void setDestination(LatLng destination) /*-{
    this.destination = destination;
  }-*/;

  /**
   * Location of destination. This can be specified as either a string to be geocoded or a LatLng.
   */
  public final native LatLng getDestination_LatLng() /*-{
    return this.destination;
  }-*/;

  /**
   * If set to true, the DirectionService will attempt to re-order the supplied intermediate waypoints to minimize
   * overall cost of the route. If waypoints are optimized, inspect DirectionsRoute.waypoint_order in the response to
   * determine the new ordering.
   * 
   * @param optimizeWaypoints
   */
  public final native void setOptimizeWaypoints(boolean optimizeWaypoints) /*-{
    this.optimizeWaypoints = optimizeWaypoints;
  }-*/;

  /**
   * If set to true, the DirectionService will attempt to re-order the supplied intermediate waypoints to minimize
   * overall cost of the route. If waypoints are optimized, inspect DirectionsRoute.waypoint_order in the response to
   * determine the new ordering.
   */
  public final native boolean getOptimizeWaypoints() /*-{
    return this.optimizeWaypoints;
  }-*/;

  /**
   * Location of origin. This can be specified as either a string to be geocoded or a LatLng. Required.
   * 
   * @param origin
   */
  public final native void setOrigin(String origin) /*-{
    this.origin = origin;
  }-*/;

  /**
   * Location of origin. This can be specified as either a string to be geocoded or a LatLng.
   */
  public final native String getOrigin_String() /*-{
    return this.origin;
  }-*/;

  /**
   * Location of origin. This can be specified as either a string to be geocoded or a LatLng. Required.
   * 
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
   * 
   * @param provideRouteAlternatives
   */
  public final native void setProvideRouteAlternatives(boolean provideRouteAlternatives) /*-{
    this.provideRouteAlternatives = provideRouteAlternatives;
  }-*/;

  /**
   * Whether or not route alternatives should be provided. Optional.
   */
  public final native boolean getProvideRouteAlternatives() /*-{
    return this.provideRouteAlternatives;
  }-*/;

  /**
   * Region code used as a bias for geocoding requests. Optional.
   * 
   * @param region
   */
  public final native void setRegion(String region) /*-{
    this.region = region;
  }-*/;

  /**
   * Region code used as a bias for geocoding requests. Optional.
   */
  public final native String getRegion() /*-{
    return this.region;
  }-*/;

  /**
   * Settings that apply only to requests where travelMode is TRANSIT.
   * This object will have no effect for other travel modes.
   * 
   * @param transitOptions
   */
  public final native void setTransitOptions(TransitOptions transitOptions) /*-{
    this.transitOptions = transitOptions;
  }-*/;
  
  /**
   * Settings that apply only to requests where travelMode is TRANSIT.
   * This object will have no effect for other travel modes.
   */
  public final native TransitOptions getTransitOptions() /*-{
    return this.transitOptions;
  }-*/;
  
  /**
   * Type of routing requested. Required.
   * 
   * @param travelMode
   */
  public final void setTravelMode(TravelMode travelMode) {
    setTravelModeImpl(travelMode.value());
  }

  private final native void setTravelModeImpl(String travelMode) /*-{
    this.travelMode = travelMode;
  }-*/;

  /**
   * Type of routing requested. Required.
   */
  public final TravelMode getTravelMode() {
    return TravelMode.fromValue(getTravelModeImpl());
  }

  private final native String getTravelModeImpl() /*-{
    return this.travelMode;
  }-*/;

  /**
   * Preferred unit system to use when displaying distance. Defaults to the unit system used in the country of origin.
   * 
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
   */
  public final UnitSystem getUnitSystem() {
    return UnitSystem.fromValue(getUnitSystemImpl());
  }

  private final native int getUnitSystemImpl() /*-{
    return this.unitSystem;
  }-*/;

  /**
   * Array of intermediate waypoints. Directions will be calculated from the origin to the destination by way of each
   * waypoint in this array. Optional.
   * 
   * @param waypoints
   */
  public final native void setWaypoints(JsArray<DirectionsWaypoint> waypoints) /*-{
    this.waypoints = waypoints;
  }-*/;

  /**
   * Array of intermediate waypoints. Directions will be calculated from the origin to the destination by way of each
   * waypoint in this array. Optional.
   */
  public final native JsArray<DirectionsWaypoint> getWaypoints() /*-{
    return this.waypoints;
  }-*/;

}
