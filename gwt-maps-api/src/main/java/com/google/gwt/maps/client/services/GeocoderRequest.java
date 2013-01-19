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
import com.google.gwt.maps.client.workaround.WorkAroundUtils;

/**
 * The specification for a geocoding request to be sent to the Geocoder. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#GeocoderRequest">GeocoderRequest
 * API Doc</a>
 */
public class GeocoderRequest extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected GeocoderRequest() {
  }

  /**
   * The specification for a geocoding request to be sent to the Geocoder.
   */
  public static final GeocoderRequest newInstance() {
    JavaScriptObject jso = createObject();
    WorkAroundUtils.removeGwtObjectId(jso);
    return jso.cast();
  }

  /**
   * Address. Optional.
   * 
   * @param address
   */
  public final native void setAddress(String address) /*-{
    this.address = address;
  }-*/;

  /**
   * Address. Optional.
   */
  public final native String getAddress() /*-{
    return this.address;
  }-*/;

  /**
   * LatLngBounds within which to search. Optional.
   * 
   * @param bounds
   */
  public final native void setBounds(LatLngBounds bounds) /*-{
    this.bounds = bounds;
  }-*/;

  /**
   * LatLngBounds within which to search. Optional.
   */
  public final native LatLngBounds getBounds() /*-{
    return this.bounds;
  }-*/;

  /**
   * LatLng about which to search. Optional.
   * 
   * @param location
   */
  public final native void setLocation(LatLng location) /*-{
    this.location = location;
  }-*/;

  /**
   * LatLng about which to search. Optional.
   */
  public final native LatLng getLocation() /*-{
    return this.location;
  }-*/;

  /**
   * Country code top-level domain within which to search. Optional.
   * 
   * @param region
   */
  public final native void setRegion(String region) /*-{
    this.region = region;
  }-*/;

  /**
   * Country code top-level domain within which to search. Optional.
   */
  public final native String getRegion() /*-{
    return this.region;
  }-*/;

}
