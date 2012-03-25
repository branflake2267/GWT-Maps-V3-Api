package com.google.gwt.maps.client.service;

import java.util.ArrayList;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.services.DirectionsStep;
import com.google.gwt.maps.client.services.Distance;
import com.google.gwt.maps.client.services.Duration;
import com.google.gwt.maps.client.services.TravelMode;

public class DirectionsStepTest extends GWTTestCase {

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
        DirectionsStep o = DirectionsStep.newInstance();
        finishTest();
      }
    }, loadLibraries , sensor);
  }

  public void testDistance() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsStep o = DirectionsStep.newInstance();
        Distance left = Distance.newInstance();
        left.setText("test");
        o.setDistance(left);
        Distance right = o.getDistance();
        assertEquals(left.getText(), right.getText());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testDuration() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsStep o = DirectionsStep.newInstance();
        Duration left = Duration.newInstance();
        left.setText("test");
        o.setDuration(left);
        Duration right = o.getDuration();
        assertEquals(left.getText(), right.getText());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testEndLocation() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsStep o = DirectionsStep.newInstance();
        LatLng left = LatLng.newInstance(25, 26);
        o.setEnd_Location(left);
        LatLng right = o.getEnd_Location();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testInstructions() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsStep o = DirectionsStep.newInstance();
        String left = "test";
        o.setInstructions(left);
        String right = o.getInstructions();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testPath() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsStep o = DirectionsStep.newInstance();
        LatLng[] a = new LatLng[3];
        a[0] = LatLng.newInstance(25, 26);
        a[1] = LatLng.newInstance(26, 27);
        a[1] = LatLng.newInstance(28, 29);
        JsArray<LatLng> left = ArrayHelper.toJsArray(a);
        o.setPath(left);
        JsArray<LatLng> right = o.getPath();
        assertEquals(left.length(), right.length());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testStartLocation() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsStep o = DirectionsStep.newInstance();
        LatLng left = LatLng.newInstance(25, 26);
        o.setStart_Location(left);
        LatLng right = o.getStart_Location();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testTravelMode() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsStep o = DirectionsStep.newInstance();
        TravelMode left = TravelMode.BICYCLING;
        o.setTravel_Mode(left);
        TravelMode right = o.getTravelMode();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
}
