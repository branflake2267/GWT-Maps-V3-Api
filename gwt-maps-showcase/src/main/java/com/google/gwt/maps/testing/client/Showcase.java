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

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.testing.client.maps.AdvancedLayersWidget;
import com.google.gwt.maps.testing.client.maps.AutocompletePlacesMapWidget;
import com.google.gwt.maps.testing.client.maps.BasicMapWidget;
import com.google.gwt.maps.testing.client.maps.ControlsMapWidget;
import com.google.gwt.maps.testing.client.maps.CustomControlsMapWidget;
import com.google.gwt.maps.testing.client.maps.DirectionsServiceMapWidget;
import com.google.gwt.maps.testing.client.maps.DrawingMapWidget;
import com.google.gwt.maps.testing.client.maps.ElevationMapWidget;
import com.google.gwt.maps.testing.client.maps.FusionTablesMapWidget;
import com.google.gwt.maps.testing.client.maps.HeatMapLayerWidget;
import com.google.gwt.maps.testing.client.maps.ImageMapTypeWidget;
import com.google.gwt.maps.testing.client.maps.InfoWindowMapWidget;
import com.google.gwt.maps.testing.client.maps.KmlMapWidget;
import com.google.gwt.maps.testing.client.maps.LanguageMapWidget;
import com.google.gwt.maps.testing.client.maps.MultipleKmlMapWidget;
import com.google.gwt.maps.testing.client.maps.OpenStreetMapLayerWidget;
import com.google.gwt.maps.testing.client.maps.OverlayViewMapWidget;
import com.google.gwt.maps.testing.client.maps.PanoramioMapWidget;
import com.google.gwt.maps.testing.client.maps.PlaceSearchMapWidget;
import com.google.gwt.maps.testing.client.maps.PolylineMapWidget;
import com.google.gwt.maps.testing.client.maps.StreetViewCustomMapWidget;
import com.google.gwt.maps.testing.client.maps.StreetViewMapWidget;
import com.google.gwt.maps.testing.client.maps.StreetViewSideBySideMapWidget;
import com.google.gwt.maps.testing.client.maps.StyledMapWidget;
import com.google.gwt.maps.testing.client.maps.TransitDirectionsServiceMapWidget;
import com.google.gwt.maps.testing.client.maps.WeatherLayersWidget;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class Showcase implements EntryPoint {

  private final String mapsContainer = "maps";

  @Override
  public void onModuleLoad() {
    loadMapApi();
  }

  private void loadMapApi() {
    boolean sensor = true;

    // load all the libs for use in the maps
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);
    loadLibraries.add(LoadLibrary.DRAWING);
    loadLibraries.add(LoadLibrary.GEOMETRY);
    loadLibraries.add(LoadLibrary.PANORAMIO);
    loadLibraries.add(LoadLibrary.PLACES);
    loadLibraries.add(LoadLibrary.WEATHER);
    loadLibraries.add(LoadLibrary.VISUALIZATION);

    Runnable onLoad = new Runnable() {
      @Override
      public void run() {
        draw();
      }
    };

    LoadApi.go(onLoad, loadLibraries, sensor);
  }

  /**
   * See the map widgets for different map configurations
   */
  private void draw() {
    HTML html = new HTML("<a href='fullpage.html'>See FullScreen Map Demo</a><br/><br/>");

    RootPanel.get(mapsContainer).add(html);

    drawHeatMap();

    drawImageMapType();

    drawWeatherMap();

    drawStyledMap();

    drawDrawingMap();

    drawOpenStreetMapLayerMap();

    drawPolylineMap();

    drawDirections();

    drawTransitDirections();

    drawElevation();

    drawAdvancedLayers();

    drawCustomControlsMap();

    drawInfoWindowMap();

    drawStreetViewSideBySide();

    drawStreetViewCustom();

    drawStreetView();

    drawAutocomplete();

    drawBasicMap();

    drawFusionMap();

    drawKmlMap();

    drawMapWcontrols();

    drawPanoramioMap();

    drawPlaceSearchRequestMap();

    drawMultipleKmlMap();

    drawOverlayViewMap();
    
    // TODO put on its own page someday
    //drawLanguageMap();
  }

  /**
   * Add the widget to the demos
   * 
   * @param widget map
   */
  private void addMapWidget(Widget widget) {
    RootPanel.get(mapsContainer).add(widget);
  }

  private void drawHeatMap() {
    HeatMapLayerWidget wMap = new HeatMapLayerWidget();
    addMapWidget(wMap);
  }

  private void drawImageMapType() {
    ImageMapTypeWidget wMap = new ImageMapTypeWidget();
    addMapWidget(wMap);
  }

  private void drawWeatherMap() {
    WeatherLayersWidget wMap = new WeatherLayersWidget();
    addMapWidget(wMap);
  }

  private void drawStyledMap() {
    StyledMapWidget wMap = new StyledMapWidget();
    addMapWidget(wMap);
  }

  private void drawElevation() {
    ElevationMapWidget wMap = new ElevationMapWidget();
    addMapWidget(wMap);
  }

  private void drawAdvancedLayers() {
    AdvancedLayersWidget wMap = new AdvancedLayersWidget();
    addMapWidget(wMap);
  }

  private void drawDirections() {
    DirectionsServiceMapWidget wMap = new DirectionsServiceMapWidget();
    addMapWidget(wMap);
  }

  private void drawTransitDirections() {
    TransitDirectionsServiceMapWidget wMap = new TransitDirectionsServiceMapWidget();
    addMapWidget(wMap);
  }

  private void drawCustomControlsMap() {
    CustomControlsMapWidget wMap = new CustomControlsMapWidget();
    addMapWidget(wMap);
  }

  private void drawInfoWindowMap() {
    InfoWindowMapWidget wMap = new InfoWindowMapWidget();
    addMapWidget(wMap);
  }

  private void drawStreetViewSideBySide() {
    StreetViewSideBySideMapWidget wStreet = new StreetViewSideBySideMapWidget();
    addMapWidget(wStreet);
  }

  private void drawStreetViewCustom() {
    StreetViewCustomMapWidget wStreet = new StreetViewCustomMapWidget();
    addMapWidget(wStreet);
  }

  private void drawStreetView() {
    StreetViewMapWidget wStreet = new StreetViewMapWidget();
    addMapWidget(wStreet);
  }

  private void drawDrawingMap() {
    DrawingMapWidget wMap = new DrawingMapWidget();
    addMapWidget(wMap);
  }

  private void drawPolylineMap() {
    PolylineMapWidget plMap = new PolylineMapWidget();
    addMapWidget(plMap);
  }

  private void drawBasicMap() {
    BasicMapWidget wMap = new BasicMapWidget();
    addMapWidget(wMap);
  }

  private void drawFusionMap() {
    FusionTablesMapWidget wMap = new FusionTablesMapWidget();
    addMapWidget(wMap);
  }

  private void drawKmlMap() {
    KmlMapWidget wMap = new KmlMapWidget();
    addMapWidget(wMap);
  }

  private void drawMapWcontrols() {
    ControlsMapWidget wMap = new ControlsMapWidget();
    addMapWidget(wMap);
  }

  private void drawPanoramioMap() {
    PanoramioMapWidget wMap = new PanoramioMapWidget();
    addMapWidget(wMap);
  }

  private void drawAutocomplete() {
    AutocompletePlacesMapWidget wMap = new AutocompletePlacesMapWidget();
    addMapWidget(wMap);
  }

  private void drawPlaceSearchRequestMap() {
    PlaceSearchMapWidget wMap = new PlaceSearchMapWidget();
    addMapWidget(wMap);
  }

  private void drawMultipleKmlMap() {
    MultipleKmlMapWidget wMap = new MultipleKmlMapWidget();
    addMapWidget(wMap);
  }

  private void drawOverlayViewMap() {
    OverlayViewMapWidget wMap = new OverlayViewMapWidget();
    addMapWidget(wMap);
  }

  private void drawOpenStreetMapLayerMap() {
    OpenStreetMapLayerWidget wMap = new OpenStreetMapLayerWidget();
    addMapWidget(wMap);
  }
  
  private void drawLanguageMap() {
    LanguageMapWidget wMap = new LanguageMapWidget();
    addMapWidget(wMap);
  }
  
}
