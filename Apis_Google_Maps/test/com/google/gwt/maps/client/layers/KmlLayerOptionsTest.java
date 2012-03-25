package com.google.gwt.maps.client.layers;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.user.client.ui.RootPanel;

public class KmlLayerOptionsTest extends GWTTestCase {

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
        KmlLayerOptions o = KmlLayerOptions.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testClickable() {
    LoadApi.go(new Runnable() {
      public void run() {
        KmlLayerOptions o = KmlLayerOptions.newInstance();
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
        KmlLayerOptions o = KmlLayerOptions.newInstance();
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

  public void testPreserveViewport() {
    LoadApi.go(new Runnable() {
      public void run() {
        KmlLayerOptions o = KmlLayerOptions.newInstance();
        boolean left = true;
        o.setPreserveViewport(left);
        boolean right = o.getPreserveViewport();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testSupresseInfoWidnows() {
    LoadApi.go(new Runnable() {
      public void run() {
        KmlLayerOptions o = KmlLayerOptions.newInstance();
        boolean left = true;
        o.setSuppressInfoWindows(left);
        boolean right = o.getSuppressInfoWindows();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
}
