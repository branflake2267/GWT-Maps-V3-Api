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

/**
 * A single DirectionsStep in a DirectionsResult. Some fields may be undefined. Note that though this object is
 * "JSON-like," it is not strictly JSON, as it directly includes LatLng objects. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#DirectionsStep">DirectionsStep API
 * Doc</a>
 */
public class DirectionsStep extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected DirectionsStep() {
  }

  /**
   * A single DirectionsStep in a DirectionsResult. Some fields may be undefined. Note that though this object is
   * "JSON-like," it is not strictly JSON, as it directly includes LatLng objects.
   */
  public static final DirectionsStep newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * The distance covered by this step. This property may be undefined as the distance may be unknown.
   * 
   * @param distance
   */
  public final native void setDistance(Distance distance) /*-{
    this.distance = distance;
  }-*/;

  /**
   * The distance covered by this step. This property may be undefined as the distance may be unknown.
   */
  public final native Distance getDistance() /*-{
    return this.distance;
  }-*/;

  /**
   * The typical time required to perform this step in seconds and in text form. This property may be undefined as the
   * duration may be unknown.
   * 
   * @param duration
   */
  public final native void setDuration(Duration duration) /*-{
    this.duration = duration;
  }-*/;

  /**
   * The typical time required to perform this step in seconds and in text form. This property may be undefined as the
   * duration may be unknown.
   */
  public final native Duration getDuration() /*-{
    return this.duration;
  }-*/;

  /**
   * The ending location of this step.
   * 
   * @param end_location
   */
  public final native void setEnd_Location(LatLng end_location) /*-{
    this.end_location = end_location;
  }-*/;

  /**
   * The ending location of this step.
   */
  public final native LatLng getEnd_Location() /*-{
    return this.end_location;
  }-*/;

  /**
   * Instructions for this step.
   * 
   * @param instructions
   */
  public final native void setInstructions(String instructions) /*-{
    this.instructions = instructions;
  }-*/;

  /**
   * Instructions for this step.
   */
  public final native String getInstructions() /*-{
    return this.instructions;
  }-*/;

  /**
   * A sequence of LatLngs describing the course of this step.
   * 
   * @param path
   */
  public final native void setPath(JsArray<LatLng> path) /*-{
    this.path = path;
  }-*/;

  /**
   * A sequence of LatLngs describing the course of this step.
   */
  public final native JsArray<LatLng> getPath() /*-{
    return this.path;
  }-*/;

  /**
   * The starting location of this step.
   * 
   * @param start_location
   */
  public final native void setStart_Location(LatLng start_location) /*-{
    this.start_location = start_location;
  }-*/;

  /**
   * The starting location of this step.
   */
  public final native LatLng getStart_Location() /*-{
    return this.start_location;
  }-*/;
  
  /**
   * Sub-steps of this step. Specified for non-transit sections of transit routes.
   * 
   * @param steps
   */
  public final native void setSteps(JsArray<DirectionsStep> steps) /*-{
    this.steps = steps;
  }-*/;
  
  /**
   * Sub-steps of this step. Specified for non-transit sections of transit routes.
   */
  public final native JsArray<DirectionsStep> getSteps() /*-{
    return this.steps;
  }-*/;
  
  /**
   * Transit-specific details about this step.
   * This property will be undefined unless the travel mode of this step is TRANSIT.
   * 
   * @param transit
   */
  public final native void setTransit(TransitDetails transit) /*-{
    this.transit = transit;
  }-*/;
  
  /**
   * Transit-specific details about this step.
   * This property will be undefined unless the travel mode of this step is TRANSIT.
   * 
   */
  public final native TransitDetails getTransit() /*-{
    return this.transit;
  }-*/;
  
  /**
   * The mode of travel used in this step.
   * 
   * @param travel_mode
   */
  public final void setTravel_Mode(TravelMode travel_mode) {
    setTravel_ModeImpl(travel_mode.value());
  }

  private final native void setTravel_ModeImpl(String travel_mode) /*-{
    this.travel_mode = travel_mode;
  }-*/;

  /**
   * The mode of travel used in this step.
   */
  public final TravelMode getTravelMode() {
    return TravelMode.fromValue(getTravel_ModeImpl());
  }

  private final native String getTravel_ModeImpl() /*-{
    return this.travel_mode;
  }-*/;

}
