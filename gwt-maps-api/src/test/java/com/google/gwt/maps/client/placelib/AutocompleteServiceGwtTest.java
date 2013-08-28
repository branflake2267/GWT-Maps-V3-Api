package com.google.gwt.maps.client.placelib;

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
import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.events.place.PlaceChangeMapEvent;
import com.google.gwt.maps.client.events.place.PlaceChangeMapHandler;
import com.google.gwt.maps.client.placeslib.*;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

public class AutocompleteServiceGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[]{LoadLibrary.PLACES};
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        AutocompleteService service = AutocompleteService.newInstance();
        finishTest();
      }
    });
  }

  public void testPlacePredictions() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        AutocompleteService service = AutocompleteService.newInstance();
        AutocompletionRequest request = AutocompletionRequest.newInstance();
        request.setKeyword("New York");

        service.getPlacePredictions(request, new PlacePredictionsHandler() {
          @Override
          public void onCallback(JsArray<AutocompletePrediction> results, PlacesServiceStatus status) {
            assertTrue(PlacesServiceStatus.OK.equals(status));
            assertTrue(results.length() > 0);

            finishTest();
          }
        });
      }
    });
  }

}
