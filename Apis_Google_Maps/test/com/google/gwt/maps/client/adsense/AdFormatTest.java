package com.google.gwt.maps.client.adsense;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class AdFormatTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;

  public String getModuleName() {
    return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
  }

  public void testWorks() {
    assertEquals(true, true);
  }

  public void testReverseEngineer() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);   
    LoadApi.go(new Runnable() {
      public void run() {
        reverseEngineer();
        finishTest();
      }
    }, loadLibraries , sensor);
  }

  private native void reverseEngineer() /*-{
    var array = ["BANNER", "BUTTON", "HALF_BANNER", "LARGE_RECTANGLE", "LEADERBOARD", "MEDIUM_RECTANGLE", "SKYSCRAPER", "SMALL_RECTANGLE", "SMALL_SQUARE", "SQUARE", "VERTICAL_BANNER", "WIDE_SKYSCRAPER"]
    for (var i=0; i < array.length; i++) {      
      var s = "$wnd.google.maps.adsense.AdFormat." + array[i];
      alert(array[i] + "=" + eval(s));
    }
  }-*/;

  public void testUse() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);   
    LoadApi.go(new Runnable() {
      public void run() {
        AdFormat o = AdFormat.BANNER;
        finishTest();
      }
    }, loadLibraries , sensor);
  }

  public void testEnum1() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);   
    LoadApi.go(new Runnable() {
      public void run() {
        AdFormat o = AdFormat.BANNER;
        String left = "BANNER";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, AdFormat.fromValue(o.value()));
        finishTest();
      }
    }, loadLibraries , sensor);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testEnum2() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);   
    LoadApi.go(new Runnable() {
      public void run() {
        AdFormat o = AdFormat.BUTTON;
        String left = "BUTTON";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, AdFormat.fromValue(o.value()));
        finishTest();
      }
    }, loadLibraries , sensor);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testEnum3() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);   
    LoadApi.go(new Runnable() {
      public void run() {
        AdFormat o = AdFormat.HALF_BANNER;
        String left = "HALF_BANNER";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, AdFormat.fromValue(o.value()));
        finishTest();
      }
    }, loadLibraries , sensor);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testEnum4() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);   
    LoadApi.go(new Runnable() {
      public void run() {
        AdFormat o = AdFormat.LARGE_RECTANGLE;
        String left = "LARGE_RECTANGLE";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, AdFormat.fromValue(o.value()));
        finishTest();
      }
    }, loadLibraries , sensor);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testEnum5() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);   
    LoadApi.go(new Runnable() {
      public void run() {
        AdFormat o = AdFormat.LEADERBOARD;
        String left = "LEADERBOARD";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, AdFormat.fromValue(o.value()));
        finishTest();
      }
    }, loadLibraries , sensor);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testEnu6() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);   
    LoadApi.go(new Runnable() {
      public void run() {
        AdFormat o = AdFormat.MEDIUM_RECTANGLE;
        String left = "MEDIUM_RECTANGLE";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, AdFormat.fromValue(o.value()));
        finishTest();
      }
    }, loadLibraries , sensor);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testEnu7() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);   
    LoadApi.go(new Runnable() {
      public void run() {
        AdFormat o = AdFormat.SKYSCRAPER;
        String left = "SKYSCRAPER";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, AdFormat.fromValue(o.value()));
        finishTest();
      }
    }, loadLibraries , sensor);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testEnu8() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);   
    LoadApi.go(new Runnable() {
      public void run() {
        AdFormat o = AdFormat.SMALL_RECTANGLE;
        String left = "SMALL_RECTANGLE";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, AdFormat.fromValue(o.value()));
        finishTest();
      }
    }, loadLibraries , sensor);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testEnu9() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);   
    LoadApi.go(new Runnable() {
      public void run() {
        AdFormat o = AdFormat.SMALL_SQUARE;
        String left = "SMALL_SQUARE";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, AdFormat.fromValue(o.value()));
        finishTest();
      }
    }, loadLibraries , sensor);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testEnu10() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);   
    LoadApi.go(new Runnable() {
      public void run() {
        AdFormat o = AdFormat.SQUARE;
        String left = "SQUARE";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, AdFormat.fromValue(o.value()));
        finishTest();
      }
    }, loadLibraries , sensor);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testEnu11() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);   
    LoadApi.go(new Runnable() {
      public void run() {
        AdFormat o = AdFormat.VERTICAL_BANNER;
        String left = "VERTICAL_BANNER";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, AdFormat.fromValue(o.value()));
        finishTest();
      }
    }, loadLibraries , sensor);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnu12() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);   
    LoadApi.go(new Runnable() {
      public void run() {
        AdFormat o = AdFormat.WIDE_SKYSCRAPER;
        String left = "WIDE_SKYSCRAPER";
        String right = o.getName();
        assertEquals(left, right);
        assertEquals(o, AdFormat.fromValue(o.value()));
        finishTest();
      }
    }, loadLibraries , sensor);
    delayTestFinish(ASYNC_DELAY_MS);
  }
}
