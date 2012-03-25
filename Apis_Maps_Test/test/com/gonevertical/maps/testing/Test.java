package com.gonevertical.maps.testing;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class Test extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;
  
  public String getModuleName() {
    return "com.gonevertical.maps.testing.Apis_Maps_Test";
  }

  public void testWorks() {
    assertEquals(true, true);
  }
  
  public void testLoad() {
    LoadApi.go(new Runnable() {
      public void run() {
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testReload2() {
    LoadApi.go(new Runnable() {
      public void run() {
        LoadApi.go(new Runnable() {
          public void run() {
            finishTest();
          }
        }, false);
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testLoad3() {
    LoadApi.go(new Runnable() {
      public void run() {
        finishTest();
      }
    }, true);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testReload4() {
    LoadApi.go(new Runnable() {
      public void run() {
        LoadApi.go(new Runnable() {
          public void run() {
            finishTest();
          }
        }, false);
      }
    }, true);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  
}
