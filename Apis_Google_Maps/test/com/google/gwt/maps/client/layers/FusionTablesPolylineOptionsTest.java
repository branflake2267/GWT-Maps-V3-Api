package com.google.gwt.maps.client.layers;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class FusionTablesPolylineOptionsTest extends GWTTestCase {

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
        FusionTablesPolylineOptions o = FusionTablesPolylineOptions.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  } 
  
  public void testStrokeColor() {
    LoadApi.go(new Runnable() {
      public void run() {
        FusionTablesPolylineOptions o = FusionTablesPolylineOptions.newInstance();
        String left = "test";
        o.setStrokeColor(left);
        String right = o.getStrokeColor();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testSrokeOpacity() {
    LoadApi.go(new Runnable() {
      public void run() {
        FusionTablesPolylineOptions o = FusionTablesPolylineOptions.newInstance();
        double left = .50;
        o.setStrokeOpacity(left);
        double right = o.getStrokeOpacity();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testSrokeWeight() {
    LoadApi.go(new Runnable() {
      public void run() {
        FusionTablesPolylineOptions o = FusionTablesPolylineOptions.newInstance();
        int left = 2;
        o.setStrokeWeight(left);
        int right = o.getStrokeWeight();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
}
