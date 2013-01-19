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
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.workaround.WorkAroundUtils;

/**
 * A DirectionsWaypoint represents a location between origin and destination through which the trip should be routed. <br>
 * <br>
 * See <a
 * href="https://developers.google.com/maps/documentation/javascript/reference#DirectionsWaypoint">DirectionsWaypoint
 * API Doc</a>
 */
public class DirectionsWaypoint extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected DirectionsWaypoint() {
  }

  /**
   * A DirectionsWaypoint represents a location between origin and destination through which the trip should be routed.
   */
  public static final DirectionsWaypoint newInstance() {
    JavaScriptObject jso = JavaScriptObject.createObject();
    WorkAroundUtils.removeGwtObjectId(jso);
    return jso.cast();
  }

  /**
   * Waypoint location. Can be an address string or LatLng. Optional.
   * 
   * @param location
   */
  public final native void setLocation(String location) /*-{
    this.location = location;
  }-*/;

  /**
   * Waypoint location. Can be an address string or LatLng. Optional.
   */
  public final native String getLocation_String() /*-{
    return this.location;
  }-*/;

  /**
   * Waypoint location. Can be an address string or LatLng. Optional.
   * 
   * @param location
   */
  public final native void setLocation(LatLng location) /*-{
    this.location = location;
  }-*/;

  /**
   * Waypoint location. Can be an address string or LatLng. Optional.
   */
  public final native LatLng getLocation_LatLng() /*-{
    return this.location;
  }-*/;

  /**
   * If true, indicates that this waypoint is a stop between the origin and destination. This has the effect of
   * splitting the route into two. This value is true by default. Optional.
   * 
   * @param stopover
   */
  public final native void setStopOver(boolean stopover) /*-{
    this.stopover = stopover;
  }-*/;

  /**
   * If true, indicates that this waypoint is a stop between the origin and destination. This has the effect of
   * splitting the route into two. This value is true by default. Optional.
   */
  public final native boolean getStopOver() /*-{
    return this.stopover;
  }-*/;

}
