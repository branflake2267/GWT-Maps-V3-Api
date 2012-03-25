package com.google.gwt.maps.client.service;

import java.util.ArrayList;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.services.DirectionsLeg;
import com.google.gwt.maps.client.services.DirectionsRoute;

public class DirectionsRouteTest extends GWTTestCase {

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
        DirectionsRoute o = DirectionsRoute.newInstance();
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
        DirectionsRoute o = DirectionsRoute.newInstance();
        LatLng sw = LatLng.newInstance(-31.203405,125.244141);
        LatLng ne = LatLng.newInstance(-25.363882, 131.044922);
        LatLngBounds left = LatLngBounds.newInstance(sw, ne);
        o.setBounds(left);
        LatLngBounds right = o.getBounds();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testCopyright() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsRoute o = DirectionsRoute.newInstance();
        String left = "left";
        o.setCopyrights(left);
        String right = o.getCopyrights();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testLegs() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsRoute o = DirectionsRoute.newInstance();
        DirectionsLeg[] a = new DirectionsLeg[3];
        a[0] = DirectionsLeg.newInstance();
        a[1] = DirectionsLeg.newInstance();
        a[2] = DirectionsLeg.newInstance();
        JsArray<DirectionsLeg> left = ArrayHelper.toJsArray(a);
        o.setLegs(left);
        JsArray<DirectionsLeg> right = o.getLegs();
        assertEquals(left.length(), right.length());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testOverviewPath() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsRoute o = DirectionsRoute.newInstance();
        LatLng[] a = new LatLng[3];
        a[0] = LatLng.newInstance(25, 26);
        a[1] = LatLng.newInstance(27, 28);
        a[2] = LatLng.newInstance(29, 30);
        JsArray<LatLng> left = ArrayHelper.toJsArray(a);
        o.setOverview_Path(left);
        JsArray<LatLng> right = o.getOverview_Path();
        assertEquals(left.length(), right.length());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testWarnings() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsRoute o = DirectionsRoute.newInstance();
        String[] a = new String[3];
        a[0] = "0";
        a[1] = "1";
        a[2] = "2";
        JsArrayString left = ArrayHelper.toJsArrayString(a);
        o.setWarnings(left);
        JsArrayString right = o.getWarnings();
        assertEquals(left.length(), right.length());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testWaypointOrder() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsRoute o = DirectionsRoute.newInstance();
        int[] a = new int[3];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        JsArrayInteger left = ArrayHelper.toJsArrayInteger(a);
        o.setWayPoint_Order(left);
        JsArrayInteger right = o.getWayPoint_Order();
        assertEquals(left.length(), right.length());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  
  
}
