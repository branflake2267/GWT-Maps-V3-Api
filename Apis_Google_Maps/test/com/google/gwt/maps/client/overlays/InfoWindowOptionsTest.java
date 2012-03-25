package com.google.gwt.maps.client.overlays;

import com.google.gwt.dom.client.Element;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Size;
import com.google.gwt.user.client.ui.FlowPanel;

public class InfoWindowOptionsTest extends GWTTestCase {

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
        InfoWindowOptions o = InfoWindowOptions.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testContent_String() {
    LoadApi.go(new Runnable() {
      public void run() {
        InfoWindowOptions o = InfoWindowOptions.newInstance();
        String left = "test123";
        o.setContent(left);
        String right = o.getContent_String();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testContent_Element() {
    LoadApi.go(new Runnable() {
      public void run() {
        InfoWindowOptions o = InfoWindowOptions.newInstance();
        FlowPanel fp = new FlowPanel();
        Element left = fp.getElement();
        o.setContent(left);
        Element right = o.getContent_Element();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testDisableAutoPan() {
    LoadApi.go(new Runnable() {
      public void run() {
        InfoWindowOptions o = InfoWindowOptions.newInstance();
        boolean left = true;
        o.setDisableAutoPan(left);
        boolean right = o.getDisableAutoPan();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testMaxWidth() {
    LoadApi.go(new Runnable() {
      public void run() {
        InfoWindowOptions o = InfoWindowOptions.newInstance();
        int left = 100;
        o.setMaxWidth(left);
        int right = o.getMaxWidth();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testPixelOffset() {
    LoadApi.go(new Runnable() {
      public void run() {
        InfoWindowOptions o = InfoWindowOptions.newInstance();
        Size left = Size.newInstance(102, 203);
        o.setPixelOffet(left);
        Size right = o.getPixelOffset();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testPosition() {
    LoadApi.go(new Runnable() {
      public void run() {
        InfoWindowOptions o = InfoWindowOptions.newInstance();
        LatLng left = LatLng.newInstance(35, 38);
        o.setPosition(left);
        LatLng right = o.getPosition();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testZindex() {
    LoadApi.go(new Runnable() {
      public void run() {
        InfoWindowOptions o = InfoWindowOptions.newInstance();
        int left = 100;
        o.setZindex(left);
        int right = o.getZindex();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
}
