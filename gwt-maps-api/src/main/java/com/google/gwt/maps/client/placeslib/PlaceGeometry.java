package com.google.gwt.maps.client.placeslib;

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
 * Defines information about the geometry of a Place. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#PlaceGeometry">PlaceGeometry API
 * Doc</a>
 */
public class PlaceGeometry extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected PlaceGeometry() {
  }

  /**
   * Defines information about the geometry of a Place.
   */
  public static final PlaceGeometry newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * The Place's position.
   * 
   * @param location
   */
  public final native void setLocation(LatLng location) /*-{
    this.location = location;
  }-*/;

  /**
   * The Place's position.
   */
  public final native LatLng getLocation() /*-{
    return this.location;
  }-*/;

  /**
   * The preferred viewport when displaying this Place on a map. This property will be null if the preferred viewport
   * for the Place is not known.
   * 
   * @param viewport
   */
  public final native void setViewPort(LatLngBounds viewport) /*-{
    this.viewport = viewport;
  }-*/;

  /**
   * The preferred viewport when displaying this Place on a map. This property will be null if the preferred viewport
   * for the Place is not known.
   */
  public final native LatLngBounds getViewPort() /*-{
    return this.viewport;
  }-*/;

}
