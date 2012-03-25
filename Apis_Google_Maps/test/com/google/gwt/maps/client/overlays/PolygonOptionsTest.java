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

public class PolygonOptionsTest extends GWTTestCase {

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
        PolygonOptions o = PolygonOptions.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testClickable() {
    LoadApi.go(new Runnable() {
      public void run() {
        PolygonOptions o = PolygonOptions.newInstance();
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
        PolygonOptions o = PolygonOptions.newInstance();
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
        PolygonOptions o = PolygonOptions.newInstance();
        double left = .50d;
        o.setFillOpacity(left);
        double right = o.getFillOpacity();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testGeodesic() {
    LoadApi.go(new Runnable() {
      public void run() {
        PolygonOptions o = PolygonOptions.newInstance();
        boolean left = true;
        o.setGeodesic(left);
        boolean right = o.getGeodesic();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testMapWidget() {
    LoadApi.go(new Runnable() {
      public void run() {
        PolygonOptions o = PolygonOptions.newInstance();
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

  /**
   * this thows some red? not sure why. It runs ok by it self? Types?
   */
  public void testPaths_JSArray() {
    LoadApi.go(new Runnable() {
      public void run() {
        PolygonOptions o = PolygonOptions.newInstance();
        LatLng[] a = new LatLng[3];
        a[0] = LatLng.newInstance(35, 36);
        a[1] = LatLng.newInstance(36, 37);
        a[2] = LatLng.newInstance(38, 39);
        JsArray<LatLng> left = ArrayHelper.toJsArray(a);
        o.setPaths(left);
        JsArray<LatLng> right = o.getPaths_JsArray();
        assertEquals(left.get(0).getToString(), right.get(0).getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  /**
   * this thows some red? not sure why. It runs ok by it self? Types?
   */
  public void testPathss_JSArray() {
    LoadApi.go(new Runnable() {
      public void run() {
        PolygonOptions o = PolygonOptions.newInstance();
        LatLng[] a = new LatLng[3];
        a[0] = LatLng.newInstance(35, 36);
        a[1] = LatLng.newInstance(36, 37);
        a[2] = LatLng.newInstance(38, 39);
        JsArray<LatLng> left1 = ArrayHelper.toJsArray(a);

        LatLng[] a2 = new LatLng[3];
        a2[0] = LatLng.newInstance(25, 26);
        a2[1] = LatLng.newInstance(26, 27);
        a2[2] = LatLng.newInstance(28, 29);
        JsArray<LatLng> left2 = ArrayHelper.toJsArray(a2);

        JsArray<JsArray<LatLng>> left = JsArray.createArray().cast();
        left.push(left1);
        left.push(left2);

        o.setPathss(left);
        JsArray<JsArray<LatLng>> right = o.getPathss_JsArray();
        assertEquals(left.get(0).get(0).getToString(), right.get(0).get(0).getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }


  public void testPaths_MVCArray() {
    LoadApi.go(new Runnable() {
      public void run() {
        PolygonOptions o = PolygonOptions.newInstance();
        LatLng[] a = new LatLng[3];
        a[0] = LatLng.newInstance(35, 36);
        a[1] = LatLng.newInstance(36, 37);
        a[2] = LatLng.newInstance(38, 39);
        MVCArray<LatLng> left = MVCArray.newInstance(a);
        o.setPaths(left);
        MVCArray<LatLng> right = o.getPaths_MVCArray();
        assertEquals(left.get(0).getToString(), right.get(0).getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testPathss_MVCArray() {
    LoadApi.go(new Runnable() {
      public void run() {
        PolygonOptions o = PolygonOptions.newInstance();
        LatLng[] a = new LatLng[3];
        a[0] = LatLng.newInstance(35, 36);
        a[1] = LatLng.newInstance(36, 37);
        a[2] = LatLng.newInstance(38, 39);
        MVCArray<LatLng> left1 = MVCArray.newInstance(a);

        LatLng[] a2 = new LatLng[3];
        a2[0] = LatLng.newInstance(25, 26);
        a2[1] = LatLng.newInstance(26, 27);
        a2[2] = LatLng.newInstance(28, 29);
        MVCArray<LatLng> left2 = MVCArray.newInstance(a2);

        MVCArray<MVCArray<LatLng>> left = MVCArray.newInstance();
        left.push(left1);
        left.push(left2);

        o.setPathss(left);
        MVCArray<MVCArray<LatLng>> right = o.getPathss_MVCArray();
        
        int ileft = left.getLength();
        int iright = right.getLength();
        
        assertEquals(ileft, iright);
        
        // TODO more testcases?
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testStrokeColor() {
    LoadApi.go(new Runnable() {
      public void run() {
        PolygonOptions o = PolygonOptions.newInstance();
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
        PolygonOptions o = PolygonOptions.newInstance();
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
        PolygonOptions o = PolygonOptions.newInstance();
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
        PolygonOptions o = PolygonOptions.newInstance();
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
