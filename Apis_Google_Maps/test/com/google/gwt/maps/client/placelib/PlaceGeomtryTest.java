package com.google.gwt.maps.client.placelib;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.placeslib.PlaceGeometry;

public class PlaceGeomtryTest extends GWTTestCase {

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
        PlaceGeometry o = PlaceGeometry.newInstance();
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
        PlaceGeometry o = PlaceGeometry.newInstance();
        LatLng left = LatLng.newInstance(35, 38);
        o.setLocation(left);
        LatLng right = o.getLocation();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testViewport() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PlaceGeometry o = PlaceGeometry.newInstance();
        LatLng sw = LatLng.newInstance(-31.203405d, 125.244141d);
        LatLng ne = LatLng.newInstance(-25.363882d, 131.044922d);
        LatLngBounds left = LatLngBounds.newInstance(sw, ne);
        o.setViewPort(left);
        LatLngBounds right = o.getViewPort();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
}
