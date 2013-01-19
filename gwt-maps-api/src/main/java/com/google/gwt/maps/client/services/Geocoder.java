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

/**
 * A service for converting between an address and LatLng.
 */
public class Geocoder extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected Geocoder() {
  }

  /**
   * Creates a new instance of a Geocoder that sends geocode requests to Google servers.
   */
  public static final Geocoder newInstance() {
    return createJso().cast();
  }

  private static final native JavaScriptObject createJso() /*-{
    return new $wnd.google.maps.Geocoder();
  }-*/;

  /**
   * Geocode a request.
   * 
   * @param request
   * @param handler
   */
  public final native void geocode(GeocoderRequest request, GeocoderRequestHandler handler) /*-{
    var callback = function(results, status) {
      $entry(@com.google.gwt.maps.client.services.Geocoder::geocodeImpl(Lcom/google/gwt/core/client/JsArray;Ljava/lang/String;Lcom/google/gwt/maps/client/services/GeocoderRequestHandler;)(results, status, handler));
    };
    this.geocode(request, callback);
  }-*/;

  private static final void geocodeImpl(JsArray<GeocoderResult> results, String status, GeocoderRequestHandler handler) {
    handler.onCallback(results, GeocoderStatus.fromValue(status));
  }

}
