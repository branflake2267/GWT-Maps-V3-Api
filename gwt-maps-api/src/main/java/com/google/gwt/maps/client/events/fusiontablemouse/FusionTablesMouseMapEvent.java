package com.google.gwt.maps.client.events.fusiontablemouse;

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

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.ajaxloader.client.Properties.TypeException;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Size;
import com.google.gwt.maps.client.events.MapEvent;

public class FusionTablesMouseMapEvent extends MapEvent<FusionTablesMouseMapHandler, FusionTablesMouseMapEvent> {

  public static Type<FusionTablesMouseMapHandler> TYPE = new Type<FusionTablesMouseMapHandler>();

  public FusionTablesMouseMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<FusionTablesMouseMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(FusionTablesMouseMapHandler handler) {
    handler.onEvent(this);
  }

  /**
   * Pre-rendered HTML content, as placed in the infowindow by the default UI.
   */
  public String getInfoWindowHtml() {
    String infoWindowHtml = null;
    try {
      infoWindowHtml = properties.getString("infoWindowHtml");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return infoWindowHtml;
  }

  /**
   * The position at which to anchor an infowindow on the clicked feature.
   * 
   * @return {@link LatLng}
   */
  public LatLng getLatLng() {
    LatLng latLng = null;
    try {
      latLng = (LatLng) properties.getObject("latLng");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return latLng;
  }

  /**
   * gets The offset to apply to an infowindow anchored on the clicked feature.
   */
  public Size getPixelOffset() {
    Size pixelOffset = null;
    try {
      pixelOffset = (Size) properties.getObject("pixelOffset");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return pixelOffset;
  }

  /**
   * returns A collection of FusionTablesCell objects, indexed by column name, representing the contents of the table
   * row which included the clicked feature.
   */
  public JavaScriptObject getRow() {
    return parseRow();
  }

  /**
   * A collection of FusionTablesCell objects, indexed by column name, representing the contents of the table row which
   * included the clicked feature.
   * 
   * @return as JSON string
   */
  public String getRowAsJson() {
    return getAsJson(parseRow());
  }

  /**
   * returns a jso that would read possibly like ({station:{columnName:"station", value:"Chicago"},
   * address:{columnName:"address", value:"800 N. State St., Chicago, IL"}, ridership:{columnName:"ridership",
   * value:"13531"}})
   */
  private JavaScriptObject parseRow() {
    JavaScriptObject row = null;
    try {
      row = properties.getObject("row");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return row;
  }

}
