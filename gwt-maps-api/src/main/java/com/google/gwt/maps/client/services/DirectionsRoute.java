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
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;

/**
 * A single route containing a set of legs in a DirectionsResult. (This object was formerly known as "DirectionsTrip".)
 * Note that though this object is "JSON-like," it is not strictly JSON, as it directly and indirectly includes LatLng
 * objects. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#DirectionsRoute">DirectionsRoute
 * API Doc</a>
 */
public class DirectionsRoute extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected DirectionsRoute() {
  }

  /**
   * A single route containing a set of legs in a DirectionsResult. (This object was formerly known as
   * "DirectionsTrip".) Note that though this object is "JSON-like," it is not strictly JSON, as it directly and
   * indirectly includes LatLng objects.
   */
  public static final DirectionsRoute newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * The bounds for this route.
   * 
   * @param bounds
   */
  public final native void setBounds(LatLngBounds bounds) /*-{
    this.bounds = bounds;
  }-*/;

  /**
   * The bounds for this route.
   */
  public final native LatLngBounds getBounds() /*-{
    return this.bounds;
  }-*/;

  /**
   * Copyrights text to be displayed for this route.
   * 
   * @param copyrights
   */
  public final native void setCopyrights(String copyrights) /*-{
    this.copyrights = copyrights;
  }-*/;

  /**
   * Copyrights text to be displayed for this route.
   */
  public final native String getCopyrights() /*-{
    return this.copyrights;
  }-*/;

  /**
   * An array of DirectionsLegs, each of which contains information about the steps of which it is composed. There will
   * be one leg for each waypoint or destination specified. So a route with no waypoints will contain one DirectionsLeg
   * and a route with one waypoint will contain two. (This property was formerly known as "routes".)
   * 
   * @param legs
   */
  public final native void setLegs(JsArray<DirectionsLeg> legs) /*-{
    this.legs = legs;
  }-*/;

  /**
   * An array of DirectionsLegs, each of which contains information about the steps of which it is composed. There will
   * be one leg for each waypoint or destination specified. So a route with no waypoints will contain one DirectionsLeg
   * and a route with one waypoint will contain two. (This property was formerly known as "routes".)
   */
  public final native JsArray<DirectionsLeg> getLegs() /*-{
    return this.legs;
  }-*/;

  /**
   * An array of LatLngs representing the entire course of this route. The path is simplified in order to make it
   * suitable in contexts where a small number of vertices is required (such as Static Maps API URLs).
   * 
   * @param overview_path
   */
  public final native void setOverview_Path(JsArray<LatLng> overview_path) /*-{
    this.overview_path = overview_path;
  }-*/;

  /**
   * An array of LatLngs representing the entire course of this route. The path is simplified in order to make it
   * suitable in contexts where a small number of vertices is required (such as Static Maps API URLs).
   */
  public final native JsArray<LatLng> getOverview_Path() /*-{
    return this.overview_path;
  }-*/;

  /**
   * Warnings to be displayed when showing these directions.
   * 
   * @param warnings
   */
  public final native void setWarnings(JsArrayString warnings) /*-{
    this.warnings = warnings;
  }-*/;

  /**
   * Warnings to be displayed when showing these directions.
   */
  public final native JsArrayString getWarnings() /*-{
    return this.warnings;
  }-*/;

  /**
   * If optimizeWaypoints was set to true, this field will contain the re-ordered permutation of the input waypoints.
   * For example, if the input was: Origin: Los Angeles Waypoints: Dallas, Bangor, Phoenix Destination: New York and the
   * optimized output was ordered as follows: Origin: Los Angeles Waypoints: Phoenix, Dallas, Bangor Destination: New
   * York then this field will be an Array containing the values [2, 0, 1]. Note that the numbering of waypoints is
   * zero-based. If any of the input waypoints has stopover set to false, this field will be empty, since route
   * optimization is not available for such queries.
   * 
   * @param waypoint_order
   */
  public final native void setWayPoint_Order(JsArrayInteger waypoint_order) /*-{
    this.waypoint_order = waypoint_order;
  }-*/;

  /**
   * If optimizeWaypoints was set to true, this field will contain the re-ordered permutation of the input waypoints.
   * For example, if the input was: Origin: Los Angeles Waypoints: Dallas, Bangor, Phoenix Destination: New York and the
   * optimized output was ordered as follows: Origin: Los Angeles Waypoints: Phoenix, Dallas, Bangor Destination: New
   * York then this field will be an Array containing the values [2, 0, 1]. Note that the numbering of waypoints is
   * zero-based. If any of the input waypoints has stopover set to false, this field will be empty, since route
   * optimization is not available for such queries.
   */
  public final native JsArrayInteger getWayPoint_Order() /*-{
    return this.waypoint_order;
  }-*/;

}
