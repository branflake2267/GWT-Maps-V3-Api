package com.gonevertical.maps.testing.client;

import java.util.ArrayList;

import com.gonevertical.maps.testing.client.maps.AutocompletePlacesMapWidget;
import com.gonevertical.maps.testing.client.maps.BasicMapWidget;
import com.gonevertical.maps.testing.client.maps.ControlsMapWidget;
import com.gonevertical.maps.testing.client.maps.CustomControlsMapWidget;
import com.gonevertical.maps.testing.client.maps.DirectionsServiceMapWidget;
import com.gonevertical.maps.testing.client.maps.DrawingMapWidget;
import com.gonevertical.maps.testing.client.maps.ElevationMapWidget;
import com.gonevertical.maps.testing.client.maps.FusionTablesMapWidget;
import com.gonevertical.maps.testing.client.maps.InfoWindowMapWidget;
import com.gonevertical.maps.testing.client.maps.KmlMapWidget;
import com.gonevertical.maps.testing.client.maps.PanoramioMapWidget;
import com.gonevertical.maps.testing.client.maps.StreetViewCustomMapWidget;
import com.gonevertical.maps.testing.client.maps.StreetViewMapWidget;
import com.gonevertical.maps.testing.client.maps.StreetViewSideBySideMapWidget;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.controls.ControlPosition;
import com.google.gwt.maps.client.controls.MapTypeControlOptions;
import com.google.gwt.maps.client.events.MouseEvent;
import com.google.gwt.maps.client.events.click.ClickMapEvent;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.maps.client.overlays.Marker;
import com.google.gwt.maps.client.overlays.MarkerOptions;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * 
 * Super raw source!
 * 
 */
public class Apis_Maps_Test implements EntryPoint {

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
    
    HTML html = new HTML("<a href=\"Apis_Maps_Test_FullPage.html\">See 100% Map Demo</a><br/><br/>");
    RootPanel.get().add(html);

    drawElevation();
    
    drawDirections();
    
    drawCustomControlsMap();
    
    drawInfoWindowMap();
    
    drawStreetViewSideBySide();
    
    drawStreetViewCustom();
    
    drawStreetView();
    
    drawAutocomplete();
    
    drawDrawingMap();
    
    drawBasicMap();
    
    drawFusionMap();
    
    drawKmlMap();
    
    drawMapWcontrols();
    
    drawPanoramioMap();
    
  }
  
  private void drawElevation() {
    ElevationMapWidget wMap = new ElevationMapWidget();
    RootPanel.get().add(wMap);
  }

  private void drawDirections() {
    DirectionsServiceMapWidget wMap = new DirectionsServiceMapWidget();
    RootPanel.get().add(wMap);
  }
  
  private void drawCustomControlsMap() {
    CustomControlsMapWidget wMap = new CustomControlsMapWidget();
    RootPanel.get().add(wMap);
  }

  private void drawInfoWindowMap() {
    InfoWindowMapWidget wMap = new InfoWindowMapWidget();
    RootPanel.get().add(wMap);
  }
  
  private void drawStreetViewSideBySide() {
    StreetViewSideBySideMapWidget wStreet = new StreetViewSideBySideMapWidget();
    RootPanel.get().add(wStreet);
  }

  private void drawStreetViewCustom() {
    StreetViewCustomMapWidget wStreet = new StreetViewCustomMapWidget();
    RootPanel.get().add(wStreet);
  }
  
  private void drawStreetView() {
    StreetViewMapWidget wStreet = new StreetViewMapWidget();
    RootPanel.get().add(wStreet);
  }
  
  private void drawDrawingMap() {
    DrawingMapWidget wMap = new DrawingMapWidget();
    RootPanel.get().add(wMap);
  }

  private void drawBasicMap() {
    BasicMapWidget wMap = new BasicMapWidget();
    RootPanel.get().add(wMap);
  }
 
  private void drawFusionMap() {
    FusionTablesMapWidget wMap = new FusionTablesMapWidget();
    RootPanel.get().add(wMap);
  }
  
  private void drawKmlMap() {
    KmlMapWidget wMap = new KmlMapWidget();
    RootPanel.get().add(wMap);
  }
  
  private void drawMapWcontrols() {
    ControlsMapWidget wMap = new ControlsMapWidget();
    RootPanel.get().add(wMap);
  }
  
  private void drawPanoramioMap() {
    PanoramioMapWidget wMap = new PanoramioMapWidget();
    RootPanel.get().add(wMap);
  }
  
  private void drawAutocomplete() {
    AutocompletePlacesMapWidget wMap = new AutocompletePlacesMapWidget();
    RootPanel.get().add(wMap);
  }
  

  private void drawMap() {
    MapOptions options = MapOptions.newInstance();
    MapWidget wMap = new MapWidget(options);
    RootPanel.get().add(wMap);
    
    wMap.addClickHandler(new ClickMapHandler() {
      public void onEvent(ClickMapEvent event) {
        MouseEvent me = event.getMouseEvent();
        LatLng ll = me.getLatLng();
        Window.alert("clicked on map: " + ll.getToString());
      }
    });

    LatLng position = LatLng.newInstance(19.54, -155.43);
    MarkerOptions optionsMarker = MarkerOptions.newInstance();
    optionsMarker.setPosition(position);
    Marker marker = Marker.newInstance(optionsMarker);
    marker.setMap(wMap);
    
    wMap.setSize("500px", "500px");
    wMap.addStyleName("test1");
  }
 
 
  
  private void drawTestMap() {
    
    MapTypeControlOptions mapTypeControlOptions = MapTypeControlOptions.newInstance();
    mapTypeControlOptions.setPosition(ControlPosition.BOTTOM_RIGHT);
    mapTypeControlOptions.setMapTypeIds(MapTypeId.values());
    
    MapOptions options = MapOptions.newInstance();
    options.setBackgroundColor("#FFD300"); // works
    options.setDisableDefaultUi(false);
    options.setDisableDoubleClickZoom(true); // works
    options.setDraggable(true); // true
    options.setDraggingCursor(true);
    options.setHeading(45);
    options.setKeyboardShortcuts(true); // works
    options.setMapTypeControl(true); 
    
    options.setMapTypeControlOptions(mapTypeControlOptions);
    
    FlowPanel fp = new FlowPanel();
    RootPanel.get().add(fp);
    fp.setSize("500px", "500px");
    fp.addStyleName("test2");
    testMap(fp.getElement(), options);
  }
  
  private static native JavaScriptObject testMap(Element element, MapOptions options) /*-{
    
    //var myOptions = {
    //  zoom: 6,
    //  center: myLatLng,
    //  mapTypeId: $wnd.google.maps.MapTypeId[mapType]
    //};
    
    var map = new $wnd.google.maps.Map(element, options);
    
    return map;
  }-*/;
  
  
  private void test1() {
    
    
    System.out.println("loaded");
  }
  

  private final native int test2(String type) /*-{
    //alert(type);
    var test = eval("$wnd.google.maps.ControlPosition." + type);
    return test;
  }-*/;
  
}
