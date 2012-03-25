package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.base.LatLng;

/**
 * An elevation query sent by the ElevationService containing the path along which to return sampled data. This request defines a continuous path along the earth along which elevation samples should be taken at evenly-spaced distances. All paths from vertex to vertex use segments of the great circle between those two points.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#PathElevationRequest}
 */
public class PathElevationRequest extends JavaScriptObject {
  
  /**
   * use newInstance();
   */
  protected PathElevationRequest() {}

  /**
   * An elevation query sent by the ElevationService containing the path along which to return sampled data. This request defines a continuous path along the earth along which elevation samples should be taken at evenly-spaced distances. All paths from vertex to vertex use segments of the great circle between those two points.
   * @return
   */
  public final static PathElevationRequest newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * The path along which to collect elevation values.
   * @param path
   */
  public final native void setPath(JsArray<LatLng> path) /*-{
    this.path = path;
  }-*/;
  
  /**
   * The path along which to collect elevation values.
   * @return
   */
  public final native JsArray<LatLng> getPath() /*-{
    return this.path;
  }-*/;
  
  /**
   * Required. The number of equidistant points along the given path for which to retrieve elevation data, including the endpoints. The number of samples must be a value between 2 and 1024.
   * @param samples
   */
  public final native void setSamples(int samples) /*-{
    this.samples = samples;
  }-*/;
  
  /**
   * Required. The number of equidistant points along the given path for which to retrieve elevation data, including the endpoints. The number of samples must be a value between 2 and 1024.
   * @return
   */
  public final native int getSamples() /*-{
    return this.samples;
  }-*/; 
  
}
