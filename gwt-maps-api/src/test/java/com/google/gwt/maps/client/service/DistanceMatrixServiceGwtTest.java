package com.google.gwt.maps.client.service;

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
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.services.DistanceMatrixRequest;
import com.google.gwt.maps.client.services.DistanceMatrixRequestHandler;
import com.google.gwt.maps.client.services.DistanceMatrixResponse;
import com.google.gwt.maps.client.services.DistanceMatrixResponseRow;
import com.google.gwt.maps.client.services.DistanceMatrixService;
import com.google.gwt.maps.client.services.DistanceMatrixStatus;
import com.google.gwt.maps.client.services.TravelMode;
import com.google.gwt.maps.client.workaround.WorkAroundUtils;

public class DistanceMatrixServiceGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.PLACES };
  }

  /**
   * TODO I can't get this to work in Devmode, probably the same as Distance service
   */
  @SuppressWarnings("unused")
  public void testUse1() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        LatLng[] ao = new LatLng[2];
        ao[0] = LatLng.newInstance(55.930385, -3.118425);
        ao[1] = LatLng.newInstance(26, 27);
        JsArray<LatLng> origins = ArrayHelper.toJsArray(ao);

        LatLng[] ad = new LatLng[2];
        ad[0] = LatLng.newInstance(50.087692, 14.421150);
        ad[1] = LatLng.newInstance(26, 27);
        JsArray<LatLng> destinations = ArrayHelper.toJsArray(ad);

        DistanceMatrixRequest request = DistanceMatrixRequest.newInstance();
        request.setOrigins(origins);
        request.setDestinations(destinations);
        request.setTravelMode(TravelMode.DRIVING);

        DistanceMatrixService o = DistanceMatrixService.newInstance();

        // fix for debugging mode
        WorkAroundUtils.removeGwtObjectId(o);
        WorkAroundUtils.removeGwtObjectId(request);

        o.getDistanceMatrix(request, new DistanceMatrixRequestHandler() {
          @Override
          public void onCallback(DistanceMatrixResponse response, DistanceMatrixStatus status) {

            System.out.println("status=" + status.value());

            if (status == DistanceMatrixStatus.INVALID_REQUEST) {
              fail();
            } else if (status == DistanceMatrixStatus.MAX_DIMENSIONS_EXCEEDED) {
              fail();
            } else if (status == DistanceMatrixStatus.MAX_ELEMENTS_EXCEEDED) {
              fail();
            } else if (status == DistanceMatrixStatus.OK) {

              JsArrayString dest = response.getDestinationAddresses();
              JsArrayString org = response.getOriginAddresses();
              JsArray<DistanceMatrixResponseRow> rows = response.getRows();

              assertTrue(true);

            } else if (status == DistanceMatrixStatus.OVER_QUERY_LIMIT) {
              fail();
            } else if (status == DistanceMatrixStatus.REQUEST_DENIED) {
              fail();
            } else if (status == DistanceMatrixStatus.UNKNOWN_ERROR) {
              fail();
            }

          }
        });

        finishTest();
      }

    });
  }

}
