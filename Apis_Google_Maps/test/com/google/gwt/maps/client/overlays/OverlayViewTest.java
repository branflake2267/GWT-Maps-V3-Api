package com.google.gwt.maps.client.overlays;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class OverlayViewTest extends GWTTestCase {

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
        OverlayView o = OverlayView.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testDraw() {
    LoadApi.go(new Runnable() {
      public void run() {
        OverlayView o = OverlayView.newInstance();
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testMapWidget() {
    LoadApi.go(new Runnable() {
      public void run() {
        OverlayView o = OverlayView.newInstance();
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testProjection() {
    LoadApi.go(new Runnable() {
      public void run() {
        OverlayView o = OverlayView.newInstance();
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testOnAdd() {
    LoadApi.go(new Runnable() {
      public void run() {
        OverlayView o = OverlayView.newInstance();
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testOnRemove() {
    LoadApi.go(new Runnable() {
      public void run() {
        OverlayView o = OverlayView.newInstance();
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testOnStreetViewPanoWidget() {
    LoadApi.go(new Runnable() {
      public void run() {
        OverlayView o = OverlayView.newInstance();
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  
}
