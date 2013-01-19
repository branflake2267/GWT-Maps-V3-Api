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
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.services.ElevationResult;
import com.google.gwt.maps.client.services.ElevationService;
import com.google.gwt.maps.client.services.ElevationServiceHandler;
import com.google.gwt.maps.client.services.ElevationStatus;
import com.google.gwt.maps.client.services.LocationElevationRequest;

public class ElevationServiceGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.PLACES };
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ElevationService o = ElevationService.newInstance();
        finishTest();
      }
    });
  }

  /**
   * TODO get this to work in test mode?
   */
  @SuppressWarnings("unused")
  public void testUse2() {

    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng[] a = new LatLng[1];
        a[0] = LatLng.newInstance(63.3333333, -150.5);

        JsArray<LatLng> locations = ArrayHelper.toJsArray(a);

        LocationElevationRequest request = LocationElevationRequest.newInstance();
        request.setLocations(locations);

        ElevationService o = ElevationService.newInstance();
        o.getElevationForLocations(request, new ElevationServiceHandler() {
          @Override
          public void onCallback(JsArray<ElevationResult> result, ElevationStatus status) {

            if (status == ElevationStatus.INVALID_REQUEST) {
              fail();
            } else if (status == ElevationStatus.OK) {
              ElevationResult e = result.get(0);
              double elevation = e.getElevation();
              LatLng locaiton = e.getLocation();
              double res = e.getResolution();
              System.out.println("worked");
              assertTrue(true);
            } else if (status == ElevationStatus.OVER_QUERY_LIMIT) {
              fail();
            } else if (status == ElevationStatus.REQUEST_DENIED) {
              fail();
            } else if (status == ElevationStatus.UNKNOWN_ERROR) {
              fail();
            }

            System.out.println("elevation request finished");
            finishTest();
          }
        });

      }
    });
  }

}
