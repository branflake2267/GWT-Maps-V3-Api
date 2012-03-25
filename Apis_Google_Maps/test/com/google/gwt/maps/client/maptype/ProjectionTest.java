package com.google.gwt.maps.client.maptype;

import java.math.BigDecimal;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Point;
import com.google.gwt.maps.client.maptypes.Projection;

public class ProjectionTest extends GWTTestCase {

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
        MapOptions options = MapOptions.newInstance();
        MapWidget wMap = new MapWidget(options);
        Projection p = wMap.getProjection();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testFromLatLngToPoint() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapOptions options = MapOptions.newInstance();
        MapWidget wMap = new MapWidget(options);
        Projection p = wMap.getProjection();
        Point point = Point.newInstance(4, 3);
        LatLng latlng = LatLng.newInstance(new BigDecimal(35), new BigDecimal(38));
        Point p2 = p.fromLatLngToPoint(latlng, point);
        assertEquals("(155.0222222222222, 101.40104481443532)", p2.getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testFromPointToLatLng() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapOptions options = MapOptions.newInstance();
        MapWidget wMap = new MapWidget(options);
        Projection p = wMap.getProjection();
        Point point = Point.newInstance(4, 3);
        Point p2 = p.fromPointToLatLng(point, false);
        assertEquals("(84.67351256610525, -174.375)", p2.getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
}
