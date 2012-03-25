package com.google.gwt.maps.client.controls;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class PanControlOptionsTest extends GWTTestCase {

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
        PanControlOptions options = PanControlOptions.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testPosition() {
    LoadApi.go(new Runnable() {
      public void run() {
        PanControlOptions options = PanControlOptions.newInstance();
        ControlPosition left = ControlPosition.TOP_CENTER;
        options.setPosition(left);
        ControlPosition right = options.getPosition();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }





}
