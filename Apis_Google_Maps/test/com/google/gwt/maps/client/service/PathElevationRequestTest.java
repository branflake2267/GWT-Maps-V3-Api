package com.google.gwt.maps.client.service;

import java.util.ArrayList;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.services.PathElevationRequest;

public class PathElevationRequestTest extends GWTTestCase {

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
        PathElevationRequest o = PathElevationRequest.newInstance();
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
        PathElevationRequest o = PathElevationRequest.newInstance();
        LatLng[] a = new LatLng[3];
        a[0] = LatLng.newInstance(25, 26);
        a[1] = LatLng.newInstance(26, 28);
        a[2] = LatLng.newInstance(27, 29);
        JsArray<LatLng> left = ArrayHelper.toJsArray(a);
        o.setPath(left);
        JsArray<LatLng> right = o.getPath();
        assertEquals(left.length(), right.length());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
 
  public void testSamples() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        PathElevationRequest o = PathElevationRequest.newInstance();
        int left = 5;
        o.setSamples(left);
        int right = o.getSamples();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
}
