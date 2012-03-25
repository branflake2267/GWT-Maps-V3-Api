package com.google.gwt.maps.client.service;

import java.util.ArrayList;

import com.google.gwt.dom.client.Element;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.services.DirectionsRenderer;
import com.google.gwt.maps.client.services.DirectionsRendererOptions;
import com.google.gwt.maps.client.services.DirectionsResult;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class DirectionsRendererTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;

  public String getModuleName() {
    return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
  }

  public void testWorks() {
    assertEquals(true, true);
  }

  public void testUse() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsRendererOptions options = DirectionsRendererOptions.newInstance();
        DirectionsRenderer o = DirectionsRenderer.newInstance(options);
        finishTest();
      }
    }, loadLibraries , sensor);
  }

  public void testDirections() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsRendererOptions options = DirectionsRendererOptions.newInstance();
        DirectionsRenderer o = DirectionsRenderer.newInstance(options);
        DirectionsResult left = DirectionsResult.newInstance();
        o.setDirections(left);
        DirectionsResult right = o.getDirections();
        assertEquals(left.getRoutes().length(), right.getRoutes().length());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testMap() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsRendererOptions options = DirectionsRendererOptions.newInstance();
        DirectionsRenderer o = DirectionsRenderer.newInstance(options);
        MapOptions opts = MapOptions.newInstance();
        MapWidget left = new MapWidget(opts);
        RootPanel.get().add(left);
        o.setMap(left);
        MapWidget right = o.getMap();
        assertEquals(left.getCenter().getToString(), right.getCenter().getToString());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testPanel() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsRendererOptions options = DirectionsRendererOptions.newInstance();
        DirectionsRenderer o = DirectionsRenderer.newInstance(options);
        FlowPanel fp = new FlowPanel();
        Element left = fp.getElement();
        o.setPanel(left);
        Element right = o.getPanel();
        assertEquals(left.toString(), right.toString());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testRouteIndex() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsRendererOptions options = DirectionsRendererOptions.newInstance();
        DirectionsRenderer o = DirectionsRenderer.newInstance(options);
        int left = 5;
        o.setRouteIndex(left);
        int right = o.getRouteIndex();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  
  
}
