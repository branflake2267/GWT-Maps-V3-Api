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

import java.util.ArrayList;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.placeslib.AutocompleteType;
import com.google.gwt.maps.client.placeslib.PlaceDetailsHandler;
import com.google.gwt.maps.client.placeslib.PlaceDetailsRequest;
import com.google.gwt.maps.client.placeslib.PlaceResult;
import com.google.gwt.maps.client.placeslib.PlaceSearchRequest;
import com.google.gwt.maps.client.placeslib.PlacesService;
import com.google.gwt.maps.client.placeslib.PlacesServiceStatus;

public class PlaceResultGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.PLACES };
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlaceSearchRequest o = PlaceSearchRequest.newInstance();
        finishTest();
      }
    });
  }

  public void testBounds() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlaceSearchRequest o = PlaceSearchRequest.newInstance();
        LatLng sw = LatLng.newInstance(-31.203405d, 125.244141d);
        LatLng ne = LatLng.newInstance(-25.363882d, 131.044922d);
        LatLngBounds left = LatLngBounds.newInstance(sw, ne);
        o.setBounds(left);
        LatLngBounds right = o.getBounds();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    });
  }

  public void testkeyword() {
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlaceSearchRequest o = PlaceSearchRequest.newInstance();
        String left = "test";
        o.setKeyword(left);
        String right = o.getKeyword();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testlocation() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlaceSearchRequest o = PlaceSearchRequest.newInstance();
        LatLng left = LatLng.newInstance(35, 38);
        o.setLocation(left);
        LatLng right = o.getLocation();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    });
  }

  public void testName() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlaceSearchRequest o = PlaceSearchRequest.newInstance();
        String left = "test";
        o.setName(left);
        String right = o.getName();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testRaidus() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlaceSearchRequest o = PlaceSearchRequest.newInstance();
        double left = 10.02;
        o.setRadius(left);
        double right = o.getRadius();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testTypes() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlaceSearchRequest o = PlaceSearchRequest.newInstance();
        AutocompleteType[] left = new AutocompleteType[2];
        left[0] = AutocompleteType.ESTABLISHMENT;
        left[1] = AutocompleteType.GEOCODE;
        o.setTypes(left);
        AutocompleteType[] right = o.getTypes();
        assertEquals(left.length, right.length);
        assertEquals(left[0].value(), right[0].value());
        finishTest();
      }
    });
  }

  public void testTypes2() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PlaceSearchRequest o = PlaceSearchRequest.newInstance();
        AutocompleteType left = AutocompleteType.ESTABLISHMENT;
        o.setTypes(left);
        AutocompleteType[] right = o.getTypes();
        assertEquals(left.value(), right[0].value());
        finishTest();
      }
    });
  }

  public void testGetDetailsPlaceResult() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng center = LatLng.newInstance(47.60346, -122.33571);
        MapOptions opts = MapOptions.newInstance();
        opts.setZoom(16);
        opts.setCenter(center);
        opts.setMapTypeId(MapTypeId.HYBRID);
        MapWidget mapWidget = new MapWidget(opts);

        PlacesService placeService = PlacesService.newInstance(mapWidget);
        PlaceDetailsRequest request = PlaceDetailsRequest.newInstance();
        request.setReference("CpQBjgAAAFCaT73TRgKBKFaeNsvq-wGNIErZoG1kSxvtgrDH6TDaDNBZsb2PDKKxWqmKHZr8kIo_JIzK8CEFgGb"
            + "Luyt1BsdUR20ZiCg3CAXkkLxh2Q08mAzNN7Ai7WzUixXOHjnbnlm6WV-NpFhbJyTPgsV_2l-AfUlyt_SbleAsUUWtdxJTp0HPHWEnQ"
            + "ZNPvcnmQ-lpRRIQZfKps0iYL5VOEBD5dQDF9xoUGgMSwqd1H9CNcwZsbVo1IY4BU44");

        placeService.getDetails(request, new PlaceDetailsHandler() {
          public void onCallback(PlaceResult result, PlacesServiceStatus status) {
            String s = new JSONObject(result).toString();
            System.out.println(s);

            String s1 = new JSONObject(result.getOpeningHours()).toString();
            System.out.println(s1);

            String s2 = new JSONObject(result.getOpeningHours().getPeriods().get(0)).toString();
            System.out.println(s2);

            String s3 = new JSONObject(result.getOpeningHours().getPeriods().get(0).getOpen()).toString();
            System.out.println(s3);

            String s4 = new JSONObject(result.getReviews()).toString();
            System.out.println(s4);

            assertEquals(-480, result.getUtcOffset());

            assertTrue(result.getOpeningHours() != null);
            assertTrue(result.getOpeningHours().getPeriods().length() > 0);
            assertTrue(result.getOpeningHours().getPeriods().get(0).getOpen() != null);
            assertTrue(result.getOpeningHours().getPeriods().get(0).getClose() != null);
            assertTrue(result.getOpeningHours().getPeriods().get(0).getOpen().getDay() == 0);
            assertTrue(result.getOpeningHours().getPeriods().get(0).getClose().getTime() != null);
            assertTrue(result.getOpeningHours().getPeriods().get(0).getOpen().getMinutes() == 0);

            assertTrue(result.getReviews().length() > 0);
            assertTrue(result.getReviews().get(0).getAspects().length() > 0);
            assertTrue(result.getReviews().get(0).getAspects().get(0).getRating() > 0);
            assertTrue(result.getReviews().get(0).getAspects().get(0).getType() != null);
            assertTrue(result.getReviews().get(0).getAuthorUrl() != null);
            assertTrue(result.getReviews().get(0).getAuthorName() != null);
            assertTrue(result.getReviews().get(0).getText() != null);

            finishTest();
          }
        });
      }
    });
  }

}
