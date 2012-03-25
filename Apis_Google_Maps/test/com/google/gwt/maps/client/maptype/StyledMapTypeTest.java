package com.google.gwt.maps.client.maptype;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.controls.MapTypeStyle;
import com.google.gwt.maps.client.maptypes.StyledMapType;
import com.google.gwt.maps.client.maptypes.StyledMapTypeOptions;

public class StyledMapTypeTest extends GWTTestCase {

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
        StyledMapTypeOptions options = StyledMapTypeOptions.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testUse2() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyle[] array = new MapTypeStyle[3];
        array[0] = MapTypeStyle.newInstance();
        array[1] = MapTypeStyle.newInstance();
        array[2] = MapTypeStyle.newInstance();
        JsArray<MapTypeStyle> styles = ArrayHelper.toJsArray(array);
        StyledMapTypeOptions options = StyledMapTypeOptions.newInstance();
        StyledMapType o = StyledMapType.newInstance(styles, options);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testAlt() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyle[] array = new MapTypeStyle[3];
        array[0] = MapTypeStyle.newInstance();
        array[1] = MapTypeStyle.newInstance();
        array[2] = MapTypeStyle.newInstance();
        JsArray<MapTypeStyle> styles = ArrayHelper.toJsArray(array);
        StyledMapTypeOptions options = StyledMapTypeOptions.newInstance();
        String left = "test";
        options.setAlt(left);
        String right = options.getAlt();
        assertEquals(left, right);
        StyledMapType o = StyledMapType.newInstance(styles, options);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testMaxZoom() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyle[] array = new MapTypeStyle[3];
        array[0] = MapTypeStyle.newInstance();
        array[1] = MapTypeStyle.newInstance();
        array[2] = MapTypeStyle.newInstance();
        JsArray<MapTypeStyle> styles = ArrayHelper.toJsArray(array);
        StyledMapTypeOptions options = StyledMapTypeOptions.newInstance();
        int left = 5;
        options.setMaxZoom(left);
        int right = options.getMaxZoom();
        assertEquals(left, right);
        StyledMapType o = StyledMapType.newInstance(styles, options);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testMinZoom() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyle[] array = new MapTypeStyle[3];
        array[0] = MapTypeStyle.newInstance();
        array[1] = MapTypeStyle.newInstance();
        array[2] = MapTypeStyle.newInstance();
        JsArray<MapTypeStyle> styles = ArrayHelper.toJsArray(array);
        StyledMapTypeOptions options = StyledMapTypeOptions.newInstance();
        int left = 5;
        options.setMinZoom(left);
        int right = options.getMinZoom();
        assertEquals(left, right);
        StyledMapType o = StyledMapType.newInstance(styles, options);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testName() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyle[] array = new MapTypeStyle[3];
        array[0] = MapTypeStyle.newInstance();
        array[1] = MapTypeStyle.newInstance();
        array[2] = MapTypeStyle.newInstance();
        JsArray<MapTypeStyle> styles = ArrayHelper.toJsArray(array);
        StyledMapTypeOptions options = StyledMapTypeOptions.newInstance();
        String left = "test";
        options.setName(left);
        String right = options.getName();
        assertEquals(left, right);
        StyledMapType o = StyledMapType.newInstance(styles, options);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
}
