package com.google.gwt.maps.client.main;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.MapTypeId;

public class MapTypeIdTest extends GWTTestCase {

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
        MapTypeId type = MapTypeId.ROADMAP;
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum1() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeId type = MapTypeId.HYBRID;
        String left = "HYBRID";
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
        MapTypeId type = MapTypeId.ROADMAP;
        String left = "ROADMAP";
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
        MapTypeId type = MapTypeId.SATELLITE;
        String left = "SATELLITE";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum4() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeId type = MapTypeId.TERRAIN;
        String left = "TERRAIN";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
}
