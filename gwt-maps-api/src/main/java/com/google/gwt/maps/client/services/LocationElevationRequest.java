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
import com.google.gwt.maps.client.workaround.WorkAroundUtils;

/**
 * An elevation request sent by the ElevationService containing the list of discrete coordinates (LatLngs) for which to
 * return elevation data. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#LocationElevationRequest">
 * LocationElevationRequest API Doc</a>
 */
public class LocationElevationRequest extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected LocationElevationRequest() {
  }

  /**
   * An elevation request sent by the ElevationService containing the list of discrete coordinates (LatLngs) for which
   * to return elevation data.
   */
  public final static LocationElevationRequest newInstance() {
    JavaScriptObject jso = JavaScriptObject.createObject();
    WorkAroundUtils.removeGwtObjectId(jso);
    return jso.cast();
  }

  /**
   * The discrete locations for which to retrieve elevations.
   * 
   * @param locations
   */
  public final native void setLocations(JsArray<LatLng> locations) /*-{
    this.locations = locations;
  }-*/;

  /**
   * The discrete locations for which to retrieve elevations.
   */
  public final native JsArray<LatLng> getLocations() /*-{
    return this.locations;
  }-*/;

}
