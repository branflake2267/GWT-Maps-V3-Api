package com.google.gwt.maps.client.maptype;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.maptypes.MapTypeStyler;

public class MapTypeStylerTest extends GWTTestCase {

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
        MapTypeStyler options = MapTypeStyler.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testGamma() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyler options = MapTypeStyler.newInstance();
        float left = 0.01f;
        options.setGamma(left);
        float right = options.getGamma();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testHue() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyler options = MapTypeStyler.newInstance();
        String left = "#ff0000";
        options.setHue(left);
        String right = options.getHue();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testInvertLightness() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyler options = MapTypeStyler.newInstance();
        boolean left = true;
        options.setInvertLightness(left);
        boolean right = options.getInvertLightness();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testLightness() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyler options = MapTypeStyler.newInstance();
        int left = -10;
        options.setLightness(left);
        int right = options.getLightness();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testSaturation() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyler options = MapTypeStyler.newInstance();
        int left = -20;
        options.setSaturation(left);
        int right = options.getSaturation();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testVisibility() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyler options = MapTypeStyler.newInstance();
        String left = "simplifed";
        options.setVisibility(left);
        String right = options.getVisibility();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
}
