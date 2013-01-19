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

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * The directions response retrieved from the directions server. You can render these using a DirectionsRenderer or
 * parse this object and render it yourself. You must display the warnings and copyrights as noted in the Maps API terms
 * of service. Note that though this result is "JSON-like," it is not strictly JSON, as it indirectly includes LatLng
 * objects. <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#DirectionsResult"
 * >DirectionsResult API Doc</a>
 */
public class DirectionsResult extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected DirectionsResult() {
  }

  /**
   * An array of DirectionsRoutes, each of which contains information about the legs and steps of which it is composed.
   * There will only be one route unless the DirectionsRequest was made with provideRouteAlternatives set to true. (This
   * property was formerly known as "trips".)
   */
  public static final DirectionsResult newInstance() {
    DirectionsResult obj = JavaScriptObject.createObject().cast();

    // needs a value, even if empty, so that DirectionsRenderer can be
    // passed this obj without failing
    JsArray<DirectionsRoute> emptyArray = ArrayHelper.toJsArray(new DirectionsRoute[] {});
    obj.setRoutes(emptyArray);

    return obj;
  }

  /**
   * An array of DirectionsRoutes, each of which contains information about the legs and steps of which it is composed.
   * There will only be one route unless the DirectionsRequest was made with provideRouteAlternatives set to true. (This
   * property was formerly known as "trips".)
   * 
   * @param routes
   */
  public final native void setRoutes(JsArray<DirectionsRoute> routes) /*-{
    this.routes = routes;
  }-*/;

  /**
   * An array of DirectionsRoutes, each of which contains information about the legs and steps of which it is composed.
   * There will only be one route unless the DirectionsRequest was made with provideRouteAlternatives set to true. (This
   * property was formerly known as "trips".)
   */
  public final native JsArray<DirectionsRoute> getRoutes() /*-{
    return this.routes;
  }-*/;

}
