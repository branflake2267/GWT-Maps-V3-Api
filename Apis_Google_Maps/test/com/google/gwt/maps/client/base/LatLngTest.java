package com.google.gwt.maps.client.base;

import java.math.BigDecimal;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class LatLngTest extends GWTTestCase {

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
        LatLng ll = LatLng.newInstance(new BigDecimal(38), new BigDecimal(35.5));
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testUse2() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng ll = LatLng.newInstance(new BigDecimal(38), new BigDecimal(35.5), false);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testUse3() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng ll = LatLng.newInstance(new BigDecimal(38), new BigDecimal(35.5), true);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
 
  public void testEqualsIsEqual() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng left = LatLng.newInstance(new BigDecimal(38), new BigDecimal(35.5), false);
        LatLng right = LatLng.newInstance(new BigDecimal(38), new BigDecimal(35.5), false);
        boolean equals = left.equals(right);
        assertEquals(true, equals);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEqualsIsNotEqual() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng left = LatLng.newInstance(new BigDecimal(38.3), new BigDecimal(35.5), false);
        LatLng right = LatLng.newInstance(new BigDecimal(38), new BigDecimal(35.5), false);
        boolean equals = left.equals(right);
        assertEquals(false, equals);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testGetLatitude() {
    LoadApi.go(new Runnable() {
      public void run() {
        BigDecimal left = new BigDecimal("38.3");
        LatLng ll = LatLng.newInstance(left, new BigDecimal(35.5), false);
        BigDecimal right = ll.getLatitude();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testGetLongitude() {
    LoadApi.go(new Runnable() {
      public void run() {
        BigDecimal left = new BigDecimal("35.5");
        LatLng ll = LatLng.newInstance(new BigDecimal(38.3), left, false);
        BigDecimal right = ll.getLongitude();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testGetToString() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng ll = LatLng.newInstance(new BigDecimal(38.3), new BigDecimal(35.5), false);
        String left = "(38.3, 35.5)";
        String right = ll.getToString();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testGetToUrlValue() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng ll = LatLng.newInstance(new BigDecimal(38.12345678901234567890), new BigDecimal(35.12345678901234567890), false);
        String left = "38.123456789,35.123456789";
        String right = ll.getToUrlValue(10);
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

}
