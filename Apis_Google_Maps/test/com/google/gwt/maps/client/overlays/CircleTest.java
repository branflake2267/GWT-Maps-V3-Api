package com.google.gwt.maps.client.overlays;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.user.client.ui.RootPanel;

public class CircleTest extends GWTTestCase {

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
        CircleOptions options = CircleOptions.newInstance();
        Circle o = Circle.newInstance(options);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testBounds() {
    LoadApi.go(new Runnable() {
      public void run() {
        CircleOptions options = CircleOptions.newInstance();
        LatLng center = LatLng.newInstance(23, 25);
        options.setCenter(center);
        options.setRadius(10);
        Circle o = Circle.newInstance(options);
        LatLngBounds right = o.getBounds();
        assertEquals("((22.999910168471587, 24.999902410586856), (23.000089831528413, 25.000097589413144))", right.getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testCenter() {
    LoadApi.go(new Runnable() {
      public void run() {
        CircleOptions options = CircleOptions.newInstance();
        LatLng center = LatLng.newInstance(23, 25);
        options.setCenter(center);
        options.setRadius(10);
        Circle o = Circle.newInstance(options);
        LatLng right = o.getCenter();
        assertEquals("(23, 25)", right.getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEditable() {
    LoadApi.go(new Runnable() {
      public void run() {
        CircleOptions options = CircleOptions.newInstance();
        Circle o = Circle.newInstance(options);
        boolean left = true;
        o.setEditable(left);
        boolean right = o.getEditable();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testMap() {
    LoadApi.go(new Runnable() {
      public void run() {
        CircleOptions options = CircleOptions.newInstance();
        Circle o = Circle.newInstance(options);
        MapOptions opts = MapOptions.newInstance();
        MapWidget left = new MapWidget(opts);
        left.setSize("500px", "500px");
        RootPanel.get().add(left);
        o.setMap(left);
        MapWidget right = o.getMap();
        assertEquals(left.getCenter().getToString(), right.getCenter().getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testRadius() {
    LoadApi.go(new Runnable() {
      public void run() {
        CircleOptions options = CircleOptions.newInstance();
        LatLng center = LatLng.newInstance(23, 25);
        options.setCenter(center);
        options.setRadius(10d);
        Circle o = Circle.newInstance(options);
        LatLngBounds right = o.getBounds();
        assertEquals("((22.999910168471587, 24.999902410586856), (23.000089831528413, 25.000097589413144))", right.getToString());
        double radius = o.getRadius();
        assertEquals(10, radius); 
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
}
