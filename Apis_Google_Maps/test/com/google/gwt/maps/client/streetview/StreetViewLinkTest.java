package com.google.gwt.maps.client.streetview;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class StreetViewLinkTest extends GWTTestCase {

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
        StreetViewLink o = StreetViewLink.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testDescription() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewLink o = StreetViewLink.newInstance();
        String left = "test";
        o.setDescription(left);
        String right = o.getDescription();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testHeading() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewLink o = StreetViewLink.newInstance();
        int left = 11;
        o.setHeading(left);
        int right = o.getHeading();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testPano() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewLink o = StreetViewLink.newInstance();
        String left = "test";
        o.setPano(left);
        String right = o.getPano();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
}
