package com.google.gwt.maps.client.service;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.services.DistanceMatrixStatus;

public class DistanceMatrixStatusTest extends GWTTestCase {

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
        DistanceMatrixStatus o = DistanceMatrixStatus.INVALID_REQUEST;
        assertEquals("invalid_request", o.value());
        assertEquals(DistanceMatrixStatus.INVALID_REQUEST, DistanceMatrixStatus.fromValue("invalid_request"));
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
        DistanceMatrixStatus o = DistanceMatrixStatus.MAX_DIMENSIONS_EXCEEDED;
        assertEquals("max_dimensions_exceeded", o.value());
        assertEquals(DistanceMatrixStatus.MAX_DIMENSIONS_EXCEEDED, DistanceMatrixStatus.fromValue("max_dimensions_exceeded"));
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
        DistanceMatrixStatus o = DistanceMatrixStatus.MAX_ELEMENTS_EXCEEDED;
        assertEquals("max_elements_exceeded", o.value());
        assertEquals(DistanceMatrixStatus.MAX_ELEMENTS_EXCEEDED, DistanceMatrixStatus.fromValue("max_elements_exceeded"));
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
        DistanceMatrixStatus o = DistanceMatrixStatus.OK;
        assertEquals("ok", o.value());
        assertEquals(DistanceMatrixStatus.OK, DistanceMatrixStatus.fromValue("ok"));
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
        DistanceMatrixStatus o = DistanceMatrixStatus.OVER_QUERY_LIMIT;
        assertEquals("over_query_limit", o.value());
        assertEquals(DistanceMatrixStatus.OVER_QUERY_LIMIT, DistanceMatrixStatus.fromValue("over_query_limit"));
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
        DistanceMatrixStatus o = DistanceMatrixStatus.REQUEST_DENIED;
        assertEquals("request_denied", o.value());
        assertEquals(DistanceMatrixStatus.REQUEST_DENIED, DistanceMatrixStatus.fromValue("request_denied"));
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
        DistanceMatrixStatus o = DistanceMatrixStatus.UNKNOWN_ERROR;
        assertEquals("unknown_error", o.value());
        assertEquals(DistanceMatrixStatus.UNKNOWN_ERROR, DistanceMatrixStatus.fromValue("unknown_error"));
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  
}
