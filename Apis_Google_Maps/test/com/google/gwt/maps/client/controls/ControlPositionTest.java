package com.google.gwt.maps.client.controls;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class ControlPositionTest extends GWTTestCase {

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
        ControlPosition o = ControlPosition.BOTTOM_CENTER;
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  
  public void testEnum1() {
    LoadApi.go(new Runnable() {
      public void run() {
        ControlPosition o = ControlPosition.BOTTOM_CENTER;
        String left = "BOTTOM_CENTER";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, ControlPosition.fromValue(o.value()));
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum2() {
    LoadApi.go(new Runnable() {
      public void run() {
        ControlPosition o = ControlPosition.BOTTOM_LEFT;
        String left = "BOTTOM_LEFT";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, ControlPosition.fromValue(o.value()));
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum3() {
    LoadApi.go(new Runnable() {
      public void run() {
        ControlPosition o = ControlPosition.BOTTOM_RIGHT;
        String left = "BOTTOM_RIGHT";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, ControlPosition.fromValue(o.value()));
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum4() {
    LoadApi.go(new Runnable() {
      public void run() {
        ControlPosition o = ControlPosition.LEFT_CENTER;
        String left = "LEFT_CENTER";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, ControlPosition.fromValue(o.value()));
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum5() {
    LoadApi.go(new Runnable() {
      public void run() {
        ControlPosition o = ControlPosition.LEFT_BOTTOM;
        String left = "LEFT_BOTTOM";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, ControlPosition.fromValue(o.value()));
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum6() {
    LoadApi.go(new Runnable() {
      public void run() {
        ControlPosition o = ControlPosition.LEFT_TOP;
        String left = "LEFT_TOP";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, ControlPosition.fromValue(o.value()));
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum7() {
    LoadApi.go(new Runnable() {
      public void run() {
        ControlPosition o = ControlPosition.RIGHT_BOTTOM;
        String left = "RIGHT_BOTTOM";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, ControlPosition.fromValue(o.value()));
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum8() {
    LoadApi.go(new Runnable() {
      public void run() {
        ControlPosition o = ControlPosition.RIGHT_CENTER;
        String left = "RIGHT_CENTER";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, ControlPosition.fromValue(o.value()));
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum9() {
    LoadApi.go(new Runnable() {
      public void run() {
        ControlPosition o = ControlPosition.RIGHT_TOP;
        String left = "RIGHT_TOP";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, ControlPosition.fromValue(o.value()));
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum10() {
    LoadApi.go(new Runnable() {
      public void run() {
        ControlPosition o = ControlPosition.TOP_CENTER;
        String left = "TOP_CENTER";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, ControlPosition.fromValue(o.value()));
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum11() {
    LoadApi.go(new Runnable() {
      public void run() {
        ControlPosition o = ControlPosition.TOP_LEFT;
        String left = "TOP_LEFT";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, ControlPosition.fromValue(o.value()));
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum12() {
    LoadApi.go(new Runnable() {
      public void run() {
        ControlPosition o = ControlPosition.TOP_RIGHT;
        String left = "TOP_RIGHT";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, ControlPosition.fromValue(o.value()));
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
}
