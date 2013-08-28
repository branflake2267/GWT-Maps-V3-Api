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

/**
 * Contains methods related to searching Autocomplete predictions. <br>
 * <br>
 * See <a
 * href="https://developers.google.com/maps/documentation/javascript/reference#AutocompleteService">AutocompleteService
 * API Doc</a>
 */
public class AutocompleteService extends JavaScriptObject {

  /**
   * Use newInstance();
   */
  protected AutocompleteService() {
  }

  /**
   * Creates a new instance of the AutocompleteService
   */
  public static final AutocompleteService newInstance() {
    return createJso();
  }

  private static final native AutocompleteService createJso() /*-{
    return new $wnd.google.maps.places.AutocompleteService();
  }-*/;

  public final native void getPlacePredictions(AutocompletionRequest request, PlacePredictionsHandler handler) /*-{
    var callback = function (results, status) {
      $entry(@com.google.gwt.maps.client.placeslib.AutocompleteService::processPlacePredictions(Lcom/google/gwt/core/client/JsArray;Ljava/lang/String;Lcom/google/gwt/maps/client/placeslib/PlacePredictionsHandler;)(results, status, handler));
    };
    this.getPlacePredictions(request, callback);
  }-*/;

  private static final void processPlacePredictions(JsArray<AutocompletePrediction> results, String status,
                                                    PlacePredictionsHandler handler) {
    handler.onCallback(results, PlacesServiceStatus.fromValue(status));
  }

}
