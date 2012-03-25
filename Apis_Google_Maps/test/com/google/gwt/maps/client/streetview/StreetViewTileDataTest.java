package com.google.gwt.maps.client.streetview;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.base.Size;

public class StreetViewTileDataTest extends GWTTestCase {

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
        StreetViewTileData o = StreetViewTileData.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
// TODO try this after the provider call back 
//  public void testTileUrl() {
//    LoadApi.go(new Runnable() {
//      public void run() {
//        StreetViewTileData o = StreetViewTileData.newInstance();
//        String pano = "panooo";
//        int tileZoom = 10;
//        int tileX = 1;
//        int tileY = 2;
//        String url = o.getTileUrl(pano, tileZoom, tileX, tileY);
//        assertEquals("", url);
//        finishTest();
//      }
//    }, false);
//    delayTestFinish(ASYNC_DELAY_MS);
//  }
  
  public void testCenterHeading() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewTileData o = StreetViewTileData.newInstance();
        int left = 15;
        o.setCenterHeading(left);
        int right = o.getCenterHeading();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testTileSize() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewTileData o = StreetViewTileData.newInstance();
        Size tileSize = Size.newInstance(10, 12);
        o.setTileSize(tileSize);
        assertEquals("(10, 12)", o.getTileSize().getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testWorldSize() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewTileData o = StreetViewTileData.newInstance();
        Size worldSize = Size.newInstance(13, 14);
        o.setWorldSize(worldSize);
        assertEquals("(13, 14)", o.getWorldSize().getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
}
