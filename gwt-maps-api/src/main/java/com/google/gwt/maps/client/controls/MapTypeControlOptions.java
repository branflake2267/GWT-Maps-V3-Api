package com.google.gwt.maps.client.controls;

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
import com.google.gwt.maps.client.MapTypeId;

/**
 * Options for the rendering of the map type control. <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#MapTypeControlOptions"
 * >MapTypeControlOptions API Doc</a>
 */
public class MapTypeControlOptions extends JavaScriptObject {

  /**
   * new Instance of Options for the rendering of the map type control.
   */
  public static MapTypeControlOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * Options for the rendering of the map type control. use newInstance();
   */
  protected MapTypeControlOptions() {
  }

  /**
   * get IDs as {@link MapTypeId} object array
   * 
   * @return MapTypeId[]
   */
  public final MapTypeId[] getMapTypeIds() {
    JsArrayString jsarr = getMapTypeIdsJs();
    if (jsarr.length() == 0) {
      return null;
    }
    MapTypeId[] r = new MapTypeId[jsarr.length()];
    for (int i = 0; i < jsarr.length(); i++) {
      String type = jsarr.get(i);
      r[i] = MapTypeId.fromValue(type);
    }
    return r;
  }

  /**
   * get IDs as {@link MapTypeId} object array
   * 
   * @return String[]
   */
  public final String[] getMapTypeIdsString() {
    JsArrayString jsarr = getMapTypeIdsJs();
    if (jsarr.length() == 0) {
      return null;
    }
    String[] r = new String[jsarr.length()];
    for (int i = 0; i < jsarr.length(); i++) {
      r[i] = jsarr.get(i);
    }
    return r;
  }

  /**
   * get MapTypeIds native
   * 
   * @return JsArrayString
   */
  private final native JsArrayString getMapTypeIdsJs() /*-{
    return this.mapTypeIds;
  }-*/;

  /**
   * Position id. Used to specify the position of the control on the map. The default position is TOP_LEFT.
   */
  public final ControlPosition getPosition() {
    return ControlPosition.fromValue(getPositionImpl());
  }

  private final native int getPositionImpl() /*-{
    return this.position;
  }-*/;

  /**
   * set native IDs
   * 
   * @param types String array for $wnd.google.maps.MapTypeId[type]
   */
  private final native void setMapTypeIdsJs(JsArrayString types) /*-{
    this.mapTypeIds = new $wnd.Array();
    for ( var i = 0; i < types.length; i++) {
      this.mapTypeIds[i] = $wnd.google.maps.MapTypeId[types[i]];
    }
  }-*/;

  /**
   * set native user defined IDs
   * 
   * @param types String array of user defined map types
   */
  private final native void setMapTypeIdsStringJs(JsArrayString types) /*-{
    this.mapTypeIds = new $wnd.Array();
    for ( var i = 0; i < types.length; i++) {
      this.mapTypeIds[i] = types[i];
    }
  }-*/;

  /**
   * set IDs of map types to show in the control.
   * 
   * @param mapTypeIds
   */
  public final void setMapTypeIds(MapTypeId[] mapTypeIds) {
    JsArrayString result = JsArrayString.createArray().cast();
    for (int i = 0; i < mapTypeIds.length; i++) {
      result.set(i, mapTypeIds[i].value());
    }
    // TODO cannot access private method. Perhaps API was updated?
    // ArrayHelper.nativePatchConstructorForSafari(result);
    setMapTypeIdsJs(result);
  }

  /**
   * set user defined string ID of map types to show in the control.
   * 
   * @param mapTypeIds
   */
  public final void setMapTypeIds(String[] mapTypeIds) {
    JsArrayString result = JsArrayString.createArray().cast();
    for (int i = 0; i < mapTypeIds.length; i++) {
      result.set(i, mapTypeIds[i]);
    }
    setMapTypeIdsStringJs(result);
  }

  /**
   * Position id. Used to specify the position of the control on the map. The default position is TOP_LEFT.
   * 
   * @param position {@link ControlPosition}
   */
  public final void setPosition(ControlPosition position) {
    setPositionImpl(position.value());
  }

  private final native void setPositionImpl(int position) /*-{
    this.position = position;
  }-*/;

}
