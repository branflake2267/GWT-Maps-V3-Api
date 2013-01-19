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
import com.google.gwt.maps.client.workaround.WorkAroundUtils;

/**
 * Defines a service class that talks directly to Google servers for requesting elevation data. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#ElevationService">ElevationService
 * API Doc</a>
 */
public class ElevationService extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected ElevationService() {
  }

  /**
   * Creates a new instance of a ElevationService that sends elevation queries to Google servers.
   */
  public static final ElevationService newInstance() {
    JavaScriptObject jso = createJso();
    WorkAroundUtils.removeGwtObjectId(jso);
    return jso.cast();
  }

  private static final native JavaScriptObject createJso() /*-{
    return new $wnd.google.maps.ElevationService();
  }-*/;

  /**
   * Makes an elevation request along a path, where the elevation data are returned as distance-based samples along that
   * path.
   * 
   * @param request
   * @param handler
   */
  public final native void getElevationAlongPath(PathElevationRequest request, ElevationServiceHandler handler) /*-{
    var callback = function(result, status) {
      $entry(@com.google.gwt.maps.client.services.ElevationService::processHandler(Lcom/google/gwt/core/client/JsArray;Ljava/lang/String;Lcom/google/gwt/maps/client/services/ElevationServiceHandler;)(result, status, handler));
    };
    this.getElevationAlongPath(request, callback);
  }-*/;

  /**
   * Makes an elevation request for a list of discrete locations.
   * 
   * @param request
   * @param handler
   */
  public final native void getElevationForLocations(LocationElevationRequest request, ElevationServiceHandler handler) /*-{
    var callback = function(result, status) {
      $entry(@com.google.gwt.maps.client.services.ElevationService::processHandler(Lcom/google/gwt/core/client/JsArray;Ljava/lang/String;Lcom/google/gwt/maps/client/services/ElevationServiceHandler;)(result, status, handler));
    };
    this.getElevationForLocations(request, callback);
  }-*/;

  private final static void processHandler(JsArray<ElevationResult> result, String status,
      ElevationServiceHandler handler) {
    handler.onCallback(result, ElevationStatus.fromValue(status));
  }

}
