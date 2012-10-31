package com.google.gwt.maps.testing;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

// TODO Test will not run. Not sure why not. Need investigation
public class Test extends AbstractMapsGWTTest {



  
  public void testLoad() {
    LoadApi.go(new Runnable() {
      public void run() {
        finishTest();
      }
    }, false);

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

  }
  
  public void testLoad3() {
    LoadApi.go(new Runnable() {
      public void run() {
        finishTest();
      }
    }, true);

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

  }
  
  
}
