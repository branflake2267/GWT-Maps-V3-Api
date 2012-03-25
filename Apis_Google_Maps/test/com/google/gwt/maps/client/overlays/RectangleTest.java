package com.google.gwt.maps.client.overlays;

import java.math.BigDecimal;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.user.client.ui.RootPanel;

public class RectangleTest extends GWTTestCase {

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
        RectangleOptions options = RectangleOptions.newInstance();
        Rectangle o = Rectangle.newInstance(options);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testBounds() {
    LoadApi.go(new Runnable() {
      public void run() {
        RectangleOptions options = RectangleOptions.newInstance();
        LatLng sw = LatLng.newInstance(new BigDecimal(-31.203405), new BigDecimal(125.244141));
        LatLng ne = LatLng.newInstance(new BigDecimal(-25.363882), new BigDecimal(131.044922));
        LatLngBounds left = LatLngBounds.newInstance(sw, ne);
        options.setBounds(left);
        LatLngBounds right = options.getBounds();
        assertEquals(left.getToString(), right.getToString());
        Rectangle o = Rectangle.newInstance(options);
        LatLngBounds right2 = o.getBounds();
        assertEquals(left.getToString(), right2.getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEditable() {
    LoadApi.go(new Runnable() {
      public void run() {
        RectangleOptions options = RectangleOptions.newInstance();
        Rectangle o = Rectangle.newInstance(options);
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
        RectangleOptions options = RectangleOptions.newInstance();
        Rectangle o = Rectangle.newInstance(options);
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
  

  
}
