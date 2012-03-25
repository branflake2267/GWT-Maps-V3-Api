package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.base.LatLng;

/**
 * A single DirectionsStep in a DirectionsResult. Some fields may be undefined. Note that though this object is "JSON-like," it is not strictly JSON, as it directly includes LatLng objects.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#DirectionsStep}
 */
public class DirectionsStep extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected DirectionsStep() {}
  
  /**
   * A single DirectionsStep in a DirectionsResult. Some fields may be undefined. Note that though this object is "JSON-like," it is not strictly JSON, as it directly includes LatLng objects.
   * @return
   */
  public static final DirectionsStep newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * The distance covered by this step. This property may be undefined as the distance may be unknown.
   * @param distance
   */
  public final native void setDistance(Distance distance) /*-{
    this.distance = distance;
  }-*/;
  
  /**
   * The distance covered by this step. This property may be undefined as the distance may be unknown.
   * @return
   */
  public final native Distance getDistance() /*-{
    return this.distance;
  }-*/;
  
  /**
   * The typical time required to perform this step in seconds and in text form. This property may be undefined as the duration may be unknown.
   * @param duration
   */
  public final native void setDuration(Duration duration) /*-{
    this.duration = duration;
  }-*/;
  
  /**
   * The typical time required to perform this step in seconds and in text form. This property may be undefined as the duration may be unknown.
   * @return
   */
  public final native Duration getDuration() /*-{
    return this.duration;
  }-*/;
  
  /**
   * The ending location of this step.
   * @param end_location
   */
  public final native void setEnd_Location(LatLng end_location) /*-{
    this.end_location = end_location;
  }-*/;
  
  /**
   * The ending location of this step.
   * @return
   */
  public final native LatLng getEnd_Location() /*-{
    return this.end_location;
  }-*/;
  
  /**
   * Instructions for this step.
   * @param instructions
   */
  public final native void setInstructions(String instructions) /*-{
    this.instructions = instructions;
  }-*/;
  
  /**
   * Instructions for this step.
   * @return
   */
  public final native String getInstructions() /*-{
    return this.instructions;
  }-*/;
  
  /**
   * A sequence of LatLngs describing the course of this step.
   * @param path
   */
  public final native void setPath(JsArray<LatLng> path) /*-{
    this.path = path;
  }-*/;
  
  /**
   * A sequence of LatLngs describing the course of this step.
   * @return
   */
  public final native JsArray<LatLng> getPath() /*-{
    return this.path;
  }-*/;
  
  /**
   * The starting location of this step.
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
   * The mode of travel used in this step.
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
   * @return
   */
  public final TravelMode getTravelMode() {
    return TravelMode.fromValue(getTravel_ModeImpl());
  }
  
  private final native String getTravel_ModeImpl() /*-{
    return this.travel_mode;
  }-*/;
  
}
