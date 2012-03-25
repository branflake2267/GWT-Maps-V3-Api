package com.google.gwt.maps.client.layers;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class FusionTablesStyleTest extends GWTTestCase {

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
        FusionTablesStyle o = FusionTablesStyle.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testMarkerOptions() {
    LoadApi.go(new Runnable() {
      public void run() {
        FusionTablesStyle o = FusionTablesStyle.newInstance();
        FusionTablesMarkerOptions left = FusionTablesMarkerOptions.newInstance();
        left.setIconName("test123");
        o.setMarkerOptions(left);
        FusionTablesMarkerOptions right = o.getMarkerOptions();
        assertEquals(left.getIconName(), right.getIconName());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testPolygonOptions() {
    LoadApi.go(new Runnable() {
      public void run() {
        FusionTablesStyle o = FusionTablesStyle.newInstance();
        FusionTablesPolygonOptions left = FusionTablesPolygonOptions.newInstance();
        left.setFillColor("red");
        o.setPolygonOptions(left);
        FusionTablesPolygonOptions right = o.getPolygonOptions();
        assertEquals(left.getFillColor(), right.getFillColor());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testPolylineOptions() {
    LoadApi.go(new Runnable() {
      public void run() {
        FusionTablesStyle o = FusionTablesStyle.newInstance();
        FusionTablesPolylineOptions left = FusionTablesPolylineOptions.newInstance();
        left.setStrokeColor("blue");
        o.setPolylineOptions(left);
        FusionTablesPolylineOptions right = o.getPolylineOptions();
        assertEquals(left.getStrokeColor(), right.getStrokeColor());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testWhere() {
    LoadApi.go(new Runnable() {
      public void run() {
        FusionTablesStyle o = FusionTablesStyle.newInstance();
        String left = "where test";
        o.setWhere(left);
        String right = o.getWhere();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
}
