package com.google.gwt.maps.testing.client.maps;

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

import com.google.gwt.core.client.GWT;
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
 * <br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/streetview.html}
 */
public class StreetViewCustomMapWidget extends Composite {

  private final VerticalPanel pWidget;

  public StreetViewCustomMapWidget() {
    pWidget = new VerticalPanel();
    initWidget(pWidget);

    draw();
  }

  private void draw() {

    pWidget.clear();

    pWidget.add(new HTML("<br>Custom Street View - (For a better demo, I need to re-cut out tiles... later)"
        + " <a href=\"http://gonevertical-hr.appspot.com/#pano_view~id:110010\" "
        + "target=\"_blank\">I used tiles from my site here</a>"));

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
    options.setVisible(true);

    options.setPanoProvider(new StreetViewPanoramaProvider() {
      @Override
      public StreetViewPanoramaData getPanoData(String pano, int zoom, int tileX, int tileY) {

        StreetViewLocation location = StreetViewLocation.newInstance();
        location.setDescription("Diamond Head Lookout");
        location.setLatLng(position);
        location.setPano("diamondheadhike");

        Size tileSize = Size.newInstance(300d, 300d);
        Size worldSize = Size.newInstance(1708d, 400d);

        StreetViewTileData tiles = StreetViewTileData.newInstance();
        tiles.setCenterHeading(0);
        tiles.setTileSize(tileSize);
        tiles.setWorldSize(worldSize);
        tiles.getTileUrl(pano, zoom, tileX, tileY, new TileUrlHandler() {
          @Override
          public String getTileUrl(String pano, int zoom, int tileX, int tileY) {
            zoom = 0; // TODO make a better tiled pano for testing
            String url = "http://gonevertical-hr.appspot.com/serve?pano=99330&z=" + zoom + "&y=" + tileY + "&x="
                + tileX;
            GWT.log("Got StreetView Tile from URL: " + url);
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
