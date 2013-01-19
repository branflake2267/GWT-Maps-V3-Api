package com.google.gwt.maps.client.streetview;

/*
 * #%L
 * GWT Maps API V3 - Core API
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

import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.user.client.ui.RootPanel;

public class StreetViewPanoramaWidgetGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
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
    });

  }

  // TODO complex test that is being ignored because it never returns. Brandon
  // should investigate
  /* public void testUse2() { asyncLibTest(new Runnable() { public void run() {
   * 
   * final LatLng position = LatLng.newInstance(21.259758694819777, -157.811758518219);
   * 
   * StreetViewPov pov = StreetViewPov.newInstance(); pov.setHeading(0); pov.setZoom(0); pov.setPitch(0);
   * 
   * StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance(); options.setPosition(position);
   * options.setStreeViewPov(pov); options.setVisibile(true);
   * 
   * options.setPanoProvider(new StreetViewPanoramaProvider() { public StreetViewPanoramaData getPanoData(String pano,
   * int zoom, int tileX, int tileY) {
   * 
   * StreetViewLocation location = StreetViewLocation.newInstance(); location.setDescription("Diamond Head Lookout");
   * location.setLatLng(position); location.setPano("diamondheadhike");
   * 
   * Size tileSize = Size.newInstance(300, 300); Size worldSize = Size.newInstance(1708, 400);
   * 
   * StreetViewTileData tiles = StreetViewTileData.newInstance(); tiles.setCenterHeading(0);
   * tiles.setTileSize(tileSize); tiles.setWorldSize(worldSize); tiles.getTileUrl(pano, zoom, tileX, tileY, new
   * TileUrlHandler() { public String getTileUrl(String pano, int zoom, int tileX, int tileY) { zoom = 0; // TODO make a
   * better tiled pano for testing String url = "http://gonevertical-hr.appspot.com/serve?pano=99330&z=" + zoom + "&y="
   * + tileY + "&x=" + tileX; System.out.println(url); return url; } });
   * 
   * StreetViewPanoramaData data = StreetViewPanoramaData.newInstance(); data.setCopyright("Brandon Donnelson");
   * data.setLocation(location); data.setTileData(tiles);
   * 
   * return data; } });
   * 
   * StreetViewPanoramaWidget wStreet = new StreetViewPanoramaWidget(options); RootPanel.get().add(wStreet);
   * wStreet.setSize("750px", "500px");
   * 
   * wStreet.setPano("diamondheadhike");
   * 
   * } });
   * 
   * } */

  @SuppressWarnings("unused")
  public void testLinks() {
    asyncLibTest(new Runnable() {
      @Override
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
    });

  }

  @SuppressWarnings("unused")
  public void testPano() {
    asyncLibTest(new Runnable() {
      @Override
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
    });

  }

  @SuppressWarnings("unused")
  public void testPosition() {
    asyncLibTest(new Runnable() {
      @Override
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
    });

  }

  @SuppressWarnings("unused")
  public void testPov() {
    asyncLibTest(new Runnable() {
      @Override
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
    });

  }

  @SuppressWarnings("unused")
  public void testVisible() {
    asyncLibTest(new Runnable() {
      @Override
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
    });

  }

  @SuppressWarnings("unused")
  public void testRegister() {
    asyncLibTest(new Runnable() {
      @Override
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
          @Override
          public StreetViewPanoramaData getPanoData(String pano, int zoom, int tileX, int tileY) {
            StreetViewPanoramaData svp = StreetViewPanoramaData.newInstance();
            StreetViewLocation location = StreetViewLocation.newInstance();
            // svp.setStreetViewLocation(location);
            return null;
          }
        });

        finishTest();
      }
    });

  }

}
