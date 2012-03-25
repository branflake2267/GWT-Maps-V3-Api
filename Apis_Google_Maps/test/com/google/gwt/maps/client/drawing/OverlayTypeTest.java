package com.google.gwt.maps.client.drawing;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.drawinglib.OverlayType;

public class OverlayTypeTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;

  public String getModuleName() {
    return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
  }

  public void testWorks() {
    assertEquals(true, true);
  }

  public void testReverseEngineer() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.DRAWING); 
    LoadApi.go(new Runnable() {
      public void run() {
        reverseEngineer1();
        finishTest();
      }
    }, loadLibraries , sensor);
  }

  protected void reverseEngineer1() {
    OverlayType[] a = OverlayType.values();
    for (int i=0; i < a.length; i++) {
      String type = a[i].value();
      reverseEngineer(type);
    }
  }

  private native void reverseEngineer(String type) /*-{
    var s = "$wnd.google.maps.drawing.OverlayType." + type;
    var v = eval(s);
    alert("google.maps.drawing.OverlayType." + type + " == " + v);
  }-*/;

  public void testUse() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.DRAWING); 
    LoadApi.go(new Runnable() {
      public void run() {
        OverlayType o = OverlayType.CIRCLE;
        String right = "circle";
        assertEquals(o.value(), right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testUse2() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.DRAWING); 
    LoadApi.go(new Runnable() {
      public void run() {
        OverlayType o = OverlayType.MARKER;
        String right = "marker";
        assertEquals(o.value(), right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testUse3() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.DRAWING); 
    LoadApi.go(new Runnable() {
      public void run() {
        OverlayType o = OverlayType.POLYGON;
        String right = "polygon";
        assertEquals(o.value(), right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testUse4() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.DRAWING); 
    LoadApi.go(new Runnable() {
      public void run() {
        OverlayType o = OverlayType.POLYLINE;
        String right = "polyline";
        assertEquals(o.value(), right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testUse5() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.DRAWING); 
    LoadApi.go(new Runnable() {
      public void run() {
        OverlayType o = OverlayType.RECTANGLE;
        String right = "rectangle";
        assertEquals(o.value(), right);
        finishTest();
      }
    }, loadLibraries , sensor);
  }
}
