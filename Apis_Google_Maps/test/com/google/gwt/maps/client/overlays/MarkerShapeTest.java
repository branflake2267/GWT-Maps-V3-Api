package com.google.gwt.maps.client.overlays;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class MarkerShapeTest extends GWTTestCase {

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
        MarkerShape o = MarkerShape.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testCoords() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerShape o = MarkerShape.newInstance();
        int[] integers = {1,2,3,4,5,6,7,8,9};
        JsArrayInteger left = ArrayHelper.toJsArrayInteger(integers);
        o.setCoordinates(left);
        JsArrayInteger right = o.getCoordinates();
        int two = right.get(2);
        assertEquals(integers[2], two);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testType() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerShape o = MarkerShape.newInstance();
        MarkerShapeType left = MarkerShapeType.RECT;
        o.setType(left);
        MarkerShapeType right = o.getType();
        assertEquals(left.value(), right.value());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
}
