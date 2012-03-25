package com.google.gwt.maps.client.service;

import java.util.ArrayList;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.services.GeocoderAddressComponent;
import com.google.gwt.maps.client.services.GeocoderGeometry;
import com.google.gwt.maps.client.services.GeocoderResult;

public class GeocoderResultTest extends GWTTestCase {

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
        GeocoderResult o = GeocoderResult.newInstance();        
        finishTest();
      }
    }, loadLibraries , sensor);
  }

  public void testAddressCom() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        GeocoderResult o = GeocoderResult.newInstance();
        GeocoderAddressComponent[] a = new GeocoderAddressComponent[3];
        a[0] = GeocoderAddressComponent.newInstace();
        a[1] = GeocoderAddressComponent.newInstace();
        a[2] = GeocoderAddressComponent.newInstace();
        
        JsArray<GeocoderAddressComponent> left = ArrayHelper.toJsArray();
        o.setAddress_Components(left);
        JsArray<GeocoderAddressComponent> right = o.getAddress_Components();
        assertEquals(left.length(), right.length());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testFormattedAddress() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        GeocoderResult o = GeocoderResult.newInstance();
        String left = "test";
        o.setFormatted_Address(left);
        String right = o.getFormatted_Address();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testGeometry() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        GeocoderResult o = GeocoderResult.newInstance();
        GeocoderGeometry left = GeocoderGeometry.newInstance();
        left.setLocation(LatLng.newInstance(25, 26));
        o.setGeometry(left);
        GeocoderGeometry right = o.getGeometry();
        assertEquals(left.getLocation().getToString(), right.getLocation().getToString());
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
        GeocoderResult o = GeocoderResult.newInstance();
        String[] a = new String[3];
        a[0] = "0";
        a[1] = "1";
        a[2] = "2";
        JsArrayString left = ArrayHelper.toJsArrayString(a);
        o.setTypes(left);
        JsArrayString right = o.getTypes();
        assertEquals(left.length(), right.length());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
}
