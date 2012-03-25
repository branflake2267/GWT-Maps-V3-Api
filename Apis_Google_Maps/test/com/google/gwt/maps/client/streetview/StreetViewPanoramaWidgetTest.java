package com.google.gwt.maps.client.streetview;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Size;
import com.google.gwt.user.client.ui.RootPanel;

public class StreetViewPanoramaWidgetTest extends GWTTestCase {

 public static final int ASYNC_DELAY_MS = 5000;
  
  public String getModuleName() {
    return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
  }
  
  public void testWorks() {
    assertEquals(true, true);
  }
  
  public void testUse() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng position = LatLng.newInstance(21.271525, -157.822731);
        
        StreetViewPov pov = StreetViewPov.newInstance();
        pov.setHeading(250);
        pov.setZoom(1);
        pov.setPitch(10);
        
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        options.setPosition(position);
        options.setStreeViewPov(pov);
        
        StreetViewPanoramaWidget wStreet = new StreetViewPanoramaWidget(options);
        RootPanel.get().add(wStreet);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testUse2() {
    LoadApi.go(new Runnable() {
      public void run() {
       
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
        RootPanel.get().add(wStreet);
        wStreet.setSize("750px", "500px");
        
        wStreet.setPano("diamondheadhike");
        
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testLinks() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng position = LatLng.newInstance(21.271525, -157.822731);
        
        StreetViewPov pov = StreetViewPov.newInstance();
        pov.setHeading(250);
        pov.setZoom(1);
        pov.setPitch(10);
        
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        options.setPosition(position);
        options.setStreeViewPov(pov);
        
        StreetViewPanoramaWidget wStreet = new StreetViewPanoramaWidget(options);
        RootPanel.get().add(wStreet);
        
        // TODO - trigger something to get this for use
        JsArray<StreetViewLink> links = wStreet.getLinks();
        
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testPano() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng position = LatLng.newInstance(21.271525, -157.822731);
        
        StreetViewPov pov = StreetViewPov.newInstance();
        pov.setHeading(250);
        pov.setZoom(1);
        pov.setPitch(10);
        
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        options.setPosition(position);
        options.setStreeViewPov(pov);
        
        StreetViewPanoramaWidget wStreet = new StreetViewPanoramaWidget(options);
        RootPanel.get().add(wStreet);
        
        String pano = wStreet.getPano();
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testPosition() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng position = LatLng.newInstance(21.271525, -157.822731);
        
        StreetViewPov pov = StreetViewPov.newInstance();
        pov.setHeading(250);
        pov.setZoom(1);
        pov.setPitch(10);
        
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        options.setPosition(position);
        options.setStreeViewPov(pov);
        
        StreetViewPanoramaWidget wStreet = new StreetViewPanoramaWidget(options);
        RootPanel.get().add(wStreet);
        
        wStreet.setPosition(position);
        
        LatLng panoPos = wStreet.getPosition();
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testPov() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng position = LatLng.newInstance(21.271525, -157.822731);
        
        StreetViewPov pov = StreetViewPov.newInstance();
        pov.setHeading(250);
        pov.setZoom(1);
        pov.setPitch(10);
        
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        options.setPosition(position);
        options.setStreeViewPov(pov);
        
        StreetViewPanoramaWidget wStreet = new StreetViewPanoramaWidget(options);
        RootPanel.get().add(wStreet);
        
        wStreet.setPov(pov);
        
        StreetViewPov panoPov = wStreet.getPov();
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testVisible() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng position = LatLng.newInstance(21.271525, -157.822731);
        
        StreetViewPov pov = StreetViewPov.newInstance();
        pov.setHeading(250);
        pov.setZoom(1);
        pov.setPitch(10);
        
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        options.setPosition(position);
        options.setStreeViewPov(pov);
        
        StreetViewPanoramaWidget wStreet = new StreetViewPanoramaWidget(options);
        RootPanel.get().add(wStreet);
        
        boolean vis = wStreet.getVisible();
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testRegister() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng position = LatLng.newInstance(21.271525, -157.822731);
        
        StreetViewPov pov = StreetViewPov.newInstance();
        pov.setHeading(250);
        pov.setZoom(1);
        pov.setPitch(10);
        
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        options.setPosition(position);
        options.setStreeViewPov(pov);
        
        StreetViewPanoramaWidget wStreet = new StreetViewPanoramaWidget(options);
        RootPanel.get().add(wStreet);
        
        wStreet.registerPanoProvider(new StreetViewPanoramaProvider() {
          public StreetViewPanoramaData getPanoData(String pano, int zoom, int tileX, int tileY) {
            StreetViewPanoramaData svp = StreetViewPanoramaData.newInstance();
            StreetViewLocation location = StreetViewLocation.newInstance();
//            svp.setStreetViewLocation(location);
            return null;
          }
        });
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
}
