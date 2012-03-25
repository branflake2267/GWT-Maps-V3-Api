package com.google.gwt.maps.client.base;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class SizeTest extends GWTTestCase {

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
        Size o = Size.newInstance(100, 250);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testUse2() {
    LoadApi.go(new Runnable() {
      public void run() {
        Size o = Size.newInstance(100, 250, "px", "px");
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  

  public void testEqual() {
    LoadApi.go(new Runnable() {
      public void run() {
        Size left = Size.newInstance(100, 250);
        Size right = Size.newInstance(100, 250);
        boolean b = left.equals(right);
        assertEquals(true, b);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testNotEqual() {
    LoadApi.go(new Runnable() {
      public void run() {
        Size left = Size.newInstance(101, 250);
        Size right = Size.newInstance(100, 250);
        boolean b = left.equals(right);
        assertEquals(false, b);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testGetToString() {
    LoadApi.go(new Runnable() {
      public void run() {
        String left = "(101, 250)";
        Size right = Size.newInstance(101, 250);
        assertEquals(left, right.getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testWidth() {
    LoadApi.go(new Runnable() {
      public void run() {
        int width = 100;
        Size o = Size.newInstance(width, 250, "px", "px");
        assertEquals(width, o.getWidth());
        o.setWidth(101);
        assertEquals(101, o.getWidth());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testHeight() {
    LoadApi.go(new Runnable() {
      public void run() {
        int height = 250;
        Size o = Size.newInstance(100, height, "px", "px");
        assertEquals(height, o.getHeight());
        o.setHeight(251);
        assertEquals(251, o.getHeight());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
}
