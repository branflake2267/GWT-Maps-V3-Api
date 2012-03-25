package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.LatLng;

/**
 * The result of an ElevationService request, consisting of the set of elevation coordinates and their elevation values. Note that a single request may produce multiple ElevationResults.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#ElevationResult}
 */
public class ElevationResult extends JavaScriptObject {
  
  /**
   * this will be generated from the ElevationService
   * use newInstatnce();
   */
  protected ElevationResult() {}

  /**
   * The result of an ElevationService request, consisting of the set of elevation coordinates and their elevation values. Note that a single request may produce multiple ElevationResults.
   * @return
   */
  public static final ElevationResult newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * The elevation of this point on Earth, in meters above sea level.
   * @param elevation
   */
  public final native void setElevation(double elevation) /*-{
    this.elevation = elevation;
  }-*/;
  
  /**
   * The elevation of this point on Earth, in meters above sea level.
   * @return
   */
  public final native double getElevation() /*-{
    return this.elevation;
  }-*/;
  
  /**
   * The location of this elevation result.
   * @param location
   */
  public final native void setLocation(LatLng location) /*-{
    this.location = location;
  }-*/;
  
  /**
   * The location of this elevation result.
   * @return
   */
  public final native LatLng getLocation() /*-{
    return this.location;
  }-*/;
  
  /**
   * The distance, in meters, between sample points from which the elevation was interpolated. This property will be missing if the resolution is not known. Note that elevation data becomes more coarse (larger resolution values) when multiple points are passed. To obtain the most accurate elevation value for a point, it should be queried independently.
   * @param resolution
   */
  public final native void setResolution(double resolution) /*-{
    this.resolution = resolution;
  }-*/;
  
  /**
   * The distance, in meters, between sample points from which the elevation was interpolated. This property will be missing if the resolution is not known. Note that elevation data becomes more coarse (larger resolution values) when multiple points are passed. To obtain the most accurate elevation value for a point, it should be queried independently.
   * @return
   */
  public final native double getResolution() /*-{
    return this.resolution;
  }-*/;
  
}
