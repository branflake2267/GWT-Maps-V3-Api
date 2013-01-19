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
 * A service for computing directions between two or more places. <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#DirectionsService"
 * >DirectionsService API Doc</a>
 */
public class DirectionsService extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected DirectionsService() {
  }

  /**
   * Creates a new instance of a DirectionsService that sends directions queries to Google servers.
   */
  public static final DirectionsService newInstance() {
    JavaScriptObject jso = createJso();
    return jso.cast();
  }

  private static final native JavaScriptObject createJso() /*-{
    return new $wnd.google.maps.DirectionsService();
  }-*/;

  /**
   * Issue a directions search request.
   * 
   * TODO I can't test this in dev mode, but seems to be working in production deployed. maps api can't find
   * <__gwt_ObjectId>
   * 
   * @param request
   * @param handler
   */
  public final native void route(DirectionsRequest request, DirectionsResultHandler handler) /*-{
    var callback = function(result, status) {
      $entry(@com.google.gwt.maps.client.services.DirectionsService::routeImpl(Lcom/google/gwt/maps/client/services/DirectionsResult;Ljava/lang/String;Lcom/google/gwt/maps/client/services/DirectionsResultHandler;)(result, status, handler));
    };

    this.route(request, callback);
  }-*/;

  private static final void routeImpl(DirectionsResult result, String status, DirectionsResultHandler handler) {
    handler.onCallback(result, DirectionsStatus.fromValue(status));
  }

}
