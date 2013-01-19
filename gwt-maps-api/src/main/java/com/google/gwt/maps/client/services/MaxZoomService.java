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

/**
 * A service for obtaining the highest zoom level at which satellite imagery is available for a given location. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#MaxZoomService">MaxZoomService API
 * Doc</a>
 */
public class MaxZoomService extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected MaxZoomService() {
  }

  /**
   * A service for obtaining the highest zoom level at which satellite imagery is available for a given location.
   */
  public static final MaxZoomService newInstance() {
    return createJso().cast();
  }

  private static final native JavaScriptObject createJso() /*-{
    return new $wnd.google.maps.MaxZoomService();
  }-*/;

  /**
   * Returns the maximum zoom level available at a particular LatLng for the Satellite map type. As this request is
   * asynchronous, you must pass a callback function which will be executed upon completion of the request, being passed
   * a MaxZoomResult.
   * 
   * @param latlng
   * @param handler
   */
  public final native void getMaxZoomAtLatLng(LatLng latlng, MaxZoomServiceHandler handler) /*-{
    var callback = function(result) {
      $entry(@com.google.gwt.maps.client.services.MaxZoomService::getMaxZoomAtLatLngImpl(Lcom/google/gwt/maps/client/services/MaxZoomResult;Lcom/google/gwt/maps/client/services/MaxZoomServiceHandler;)(result, handler));
    };
    this.getMaxZoomAtLatLng(latlng, callback);
  }-*/;

  private static final void getMaxZoomAtLatLngImpl(MaxZoomResult result, MaxZoomServiceHandler handler) {
    handler.onCallback(result);
  }

}
