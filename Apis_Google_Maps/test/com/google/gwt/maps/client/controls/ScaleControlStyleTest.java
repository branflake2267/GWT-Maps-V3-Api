package com.google.gwt.maps.client.controls;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class ScaleControlStyleTest extends GWTTestCase {

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
        ScaleControlStyle type = ScaleControlStyle.DEFAULT;
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum1() {
    LoadApi.go(new Runnable() {
      public void run() {
        ScaleControlStyle type = ScaleControlStyle.DEFAULT;
        String left = "DEFAULT";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  
}
