package com.google.gwt.maps.client.service;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.services.GeocoderRequest;

public class GeocoderRequestTest extends GWTTestCase {

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
        GeocoderRequest o = GeocoderRequest.newInstance();
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testAddress() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        GeocoderRequest o = GeocoderRequest.newInstance();
        String left = "test";
        o.setAddress(left);
        String right = o.getAddress();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testBounds() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        GeocoderRequest o = GeocoderRequest.newInstance();
        LatLng sw = LatLng.newInstance(new BigDecimal(-31.203405), new BigDecimal(125.244141));
        LatLng ne = LatLng.newInstance(new BigDecimal(-25.363882), new BigDecimal(131.044922));
        LatLngBounds left = LatLngBounds.newInstance(sw, ne);
        o.setBounds(left);
        LatLngBounds right = o.getBounds();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testLocation() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        GeocoderRequest o = GeocoderRequest.newInstance();
        LatLng left = LatLng.newInstance(new BigDecimal(-31.203405), new BigDecimal(125.244141));
        o.setLocation(left);
        LatLng right = o.getLocation();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testRegion() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        GeocoderRequest o = GeocoderRequest.newInstance();
        String left = "test";
        o.setRegion(left);
        String right = o.getRegion();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
}
