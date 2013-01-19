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
import com.google.gwt.core.client.JsArrayString;

/**
 * A single address component within a GeocoderResult. A full address may consist of multiple address components. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#GeocoderAddressComponent">
 * GeocoderAddressComponent API Doc</a>
 */
public class GeocoderAddressComponent extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected GeocoderAddressComponent() {
  }

  /**
   * A single address component within a GeocoderResult. A full address may consist of multiple address components.
   */
  public static final GeocoderAddressComponent newInstace() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * The full text of the address component
   * 
   * @param long_name
   */
  public final native void setLong_Name(String long_name) /*-{
    this.long_name = long_name;
  }-*/;

  /**
   * The full text of the address component
   */
  public final native String getLong_Name() /*-{
    return this.long_name;
  }-*/;

  /**
   * The abbreviated, short text of the given address component
   * 
   * @param short_name
   */
  public final native void setShort_Name(String short_name) /*-{
    this.short_name = short_name;
  }-*/;

  /**
   * The abbreviated, short text of the given address component
   */
  public final native String getShort_Name() /*-{
    return this.short_name;
  }-*/;

  /**
   * An array of strings denoting the type of this address component
   * 
   * @param types
   */
  public final native void setTypes(JsArrayString types) /*-{
    this.types = types;
  }-*/;

  /**
   * An array of strings denoting the type of this address component
   */
  public final native JsArrayString getTypes() /*-{
    return this.types;
  }-*/;

}
