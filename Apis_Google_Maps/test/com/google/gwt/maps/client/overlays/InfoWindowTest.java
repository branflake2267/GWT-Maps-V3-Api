package com.google.gwt.maps.client.overlays;

import com.google.gwt.dom.client.Element;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class InfoWindowTest extends GWTTestCase {

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
        InfoWindowOptions options = InfoWindowOptions.newInstance();
        InfoWindow o = InfoWindow.newInstance(options);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testClose() {
    LoadApi.go(new Runnable() {
      public void run() {
        InfoWindowOptions options = InfoWindowOptions.newInstance();
        InfoWindow o = InfoWindow.newInstance(options);
        o.close();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testContentString() {
    LoadApi.go(new Runnable() {
      public void run() {
        InfoWindowOptions options = InfoWindowOptions.newInstance();
        InfoWindow o = InfoWindow.newInstance(options);
        String left = "test123";
        o.setContent(left);
        String right = o.getContent_String();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testContentElement() {
    LoadApi.go(new Runnable() {
      public void run() {
        InfoWindowOptions options = InfoWindowOptions.newInstance();
        InfoWindow o = InfoWindow.newInstance(options);
        FlowPanel fp = new FlowPanel();
        Element left = fp.getElement();
        o.setContent(left);
        Element right = o.getContent_Node();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testPosition() {
    LoadApi.go(new Runnable() {
      public void run() {
        InfoWindowOptions options = InfoWindowOptions.newInstance();
        InfoWindow o = InfoWindow.newInstance(options);
        LatLng left = LatLng.newInstance(35, 38);
        o.setPosition(left);
        LatLng right = o.getPosition();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testZindex() {
    LoadApi.go(new Runnable() {
      public void run() {
        InfoWindowOptions options = InfoWindowOptions.newInstance();
        InfoWindow o = InfoWindow.newInstance(options);
        int left = 2;
        o.setZindex(left);
        int right = o.getZindex();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testOpenMapwidget() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapOptions mopts = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(mopts);
        mapWidget.setSize("500px", "500px");
        RootPanel.get().add(mapWidget);
       
        LatLng center = mapWidget.getCenter();
        
        InfoWindowOptions options = InfoWindowOptions.newInstance();
        options.setContent("test123");
        options.setPosition(center);
       
        InfoWindow o = InfoWindow.newInstance(options);
        
        o.open(mapWidget);
       
        // TODO add to render testing
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  // TODO open mapwidget anchor

  // TODO open streetviewpanoramawidget

  // TODO open streetviewpanoramawidget anchor



}
