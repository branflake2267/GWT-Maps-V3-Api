package com.google.gwt.maps.client.service;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.services.GeocoderGeometry;
import com.google.gwt.maps.client.services.GeocoderLocationType;

public class GeocoderGeometryTest extends GWTTestCase {

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
        GeocoderGeometry o = GeocoderGeometry.newInstance();
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
        GeocoderGeometry o = GeocoderGeometry.newInstance();
        LatLng sw = LatLng.newInstance(-31.203405,125.244141);
        LatLng ne = LatLng.newInstance(-25.363882, 131.044922);
        LatLngBounds left = LatLngBounds.newInstance(sw, ne);
        assertEquals("((-31.203405, 125.24414100000001), (-25.363882, 131.04492200000004))", left.getToString());
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
        GeocoderGeometry o = GeocoderGeometry.newInstance();
        LatLng left = LatLng.newInstance(25, 26);
        o.setLocation(left);
        LatLng right = o.getLocation();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testLocationType() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        GeocoderGeometry o = GeocoderGeometry.newInstance();
        GeocoderLocationType left = GeocoderLocationType.APPROXIMATE;
        o.setLocation_Type(left);
        GeocoderLocationType right = o.getLocation_Type();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testViewPort() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        GeocoderGeometry o = GeocoderGeometry.newInstance();
        LatLng sw = LatLng.newInstance(-31.203405,125.244141);
        LatLng ne = LatLng.newInstance(-25.363882, 131.044922);
        LatLngBounds left = LatLngBounds.newInstance(sw, ne);
        assertEquals("((-31.203405, 125.24414100000001), (-25.363882, 131.04492200000004))", left.getToString());
        o.setViewPort(left);
        LatLngBounds right = o.getViewPort();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
}
