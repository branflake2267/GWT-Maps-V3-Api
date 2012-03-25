package com.gonevertical.maps.testing.client.maps;

import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.events.MouseEvent;
import com.google.gwt.maps.client.events.click.ClickMapEvent;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.maps.client.events.tiles.TilesLoadedMapEvent;
import com.google.gwt.maps.client.events.tiles.TilesLoadedMapHandler;
import com.google.gwt.maps.client.overlays.InfoWindow;
import com.google.gwt.maps.client.overlays.InfoWindowOptions;
import com.google.gwt.maps.client.overlays.Marker;
import com.google.gwt.maps.client.overlays.MarkerOptions;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * 
 * {@link http://code.google.com/apis/maps/documentation/javascript/layers.html#FusionTables}
 */
public class InfoWindowMapWidget extends Composite {

  private VerticalPanel pWidget;

  private MapWidget mapWidget;

  public InfoWindowMapWidget() {
    pWidget = new VerticalPanel();
    initWidget(pWidget);

    draw();
  }

  private void draw() {

    pWidget.clear();

    pWidget.add(new HTML("<br>Maps with Info Windows - click on marker"));

    drawMap();
    
    drawInfoWindowOnMapCenter();
    
    drawMarker1();
    
  }
  
  private void drawInfoWindowOnMapCenter() {
    HTML html = new HTML("Center: " + mapWidget.getCenter().getToString());
    
    InfoWindowOptions options = InfoWindowOptions.newInstance();
    options.setContent(html);
    options.setPosition(mapWidget.getCenter());
    
    InfoWindow iw = InfoWindow.newInstance(options);
    iw.open(mapWidget);
  }

  private void drawMarker1() {
    LatLng center = LatLng.newInstance(47.8, -121.4);
    MarkerOptions options = MarkerOptions.newInstance();
    options.setPosition(center);
    options.setTitle("Hello World");
    
    final Marker marker = Marker.newInstance(options);
    marker.setMap(mapWidget);
    
    marker.addClickHandler(new ClickMapHandler() {
      public void onEvent(ClickMapEvent event) {
        drawInfoWindow(marker, event.getMouseEvent());
      }
    });
  }
  
  protected void drawInfoWindow(final Marker marker, MouseEvent mouseEvent) {
    if (marker == null || mouseEvent == null) {
      return;
    }
    
    HTML html = new HTML("Why did you click on me? <br/> You clicked on: " + mouseEvent.getLatLng().getToString());

    InfoWindowOptions options = InfoWindowOptions.newInstance();
    options.setContent(html);
    
    InfoWindow iw = InfoWindow.newInstance(options);
    iw.open(mapWidget, marker);


  }

  private void drawMap() {
    LatLng center = LatLng.newInstance(49.496675,-102.65625);
    MapOptions opts = MapOptions.newInstance();
    opts.setZoom(4);
    opts.setCenter(center);
    opts.setMapTypeId(MapTypeId.HYBRID);
    
    mapWidget = new MapWidget(opts);
    pWidget.add(mapWidget);
    mapWidget.setSize("750px", "500px");
    
    mapWidget.addClickHandler(new ClickMapHandler() {
      public void onEvent(ClickMapEvent event) {
        // TODO fix the event getting, getting ....
        System.out.println("clicked on latlng=" + event.getMouseEvent().getLatLng());
      }
    });
    
    mapWidget.addTilesLoadedHandler(new TilesLoadedMapHandler() {
      public void onEvent(TilesLoadedMapEvent event) {
        
      }
    });
  }
  
}
