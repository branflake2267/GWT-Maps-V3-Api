package com.google.gwt.maps.client.service;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.services.MaxZoomStatus;

public class MaxZoomStatusTest extends GWTTestCase {

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
        MaxZoomStatus o = MaxZoomStatus.ERROR;
        assertEquals("error", o.value());
        assertEquals(MaxZoomStatus.ERROR, MaxZoomStatus.fromValue("error"));
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
        MaxZoomStatus o = MaxZoomStatus.OK;
        assertEquals("ok", o.value());
        assertEquals(MaxZoomStatus.OK, MaxZoomStatus.fromValue("ok"));
        finishTest();
      }
    }, loadLibraries , sensor);
  }

  
}
