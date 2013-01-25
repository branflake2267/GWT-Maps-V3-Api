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

import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Point;
import com.google.gwt.maps.client.base.Size;
import com.google.gwt.maps.client.controls.MapTypeControlOptions;
import com.google.gwt.maps.client.maptypes.ImageMapType;
import com.google.gwt.maps.client.maptypes.ImageMapTypeOptions;
import com.google.gwt.maps.client.maptypes.TileUrlCallBack;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/layers#ImageMapType"
 * >ImageMapType API Doc</a>
 */
public class ImageMapTypeWidget extends Composite {

  private final static String MARTIAN_NAME = "Mars";
  private final static String LUNAR_NAME = "Moon";

  private final VerticalPanel pWidget;
  private MapWidget mapWidget;

  public ImageMapTypeWidget() {
    pWidget = new VerticalPanel();
    initWidget(pWidget);

    draw();
  }

  private void draw() {

    pWidget.clear();
    pWidget.add(new HTML("<br>Custom ImageMapType (i.e. the Moon, Mars, Earth) Example"));

    drawMap();
  }

  private void drawMap() {

    // make custom maps
    ImageMapType moonType = getMoonMapType();
    ImageMapType marsType = getMarsMapType();

    // draw map
    MapTypeControlOptions controlOpts = MapTypeControlOptions.newInstance();
    //TODO How it make it label as "Earth" not "Satellite" without redefining that standard map type?
    controlOpts.setMapTypeIds(new String[] { LUNAR_NAME, MARTIAN_NAME, MapTypeId.SATELLITE.toString() });

    MapOptions opts = MapOptions.newInstance();
    opts.setCenter(LatLng.newInstance(-12d, -70d));
    opts.setZoom(7);
    opts.setMapTypeControlOptions(controlOpts);
    opts.setStreetViewControl(false);

    mapWidget = new MapWidget(opts);
    mapWidget.setSize("750px", "500px");

    // add to map
    mapWidget.getMapTypeRegistry().set(MARTIAN_NAME, marsType);
    mapWidget.getMapTypeRegistry().set(LUNAR_NAME, moonType);
    mapWidget.setMapTypeId(MARTIAN_NAME);

    pWidget.add(mapWidget);
  }

  private ImageMapType getMoonMapType() {
    ImageMapTypeOptions opts = ImageMapTypeOptions.newInstance();
    opts.setMaxZoom(9);
    opts.setMinZoom(0);
    opts.setName(LUNAR_NAME);
    opts.setTileSize(Size.newInstance(256d, 256d));
    opts.setTileUrl(new TileUrlCallBack() {

      @Override
      public String getTileUrl(Point point, int zoomLevel) {
        Point normalizedCoord = getNormalizedCoord(point, zoomLevel);
        if (normalizedCoord == null) {
          return null;
        }

        double bound = Math.pow(2, zoomLevel);
        return "http://mw1.google.com/mw-planetary/lunar/lunarmaps_v1/clem_bw" + "/" + zoomLevel + "/"
            + (int) normalizedCoord.getX() + "/" + (int) (bound - normalizedCoord.getY() - 1) + ".jpg";
      }
    });

    return ImageMapType.newInstance(opts);
  }

  private ImageMapType getMarsMapType() {

    ImageMapTypeOptions opts = ImageMapTypeOptions.newInstance();
    opts.setTileSize(Size.newInstance(256d, 256d));
    opts.setMinZoom(0);
    opts.setMaxZoom(12);
    opts.setName(MARTIAN_NAME);
    opts.setTileUrl(new TileUrlCallBack() {

      @Override
      public String getTileUrl(Point point, int zoomLevel) {

        double bound = Math.pow(2, zoomLevel);
        double x = point.getX();
        double y = point.getY();

        // don't repeat across y-axis (vertically)
        if (y < 0 || y >= bound) {
          return null;
        }

        // repeat across x-axis
        if (x < 0 || x >= bound) {
          x = (x % bound + bound) % bound;
        }

        String qstr = "t";
        for (int z = 0; z < zoomLevel; z++) {
          bound = bound / 2;
          if (y < bound) {
            if (x < bound) {
              qstr += "q";
            } else {
              qstr += "r";
              x -= bound;
            }
          } else {
            if (x < bound) {
              qstr += "t";
              y -= bound;
            } else {
              qstr += "s";
              x -= bound;
              y -= bound;
            }
          }
        }
        return "http://mw1.google.com/mw-planetary/mars/infrared/" + qstr + ".jpg";
      }
    });

    return ImageMapType.newInstance(opts);
  }

  // Normalizes the coords that tiles repeat across the x axis (horizontally)
  // like the standard Google map tiles.
  public final static Point getNormalizedCoord(Point coord, int zoom) {
    double y = coord.getY();
    double x = coord.getX();

    // tile range in one direction range is dependent on zoom level
    // 0 = 1 tile, 1 = 2 tiles, 2 = 4 tiles, 3 = 8 tiles, etc
    double tileRange = 1 << zoom;

    // don't repeat across y-axis (vertically)
    if (y < 0 || y >= tileRange) {
      return null;
    }

    // repeat across x-axis
    if (x < 0 || x >= tileRange) {
      x = (x % tileRange + tileRange) % tileRange;
    }

    return Point.newInstance(x, y);
  }
}