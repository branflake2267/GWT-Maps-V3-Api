package com.google.gwt.maps.client.drawing;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.drawinglib.DrawingManager;
import com.google.gwt.maps.client.drawinglib.DrawingManagerOptions;
import com.google.gwt.maps.client.drawinglib.OverlayType;
import com.google.gwt.user.client.ui.RootPanel;

public class DrawingManagerOptionsTest extends GWTTestCase {

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
    loadLibraries.add(LoadLibrary.DRAWING); 
    LoadApi.go(new Runnable() {
      public void run() {
        DrawingManagerOptions options = DrawingManagerOptions.newInstance();
        DrawingManager o = DrawingManager.newInstance(options); 
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testDrawingMode() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.DRAWING); 
    LoadApi.go(new Runnable() {
      public void run() {
        DrawingManagerOptions options = DrawingManagerOptions.newInstance();
        OverlayType left = OverlayType.CIRCLE;
        options.setDrawingMode(left);
        DrawingManager o = DrawingManager.newInstance(options); 
        OverlayType right = o.getDrawingMode();
        assertEquals(left, right);
        o.setDrawingMode(OverlayType.MARKER);
        right = o.getDrawingMode();
        assertEquals(OverlayType.MARKER, right);
        
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testMap() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.DRAWING); 
    LoadApi.go(new Runnable() {
      public void run() {
        MapOptions optionsMap = MapOptions.newInstance();
        MapWidget left = new MapWidget(optionsMap);
        RootPanel.get().add(left);
        left.setSize("500px", "500px");
        
        DrawingManagerOptions options = DrawingManagerOptions.newInstance();
        options.setDrawingMode(OverlayType.CIRCLE);
        DrawingManager o = DrawingManager.newInstance(options); 
        o.setMap(left);
        
        MapWidget right = o.getMap();
        assertEquals(left.getCenter().getToString(), right.getCenter().getToString());
        
        finishTest();
      }
    }, loadLibraries , sensor);
  }
}
