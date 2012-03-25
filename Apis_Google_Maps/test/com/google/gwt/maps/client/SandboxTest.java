package com.google.gwt.maps.client;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class SandboxTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;

  public String getModuleName() {
    return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
  }

  public void testWorks() {
    assertEquals(true, true);
  }
  
  public void testOut() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);
    loadLibraries.add(LoadLibrary.DRAWING);
    loadLibraries.add(LoadLibrary.GEOMETRY);
    loadLibraries.add(LoadLibrary.PANORAMIO);
    loadLibraries.add(LoadLibrary.PLACES);
    
    LoadApi.go(new Runnable() {
      public void run() {
        runSomething();
        finishTest();
      }
    }, loadLibraries , sensor);
  }

  protected void runSomething() {

    runJsni();
    
  }
  
  private final native void runJsni() /*-{
    var array = ["BANNER", "BUTTON", "HALF_BANNER", "LARGE_RECTANGLE", "LEADERBOARD", "MEDIUM_RECTANGLE", "SKYSCRAPER", "SMALL_RECTANGLE", "SMALL_SQUARE", "SQUARE", "VERTICAL_BANNER", "WIDE_SKYSCRAPER"]
    for (var i=0; i < array.length; i++) {      
      var s = "$wnd.google.maps.adsense.AdFormat." + array[i];
      alert(array[i] + "=" + eval(s));
    }
  }-*/;
}
