package com.google.gwt.maps.client.adsense;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.controls.ControlPosition;

public class AdUnitOptionsTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;
  
  public String getModuleName() {
    return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
  }

  public void testWorks() {
    assertEquals(true, true);
  }
  
  public void testUse() {
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);
    LoadApi.go(new Runnable() {
      public void run() {
        AdUnitOptions o = AdUnitOptions.newInstance();
        finishTest();
      }
    }, loadLibraries , false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testChannel() {
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);
    LoadApi.go(new Runnable() {
      public void run() {
        AdUnitOptions o = AdUnitOptions.newInstance();
        String left = "test";
        o.setChannelNumber(left);
        String right = o.getChannelNumber();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testAdFormat() {
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);
    LoadApi.go(new Runnable() {
      public void run() {
        AdUnitOptions o = AdUnitOptions.newInstance();
        AdFormat left = AdFormat.BANNER;
        o.setFormat(left);
        AdFormat right = o.getFormat();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testPosition() {
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);
    LoadApi.go(new Runnable() {
      public void run() {
        AdUnitOptions o = AdUnitOptions.newInstance();
        ControlPosition left = ControlPosition.TOP_CENTER;
        o.setPosition(left);
        ControlPosition right = o.getPosition();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testPublisherId() {
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);
    LoadApi.go(new Runnable() {
      public void run() {
        AdUnitOptions o = AdUnitOptions.newInstance();
        String left = "test";
        o.setPublisherId(left);
        String right = o.getPublisherId();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
}
