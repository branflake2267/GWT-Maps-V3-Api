package com.google.gwt.maps.client.service;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.services.DistanceMatrixElementStatus;

public class DistanceMatrixElementStatusTest extends GWTTestCase {

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
        DistanceMatrixElementStatus o = DistanceMatrixElementStatus.NOT_FOUND;
        assertEquals("not_found", o.value());
        assertEquals(DistanceMatrixElementStatus.NOT_FOUND, DistanceMatrixElementStatus.fromValue("not_found"));
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
        DistanceMatrixElementStatus o = DistanceMatrixElementStatus.OK;
        assertEquals("ok", o.value());
        assertEquals(DistanceMatrixElementStatus.OK, DistanceMatrixElementStatus.fromValue("ok"));
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
        DistanceMatrixElementStatus o = DistanceMatrixElementStatus.ZERO_RESULTS;
        assertEquals("zero_results", o.value());
        assertEquals(DistanceMatrixElementStatus.ZERO_RESULTS, DistanceMatrixElementStatus.fromValue("zero_results"));
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  
}
