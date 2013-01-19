package com.google.gwt.maps.client.geometrylib;

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

import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.mvc.MVCArray;

/**
 * Utilities for polyline encoding and decoding.<br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#encoding" >Encoding Utils API
 * Doc</a>
 */
public class EncodingUtils {

  /**
   * Decodes an encoded path string into a sequence of LatLngs.
   * 
   * @param encodedPath
   */
  public final static native JsArray<LatLng> decodePath(String encodedPath) /*-{
    return $wnd.google.maps.geometry.encoding.decodePath(encodedPath);
  }-*/;

  /**
   * Encodes a sequence of LatLngs into an encoded path string.
   * 
   * @param path
   */
  public final static native String encodePath(JsArray<LatLng> path) /*-{
    return $wnd.google.maps.geometry.encoding.encodePath(path);
  }-*/;

  /**
   * Encodes a sequence of LatLngs into an encoded path string.
   * 
   * @param path
   */
  public final static native String encodePath(MVCArray<LatLng> path) /*-{
    return $wnd.google.maps.geometry.encoding.encodePath(path);
  }-*/;

}
