package com.google.gwt.maps.client.service;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.services.MaxZoomResult;
import com.google.gwt.maps.client.services.MaxZoomStatus;

public class MaxZoomResultTest extends GWTTestCase {

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
        MaxZoomResult o = MaxZoomResult.newInstance();
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testStatus() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        MaxZoomResult o = MaxZoomResult.newInstance();
        MaxZoomStatus left = MaxZoomStatus.OK;
        o.setStatus(left);
        MaxZoomStatus right = o.getStatus();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testZoom() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        MaxZoomResult o = MaxZoomResult.newInstance();
        int left = 5;
        o.setZoom(left);
        int right = o.getZoom();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
}
