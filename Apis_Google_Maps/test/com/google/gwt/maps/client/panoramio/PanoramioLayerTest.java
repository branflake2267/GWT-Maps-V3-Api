package com.google.gwt.maps.client.panoramio;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Size;
import com.google.gwt.maps.client.events.panoramiomouse.PanoramioMouseMapEvent;
import com.google.gwt.maps.client.events.panoramiomouse.PanoramioMouseMapHandler;
import com.google.gwt.maps.client.panoramiolib.PanoramioFeature;
import com.google.gwt.maps.client.panoramiolib.PanoramioLayer;
import com.google.gwt.maps.client.panoramiolib.PanoramioLayerOptions;
import com.google.gwt.user.client.ui.RootPanel;

public class PanoramioLayerTest extends GWTTestCase {

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
    loadLibraries.add(LoadLibrary.PANORAMIO);   
    LoadApi.go(new Runnable() {
      public void run() {

        MapOptions optionsMap = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(optionsMap);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        PanoramioLayerOptions optionsPano = PanoramioLayerOptions.newInstance();
        optionsPano.setClickable(true);
        optionsPano.setMap(mapWidget);
        optionsPano.setSuppressInfoWindows(false);
        optionsPano.setTag("hawaii");
        optionsPano.setUserId("2597317");
        PanoramioLayer pano = PanoramioLayer.newInstance(optionsPano);
        
        pano.addClickHandler(new PanoramioMouseMapHandler() {
          public void onEvent(PanoramioMouseMapEvent event) {
            PanoramioFeature feature = event.getFeatureDetails();
            String info = event.getInfoWindowHtml();
            LatLng latlng = event.getLatLng();
            Size pixeloffset = event.getPixelOffset();
          }
        });

        finishTest();
      }
    }, loadLibraries , sensor);
  }
 
  public void testMap() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PANORAMIO);   
    LoadApi.go(new Runnable() {
      public void run() {

        MapOptions optionsMap = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(optionsMap);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        PanoramioLayerOptions optionsPano = PanoramioLayerOptions.newInstance();
        optionsPano.setClickable(true);
        optionsPano.setMap(mapWidget);
        optionsPano.setSuppressInfoWindows(false);
        optionsPano.setTag("hawaii");
        optionsPano.setUserId("2597317");
        PanoramioLayer pano = PanoramioLayer.newInstance(optionsPano);
        
        MapWidget right = pano.getMap();
        assertEquals(mapWidget.getCenter().getToString(), right.getCenter().getToString());
        
        LatLng center = LatLng.newInstance(47.19, -121.51);
        mapWidget.setCenter(center );
        pano.setMap(mapWidget);
        
        MapWidget right2 = pano.getMap();
        assertEquals(mapWidget.getCenter().getToString(), right2.getCenter().getToString());
        
        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testTag() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PANORAMIO);   
    LoadApi.go(new Runnable() {
      public void run() {

        MapOptions optionsMap = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(optionsMap);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        PanoramioLayerOptions optionsPano = PanoramioLayerOptions.newInstance();
        optionsPano.setClickable(true);
        optionsPano.setMap(mapWidget);
        optionsPano.setSuppressInfoWindows(false);
        optionsPano.setTag("hawaii");
        optionsPano.setUserId("2597317"); // 2597317?
        PanoramioLayer pano = PanoramioLayer.newInstance(optionsPano);
        
        String tag = pano.getTag();
        assertEquals("hawaii", tag);
        
        pano.setTag("france");
        assertEquals("france", pano.getTag());

        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testUserId() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PANORAMIO);   
    LoadApi.go(new Runnable() {
      public void run() {

        MapOptions optionsMap = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(optionsMap);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        PanoramioLayerOptions optionsPano = PanoramioLayerOptions.newInstance();
        optionsPano.setClickable(true);
        optionsPano.setMap(mapWidget);
        optionsPano.setSuppressInfoWindows(false);
        optionsPano.setTag("hawaii");
        optionsPano.setUserId("2597317"); // 2597317?
        PanoramioLayer pano = PanoramioLayer.newInstance(optionsPano);
        
        String tag = pano.getUserId();
        assertEquals("2597317", tag);
        
        pano.setUserId("4128216");
        assertEquals("hawaii", pano.getTag());

        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  public void testOptions() {
    boolean sensor = false;
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.PANORAMIO);   
    LoadApi.go(new Runnable() {
      public void run() {

        MapOptions optionsMap = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(optionsMap);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        PanoramioLayerOptions optionsPano = PanoramioLayerOptions.newInstance();
        optionsPano.setClickable(true);
        optionsPano.setMap(mapWidget);
        optionsPano.setSuppressInfoWindows(false);
        optionsPano.setTag("hawaii");
        optionsPano.setUserId("2597317"); // 2597317?
        PanoramioLayer pano = PanoramioLayer.newInstance(optionsPano);
        
        pano.setOption(optionsPano);

        finishTest();
      }
    }, loadLibraries , sensor);
  }
  
  
}
