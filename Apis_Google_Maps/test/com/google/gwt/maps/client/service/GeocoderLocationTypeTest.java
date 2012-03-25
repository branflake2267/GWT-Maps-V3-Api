package com.google.gwt.maps.client.service;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.services.GeocoderLocationType;

public class GeocoderLocationTypeTest extends GWTTestCase {

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
        GeocoderLocationType o = GeocoderLocationType.APPROXIMATE;
        assertEquals("approximate", o.value());
        assertEquals(GeocoderLocationType.APPROXIMATE, GeocoderLocationType.fromValue("approximate"));
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
        GeocoderLocationType o = GeocoderLocationType.GEOMETRIC_CENTER;
        assertEquals("geometric_center", o.value());
        assertEquals(GeocoderLocationType.GEOMETRIC_CENTER, GeocoderLocationType.fromValue("geometric_center"));
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
        GeocoderLocationType o = GeocoderLocationType.RANGE_INTERPOLATED;
        assertEquals("range_interpolated", o.value());
        assertEquals(GeocoderLocationType.RANGE_INTERPOLATED, GeocoderLocationType.fromValue("range_interpolated"));
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
        GeocoderLocationType o = GeocoderLocationType.ROOFTOP;
        assertEquals("rooftop", o.value());
        assertEquals(GeocoderLocationType.ROOFTOP, GeocoderLocationType.fromValue("rooftop"));
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
}
