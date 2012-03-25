package com.google.gwt.maps.client.streetview;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.controls.ControlPosition;
import com.google.gwt.maps.client.controls.PanControlOptions;

public class StreetViewPanaoramaOptionsTest extends GWTTestCase {

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
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testAddressControl() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        boolean left = true;
        options.setAddressControl(left);
        boolean right = options.getAddressControl();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testAddressControlOptions() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        StreetViewAddressControlOptions left = StreetViewAddressControlOptions.newInstance();
        left.setPosition(ControlPosition.BOTTOM_CENTER);
        options.setAddressControlOptions(left);
        StreetViewAddressControlOptions right = options.getAddressControlOptions();
        assertEquals(left.getPosition(), right.getPosition());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testDisableDoubleClickZoom() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        boolean left = true;
        options.setDisableDoubleClickZoom(left);
        boolean right = options.getDisableDoubleClickZoom();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnableCloseButton() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        boolean left = true;
        options.setEnableCloseButton(left);
        boolean right = options.getEnableCloseButton();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testLinksControl() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        boolean left = true;
        options.setLinksControl(left);
        boolean right = options.getLinksControl();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testPanControl() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        boolean left = true;
        options.setPanControl(left);
        boolean right = options.getPanControl();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testPanControlOptions() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        PanControlOptions left = PanControlOptions.newInstance();
        left.setPosition(ControlPosition.BOTTOM_CENTER);
        options.setPanControlOptions(left);
        PanControlOptions right = options.getPanControlOptions();
        assertEquals(left.getPosition(), right.getPosition());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testPano() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        String left = "test";
        options.setPano(left);
        String right = options.getPano();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  /**
   * TODO finish in render
   */
  public void testPanoProvider() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        options.setPanoProvider(new StreetViewPanoramaProvider() {
          public StreetViewPanoramaData getPanoData(String pano, int zoom, int tileX, int tileY) {
            // TODO 
            return null;
          }
        });
        // TODO assert something
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  
}
