package com.google.gwt.maps.client.service;

import java.util.ArrayList;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.services.DistanceMatrixRequest;
import com.google.gwt.maps.client.services.TravelMode;
import com.google.gwt.maps.client.services.UnitSystem;

public class DistanceMatrixRequestTest extends GWTTestCase {

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
        DistanceMatrixRequest o = DistanceMatrixRequest.newInstance();
      }
    }, loadLibraries , sensor);
  }
  
  public void testAvoidHighways() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DistanceMatrixRequest o = DistanceMatrixRequest.newInstance();
        boolean left = true;
        o.setAvoidHighways(left);
        boolean right = o.getAvoidHighways();
        assertEquals(left, right);
      }
    }, loadLibraries , sensor);
  }
  
  public void testAvoidTolls() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DistanceMatrixRequest o = DistanceMatrixRequest.newInstance();
        boolean left = true;
        o.setAvoidTolls(left);
        boolean right = o.getAvoidTolls();
        assertEquals(left, right);
      }
    }, loadLibraries , sensor);
  }
  
  public void testDesinations1() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DistanceMatrixRequest o = DistanceMatrixRequest.newInstance();
        String[] a = new String[3];
        a[0] = "a";
        a[1] = "b";
        a[2] = "c";
        JsArrayString left = ArrayHelper.toJsArrayString(a);
        o.setDestinations(left);
        JsArray<LatLng> right = o.getDestinations();
        assertEquals(left.length(), right.length());
      }
    }, loadLibraries , sensor);
  }
  
  public void testDesinations2() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DistanceMatrixRequest o = DistanceMatrixRequest.newInstance();
        LatLng[] a = new LatLng[3];
        a[0] = LatLng.newInstance(25, 26);
        a[1] = LatLng.newInstance(28, 27);
        a[2] = LatLng.newInstance(29, 25);
        JsArray<LatLng> left = ArrayHelper.toJsArray(a);
        o.setDestinations(left);
        JsArray<LatLng> right = o.getDestinations();
        assertEquals(left.length(), right.length());
      }
    }, loadLibraries , sensor);
  }
  
  
  
  public void testOrigins1() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);
    LoadApi.go(new Runnable() {
      public void run() {
        DistanceMatrixRequest o = DistanceMatrixRequest.newInstance();
        String[] a = new String[3];
        a[0] = "a";
        a[1] = "b";
        a[2] = "c";
        JsArrayString left = ArrayHelper.toJsArrayString(a);
        o.setOrigins(left);
        JsArray<LatLng> right = o.getOrigins();
        assertEquals(left.length(), right.length());
      }
    }, loadLibraries , sensor);
  }
  
  public void testOrigins2() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);
    LoadApi.go(new Runnable() {
      public void run() {
        DistanceMatrixRequest o = DistanceMatrixRequest.newInstance();
        LatLng[] a = new LatLng[3];
        a[0] = LatLng.newInstance(25, 26);
        a[1] = LatLng.newInstance(28, 27);
        a[2] = LatLng.newInstance(29, 25);
        JsArray<LatLng> left = ArrayHelper.toJsArray(a);
        o.setOrigins(left);
        JsArray<LatLng> right = o.getOrigins();
        assertEquals(left.length(), right.length());
      }
    }, loadLibraries , sensor);
  }
  
  
  public void tesRegion() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);
    LoadApi.go(new Runnable() {
      public void run() {
        DistanceMatrixRequest o = DistanceMatrixRequest.newInstance();
        String left = "test";
        o.setRegion(left);
        String right = o.getRegion();
        assertEquals(left, right);
      }
    }, loadLibraries , sensor);
  }
  
  public void testTravelMode() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);
    LoadApi.go(new Runnable() {
      public void run() {
        DistanceMatrixRequest o = DistanceMatrixRequest.newInstance();
        TravelMode left = TravelMode.BICYCLING;
        o.setTravelMode(left);
        TravelMode right = o.getTravelMode();
        assertEquals(left.value(), right.value());
      }
    }, loadLibraries , sensor);
  }
  
  public void testUnitSystem() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);
    LoadApi.go(new Runnable() {
      public void run() {
        DistanceMatrixRequest o = DistanceMatrixRequest.newInstance();
        UnitSystem left = UnitSystem.IMPERIAL;
        o.setUnitSystem(left);
        UnitSystem right = o.getUnitSystem();
        assertEquals(left, right);
      }
    }, loadLibraries , sensor);
  }
  
}
