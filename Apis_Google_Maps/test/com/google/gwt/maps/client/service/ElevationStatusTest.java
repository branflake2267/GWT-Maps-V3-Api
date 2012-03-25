package com.google.gwt.maps.client.service;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.services.ElevationStatus;

public class ElevationStatusTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;

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
        ElevationStatus o = ElevationStatus.INVALID_REQUEST;
        assertEquals("invalid_request", o.value());
        assertEquals(ElevationStatus.INVALID_REQUEST, ElevationStatus.fromValue("invalid_request"));
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
        ElevationStatus o = ElevationStatus.OK;
        assertEquals("ok", o.value());
        assertEquals(ElevationStatus.OK, ElevationStatus.fromValue("ok"));
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
        ElevationStatus o = ElevationStatus.OVER_QUERY_LIMIT;
        assertEquals("over_query_limit", o.value());
        assertEquals(ElevationStatus.OVER_QUERY_LIMIT, ElevationStatus.fromValue("over_query_limit"));
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
        ElevationStatus o = ElevationStatus.REQUEST_DENIED;
        assertEquals("request_denied", o.value());
        assertEquals(ElevationStatus.REQUEST_DENIED, ElevationStatus.fromValue("request_denied"));
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testUse7() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        ElevationStatus o = ElevationStatus.UNKNOWN_ERROR;
        assertEquals("unknown_error", o.value());
        assertEquals(ElevationStatus.UNKNOWN_ERROR, ElevationStatus.fromValue("unknown_error"));
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
}
