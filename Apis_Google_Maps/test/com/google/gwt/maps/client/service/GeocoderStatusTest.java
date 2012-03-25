package com.google.gwt.maps.client.service;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.services.GeocoderStatus;

public class GeocoderStatusTest extends GWTTestCase {

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
        GeocoderStatus o = GeocoderStatus.ERROR;
        assertEquals("error", o.value());
        assertEquals(GeocoderStatus.ERROR, GeocoderStatus.fromValue("error"));
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
        GeocoderStatus o = GeocoderStatus.INVALID_REQUEST;
        assertEquals("invalid_request", o.value());
        assertEquals(GeocoderStatus.INVALID_REQUEST, GeocoderStatus.fromValue("invalid_request"));
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
        GeocoderStatus o = GeocoderStatus.OK;
        assertEquals("ok", o.value());
        assertEquals(GeocoderStatus.OK, GeocoderStatus.fromValue("ok"));
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
        GeocoderStatus o = GeocoderStatus.OVER_QUERY_LIMIT;
        assertEquals("over_query_limit", o.value());
        assertEquals(GeocoderStatus.OVER_QUERY_LIMIT, GeocoderStatus.fromValue("over_query_limit"));
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
        GeocoderStatus o = GeocoderStatus.REQUEST_DENIED;
        assertEquals("request_denied", o.value());
        assertEquals(GeocoderStatus.REQUEST_DENIED, GeocoderStatus.fromValue("request_denied"));
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
        GeocoderStatus o = GeocoderStatus.UNKNOWN_ERROR;
        assertEquals("unknown_error", o.value());
        assertEquals(GeocoderStatus.UNKNOWN_ERROR, GeocoderStatus.fromValue("unknown_error"));
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
        GeocoderStatus o = GeocoderStatus.ZERO_RESULTS;
        assertEquals("zero_results", o.value());
        assertEquals(GeocoderStatus.ZERO_RESULTS, GeocoderStatus.fromValue("zero_results"));
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
}
