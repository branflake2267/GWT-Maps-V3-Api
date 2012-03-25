package com.google.gwt.maps.client.overlays;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.user.client.ui.RootPanel;

public class CircleOptionsTest extends GWTTestCase {

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
        CircleOptions o = CircleOptions.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testCenter() {
    LoadApi.go(new Runnable() {
      public void run() {
        CircleOptions o = CircleOptions.newInstance();
        LatLng left = LatLng.newInstance(24, 33);
        o.setCenter(left);
        LatLng right = o.getCenter();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testClickable() {
    LoadApi.go(new Runnable() {
      public void run() {
        CircleOptions o = CircleOptions.newInstance();
        boolean left = true;
        o.setClickable(left);
        boolean right = o.getClickable();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testFillColor() {
    LoadApi.go(new Runnable() {
      public void run() {
        CircleOptions o = CircleOptions.newInstance();
        String left = "red";
        o.setFillColor(left);
        String right = o.getFillColor();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testFillOpacity() {
    LoadApi.go(new Runnable() {
      public void run() {
        CircleOptions o = CircleOptions.newInstance();
        double left = .50d;
        o.setFillOpacity(left);
        double right = o.getFillOpacity();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testMapWidget() {
    LoadApi.go(new Runnable() {
      public void run() {
        CircleOptions o = CircleOptions.newInstance();
        MapOptions opts = MapOptions.newInstance();
        MapWidget left = new MapWidget(opts);
        left.setSize("500px", "500px");
        RootPanel.get().add(left);
        o.setMap(left);
        MapWidget right = o.getMapWidget();
        assertEquals(left.getCenter().getToString(), right.getCenter().getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testRadius() {
    LoadApi.go(new Runnable() {
      public void run() {
        CircleOptions o = CircleOptions.newInstance();
        double left = 110.1d;
        o.setRadius(left);
        double right = o.getRadius();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testStrokeColor() {
    LoadApi.go(new Runnable() {
      public void run() {
        CircleOptions o = CircleOptions.newInstance();
        String left = "red";
        o.setStrokeColor(left);
        String right = o.getStrokeColor();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testStrokeOpacity() {
    LoadApi.go(new Runnable() {
      public void run() {
        CircleOptions o = CircleOptions.newInstance();
        double left = .50d;
        o.setStrokeOpacity(left);
        double right = o.getStrokeOpacity();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testStrokeWeight() {
    LoadApi.go(new Runnable() {
      public void run() {
        CircleOptions o = CircleOptions.newInstance();
        int left = 5;
        o.setStrokeWeight(left);
        int right = o.getStrokeWeight();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testZindex() {
    LoadApi.go(new Runnable() {
      public void run() {
        CircleOptions o = CircleOptions.newInstance();
        int left = 5;
        o.setZindex(left);
        int right = o.getZindex();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }


}
