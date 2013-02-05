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

import java.util.Date;

import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.services.DirectionsLeg;
import com.google.gwt.maps.client.services.DirectionsRequest;
import com.google.gwt.maps.client.services.DirectionsResult;
import com.google.gwt.maps.client.services.DirectionsResultHandler;
import com.google.gwt.maps.client.services.DirectionsRoute;
import com.google.gwt.maps.client.services.DirectionsService;
import com.google.gwt.maps.client.services.DirectionsStatus;
import com.google.gwt.maps.client.services.DirectionsStep;
import com.google.gwt.maps.client.services.TransitOptions;
import com.google.gwt.maps.client.services.TravelMode;
import com.google.gwt.maps.client.workaround.WorkAroundUtils;
import com.google.gwt.user.client.ui.RootPanel;

public class TransitDirectionsServiceGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] {};
  }

  public void testTransit() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        // Portland, OR
        LatLng center = LatLng.newInstance(45.522947, -122.67849);
        MapOptions optionsMap = MapOptions.newInstance();
        optionsMap.setCenter(center);
        optionsMap.setZoom(10);
        optionsMap.setMapTypeId(MapTypeId.ROADMAP);

        MapWidget mapWidget = new MapWidget(optionsMap);
        RootPanel.get().add(mapWidget);

        // Random places around Portland, OR, where we expect
        // to have reliable transit always available.
        LatLng origin = LatLng.newInstance(45.48541, -122.815819);
        LatLng destination = LatLng.newInstance(45.559497, -122.601242);

        final DirectionsRequest request = DirectionsRequest.newInstance();
        TransitOptions transitOptions = TransitOptions.newInstance();
        transitOptions.setDepartureTime(new Date());
        request.setTransitOptions(transitOptions);
        request.setOrigin(origin);
        request.setDestination(destination);
        request.setTravelMode(TravelMode.TRANSIT);

        DirectionsService o = DirectionsService.newInstance();

        // fix for debugging mode
        WorkAroundUtils.removeGwtObjectId(o);
        WorkAroundUtils.removeGwtObjectId(request);

        o.route(request, new DirectionsResultHandler() {
          @Override
          public void onCallback(DirectionsResult result, DirectionsStatus status) {
            if (status == DirectionsStatus.OK) {
              assertTrue(true);
              for (int i = 0; i < result.getRoutes().length(); i++) {
                checkRoute(request, result.getRoutes().get(i));
              }
            } else {
              fail();
            }

            finishTest();
          }
        });

      }
    });
  }

  private void checkRoute(DirectionsRequest request, DirectionsRoute route) {
    assertTrue(route.getLegs().length() >= 1);
    assertLatLngDistance(request.getOrigin_LatLng(), route.getLegs().get(0).getStart_Location(), 100);
    assertLatLngDistance(request.getDestination_LatLng(), route.getLegs().get(route.getLegs().length() - 1)
        .getEnd_Location(), 100);
    for (int i = 0; i < route.getLegs().length(); i++) {
      DirectionsLeg leg = route.getLegs().get(i);
      long deltaDepartureSec = Math.abs(leg.getDeparture_Time().getValue().getTime()
          - request.getTransitOptions().getDepartureTime().getTime()) / 1000;
      assertTrue(deltaDepartureSec < 3 * 3600); // 3h, should be safe
      long durationSec = leg.getDuration().getValue();
      assertTrue(durationSec < 3 * 3600); // 3h, actual is ~1h30
      long distanceMeters = leg.getDistance().getValue();
      assertTrue(distanceMeters < 50000);
      assertTrue(distanceMeters > 20000); // Actual is ~30km
      assertTrue(leg.getSteps().length() >= 3); // Walk, Bus, Walk
      boolean hasTransit = false;
      boolean hasWalking = false;
      for (int j = 0; j < leg.getSteps().length(); j++) {
        DirectionsStep step = leg.getSteps().get(j);
        if (step.getTravelMode() == TravelMode.TRANSIT)
          hasTransit = true;
        if (step.getTravelMode() == TravelMode.WALKING) {
          hasWalking = true;
          assertTrue(step.getSteps().length() > 0);
        }
      }
      assertTrue(hasTransit);
      assertTrue(hasWalking);
    }
  }
}
