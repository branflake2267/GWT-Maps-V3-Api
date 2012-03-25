package com.google.gwt.maps.client.controls;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class ZoomControlStyleTest extends GWTTestCase {

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
        ZoomControlStyle type = ZoomControlStyle.DEFAULT;
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum1() {
    LoadApi.go(new Runnable() {
      public void run() {
        ZoomControlStyle type = ZoomControlStyle.DEFAULT;
        String left = "DEFAULT";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum2() {
    LoadApi.go(new Runnable() {
      public void run() {
        ZoomControlStyle type = ZoomControlStyle.LARGE;
        String left = "LARGE";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum3() {
    LoadApi.go(new Runnable() {
      public void run() {
        ZoomControlStyle type = ZoomControlStyle.SMALL;
        String left = "SMALL";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  
}
