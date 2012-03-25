package com.google.gwt.maps.client.placelib;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.placeslib.PlacesServiceStatus;

public class PlaceServiceStatusTest extends GWTTestCase {

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
        PlacesServiceStatus o = PlacesServiceStatus.INVALID_REQUEST;
        assertEquals("invalid_request", o.value());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
   
  public void testUse2() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PlacesServiceStatus o = PlacesServiceStatus.OK;
        assertEquals("ok", o.value());
        finishTest();
      }
    }, loadLibraries , sensor);
  }

  public void testUse3() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PlacesServiceStatus o = PlacesServiceStatus.OVER_QUERY_LIMIT;
        assertEquals("over_query_limit", o.value());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testUse4() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PlacesServiceStatus o = PlacesServiceStatus.REQUEST_DENIED;
        assertEquals("request_denied", o.value());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testUse5() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PlacesServiceStatus o = PlacesServiceStatus.UNKNOWN_ERROR;
        assertEquals("unknown_error", o.value());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testUse6() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PlacesServiceStatus o = PlacesServiceStatus.ZERO_RESULTS;
        assertEquals("zero_results", o.value());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
}
