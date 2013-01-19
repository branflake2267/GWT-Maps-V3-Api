package com.google.gwt.maps.client.maptypes;

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
 * This class is used to specify options when creating a StyledMapType. These options cannot be changed after the
 * StyledMapType is instantiated. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#StyledMapTypeOptions">
 * StyledMapTypeOptions API Doc</a>
 */
public class StyledMapTypeOptions extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected StyledMapTypeOptions() {
  }

  /**
   * creates options
   */
  public final static StyledMapTypeOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * sets Text to display when this MapType's button is hovered over in the map type control.
   * 
   * @param alt
   */
  public final native void setAlt(String alt) /*-{
    this.alt = alt;
  }-*/;

  /**
   * gets Text to display when this MapType's button is hovered over in the map type control.
   */
  public final native String getAlt() /*-{
    return this.alt;
  }-*/;

  /**
   * sets The maximum zoom level for the map when displaying this MapType. Optional.
   * 
   * @param maxZoom
   */
  public final native void setMaxZoom(int maxZoom) /*-{
    this.maxZoom = maxZoom;
  }-*/;

  /**
   * gets The maximum zoom level for the map when displaying this MapType. Optional.
   */
  public final native int getMaxZoom() /*-{
    return this.maxZoom;
  }-*/;

  /**
   * sets The minimum zoom level for the map when displaying this MapType. Optional.
   * 
   * @param minZoom
   */
  public final native void setMinZoom(int minZoom) /*-{
    this.minZoom = minZoom;
  }-*/;

  /**
   * gets The minimum zoom level for the map when displaying this MapType. Optional.
   */
  public final native int getMinZoom() /*-{
    return this.minZoom;
  }-*/;

  /**
   * sets The name to display in the map type control.
   * 
   * @param name
   */
  public final native void setName(String name) /*-{
    this.name = name;
  }-*/;

  /**
   * gets The name to display in the map type control.
   */
  public final native String getName() /*-{
    return this.name;
  }-*/;

}
