package com.google.gwt.maps.client.maptype;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.maptypes.MapTypeStyleElementType;

public class MapTypeStyeElementTypeTest extends GWTTestCase {

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
        MapTypeStyleElementType type = MapTypeStyleElementType.ALL;
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum1() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleElementType type = MapTypeStyleElementType.ALL;
        String left = "all";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
    
  public void testEnum2() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleElementType type = MapTypeStyleElementType.GEOMETRY;
        String left = "geometry";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum3() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleElementType type = MapTypeStyleElementType.LABELS;
        String left = "labels";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
}
