package com.google.gwt.maps.client.base;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class PointTest extends GWTTestCase {

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
        Point p = Point.newInstance(2, 3);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEquals() {
    LoadApi.go(new Runnable() {
      public void run() {
        Point p = Point.newInstance(2, 3);
        Point p2 = Point.newInstance(2, 3);
        boolean b = p.equals(p2);
        assertEquals(true, b);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testNotEquals() {
    LoadApi.go(new Runnable() {
      public void run() {
        Point p = Point.newInstance(2, 3);
        Point p2 = Point.newInstance(2, 4);
        boolean b = p.equals(p2);
        assertEquals(false, b);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testToString() {
    LoadApi.go(new Runnable() {
      public void run() {
        Point p = Point.newInstance(2, 3);
        String s = p.getToString();
        assertEquals("(2, 3)", s);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testXandY() {
    LoadApi.go(new Runnable() {
      public void run() {
        Point p = Point.newInstance(2, 3);
        assertEquals(2, p.getX());
        assertEquals(3, p.getY());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
}
