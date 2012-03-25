package com.google.gwt.maps.client.overlays;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class MapCanvasProjectionTest extends GWTTestCase {

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
        MapCanvasProjection o = MapCanvasProjection.newInstance();

        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testfromContainerPixelToLatLng() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapCanvasProjection o = MapCanvasProjection.newInstance();

        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testfromDivPixelToLatLng() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapCanvasProjection o = MapCanvasProjection.newInstance();

        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testfromLatLngToContainerPixel() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapCanvasProjection o = MapCanvasProjection.newInstance();

        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testfromLatLngToDivPixel() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapCanvasProjection o = MapCanvasProjection.newInstance();

        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testgetWorldWidth() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapCanvasProjection o = MapCanvasProjection.newInstance();

        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
}
