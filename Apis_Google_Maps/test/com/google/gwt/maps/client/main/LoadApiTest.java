package com.google.gwt.maps.client.main;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class LoadApiTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;

  public String getModuleName() {
    return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
  }

  public void testWorks() {
    assertEquals(true, true);
  }
  
  public void testUse1() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);
    loadLibraries.add(LoadLibrary.DRAWING);
    loadLibraries.add(LoadLibrary.GEOMETRY);
    loadLibraries.add(LoadLibrary.PANORAMIO);
    loadLibraries.add(LoadLibrary.PLACES);
    
    LoadApi.go(new Runnable() {
      public void run() {
        finishTest();
      }
    }, loadLibraries , sensor);
  }

  public void testLoad() {
    boolean sensor = false;
    LoadApi.go(new Runnable() {
      public void run() {
        finishTest();
      }
    }, sensor);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testLoad2() {
    boolean sensor = false;
    LoadApi.go(new Runnable() {
      public void run() {
        finishTest();
      }
    }, sensor);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testLoadWLibs() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.GEOMETRY);
    LoadApi.go(new Runnable() {
      public void run() {
        finishTest();
      }
    }, loadLibraries , sensor);
  }
 
  
  public void testLoadWLibs3() {
    boolean sensor = true;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);
    loadLibraries.add(LoadLibrary.DRAWING);
    loadLibraries.add(LoadLibrary.GEOMETRY);
    loadLibraries.add(LoadLibrary.PANORAMIO);
    loadLibraries.add(LoadLibrary.PLACES);
    
    LoadApi.go(new Runnable() {
      public void run() {
        finishTest();
      }
    }, loadLibraries , sensor);
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

  public void testReload5() {
    LoadApi.go(new Runnable() {
      public void run() {
        LoadApi.go(new Runnable() {
          public void run() {
            finishTest();
          }
        }, false, null);
      }
    }, true);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testReload6() {
    LoadApi.go(new Runnable() {
      public void run() {
        LoadApi.go(new Runnable() {
          public void run() {
            finishTest();
          }
        }, false, "");
      }
    }, true);
    delayTestFinish(ASYNC_DELAY_MS);
  }

}
