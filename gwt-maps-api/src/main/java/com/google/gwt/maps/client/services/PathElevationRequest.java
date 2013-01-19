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
 * An elevation query sent by the ElevationService containing the path along which to return sampled data. This request
 * defines a continuous path along the earth along which elevation samples should be taken at evenly-spaced distances.
 * All paths from vertex to vertex use segments of the great circle between those two points. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#PathElevationRequest">
 * PathElevationRequest API Doc</a>
 */
public class PathElevationRequest extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected PathElevationRequest() {
  }

  /**
   * An elevation query sent by the ElevationService containing the path along which to return sampled data. This
   * request defines a continuous path along the earth along which elevation samples should be taken at evenly-spaced
   * distances. All paths from vertex to vertex use segments of the great circle between those two points.
   */
  public final static PathElevationRequest newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * The path along which to collect elevation values.
   * 
   * @param path
   */
  public final native void setPath(JsArray<LatLng> path) /*-{
    this.path = path;
  }-*/;

  /**
   * The path along which to collect elevation values.
   */
  public final native JsArray<LatLng> getPath() /*-{
    return this.path;
  }-*/;

  /**
   * Required. The number of equidistant points along the given path for which to retrieve elevation data, including the
   * endpoints. The number of samples must be a value between 2 and 1024.
   * 
   * @param samples
   */
  public final native void setSamples(int samples) /*-{
    this.samples = samples;
  }-*/;

  /**
   * Required. The number of equidistant points along the given path for which to retrieve elevation data, including the
   * endpoints. The number of samples must be a value between 2 and 1024.
   */
  public final native int getSamples() /*-{
    return this.samples;
  }-*/;

}
