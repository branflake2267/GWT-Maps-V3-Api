package com.google.gwt.maps.client.base;

import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class SizeTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;
  
  public static final double MOCK_H = 100d;
  public static final double MOCK_W = 250d;
  
  
  public String getModuleName() {
    return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
  }

  public void testWorks() {
    assertEquals(true, true);
  }
  
  @SuppressWarnings("unused")
  public void testUse() {
    LoadApi.go(new Runnable() {
      public void run() {
        Size o = Size.newInstance(MOCK_H, MOCK_W);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  @SuppressWarnings("unused")
  public void testUse2() {
    LoadApi.go(new Runnable() {
      public void run() {
        Size o = Size.newInstance(MOCK_H, MOCK_W, "px", "px");
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  

  public void testEqual() {
    LoadApi.go(new Runnable() {
      public void run() {
        Size left = Size.newInstance(MOCK_H, MOCK_W);
        Size right = Size.newInstance(MOCK_H, MOCK_W);
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
        Size left = Size.newInstance(101, MOCK_W);
        Size right = Size.newInstance(MOCK_H, MOCK_W);
        boolean b = left.equals(right);
        assertEquals(false, b);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testToString() {
    LoadApi.go(new Runnable() {
      public void run() {
    	
        String hStr = NumberFormat.getFormat("#.#").format(MOCK_H+1);
    	String wStr = NumberFormat.getFormat("#.#").format(MOCK_W);
        String left = "("+hStr+", "+wStr+")"; // oddly trailing zeros are truncated in API toString
        
        Size right = Size.newInstance(MOCK_H+1, MOCK_W);
        assertEquals(left, right.getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testWidth() {
    LoadApi.go(new Runnable() {
      public void run() {
    	  double width = MOCK_H;
        Size o = Size.newInstance(width, MOCK_W, "px", "px");
        assertEquals(width, o.getWidth());
        o.setWidth(MOCK_W+1);
        assertEquals(MOCK_W+1, o.getWidth());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testHeight() {
    LoadApi.go(new Runnable() {
      public void run() {
        double height = MOCK_W;
        Size o = Size.newInstance(MOCK_H, height, "px", "px");
        assertEquals(height, o.getHeight());
        o.setHeight(MOCK_H+1);
        assertEquals(MOCK_H+1, o.getHeight());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
}
