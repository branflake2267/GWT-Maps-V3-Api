package com.gonevertical.maps.testing.client.maps;

import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Size;
import com.google.gwt.maps.client.streetview.StreetViewLocation;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaData;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaOptions;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaProvider;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaWidget;
import com.google.gwt.maps.client.streetview.StreetViewPov;
import com.google.gwt.maps.client.streetview.StreetViewTileData;
import com.google.gwt.maps.client.streetview.TileUrlHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * 
 * {@link http://code.google.com/apis/maps/documentation/javascript/streetview.html}
 */
public class StreetViewCustomMapWidget extends Composite {

  private VerticalPanel pWidget;

  private MapWidget mapWidget;

  public StreetViewCustomMapWidget() {
    pWidget = new VerticalPanel();
    initWidget(pWidget);

    draw();
  }

  private void draw() {

    pWidget.clear();

    pWidget.add(new HTML("<br>Custom Street View - (For a better demo, I need to re-cut out tiles... later) <a href=\"http://gonevertical-hr.appspot.com/#pano_view~id:110010\" target=\"_blank\">I used tiles from my site here</a>"));

    drawStreeView();
   
  }
  
  private void drawStreeView() {
   
    final LatLng position = LatLng.newInstance(21.259758694819777, -157.811758518219);
    
    StreetViewPov pov = StreetViewPov.newInstance();
    pov.setHeading(0);
    pov.setZoom(0);
    pov.setPitch(0);
    
    StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
    options.setPosition(position);
    options.setStreeViewPov(pov);
    options.setVisibile(true);
    
    options.setPanoProvider(new StreetViewPanoramaProvider() {
      public StreetViewPanoramaData getPanoData(String pano, int zoom, int tileX, int tileY) {
        
        StreetViewLocation location = StreetViewLocation.newInstance();
        location.setDescription("Diamond Head Lookout");
        location.setLatLng(position);
        location.setPano("diamondheadhike");
        
        Size tileSize = Size.newInstance(300, 300);
        Size worldSize = Size.newInstance(1708, 400);
        
        StreetViewTileData tiles = StreetViewTileData.newInstance();
        tiles.setCenterHeading(0);
        tiles.setTileSize(tileSize);
        tiles.setWorldSize(worldSize);
        tiles.getTileUrl(pano, zoom, tileX, tileY, new TileUrlHandler() {
          public String getTileUrl(String pano, int zoom, int tileX, int tileY) {
            zoom = 0; // TODO make a better tiled pano for testing
            String url = "http://gonevertical-hr.appspot.com/serve?pano=99330&z=" + zoom + "&y=" + tileY + "&x=" + tileX;
            System.out.println(url);
            return url;
          }
        });
        
        StreetViewPanoramaData data = StreetViewPanoramaData.newInstance();
        data.setCopyright("Brandon Donnelson");
        data.setLocation(location);
        data.setTileData(tiles);
        
        return data;
      }
    });
    
    StreetViewPanoramaWidget wStreet = new StreetViewPanoramaWidget(options);
    pWidget.add(wStreet);
    wStreet.setSize("750px", "500px");
    
    wStreet.setPano("diamondheadhike");
    
  }

  
}
