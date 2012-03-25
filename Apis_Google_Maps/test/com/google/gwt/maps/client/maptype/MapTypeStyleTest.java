package com.google.gwt.maps.client.maptype;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.controls.MapTypeStyle;
import com.google.gwt.maps.client.maptypes.MapTypeStyleElementType;
import com.google.gwt.maps.client.maptypes.MapTypeStyleFeatureType;
import com.google.gwt.maps.client.maptypes.MapTypeStyler;

public class MapTypeStyleTest extends GWTTestCase {

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
        MapTypeStyle options = MapTypeStyle.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testElementType() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyle options = MapTypeStyle.newInstance();
        MapTypeStyleElementType left = MapTypeStyleElementType.GEOMETRY;
        options.setElementType(left);
        MapTypeStyleElementType right = options.getElementType();
        assertEquals(left.value(), right.value());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testElementTypes() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyle options = MapTypeStyle.newInstance();
        MapTypeStyleElementType[] values = MapTypeStyleElementType.values();
        for (int i=0; i < values.length; i++) {
          MapTypeStyleElementType left = values[i];
          options.setElementType(left);
          MapTypeStyleElementType right = options.getElementType();
          assertEquals(left, right);
        }
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testFeatureType() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyle options = MapTypeStyle.newInstance();
        MapTypeStyleFeatureType left = MapTypeStyleFeatureType.ADMINISTRATIVE__LOCALITY;
        options.setFeatureType(left);
        MapTypeStyleFeatureType right = options.getFeatureType();
        assertEquals(left.value(), right.value());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testFeatureTypes() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyle options = MapTypeStyle.newInstance();
        MapTypeStyleFeatureType[] values = MapTypeStyleFeatureType.values();
        for (int i=0; i < values.length; i++) {
          MapTypeStyleFeatureType left = values[i];
          options.setFeatureType(left);
          MapTypeStyleFeatureType right = options.getFeatureType();
          assertEquals(left, right);
        }
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testStylers() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyle options = MapTypeStyle.newInstance();
        MapTypeStyler[] left = new MapTypeStyler[2];
        left[0] = MapTypeStyler.newInstance();
        left[0].setGamma(.01f);
        left[0].setHue("#ffff");
        left[0].setInvertLightness(false);
        left[0].setLightness(1);
        left[0].setSaturation(5);
        left[0].setVisibility("on");
        left[1] = MapTypeStyler.newInstance();
        left[1].setGamma(.01f);
        left[1].setHue("#ffff");
        left[1].setInvertLightness(false);
        left[1].setLightness(1);
        left[1].setSaturation(5);
        left[1].setVisibility("on");
        options.setStylers(left);
        MapTypeStyler[] right = options.getStylers();
        assertEquals(left[0].getGamma(), right[0].getGamma());
        assertEquals(left[0].getHue(), right[0].getHue());
        assertEquals(left[0].getInvertLightness(), right[0].getInvertLightness());
        assertEquals(left[0].getLightness(), right[0].getLightness());
        assertEquals(left[0].getSaturation(), right[0].getSaturation());
        assertEquals(left[0].getVisibility(), right[0].getVisibility());
        assertEquals(left[1].getGamma(), right[0].getGamma());
        assertEquals(left[1].getHue(), right[0].getHue());
        assertEquals(left[1].getInvertLightness(), right[0].getInvertLightness());
        assertEquals(left[1].getLightness(), right[0].getLightness());
        assertEquals(left[1].getSaturation(), right[0].getSaturation());
        assertEquals(left[1].getVisibility(), right[0].getVisibility());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  
  
}
