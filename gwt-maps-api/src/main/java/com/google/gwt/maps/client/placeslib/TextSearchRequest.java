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

public class TextSearchRequest extends JavaScriptObject {

  protected TextSearchRequest() {
  }

  public static final TextSearchRequest newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * The bounds within which to search for Places. Both location and radius will be ignored if bounds is set.
   * 
   * @param bounds
   */
  public final native void setBounds(LatLngBounds bounds) /*-{
    this.bounds = bounds;
  }-*/;

  /**
   * The bounds within which to search for Places. Both location and radius will be ignored if bounds is set.
   */
  public final native LatLngBounds getBounds() /*-{
    return this.bounds;
  }-*/;

  /**
   * The location around which to search for Places.
   * 
   * @param location
   */
  public final native void setLocation(LatLng location) /*-{
    this.location = location;
  }-*/;

  /**
   * The location around which to search for Places.
   */
  public final native LatLng getLocation() /*-{
    return this.location;
  }-*/;

  /**
   * The request's query term. e.g. the name of a place ('Eiffel Tower'), a category followed by the name of a location
   * ('pizza in New York'), or the name of a place followed by a location disambiguator ('Starbucks in Sydney').
   */
  public final native void setQuery(String query) /*-{
    this.query = query;
  }-*/;

  /**
   * The request's query term. e.g. the name of a place ('Eiffel Tower'), a category followed by the name of a location
   * ('pizza in New York'), or the name of a place followed by a location disambiguator ('Starbucks in Sydney').
   */
  public final native String getQuery() /*-{
    return this.query;
  }-*/;

  /**
   * The radius of the area used to bias results when searching for Places, in meters.
   */
  public final native void setRadius(double radius) /*-{
    this.radius = radius;
  }-*/;

  /**
   * The radius of the area used to bias results when searching for Places, in meters.
   */
  public final native double getRadius() /*-{
    return this.radius;
  }-*/;

}
