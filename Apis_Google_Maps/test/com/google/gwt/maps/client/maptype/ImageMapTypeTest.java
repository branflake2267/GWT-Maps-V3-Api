package com.google.gwt.maps.client.maptype;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.base.Point;
import com.google.gwt.maps.client.base.Size;
import com.google.gwt.maps.client.maptypes.ImageMapType;
import com.google.gwt.maps.client.maptypes.ImageMapTypeOptions;
import com.google.gwt.maps.client.maptypes.TileUrlCallBack;

public class ImageMapTypeTest extends GWTTestCase {

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
        ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testUse2() {
    LoadApi.go(new Runnable() {
      public void run() {
        ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
        ImageMapType o = ImageMapType.newInstance(options);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testAlt() {
    LoadApi.go(new Runnable() {
      public void run() {
        ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
        String left = "test";
        options.setAlt(left);
        String right = options.getAlt();
        assertEquals(left, right);
        ImageMapType o = ImageMapType.newInstance(options);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testGetUrl() {
    LoadApi.go(new Runnable() {
      public void run() {
        ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
        options.setTileUrl(new TileUrlCallBack() {
          public String getTileUrl(Point point, int zoomLevel) {
            return "http://mt3.google.com/mapstt?zoom=" + zoomLevel + "&x=" + point.getX() + "&y=" + point.getY() + "&client=api";
          }
        });
        ImageMapType o = ImageMapType.newInstance(options);
        
        // TODO how can I trigger?
        
        // TODO will this work?????
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testMaxZoom() {
    LoadApi.go(new Runnable() {
      public void run() {
        ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
        int left = 5;
        options.setMaxZoom(left);
        int right = options.getMaxZoom();
        assertEquals(left, right);
        ImageMapType o = ImageMapType.newInstance(options);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testMinZoom() {
    LoadApi.go(new Runnable() {
      public void run() {
        ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
        int left = 5;
        options.setMinZoom(left);
        int right = options.getMinZoom();
        assertEquals(left, right);
        ImageMapType o = ImageMapType.newInstance(options);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testName() {
    LoadApi.go(new Runnable() {
      public void run() {
        ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
        String left = "test";
        options.setName(left);
        String right = options.getName();
        assertEquals(left, right);
        ImageMapType o = ImageMapType.newInstance(options);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testOpacity() {
    LoadApi.go(new Runnable() {
      public void run() {
        ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
        double left = .51;
        options.setOpacity(left);
        double right = options.getOpacity();
        assertEquals(left, right);
        ImageMapType o = ImageMapType.newInstance(options);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testTileSize() {
    LoadApi.go(new Runnable() {
      public void run() {
        ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
        Size left = Size.newInstance(103, 102);
        options.setTileSize(left);
        Size right = options.getTileSize();
        assertEquals(left.getToString(), right.getToString());
        ImageMapType o = ImageMapType.newInstance(options);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  
  
}
