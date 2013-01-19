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
import com.google.gwt.maps.client.base.LatLngBounds;

/**
 * Geometry information about this GeocoderResult <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#GeocoderGeometry">GeocoderGeometry
 * API Doc</a>
 */
public class GeocoderGeometry extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected GeocoderGeometry() {
  }

  /**
   * Geometry information about this GeocoderResult
   */
  public static final GeocoderGeometry newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * The precise bounds of this GeocodeResult, if applicable
   * 
   * @param bounds
   */
  public final native void setBounds(LatLngBounds bounds) /*-{
    this.bounds = bounds;
  }-*/;

  /**
   * The precise bounds of this GeocodeResult, if applicable
   */
  public final native LatLngBounds getBounds() /*-{
    return this.bounds;
  }-*/;

  /**
   * The latitude/longitude coordinates of this result
   * 
   * @param location
   */
  public final native void setLocation(LatLng location) /*-{
    this.location = location;
  }-*/;

  /**
   * The latitude/longitude coordinates of this result
   */
  public final native LatLng getLocation() /*-{
    return this.location;
  }-*/;

  /**
   * The type of location returned in location
   * 
   * @param location_type
   */
  public final void setLocation_Type(GeocoderLocationType location_type) {
    setLocation_TypeImpl(location_type.value());
  }

  private final native void setLocation_TypeImpl(String location_type) /*-{
    this.location_type = location_type;
  }-*/;

  /**
   * The type of location returned in location
   */
  public final GeocoderLocationType getLocation_Type() {
    return GeocoderLocationType.fromValue(getLocation_TypeImpl());
  }

  private final native String getLocation_TypeImpl() /*-{
    return this.location_type;
  }-*/;

  /**
   * The bounds of the recommended viewport for displaying this GeocodeResult
   * 
   * @param viewport
   */
  public final native void setViewPort(LatLngBounds viewport) /*-{
    this.viewport = viewport;
  }-*/;

  /**
   * The bounds of the recommended viewport for displaying this GeocodeResult
   */
  public final native LatLngBounds getViewPort() /*-{
    return this.viewport;
  }-*/;

}
