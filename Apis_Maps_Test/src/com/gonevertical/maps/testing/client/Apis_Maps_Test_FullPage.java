package com.gonevertical.maps.testing.client;

import java.util.ArrayList;

import com.gonevertical.maps.testing.client.maps.FullPageMapWidget;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * 
 * Super raw source!
 * 
 */
public class Apis_Maps_Test_FullPage implements EntryPoint {

  public void onModuleLoad() {
    loadMapApi();
  }
 
  private void loadMapApi() {
    boolean sensor = true;
    
    // load all the libs for use
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);
    loadLibraries.add(LoadLibrary.DRAWING);
    loadLibraries.add(LoadLibrary.GEOMETRY);
    loadLibraries.add(LoadLibrary.PANORAMIO);
    loadLibraries.add(LoadLibrary.PLACES);
    
    Runnable onLoad = new Runnable() {
      public void run() {
        draw();
      }
    };
    
    LoadApi.go(onLoad, loadLibraries, sensor);
  }

  
  private void draw() {
    
    FullPageMapWidget wMap = new FullPageMapWidget();
    RootPanel.get().add(wMap);
    
  }
  
}
