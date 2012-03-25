package com.google.gwt.maps.client.service;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.services.MaxZoomResult;
import com.google.gwt.maps.client.services.MaxZoomService;
import com.google.gwt.maps.client.services.MaxZoomServiceHandler;
import com.google.gwt.maps.client.services.MaxZoomStatus;

public class MaxZoomServiceTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;

  public String getModuleName() {
    return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
  }

  public void testWorks() {
    assertEquals(true, true);
  }

  public void testUse() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        MaxZoomService o = MaxZoomService.newInstance();
        finishTest();
      }
    }, loadLibraries , sensor);
  }

  
  public void testGet() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        MaxZoomService o = MaxZoomService.newInstance();
        LatLng latlng = LatLng.newInstance(25, 26);
        o.getMaxZoomAtLatLng(latlng, new MaxZoomServiceHandler() {
          public void onCallback(MaxZoomResult result) {
            if (result == null) {
              fail();
            }
            
            if (result.getStatus() == MaxZoomStatus.OK) {
              System.out.println("result.zoom=" + result.getZoom());
              assertEquals(16, result.getZoom());
              
            } else if (result.getStatus() == MaxZoomStatus.ERROR) {
              fail();
            }
            finishTest();    
          }
        });

      }
    }, loadLibraries , sensor);
  }
  
}
