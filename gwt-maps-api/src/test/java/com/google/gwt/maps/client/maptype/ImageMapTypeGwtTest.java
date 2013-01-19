package com.google.gwt.maps.client.maptype;

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

import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Point;
import com.google.gwt.maps.client.base.Size;
import com.google.gwt.maps.client.maptypes.ImageMapType;
import com.google.gwt.maps.client.maptypes.ImageMapTypeOptions;
import com.google.gwt.maps.client.maptypes.TileUrlCallBack;
import com.google.gwt.user.client.ui.RootPanel;

public class ImageMapTypeGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
        finishTest();
      }
    });
  }

  @SuppressWarnings("unused")
  public void testUse2() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
        ImageMapType o = ImageMapType.newInstance(options);
        finishTest();
      }
    });

  }

  @SuppressWarnings("unused")
  public void testAlt() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
        String left = "test";
        options.setAlt(left);
        String right = options.getAlt();
        assertEquals(left, right);
        ImageMapType o = ImageMapType.newInstance(options);
        finishTest();
      }
    });

  }

  @SuppressWarnings("unused")
  public void testGetUrl() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
        options.setTileUrl(new TileUrlCallBack() {
          @Override
          public String getTileUrl(Point point, int zoomLevel) {
            return "http://mt3.google.com/mapstt?zoom=" + zoomLevel + "&x=" + point.getX() + "&y=" + point.getY()
                + "&client=api";
          }
        });
        ImageMapType o = ImageMapType.newInstance(options);

        // TODO how can I trigger?

        // TODO will this work?????

        finishTest();
      }
    });

  }

  @SuppressWarnings("unused")
  public void testMaxZoom() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
        int left = 5;
        options.setMaxZoom(left);
        int right = options.getMaxZoom();
        assertEquals(left, right);
        ImageMapType o = ImageMapType.newInstance(options);
        finishTest();
      }
    });

  }

  @SuppressWarnings("unused")
  public void testMinZoom() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
        int left = 5;
        options.setMinZoom(left);
        int right = options.getMinZoom();
        assertEquals(left, right);
        ImageMapType o = ImageMapType.newInstance(options);
        finishTest();
      }
    });

  }

  @SuppressWarnings("unused")
  public void testName() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
        String left = "test";
        options.setName(left);
        String right = options.getName();
        assertEquals(left, right);
        ImageMapType o = ImageMapType.newInstance(options);
        finishTest();
      }
    });

  }

  public void testOpacityOptions() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
        double left = .51;
        options.setOpacity(left);
        double right = options.getOpacity();
        assertEquals(left, right);
        ImageMapType.newInstance(options);

        finishTest();
      }
    });
  }

  public void testOpacity() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
        double expected = .51d;
        options.setOpacity(expected);
        ImageMapType o = ImageMapType.newInstance(options);

        // test
        double actual = o.getOpacity();
        assertEquals(expected, actual, 1e-3);

        // change and confirm changed
        double expected2 = 1.0d;
        o.setOpacity(expected2);
        double actual2 = o.getOpacity();
        assertEquals(expected2, actual2, 1e-3);

        finishTest();
      }
    });
  }

  @SuppressWarnings("unused")
  public void testTileSize() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
        Size left = Size.newInstance(103d, 102d);
        options.setTileSize(left);
        Size right = options.getTileSize();
        assertEquals(left.getToString(), right.getToString());
        ImageMapType o = ImageMapType.newInstance(options);
        finishTest();
      }
    });
  }

  // example adapted from
  // https://developers.google.com/maps/documentation/javascript/maptypes
  public void testFullTest() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        String customTypeName = "Moon";

        ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
        options.setAlt("To the moon!");
        options.setMaxZoom(9);
        options.setMinZoom(0);
        options.setName(customTypeName);
        options.setTileSize(Size.newInstance(256d, 256d));
        options.setTileUrl(new TileUrlCallBack() {

          @Override
          public String getTileUrl(Point point, int zoomLevel) {
            Point normalizedCoord = getNormalizedCoord(point, zoomLevel);
            if (normalizedCoord == null) {
              return null;
            }

            double bound = Math.pow(2, zoomLevel);
            return "http://mw1.google.com/mw-planetary/lunar/lunarmaps_v1/clem_bw" + "/" + zoomLevel + "/"
                + normalizedCoord.getX() + "/" + (bound - normalizedCoord.getY() - 1) + ".jpg";
          }
        });

        // testing that we can add it, but not that it runs, not thrown
        // here
        ImageMapType moonType = ImageMapType.newInstance(options);

        // add to a map
        MapOptions opts = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(opts);
        mapWidget.setSize("500px", "500px");
        mapWidget.setCenter(LatLng.newInstance(0d, 0d));
        mapWidget.setZoom(1);

        // custom type, the moon
        mapWidget.getMapTypeRegistry().set(customTypeName, moonType);
        mapWidget.setMapTypeId(customTypeName);

        RootPanel.get().add(mapWidget);

        finishTest();
      }
    });
  }

  // example adapted from
  // https://developers.google.com/maps/documentation/javascript/maptypes
  // TODO event is not thrown, figure out why
  /* public void testTilesLoadedEvent() { asyncLibTest(new Runnable() {
   * 
   * @Override public void run() { String customTypeName = "Moon";
   * 
   * ImageMapTypeOptions options = ImageMapTypeOptions.newInstance(); options.setAlt("To the moon!");
   * options.setMaxZoom(9); options.setMinZoom(0); options.setName(customTypeName);
   * options.setTileSize(Size.newInstance(256d, 256d)); options.setTileUrl(new TileUrlCallBack() {
   * 
   * @Override public String getTileUrl(Point point, int zoomLevel) { Point normalizedCoord = getNormalizedCoord(point,
   * zoomLevel); if (normalizedCoord == null) { return null; }
   * 
   * double bound = Math.pow(2, zoomLevel); return "http://mw1.google.com/mw-planetary/lunar/lunarmaps_v1/clem_bw" + "/"
   * + zoomLevel + "/" + normalizedCoord.getX() + "/" + (bound - normalizedCoord.getY() - 1) + ".jpg"; } });
   * 
   * // testing that we can add it, but not that it runs, not thrown // here ImageMapType moonType =
   * ImageMapType.newInstance(options); moonType.addClickHandler(new TilesLoadedMapHandler() {
   * 
   * @Override public void onEvent(TilesLoadedMapEvent event) { // should fire when these tiles load finishTest(); }
   * 
   * });
   * 
   * // add to a map MapOptions opts = MapOptions.newInstance(); MapWidget mapWidget = new MapWidget(opts);
   * mapWidget.setSize("500px", "500px"); mapWidget.setCenter(LatLng.newInstance(0d, 0d)); mapWidget.setZoom(1);
   * 
   * // custom type, the moon mapWidget.getMapTypeRegistry().set(customTypeName, moonType);
   * mapWidget.setMapTypeId(customTypeName);
   * 
   * RootPanel.get().add(mapWidget); } }); } */

  // Normalizes the coords that tiles repeat across the x axis (horizontally)
  // like the standard Google map tiles.
  private Point getNormalizedCoord(Point coord, int zoom) {
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
