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
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.placeslib.PlaceDetailsHandler;
import com.google.gwt.maps.client.placeslib.PlaceDetailsRequest;
import com.google.gwt.maps.client.placeslib.PlaceResult;
import com.google.gwt.maps.client.placeslib.PlaceSearchHandler;
import com.google.gwt.maps.client.placeslib.PlaceSearchPagination;
import com.google.gwt.maps.client.placeslib.PlaceSearchRequest;
import com.google.gwt.maps.client.placeslib.PlaceTextSearchHandler;
import com.google.gwt.maps.client.placeslib.PlacesService;
import com.google.gwt.maps.client.placeslib.PlacesServiceStatus;
import com.google.gwt.maps.client.placeslib.TextSearchRequest;
import com.google.gwt.maps.client.services.GeocoderAddressComponent;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class PlacesServiceGwtTest extends AbstractMapsGWTTestHelper {

  /**
   * Used for nearby search
   */
  private int page;

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.PLACES };
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);

        MapOptions options = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(options);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        PlacesService o = PlacesService.newInstance(mapWidget);

        Element htmlDivElement = fp.getElement();
        PlacesService o1 = PlacesService.newInstance(htmlDivElement);

        finishTest();
      }
    });
  }

  /**
   * TODO add some more tests
   */
  @SuppressWarnings("unused")
  public void testDetails1() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);

        MapOptions options = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(options);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        PlacesService o = PlacesService.newInstance(mapWidget);

        String reference = "CnRkAAAAGnBVNFDeQoOQHzgdOpOqJNV7K9-c5IQrWFUYD9TNhUmz5-aHhfqyKH0zmAcUlkqVCrpaKcV8Z"
            + "jGQKzB6GXxtzUYcP-muHafGsmW-1CwjTPBCmK43AZpAwW0FRtQDQADj3H2bzwwHVIXlQAiccm7r4xIQmjt_Oqm2FejWpBxLW"
            + "s3L_RoUbharABi5FMnKnzmRL2TGju6UA4k";
        PlaceDetailsRequest request = PlaceDetailsRequest.newInstance();
        request.setReference(reference);

        o.getDetails(request, new PlaceDetailsHandler() {
          @Override
          public void onCallback(PlaceResult result, PlacesServiceStatus status) {
            System.out.println("status=" + status.toString());

            if (status == PlacesServiceStatus.OK) {
              System.out.println("OK");

              String address = result.getFormatted_Address();
              JsArray<GeocoderAddressComponent> addressComp = result.getAddress_Components();
              String name = result.getName();

              System.out.println("source=" + result.toSource());

              assertTrue(true);

            } else if (status == PlacesServiceStatus.INVALID_REQUEST) {
              System.out.println("INVALID_REQUEST");
              fail();

            } else if (status == PlacesServiceStatus.OVER_QUERY_LIMIT) {
              System.out.println("OVER_QUERY_LIMIT");
              fail();

            } else if (status == PlacesServiceStatus.REQUEST_DENIED) {
              System.out.println("REQUEST_DENIED");
              fail();

            } else if (status == PlacesServiceStatus.UNKNOWN_ERROR) {
              System.out.println("UNKNOWN_ERROR");
              fail();

            } else if (status == PlacesServiceStatus.ZERO_RESULTS) {
              System.out.println("ZERO_RESULTS");
              assertTrue(true);

            }

            finishTest();
          }
        });

      }
    });
  }

  public void testSearch() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);

        MapOptions options = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(options);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        PlacesService placeService = PlacesService.newInstance(mapWidget);

        PlaceSearchRequest request = PlaceSearchRequest.newInstance();
        request.setLocation(LatLng.newInstance(47.6107, -122.3348));
        request.setRadius(15);

        placeService.nearbySearch(request, new PlaceSearchHandler() {

          @Override
          public void onCallback(JsArray<PlaceResult> results, PlaceSearchPagination pagination,
              PlacesServiceStatus status) {
            System.out.println("status=" + status.toString());

            String s = new JSONObject(results).toString();
            System.out.println(s);

            if (status == PlacesServiceStatus.OK) {
              assertTrue(true);
              assertTrue(pagination.hasNextPage());

            } else if (status == PlacesServiceStatus.INVALID_REQUEST) {
              System.out.println("INVALID_REQUEST");
              fail();

            } else if (status == PlacesServiceStatus.OVER_QUERY_LIMIT) {
              System.out.println("OVER_QUERY_LIMIT");
              fail();

            } else if (status == PlacesServiceStatus.REQUEST_DENIED) {
              System.out.println("REQUEST_DENIED");
              fail();

            } else if (status == PlacesServiceStatus.UNKNOWN_ERROR) {
              System.out.println("UNKNOWN_ERROR");
              fail();

            } else if (status == PlacesServiceStatus.ZERO_RESULTS) {
              System.out.println("ZERO_RESULTS");
              assertTrue(true);
            }

            finishTest();
          }
        });

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

            finishTest();
          }
        });
      }
    });
  }

  public void testTextSearch() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng center = LatLng.newInstance(47.60346, -122.33571);
        MapOptions opts = MapOptions.newInstance();
        opts.setZoom(16);
        opts.setCenter(center);
        opts.setMapTypeId(MapTypeId.HYBRID);
        MapWidget mapWidget = new MapWidget(opts);

        TextSearchRequest request = TextSearchRequest.newInstance();
        request.setLocation(LatLng.newInstance(47.6107, -122.3348));
        request.setRadius(15);
        request.setQuery("pike");

        PlacesService placeService = PlacesService.newInstance(mapWidget);
        placeService.textSearch(request, new PlaceTextSearchHandler() {
          public void onCallback(JsArray<PlaceResult> results, PlacesServiceStatus status) {
            System.out.println("status=" + status);

            String s = new JSONObject(results).toString();
            System.out.println(s);

            assertEquals(PlacesServiceStatus.OK, status);

            assertTrue(results.length() > 0);

            finishTest();
          }
        });
      }
    });
  }

  public void testSearchNearBy() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng center = LatLng.newInstance(47.60346, -122.33571);
        MapOptions opts = MapOptions.newInstance();
        opts.setZoom(16);
        opts.setCenter(center);
        opts.setMapTypeId(MapTypeId.HYBRID);
        MapWidget mapWidget = new MapWidget(opts);

        PlaceSearchRequest request = PlaceSearchRequest.newInstance();
        request.setLocation(center);
        request.setRadius(5000);
        request.setTypes("store");

        PlacesService placeService = PlacesService.newInstance(mapWidget);
        placeService.nearbySearch(request, new PlaceSearchHandler() {
          @Override
          public void onCallback(JsArray<PlaceResult> results, PlaceSearchPagination pagination,
              PlacesServiceStatus status) {
            String s = new JSONObject(results).toString();
            System.out.println(s);

            System.out.println("pagination hasNextPage=" + pagination.hasNextPage());

            assertEquals(PlacesServiceStatus.OK, status);

            assertTrue(pagination.hasNextPage());

            // Since this should use the same callback
            if (page == 0) {
              page++;
              pagination.nextPage();
            } else if (page == 1) {
              finishTest();
            }
          }
        });
      }
    });
  }

}
