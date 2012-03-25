package com.google.gwt.maps.client.streetview;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class StreetViewStatusTest extends GWTTestCase {

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
        StreetViewStatus o = StreetViewStatus.OK;
        assertEquals("ok", o.value());
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
        StreetViewStatus o = StreetViewStatus.UNKNOWN_ERROR;
        assertEquals("unknown_error", o.value());
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
        StreetViewStatus o = StreetViewStatus.ZERO_RESULTS;
        assertEquals("zero_results", o.value());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
}
