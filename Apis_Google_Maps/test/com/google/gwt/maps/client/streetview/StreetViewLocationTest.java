package com.google.gwt.maps.client.streetview;

import java.math.BigDecimal;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.base.LatLng;

public class StreetViewLocationTest extends GWTTestCase {

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
        StreetViewLocation o = StreetViewLocation.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testDescription() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewLocation o = StreetViewLocation.newInstance();
        String left = "desc";
        o.setDescription(left);
        String right = o.getDescription();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testLatLng() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewLocation o = StreetViewLocation.newInstance();
        LatLng left = LatLng.newInstance(new BigDecimal(38), new BigDecimal(35));
        o.setLatLng(left);
        LatLng right = o.getLatLng();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testPanon() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewLocation o = StreetViewLocation.newInstance();
        String left = "pano";
        o.setPano(left);
        String right = o.getPano();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
}
