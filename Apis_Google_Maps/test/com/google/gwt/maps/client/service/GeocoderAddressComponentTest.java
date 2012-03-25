package com.google.gwt.maps.client.service;

import java.util.ArrayList;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.services.GeocoderAddressComponent;

public class GeocoderAddressComponentTest extends GWTTestCase {

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
        GeocoderAddressComponent o = GeocoderAddressComponent.newInstace();
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testLong_Name() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);
    LoadApi.go(new Runnable() {
      public void run() {
        GeocoderAddressComponent o = GeocoderAddressComponent.newInstace();
        String left = "test";
        o.setLong_Name(left);
        String right = o.getLong_Name();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
    
  public void testShort_Name() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);
    LoadApi.go(new Runnable() {
      public void run() {
        GeocoderAddressComponent o = GeocoderAddressComponent.newInstace();
        String left = "test";
        o.setShort_Name(left);
        String right = o.getShort_Name();
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
        GeocoderAddressComponent o = GeocoderAddressComponent.newInstace();
        String[] a = new String[3];
        a[0] = "0";
        a[1] = "1";
        a[2] = "2";
        JsArrayString left = ArrayHelper.toJsArrayString(a);
        o.setTypes(left);
        JsArrayString right = o.getTypes();
        assertEquals(left.length(), right.length());
        assertEquals(left.get(0), right.get(0));
        finishTest();
      }
    }, loadLibraries , sensor);
  }
}
