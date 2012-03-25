package com.google.gwt.maps.client.service;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.services.DirectionsStatus;

public class DirectionsStatusTest extends GWTTestCase {

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
        DirectionsStatus o = DirectionsStatus.INVALID_REQUEST;
        assertEquals("invalid_request", o.value());
        assertEquals(DirectionsStatus.INVALID_REQUEST, DirectionsStatus.fromValue("invalid_request"));
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
        DirectionsStatus o = DirectionsStatus.MAX_WAYPOINTS_EXCEEDED;
        assertEquals("max_waypoints_exceeded", o.value());
        assertEquals(DirectionsStatus.MAX_WAYPOINTS_EXCEEDED, DirectionsStatus.fromValue("max_waypoints_exceeded"));
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
        DirectionsStatus o = DirectionsStatus.NOT_FOUND;
        assertEquals("not_found", o.value());
        assertEquals(DirectionsStatus.NOT_FOUND, DirectionsStatus.fromValue("not_found"));
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
        DirectionsStatus o = DirectionsStatus.OK;
        assertEquals("ok", o.value());
        assertEquals(DirectionsStatus.OK, DirectionsStatus.fromValue("ok"));
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
        DirectionsStatus o = DirectionsStatus.OVER_QUERY_LIMIT;
        assertEquals("over_query_limit", o.value());
        assertEquals(DirectionsStatus.OVER_QUERY_LIMIT, DirectionsStatus.fromValue("over_query_limit"));
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
        DirectionsStatus o = DirectionsStatus.REQUEST_DENIED;
        assertEquals("request_denied", o.value());
        assertEquals(DirectionsStatus.REQUEST_DENIED, DirectionsStatus.fromValue("request_denied"));
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
        DirectionsStatus o = DirectionsStatus.UNKNOWN_ERROR;
        assertEquals("unknown_error", o.value());
        assertEquals(DirectionsStatus.UNKNOWN_ERROR, DirectionsStatus.fromValue("unknown_error"));
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testUse8() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsStatus o = DirectionsStatus.ZERO_RESULTS;
        assertEquals("zero_results", o.value());
        assertEquals(DirectionsStatus.ZERO_RESULTS, DirectionsStatus.fromValue("zero_results"));
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
}
