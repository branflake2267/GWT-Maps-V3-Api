package com.google.gwt.maps.client.visualizationlib;

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
 * A data point entry for a heatmap. This is a geographical data point with a weight attribute. <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#WeightedLocation"
 * >WeightedLocation API Doc</a>
 */
public class WeightedLocation extends JavaScriptObject {

  /**
   * See {@link #newInstance}
   */
  protected WeightedLocation() {
  };

  /**
   * A data point entry for a heatmap. This is a geographical data point with a weight attribute.
   * 
   * @param location
   * @param weight weighting value
   */
  public static WeightedLocation newInstance(LatLng location, double weight) {
    WeightedLocation options = newInstanceDefault();
    options.setWeight(weight);
    options.setLocation(location);
    return options;
  }

  /**
   * Setup a Javascript object to store the values in
   * 
   * @return WeightedLocation
   */
  private final static WeightedLocation newInstanceDefault() {
    JavaScriptObject jso = JavaScriptObject.createObject();
    // WorkAroundUtils.removeGwtObjectId(jso); TODO Still needed?
    return jso.cast();
  }

  /**
   * Get the weighting value of the data point.
   * 
   * @return weight value or NULL
   */
  public native final double getWeight()/*-{
    return this.weight;
  }-*/;

  /**
   * Set the weighting value of the data point.
   * 
   * @param weight
   */
  public final native void setWeight(double weight)/*-{
    this.weight = weight;
  }-*/;

  /**
   * The location of data point.
   * 
   * @param location
   */
  public final native void setLocation(LatLng location)/*-{
    this.location = location;
  }-*/;

  /**
   * Get location of the data point.
   * 
   * @return location
   */
  public final native LatLng getLocation()/*-{
    return this.location;
  }-*/;

}
