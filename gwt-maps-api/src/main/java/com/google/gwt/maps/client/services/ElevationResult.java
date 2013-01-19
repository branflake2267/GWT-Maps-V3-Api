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

/**
 * The result of an ElevationService request, consisting of the set of elevation coordinates and their elevation values.
 * Note that a single request may produce multiple ElevationResults. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#ElevationResult">ElevationResult
 * API Doc</a>
 */
public class ElevationResult extends JavaScriptObject {

  /**
   * this will be generated from the ElevationService use newInstatnce();
   */
  protected ElevationResult() {
  }

  /**
   * The result of an ElevationService request, consisting of the set of elevation coordinates and their elevation
   * values. Note that a single request may produce multiple ElevationResults.
   */
  public static final ElevationResult newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * The elevation of this point on Earth, in meters above sea level.
   * 
   * @param elevation
   */
  public final native void setElevation(double elevation) /*-{
    this.elevation = elevation;
  }-*/;

  /**
   * The elevation of this point on Earth, in meters above sea level.
   */
  public final native double getElevation() /*-{
    return this.elevation;
  }-*/;

  /**
   * The location of this elevation result.
   * 
   * @param location
   */
  public final native void setLocation(LatLng location) /*-{
    this.location = location;
  }-*/;

  /**
   * The location of this elevation result.
   */
  public final native LatLng getLocation() /*-{
    return this.location;
  }-*/;

  /**
   * The distance, in meters, between sample points from which the elevation was interpolated. This property will be
   * missing if the resolution is not known. Note that elevation data becomes more coarse (larger resolution values)
   * when multiple points are passed. To obtain the most accurate elevation value for a point, it should be queried
   * independently.
   * 
   * @param resolution
   */
  public final native void setResolution(double resolution) /*-{
    this.resolution = resolution;
  }-*/;

  /**
   * The distance, in meters, between sample points from which the elevation was interpolated. This property will be
   * missing if the resolution is not known. Note that elevation data becomes more coarse (larger resolution values)
   * when multiple points are passed. To obtain the most accurate elevation value for a point, it should be queried
   * independently.
   */
  public final native double getResolution() /*-{
    return this.resolution;
  }-*/;

}
