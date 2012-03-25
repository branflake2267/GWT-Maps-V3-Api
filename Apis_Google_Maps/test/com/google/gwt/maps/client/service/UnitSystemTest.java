package com.google.gwt.maps.client.service;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.services.UnitSystem;

public class UnitSystemTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;

  public String getModuleName() {
    return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
  }

  public void testWorks() {
    assertEquals(true, true);
  }

  public void testReverseEngineer() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);   
    LoadApi.go(new Runnable() {
      public void run() {
        reverseEngineer();
        finishTest();
      }
    }, loadLibraries , sensor);
  }

  private native void reverseEngineer() /*-{
    var array = ["IMPERIAL", "METRIC"]
    for (var i=0; i < array.length; i++) {      
      var s = "$wnd.google.maps.UnitSystem." + array[i];
      alert(array[i] + "=" + eval(s));
    }
  }-*/;
  
  public void testUse1() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        UnitSystem o = UnitSystem.IMPERIAL;
        assertEquals(1, o.value());
        assertEquals(UnitSystem.IMPERIAL, UnitSystem.fromValue(1));
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testUse2() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        UnitSystem o = UnitSystem.METRIC;
        assertEquals(0, o.value());
        assertEquals(UnitSystem.METRIC, UnitSystem.fromValue(0));
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
}
