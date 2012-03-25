package com.google.gwt.maps.client.service;

import java.util.ArrayList;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.overlays.InfoWindow;
import com.google.gwt.maps.client.overlays.InfoWindowOptions;
import com.google.gwt.maps.client.overlays.MarkerOptions;
import com.google.gwt.maps.client.overlays.PolylineOptions;
import com.google.gwt.maps.client.services.DirectionsRendererOptions;
import com.google.gwt.maps.client.services.DirectionsResult;
import com.google.gwt.maps.client.services.DirectionsRoute;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

public class DirectionsRendererOptionsTest extends GWTTestCase {

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
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
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
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        DirectionsRoute[] a = new DirectionsRoute[3];
        a[0] = DirectionsRoute.newInstance();
        a[1] = DirectionsRoute.newInstance();
        a[2] = DirectionsRoute.newInstance();
        JsArray<DirectionsRoute> ll = ArrayHelper.toJsArray(a);
        DirectionsResult left = DirectionsResult.newInstance();
        left.setRoutes(ll);
        o.setDirections(left);
        DirectionsResult right = o.getDirections();
        assertEquals(left.getRoutes().length(), right.getRoutes().length());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testDraggable() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        boolean left = true;
        o.setDraggable(left);
        boolean right = o.getDraggable();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }

  public void testHideRouteList() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        boolean left = true;
        o.setHideRouteList(left);
        boolean right = o.getHideRouteList();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testInfoWindow() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        InfoWindowOptions options = InfoWindowOptions.newInstance();
        options.setContent("test");
        options.setZindex(5);
        InfoWindow left = InfoWindow.newInstance(options);
        o.setInfoWindow(left);
        InfoWindow right = o.getInfoWindow();
        assertEquals(left.getZindex(), right.getZindex());
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
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        MapOptions options = MapOptions.newInstance();
        MapWidget left = new MapWidget(options);
        left.setSize("500px", "500px");
        RootPanel.get().add(left);
        o.setMap(left);
        MapWidget right = o.getMapWidget();
        assertEquals(left.getCenter().getToString(), right.getCenter().getToString());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testMarkerOptions() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        MarkerOptions left = MarkerOptions.newInstance();
        left.setClickable(true);
        o.setMarkerOptions(left);
        MarkerOptions right = o.getMarkerOptions();
        assertEquals(left.getClickable(), right.getClickable());
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
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        FlowPanel fp = new FlowPanel();
        fp.add(new HTML("test"));
        Element left = fp.getElement();
        o.setPanel(left);
        Element right = o.getPanel();
        assertEquals(left.toString(), right.toString());
        finishTest();
      }
    }, loadLibraries , sensor);
  }

  public void testPolylineOptions() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        PolylineOptions left = PolylineOptions.newInstance();
        left.setClickable(true);
        o.setPolylineOptions(left);
        PolylineOptions right = o.getPolylineOptions();
        assertEquals(left.getClickable(), right.getClickable());
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testPreserveViewport() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        boolean left = true;
        o.setPreserveViewport(left);
        boolean right = o.getPreserveViewport();
        assertEquals(left, right);
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
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        int left = 5;
        o.setRouteIndex(left);
        int right = o.getRouteIndex();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }

  public void testSuppressBicyclingLayer() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        boolean left = true;
        o.setSuppressBicyclingLayer(left);
        boolean right = o.getSuppressBicyclingLayer();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testSuppressInfoWindows() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        boolean left = true;
        o.setSuppressInfoWindows(left);
        boolean right = o.getSuppressInfoWindows();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testMarkers() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        boolean left = true;
        o.setSuppressMarkers(left);
        boolean right = o.getSuppressMarkers();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testPolyline() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PLACES);   
    LoadApi.go(new Runnable() {
      public void run() {
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        boolean left = true;
        o.setSuppressPolylines(left);
        boolean right = o.getSuppressPolylines();
        assertEquals(left, right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
}
