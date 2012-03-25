package com.google.gwt.maps.client.placelib;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.placeslib.AutocompleteType;
import com.google.gwt.maps.client.placeslib.PlaceSearchRequest;

public class PlaceResultTest extends GWTTestCase {

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
        PlaceSearchRequest o = PlaceSearchRequest.newInstance();
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
        PlaceSearchRequest o = PlaceSearchRequest.newInstance();
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
  
  public void testkeyword() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PlaceSearchRequest o = PlaceSearchRequest.newInstance();
        String left = "test";
        o.setKeyword(left);
        String right = o.getKeyword();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testlocation() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PlaceSearchRequest o = PlaceSearchRequest.newInstance();
        LatLng left = LatLng.newInstance(35, 38);
        o.setLocation(left);
        LatLng right = o.getLocation();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testName() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PlaceSearchRequest o = PlaceSearchRequest.newInstance();
        String left = "test";
        o.setName(left);
        String right = o.getName();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testRaidus() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PlaceSearchRequest o = PlaceSearchRequest.newInstance();
        double left = 10.02;
        o.setRaidus(left);
        double right = o.getRaidus();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testTypes() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PlaceSearchRequest o = PlaceSearchRequest.newInstance();
        AutocompleteType[] left = new AutocompleteType[2];
        left[0] = AutocompleteType.ESTABLISHMENT;
        left[1] = AutocompleteType.GEOCODE;
        o.setTypes(left);
        AutocompleteType[] right = o.getTypes();
        assertEquals(left.length, right.length);
        assertEquals(left[0].value(), right[0].value());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testTypes2() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PlaceSearchRequest o = PlaceSearchRequest.newInstance();
        AutocompleteType left = AutocompleteType.ESTABLISHMENT;
        o.setTypes(left);
        AutocompleteType[] right = o.getTypes();
        assertEquals(1, right[0].value());
        assertEquals(left.value(), right[0].value());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
}
