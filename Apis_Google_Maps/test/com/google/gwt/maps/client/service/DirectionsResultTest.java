package com.google.gwt.maps.client.service;

import java.util.ArrayList;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.services.DirectionsResult;
import com.google.gwt.maps.client.services.DirectionsRoute;

public class DirectionsResultTest extends GWTTestCase {

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
        DirectionsResult o = DirectionsResult.newInstance();
        finishTest();
      }
    }, loadLibraries , sensor);
  }

  public void testRoutes() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsResult o = DirectionsResult.newInstance();
        DirectionsRoute[] a = new DirectionsRoute[3];
        a[0] = DirectionsRoute.newInstance();
        a[1] = DirectionsRoute.newInstance();
        a[2] = DirectionsRoute.newInstance();
        JsArray<DirectionsRoute> left = ArrayHelper.toJsArray(a);
        o.setRoutes(left);
        JsArray<DirectionsRoute> right = o.getRoutes();
        assertEquals(left.length(), right.length());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
}
