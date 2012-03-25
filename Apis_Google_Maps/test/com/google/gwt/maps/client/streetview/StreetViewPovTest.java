package com.google.gwt.maps.client.streetview;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class StreetViewPovTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;
  
  public String getModuleName() {
    return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
  }

  public void testWorks() {
    assertEquals(true, true);
  }
  
  public void testUse() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewPov o = StreetViewPov.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
 
  public void testHeading() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewPov o = StreetViewPov.newInstance();
        int left = 10;
        o.setHeading(left);
        int right = o.getHeading();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testPitch() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewPov o = StreetViewPov.newInstance();
        int left = 12;
        o.setPitch(left);
        int right = o.getPitch();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testZoom() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewPov o = StreetViewPov.newInstance();
        int left = 12;
        o.setZoom(left);
        int right = o.getZoom();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  

  
}
