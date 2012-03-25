package com.google.gwt.maps.client.panoramio;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.panoramiolib.PanoramioLayerOptions;
import com.google.gwt.user.client.ui.RootPanel;

public class PanoramioOptionsTest extends GWTTestCase {

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
        PanoramioLayerOptions o = PanoramioLayerOptions.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testClickable() {
    LoadApi.go(new Runnable() {
      public void run() {
        PanoramioLayerOptions o = PanoramioLayerOptions.newInstance();
        boolean left = true;
        o.setClickable(left);
        boolean right = o.getClickable();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testMap() {
    LoadApi.go(new Runnable() {
      public void run() {
        PanoramioLayerOptions o = PanoramioLayerOptions.newInstance();
        MapOptions options = MapOptions.newInstance();
        MapWidget left = new MapWidget(options);
        left.setSize("500px", "500px");
        RootPanel.get().add(left);
        o.setMap(left);
        MapWidget right = o.getMap();
        assertEquals(left.getCenter(), right.getCenter());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testSupresseInfoWidnows() {
    LoadApi.go(new Runnable() {
      public void run() {
        PanoramioLayerOptions o = PanoramioLayerOptions.newInstance();
        boolean left = true;
        o.setSuppressInfoWindows(left);
        boolean right = o.getSuppressInfoWindows();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testTag() {
    LoadApi.go(new Runnable() {
      public void run() {
        PanoramioLayerOptions o = PanoramioLayerOptions.newInstance();
        String left = "tagtest";
        o.setTag(left);
        String right = o.getTag();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testUserId() {
    LoadApi.go(new Runnable() {
      public void run() {
        PanoramioLayerOptions o = PanoramioLayerOptions.newInstance();
        String left = "userIdTest";
        o.setUserId(left);
        String right = o.getUserId();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
}
