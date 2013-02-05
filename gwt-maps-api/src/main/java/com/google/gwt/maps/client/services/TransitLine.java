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

/**
 * TransitLine, used within TRANSIT legs.<br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#TransitLine" >TransitLine API
 * Doc</a>
 */
public class TransitLine extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected TransitLine() {
  }

  /**
   */
  public static final TransitLine newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * The transit agency that operates this transit line.
   */
  public final native void setAgencies(JsArray<TransitAgency> agencies) /*-{
    this.agencies = agencies;
  }-*/;

  /**
   * The transit agency that operates this transit line.
   */
  public final native JsArray<TransitAgency> getAgencies() /*-{
    return this.agencies;
  }-*/;

  /**
   * The color commonly used in signage for this transit line, represented as a hex string.
   */
  public final native void setColor(String color) /*-{
    this.color = color;
  }-*/;

  /**
   * The color commonly used in signage for this transit line, represented as a hex string.
   */
  public final native String getColor() /*-{
    return this.color;
  }-*/;

  /**
   * The URL for an icon associated with this line.
   */
  public final native void setIcon(String icon) /*-{
    this.icon = icon;
  }-*/;

  /**
   * The URL for an icon associated with this line.
   */
  public final native String getIcon() /*-{
    return this.icon;
  }-*/;

  /**
   * The full name of this transit line, e.g. "8 Avenue Local".
   */
  public final native void setName(String name) /*-{
    this.name = name;
  }-*/;

  /**
   * The full name of this transit line, e.g. "8 Avenue Local".
   */
  public final native String getName() /*-{
    return this.name;
  }-*/;

  /**
   * The short name of this transit line, e.g. "E".
   */
  public final native void setShort_Name(String shortName) /*-{
    this.short_name = shortName;
  }-*/;

  /**
   * The short name of this transit line, e.g. "E".
   */
  public final native String getShort_Name() /*-{
    return this.short_name;
  }-*/;

  /**
   * The text color commonly used in signage for this transit line, represented as a hex string.
   */
  public final native void setText_Color(String textColor) /*-{
    this.text_color = textColor;
  }-*/;

  /**
   * The text color commonly used in signage for this transit line, represented as a hex string.
   */
  public final native String getText_Color() /*-{
    return this.text_color;
  }-*/;

  /**
   * The agency's URL which is specific to this transit line.
   */
  public final native void setUrl(String url) /*-{
    this.url = url;
  }-*/;

  /**
   * The agency's URL which is specific to this transit line.
   */
  public final native String getUrl() /*-{
    return this.url;
  }-*/;

  /**
   * The type of vehicle used, e.g. train or bus.
   */
  public final native void setVehicle(TransitVehicle vehicle) /*-{
    this.vehicle = vehicle;
  }-*/;

  /**
   * The type of vehicle used, e.g. train or bus.
   */
  public final native TransitVehicle getVehicle() /*-{
    return this.vehicle;
  }-*/;
}
