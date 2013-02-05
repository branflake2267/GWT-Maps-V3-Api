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

/**
 * TransitLine, used within TRANSIT legs.<br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#TransitVehicle" >TransitVehicle
 * API Doc</a>
 */
public class TransitVehicle extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected TransitVehicle() {
  }

  /**
   */
  public static final TransitVehicle newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * A URL for an icon that corresponds to the type of vehicle used on this line.
   */
  public final native void setIcon(String icon) /*-{
    this.icon = icon;
  }-*/;

  /**
   * A URL for an icon that corresponds to the type of vehicle used on this line.
   */
  public final native String getIcon() /*-{
    return this.icon;
  }-*/;

  /**
   * A URL for an icon that corresponds to the type of vehicle used in this region instead of the more general icon.
   */
  public final native void setLocal_Icon(String localIcon) /*-{
    this.local_icon = localIcon;
  }-*/;

  /**
   * A URL for an icon that corresponds to the type of vehicle used in this region instead of the more general icon.
   */
  public final native String getLocal_Icon() /*-{
    return this.local_icon;
  }-*/;

  /**
   * A name for this type of TransitVehicle, e.g. "Train" or "Bus".
   */
  public final native void setName(String name) /*-{
    this.name = name;
  }-*/;

  /**
   * A name for this type of TransitVehicle, e.g. "Train" or "Bus".
   */
  public final native String getName() /*-{
    return this.name;
  }-*/;

  /**
   * The type of vehicle used, e.g. train, bus, or ferry.
   */
  public final void setType(VehicleType type) {
    setTypeImpl(type.value());
  }

  private final native void setTypeImpl(String vehicleType) /*-{
    this.type = type;
  }-*/;

  /**
   * The type of vehicle used, e.g. train, bus, or ferry.
   */
  public final VehicleType getType() {
    return VehicleType.fromValue(getTypeImpl());
  }

  private final native String getTypeImpl() /*-{
    return this.type;
  }-*/;

}
