package com.google.gwt.maps.client.placeslib;

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
import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;

/**
 * Contains methods related to searching for Places and retrieving details about a Place. <br>
 * <br>
 * See <a
 * href="https://developers.google.com/maps/documentation/javascript/reference#PlaceSearchRequest">PlaceSearchRequest
 * API Doc</a>
 */
public class PlacesService extends JavaScriptObject {

  /**
   * Use newInstance();
   */
  protected PlacesService() {
  }

  /**
   * Creates a new instance of the PlacesService that renders attributions in the specified container.
   * 
   * @param mapWidget
   */
  public static final PlacesService newInstance(MapWidget mapWidget) {
    return createJso(mapWidget.getJso());
  }

  /**
   * Creates a new instance of the PlacesService that renders attributions in the specified container.
   * 
   * @param htmlDivElement
   */
  public static final PlacesService newInstance(Element htmlDivElement) {
    return createJso(htmlDivElement);
  }

  private static final native PlacesService createJso(MapImpl map) /*-{
    return new $wnd.google.maps.places.PlacesService(map);
  }-*/;

  private static final native PlacesService createJso(Element element) /*-{
    return new $wnd.google.maps.places.PlacesService(element);
  }-*/;

  /**
   * Retrieves details about the Place identified by the given reference.
   * 
   * @param request
   * @param handler
   */
  public final native void getDetails(PlaceDetailsRequest request, PlaceDetailsHandler handler) /*-{
    var callback = function(result, status) {
      $entry(@com.google.gwt.maps.client.placeslib.PlacesService::processDetailsCallback(Lcom/google/gwt/maps/client/placeslib/PlaceResult;Ljava/lang/String;Lcom/google/gwt/maps/client/placeslib/PlaceDetailsHandler;)(result, status, handler));
    };
    this.getDetails(request, callback);
  }-*/;

  private static final void processDetailsCallback(PlaceResult result, String status, PlaceDetailsHandler handler) {
    handler.onCallback(result, PlacesServiceStatus.fromValue(status));
  }

  /**
   * Retrieves a list of Places in a given area. The PlaceResultss passed to the callback are stripped-down versions of
   * a full PlaceResult. A more detailed PlaceResult for each Place can be obtained by sending a Place Details request
   * with the desired Place's reference value.
   * 
   * required parameters: location, radius
   * 
   * @param request
   * @param handler
   */
  public final native void nearbySearch(PlaceSearchRequest request, PlaceSearchHandler handler) /*-{
    var callback = function(results, status, pagination) {
      $entry(@com.google.gwt.maps.client.placeslib.PlacesService::processSearchCallback(Lcom/google/gwt/core/client/JsArray;Ljava/lang/String;Lcom/google/gwt/maps/client/placeslib/PlaceSearchPagination;Lcom/google/gwt/maps/client/placeslib/PlaceSearchHandler;)(results, status, pagination, handler));
    };
    this.nearbySearch(request, callback);
  }-*/;

  private static final void processSearchCallback(JsArray<PlaceResult> results, String status,
      PlaceSearchPagination pagination, PlaceSearchHandler handler) {
    handler.onCallback(results, pagination, PlacesServiceStatus.fromValue(status));
  }

  /**
   * Similar to the nearbySearch function, with the following differences: it retrieves a list of Places based on the
   * query attribute in the given request object; bounds or location + radius parameters are optional; and the region,
   * when provided, will not restrict the results to places inside the area, only bias the response towards results near
   * it.
   */
  public final native void textSearch(TextSearchRequest request, PlaceTextSearchHandler handler) /*-{
    var callback = function(results, status) {
      $entry(@com.google.gwt.maps.client.placeslib.PlacesService::processTextSearch(Lcom/google/gwt/core/client/JsArray;Ljava/lang/String;Lcom/google/gwt/maps/client/placeslib/PlaceTextSearchHandler;)(results, status, handler));
    };
    this.textSearch(request, callback);
  }-*/;

  private static final void processTextSearch(JsArray<PlaceResult> results, String status,
      PlaceTextSearchHandler handler) {
    handler.onCallback(results, PlacesServiceStatus.fromValue(status));
  }

}
