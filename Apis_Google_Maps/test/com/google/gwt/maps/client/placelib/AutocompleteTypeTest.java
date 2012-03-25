package com.google.gwt.maps.client.placelib;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.placeslib.AutocompleteType;

public class AutocompleteTypeTest extends GWTTestCase {

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
        AutocompleteType o = AutocompleteType.ESTABLISHMENT;
        assertEquals("establishment", o.value());
        
        AutocompleteType o2 = AutocompleteType.GEOCODE;
        assertEquals("geocode", o2.value());
        
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
 
  
}
