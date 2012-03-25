package com.google.gwt.maps.client.service;

import java.util.ArrayList;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
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

public class DistanceMatrixServiceTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;

  public String getModuleName() {
    return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
  }

  public void testWorks() {
    assertEquals(true, true);
  }

  /**
   * TODO I can't get this to work in Devmode, probably the same as Distance service
   */
  public void testUse1() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
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
      
      
    }, loadLibraries , sensor);
  }

  
}
