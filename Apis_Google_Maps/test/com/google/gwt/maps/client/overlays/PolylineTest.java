package com.google.gwt.maps.client.overlays;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.mvc.MVCArray;
import com.google.gwt.user.client.ui.RootPanel;

public class PolylineTest extends GWTTestCase {

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
        PolylineOptions options = PolylineOptions.newInstance();
        Polyline o = Polyline.newInstance(options);

        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEditable() {
    LoadApi.go(new Runnable() {
      public void run() {
        PolylineOptions options = PolylineOptions.newInstance();
        Polyline o = Polyline.newInstance(options);
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
        PolylineOptions options = PolylineOptions.newInstance();
        Polyline o = Polyline.newInstance(options);
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
  
  public void testPath_JsArray() {
    LoadApi.go(new Runnable() {
      public void run() {
        PolylineOptions options = PolylineOptions.newInstance();
        Polyline o = Polyline.newInstance(options);
        LatLng[] a = new LatLng[3];
        a[0] = LatLng.newInstance(35, 36);
        a[1] = LatLng.newInstance(36, 37);
        a[2] = LatLng.newInstance(38, 39);
        JsArray<LatLng> left = ArrayHelper.toJsArray(a);
        o.setPath(left);
        // fail and it will throw
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testPath_MVCArray() {
    LoadApi.go(new Runnable() {
      public void run() {
        PolylineOptions options = PolylineOptions.newInstance();
        Polyline o = Polyline.newInstance(options);
        LatLng[] a = new LatLng[3];
        a[0] = LatLng.newInstance(35, 36);
        a[1] = LatLng.newInstance(36, 37);
        a[2] = LatLng.newInstance(38, 39);
        MVCArray<LatLng> left = MVCArray.newInstance(a);
        o.setPath(left);
        // fail and it will throw
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  
}
