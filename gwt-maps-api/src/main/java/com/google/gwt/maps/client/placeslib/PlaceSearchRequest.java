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

import java.util.List;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;

/**
 * A Place search query to be sent to the PlacesService. <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#PlaceSearchRequest"
 * >PlaceSearchRequest API Doc</a>
 */
public class PlaceSearchRequest extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected PlaceSearchRequest() {
  }

  /**
   * A Place search query to be sent to the PlacesService.
   */
  public static final PlaceSearchRequest newInstance() {
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
   * A term to be matched against all available fields, including but not limited to name, type, and address, as well as
   * customer reviews and other third-party content.
   * 
   * @param keyword
   */
  public final native void setKeyword(String keyword) /*-{
    this.keyword = keyword;
  }-*/;

  /**
   * A term to be matched against all available fields, including but not limited to name, type, and address, as well as
   * customer reviews and other third-party content.
   */
  public final native String getKeyword() /*-{
    return this.keyword;
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
   * Restricts the Place search results to Places that include this text in the name.
   * 
   * @param name
   */
  public final native void setName(String name) /*-{
    this.name = name;
  }-*/;

  /**
   * Restricts the Place search results to Places that include this text in the name.
   */
  public final native String getName() /*-{
    return this.name;
  }-*/;

  /**
   * The distance from the given location within which to search for Places, in meters. The maximum allowed value is
   * 50000
   * 
   * @param radius
   */
  public final native void setRadius(double radius) /*-{
    this.radius = radius;
  }-*/;

  /**
   * The distance from the given location within which to search for Places, in meters. The maximum allowed value is
   * 50000
   */
  public final native double getRadius() /*-{
    return this.radius;
  }-*/;

  /**
   * Restricts the Place search results to Places with a type matching at least one of the specified types in this
   * array. Valid types are given <a href= "https://developers.google.com/maps/documentation/places/supported_types"
   * >here</a>. TODO add more AutocompleteType enums down the road. Otherwise use the setTypes(JsArrayString)
   * 
   * @param types
   */
  public final void setTypes(AutocompleteType... types) {
    if (types == null) {
      return;
    }
    String[] stypes = new String[types.length];
    for (int i = 0; i < types.length; i++) {
      stypes[i] = types[i].value();
    }
    JsArrayString a = ArrayHelper.toJsArrayString(stypes);
    setTypesImpl(a);
  }

  public final void setTypes(List<String> types) {
    setTypes((String[]) types.toArray());
  }

  public final void setTypes(String... types) {
    setTypes(ArrayHelper.toJsArrayString(types));
  }

  public final void setTypes(JsArrayString types) {
    setTypesImpl(types);
  }

  private final native void setTypesImpl(JsArrayString types) /*-{
    this.types = types;
  }-*/;

  /**
   * Restricts the Place search results to Places with a type matching at least one of the specified types in this
   * array. Valid types are given <a href= "https://developers.google.com/maps/documentation/places/supported_types"
   * >here</a>.
   */
  public final AutocompleteType[] getTypes() {
    JsArrayString at = getTypesImpl();
    if (at == null) {
      return null;
    }
    AutocompleteType[] types = new AutocompleteType[at.length()];
    for (int i = 0; i < at.length(); i++) {
      types[i] = AutocompleteType.fromValue(at.get(i));
    }
    return types;
  }

  private final native JsArrayString getTypesImpl() /*-{
    return this.types;
  }-*/;

}
