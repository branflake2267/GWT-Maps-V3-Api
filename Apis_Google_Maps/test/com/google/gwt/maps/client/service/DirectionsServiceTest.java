package com.google.gwt.maps.client.service;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.services.DirectionsRenderer;
import com.google.gwt.maps.client.services.DirectionsRendererOptions;
import com.google.gwt.maps.client.services.DirectionsRequest;
import com.google.gwt.maps.client.services.DirectionsResult;
import com.google.gwt.maps.client.services.DirectionsResultHandler;
import com.google.gwt.maps.client.services.DirectionsService;
import com.google.gwt.maps.client.services.DirectionsStatus;
import com.google.gwt.maps.client.services.TravelMode;
import com.google.gwt.maps.client.workaround.WorkAroundUtils;
import com.google.gwt.user.client.ui.RootPanel;

public class DirectionsServiceTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 7000;

  public String getModuleName() {
    return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
  }

  public void testWorks() {
    assertEquals(true, true);
  }

  public void testUse1() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsService o = DirectionsService.newInstance();
        finishTest();
      }
    }, loadLibraries , sensor);
  }
 
  public void testRoute() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        
        LatLng center = LatLng.newInstance(37.7699298, -122.4469157);
        
        MapOptions optionsMap = MapOptions.newInstance();
        optionsMap.setCenter(center);
        optionsMap.setZoom(14);
        optionsMap.setMapTypeId(MapTypeId.ROADMAP);
        
        MapWidget mapWidget = new MapWidget(optionsMap);
        RootPanel.get().add(mapWidget);
       

        
        DirectionsRendererOptions options = DirectionsRendererOptions.newInstance();
        final DirectionsRenderer directionsDisplay = DirectionsRenderer.newInstance(options);
        directionsDisplay.setMap(mapWidget);
        
        //LatLng origin = LatLng.newInstance(37.7699298, -122.4469157);
        //LatLng destination = LatLng.newInstance(37.7683909618184, -122.51089453697205);
        
        String origin = "Arlington, WA";
        String destination = "Seattle, WA";
        
        DirectionsRequest request = DirectionsRequest.newInstance();
        request.setOrigin(origin);
        request.setDestination(destination);
        request.setTravelMode(TravelMode.DRIVING);
        
        DirectionsService o = DirectionsService.newInstance();
        
        // fix for debugging mode
        WorkAroundUtils.removeGwtObjectId(o);
        WorkAroundUtils.removeGwtObjectId(request);
        
        o.route(request, new DirectionsResultHandler() {
          public void onCallback(DirectionsResult result, DirectionsStatus status) {
            if (status == DirectionsStatus.OK) {
              directionsDisplay.setDirections(result);
              assertTrue(true);
              
            } else if (status == DirectionsStatus.INVALID_REQUEST) {
              fail();
            } else if (status == DirectionsStatus.MAX_WAYPOINTS_EXCEEDED) {
              fail();
            } else if (status == DirectionsStatus.NOT_FOUND) {
              fail();
            } else if (status == DirectionsStatus.OVER_QUERY_LIMIT) {
              fail();
            } else if (status == DirectionsStatus.REQUEST_DENIED) {
              fail();
            } else if (status == DirectionsStatus.UNKNOWN_ERROR) {
              fail();
            } else if (status == DirectionsStatus.ZERO_RESULTS) {
              fail();
            }
          
            finishTest();
          }
        });
        
        
      }
    }, loadLibraries , sensor);
  }
}
