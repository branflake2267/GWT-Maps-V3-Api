package com.google.gwt.maps.client.overlays;

import com.google.gwt.dom.client.Element;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;

public class MapPanesTest extends GWTTestCase {

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
        MapPanes o = MapPanes.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testFloatPane() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapPanes o = MapPanes.newInstance();
        FlowPanel fp = new FlowPanel();
        fp.add(new HTML("test123"));
        Element left = fp.getElement();
        o.setFloatPane(left);
        Element right = o.getFloatPane();
        assertEquals(left.getInnerHTML(), right.getInnerHTML());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testFloatShadow() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapPanes o = MapPanes.newInstance();
        FlowPanel fp = new FlowPanel();
        fp.add(new HTML("test123"));
        Element left = fp.getElement();
        o.setFloatShadow(left);
        Element right = o.getFloatShadow();
        assertEquals(left.getInnerHTML(), right.getInnerHTML());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testMapPane() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapPanes o = MapPanes.newInstance();
        FlowPanel fp = new FlowPanel();
        fp.add(new HTML("test123"));
        Element left = fp.getElement();
        o.setMapPane(left);
        Element right = o.getMapPane();
        assertEquals(left.getInnerHTML(), right.getInnerHTML());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testOverlayImage() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapPanes o = MapPanes.newInstance();
        FlowPanel fp = new FlowPanel();
        fp.add(new HTML("test123"));
        Element left = fp.getElement();
        o.setOverlayImage(left);
        Element right = o.getOverlayImage();
        assertEquals(left.getInnerHTML(), right.getInnerHTML());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testOverlayLayer() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapPanes o = MapPanes.newInstance();
        FlowPanel fp = new FlowPanel();
        fp.add(new HTML("test123"));
        Element left = fp.getElement();
        o.setOverlayLayer(left);
        Element right = o.getOverlayLayer();
        assertEquals(left.getInnerHTML(), right.getInnerHTML());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testOverlayMouseTarget() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapPanes o = MapPanes.newInstance();
        FlowPanel fp = new FlowPanel();
        fp.add(new HTML("test123"));
        Element left = fp.getElement();
        o.setOverlayMouseTarget(left);
        Element right = o.getOverlayMouseTarget();
        assertEquals(left.getInnerHTML(), right.getInnerHTML());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  

  public void testOverlayShadow() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapPanes o = MapPanes.newInstance();
        FlowPanel fp = new FlowPanel();
        fp.add(new HTML("test123"));
        Element left = fp.getElement();
        o.setOverlayShadow(left);
        Element right = o.getOverlayShadow();
        assertEquals(left.getInnerHTML(), right.getInnerHTML());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
}
