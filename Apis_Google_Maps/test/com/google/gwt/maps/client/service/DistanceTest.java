package com.google.gwt.maps.client.service;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.services.Distance;

public class DistanceTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;

  public String getModuleName() {
    return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
  }

  public void testWorks() {
    assertEquals(true, true);
  }

  @SuppressWarnings("unused")
  public void testUse() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        Distance o = Distance.newInstance();
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testText() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        Distance o = Distance.newInstance();
        String left = "test";
        o.setText(left);
        String right = o.getText();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testValue() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        Distance o = Distance.newInstance();
        int left = 10;
        o.setValue(left);
        int right = o.getValue();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
}
