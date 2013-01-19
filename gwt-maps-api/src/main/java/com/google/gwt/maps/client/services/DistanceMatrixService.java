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
import com.google.gwt.maps.client.workaround.WorkAroundUtils;

/**
 * A service for computing distances between multiple origins and destinations. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#DistanceMatrixService">
 * DistanceMatrixService API Doc</a>
 */
public class DistanceMatrixService extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected DistanceMatrixService() {
  }

  /**
   * Creates a new instance of a DistanceMatrixService that sends distance matrix queries to Google servers.
   */
  public static final DistanceMatrixService newInstance() {
    JavaScriptObject jso = createJso();
    WorkAroundUtils.removeGwtObjectId(jso);
    return jso.cast();
  }

  private static final native JavaScriptObject createJso() /*-{
    return new $wnd.google.maps.DistanceMatrixService();
  }-*/;

  public final native void getDistanceMatrix(DistanceMatrixRequest request, DistanceMatrixRequestHandler handler) /*-{
    var callback = function(response, status) {
      $entry(@com.google.gwt.maps.client.services.DistanceMatrixService::getDistanceMatrixImpl(Lcom/google/gwt/maps/client/services/DistanceMatrixResponse;Ljava/lang/String;Lcom/google/gwt/maps/client/services/DistanceMatrixRequestHandler;)(response, status, handler));
    };
    this.getDistanceMatrix(request, callback);
  }-*/;

  private static final void getDistanceMatrixImpl(DistanceMatrixResponse response, String status,
      DistanceMatrixRequestHandler handler) {
    handler.onCallback(response, DistanceMatrixStatus.fromValue(status));
  }

}
