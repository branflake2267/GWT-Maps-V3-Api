package com.google.gwt.maps.testing.client;

/*
 * #%L
 * GWT Maps API V3 - Showcase
 * %%
 * Copyright (C) 2011 - 2012 GWT Maps API V3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.util.ArrayList;

import com.google.gwt.maps.testing.client.maps.FullPageMapWidget;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * 
 * Super raw source!
 * 
 */
public class ShowcaseFullPage implements EntryPoint {

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
