package com.google.gwt.maps.client.overlays;

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
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Point;
import com.google.gwt.maps.client.overlays.overlayhandlers.OverlayViewMethods;
import com.google.gwt.maps.client.overlays.overlayhandlers.OverlayViewOnAddHandler;
import com.google.gwt.maps.client.overlays.overlayhandlers.OverlayViewOnDrawHandler;
import com.google.gwt.maps.client.overlays.overlayhandlers.OverlayViewOnRemoveHandler;
import com.google.gwt.user.client.ui.RootPanel;

public class MapCanvasProjectionGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return LoadLibrary.values();
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng center = LatLng.newInstance(40.740, -74.18);
        MapOptions options = MapOptions.newInstance();
        options.setZoom(13);
        options.setCenter(center);
        options.setMapTypeId(MapTypeId.HYBRID);

        MapWidget mapWidget = new MapWidget(options);
        mapWidget.setSize("500px", "500px");
        RootPanel.get().add(mapWidget);

        OverlayViewOnDrawHandler onDrawHandler = new OverlayViewOnDrawHandler() {
          @Override
          public void onDraw(OverlayViewMethods methods) {
            MapCanvasProjection o = methods.getProjection();
            finishTest();
          }
        };

        OverlayViewOnAddHandler onAddHandler = new OverlayViewOnAddHandler() {
          @Override
          public void onAdd(OverlayViewMethods methods) {
          }
        };

        OverlayViewOnRemoveHandler onRemoveHnadler = new OverlayViewOnRemoveHandler() {
          @Override
          public void onRemove(OverlayViewMethods methods) {
          }
        };

        OverlayView overlay = OverlayView.newInstance(mapWidget, onDrawHandler, onAddHandler, onRemoveHnadler);
      }
    });
  }

  public void testfromContainerPixelToLatLng() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng center = LatLng.newInstance(40.740, -74.18);
        MapOptions options = MapOptions.newInstance();
        options.setZoom(13);
        options.setCenter(center);
        options.setMapTypeId(MapTypeId.HYBRID);

        MapWidget mapWidget = new MapWidget(options);
        mapWidget.setSize("500px", "500px");
        RootPanel.get().add(mapWidget);

        OverlayViewOnDrawHandler onDrawHandler = new OverlayViewOnDrawHandler() {
          @Override
          public void onDraw(OverlayViewMethods methods) {
            MapCanvasProjection o = methods.getProjection();

            Point pixel = Point.newInstance(100d, 110d);
            LatLng actual = o.fromContainerPixelToLatLng(pixel);

            LatLng expected = LatLng.newInstance(40.75820649610606, -74.20574920654298);

            assertLatLngEquals(expected, actual);
            finishTest();
          }
        };

        OverlayViewOnAddHandler onAddHandler = new OverlayViewOnAddHandler() {
          @Override
          public void onAdd(OverlayViewMethods methods) {
            finishTest();
          }
        };

        OverlayViewOnRemoveHandler onRemoveHnadler = new OverlayViewOnRemoveHandler() {
          @Override
          public void onRemove(OverlayViewMethods methods) {
            finishTest();
          }
        };

        OverlayView overlay = OverlayView.newInstance(mapWidget, onDrawHandler, onAddHandler, onRemoveHnadler);
      }
    });
  }

  public void testfromContainerPixelToLatLng_noWrap_true() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng center = LatLng.newInstance(40.740, -74.18);
        MapOptions options = MapOptions.newInstance();
        options.setZoom(13);
        options.setCenter(center);
        options.setMapTypeId(MapTypeId.HYBRID);

        MapWidget mapWidget = new MapWidget(options);
        mapWidget.setSize("500px", "500px");
        RootPanel.get().add(mapWidget);

        OverlayViewOnDrawHandler onDrawHandler = new OverlayViewOnDrawHandler() {
          @Override
          public void onDraw(OverlayViewMethods methods) {
            MapCanvasProjection o = methods.getProjection();

            Point pixel = Point.newInstance(100d, 110d);
            LatLng actual = o.fromContainerPixelToLatLng(pixel, true);

            LatLng expected = LatLng.newInstance(40.75820649610606, -74.20574920654298);

            assertLatLngEquals(expected, actual);
            finishTest();
          }
        };

        OverlayViewOnAddHandler onAddHandler = new OverlayViewOnAddHandler() {
          @Override
          public void onAdd(OverlayViewMethods methods) {
            finishTest();
          }
        };

        OverlayViewOnRemoveHandler onRemoveHnadler = new OverlayViewOnRemoveHandler() {
          @Override
          public void onRemove(OverlayViewMethods methods) {
            finishTest();
          }
        };

        OverlayView overlay = OverlayView.newInstance(mapWidget, onDrawHandler, onAddHandler, onRemoveHnadler);
      }
    });
  }

  public void testfromContainerPixelToLatLng_noWrap_false() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng center = LatLng.newInstance(40.740, -74.18);
        MapOptions options = MapOptions.newInstance();
        options.setZoom(13);
        options.setCenter(center);
        options.setMapTypeId(MapTypeId.HYBRID);

        MapWidget mapWidget = new MapWidget(options);
        mapWidget.setSize("500px", "500px");
        RootPanel.get().add(mapWidget);

        OverlayViewOnDrawHandler onDrawHandler = new OverlayViewOnDrawHandler() {
          @Override
          public void onDraw(OverlayViewMethods methods) {
            MapCanvasProjection o = methods.getProjection();

            Point pixel = Point.newInstance(100d, 110d);
            LatLng actual = o.fromContainerPixelToLatLng(pixel, false);

            LatLng expected = LatLng.newInstance(40.75820649610606, -74.20574920654298);

            assertLatLngEquals(expected, actual);
            finishTest();
          }
        };

        OverlayViewOnAddHandler onAddHandler = new OverlayViewOnAddHandler() {
          @Override
          public void onAdd(OverlayViewMethods methods) {
            finishTest();
          }
        };

        OverlayViewOnRemoveHandler onRemoveHnadler = new OverlayViewOnRemoveHandler() {
          @Override
          public void onRemove(OverlayViewMethods methods) {
            finishTest();
          }
        };

        OverlayView overlay = OverlayView.newInstance(mapWidget, onDrawHandler, onAddHandler, onRemoveHnadler);
      }
    });
  }

  public void testfromDivPixelToLatLng() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng center = LatLng.newInstance(40.740, -74.18);
        MapOptions options = MapOptions.newInstance();
        options.setZoom(13);
        options.setCenter(center);
        options.setMapTypeId(MapTypeId.HYBRID);

        MapWidget mapWidget = new MapWidget(options);
        mapWidget.setSize("500px", "500px");
        RootPanel.get().add(mapWidget);

        OverlayViewOnDrawHandler onDrawHandler = new OverlayViewOnDrawHandler() {
          @Override
          public void onDraw(OverlayViewMethods methods) {
            MapCanvasProjection o = methods.getProjection();

            Point pixel = Point.newInstance(100d, 110d);
            LatLng actual = o.fromDivPixelToLatLng(pixel);

            LatLng expected = LatLng.newInstance(-74.22147d, 131.625d);

            assertLatLngEquals(expected, actual);
            finishTest();
          }
        };

        OverlayViewOnAddHandler onAddHandler = new OverlayViewOnAddHandler() {
          @Override
          public void onAdd(OverlayViewMethods methods) {
            finishTest();
          }
        };

        OverlayViewOnRemoveHandler onRemoveHnadler = new OverlayViewOnRemoveHandler() {
          @Override
          public void onRemove(OverlayViewMethods methods) {
            finishTest();
          }
        };

        OverlayView overlay = OverlayView.newInstance(mapWidget, onDrawHandler, onAddHandler, onRemoveHnadler);
      }
    });
  }

  public void testfromDivPixelToLatLng_noWap_true() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng center = LatLng.newInstance(40.740, -74.18);
        MapOptions options = MapOptions.newInstance();
        options.setZoom(13);
        options.setCenter(center);
        options.setMapTypeId(MapTypeId.HYBRID);

        MapWidget mapWidget = new MapWidget(options);
        mapWidget.setSize("500px", "500px");
        RootPanel.get().add(mapWidget);

        OverlayViewOnDrawHandler onDrawHandler = new OverlayViewOnDrawHandler() {
          @Override
          public void onDraw(OverlayViewMethods methods) {
            MapCanvasProjection o = methods.getProjection();

            Point pixel = Point.newInstance(100d, 110d);
            LatLng actual = o.fromDivPixelToLatLng(pixel, true);

            LatLng expected = LatLng.newInstance(-74.22147d, 131.625d);

            assertLatLngEquals(expected, actual);
            finishTest();
          }
        };

        OverlayViewOnAddHandler onAddHandler = new OverlayViewOnAddHandler() {
          @Override
          public void onAdd(OverlayViewMethods methods) {
            finishTest();
          }
        };

        OverlayViewOnRemoveHandler onRemoveHnadler = new OverlayViewOnRemoveHandler() {
          @Override
          public void onRemove(OverlayViewMethods methods) {
            finishTest();
          }
        };

        OverlayView overlay = OverlayView.newInstance(mapWidget, onDrawHandler, onAddHandler, onRemoveHnadler);
      }
    });
  }

  public void testfromDivPixelToLatLng_noWrap_false() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng center = LatLng.newInstance(40.740, -74.18);
        MapOptions options = MapOptions.newInstance();
        options.setZoom(13);
        options.setCenter(center);
        options.setMapTypeId(MapTypeId.HYBRID);

        MapWidget mapWidget = new MapWidget(options);
        mapWidget.setSize("500px", "500px");
        RootPanel.get().add(mapWidget);

        OverlayViewOnDrawHandler onDrawHandler = new OverlayViewOnDrawHandler() {
          @Override
          public void onDraw(OverlayViewMethods methods) {
            MapCanvasProjection o = methods.getProjection();

            Point pixel = Point.newInstance(100d, 110d);
            LatLng actual = o.fromDivPixelToLatLng(pixel, false);

            LatLng expected = LatLng.newInstance(-74.22147d, 131.625d);

            assertLatLngEquals(expected, actual);
            finishTest();
          }
        };

        OverlayViewOnAddHandler onAddHandler = new OverlayViewOnAddHandler() {
          @Override
          public void onAdd(OverlayViewMethods methods) {
            finishTest();
          }
        };

        OverlayViewOnRemoveHandler onRemoveHnadler = new OverlayViewOnRemoveHandler() {
          @Override
          public void onRemove(OverlayViewMethods methods) {
            finishTest();
          }
        };

        OverlayView overlay = OverlayView.newInstance(mapWidget, onDrawHandler, onAddHandler, onRemoveHnadler);
      }
    });
  }

  public void testfromLatLngToContainerPixel() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng center = LatLng.newInstance(40.740, -74.18);
        MapOptions options = MapOptions.newInstance();
        options.setZoom(13);
        options.setCenter(center);
        options.setMapTypeId(MapTypeId.HYBRID);

        MapWidget mapWidget = new MapWidget(options);
        mapWidget.setSize("500px", "500px");
        RootPanel.get().add(mapWidget);

        OverlayViewOnDrawHandler onDrawHandler = new OverlayViewOnDrawHandler() {
          @Override
          public void onDraw(OverlayViewMethods methods) {
            MapCanvasProjection o = methods.getProjection();

            LatLng testLatLng = LatLng.newInstance(34.4344d, -89.2433d);
            Point actual = o.fromLatLngToContainerPixel(testLatLng);

            // actual -87500.08256000001, 46656.067931791535
            assertEquals(Double.doubleToLongBits(-87500.08256000001), Double.doubleToLongBits(actual.getX()));
            assertEquals(Double.doubleToLongBits(46656.067931791535), Double.doubleToLongBits(actual.getY()));
            finishTest();
          }
        };

        OverlayViewOnAddHandler onAddHandler = new OverlayViewOnAddHandler() {
          @Override
          public void onAdd(OverlayViewMethods methods) {
            finishTest();
          }
        };

        OverlayViewOnRemoveHandler onRemoveHnadler = new OverlayViewOnRemoveHandler() {
          @Override
          public void onRemove(OverlayViewMethods methods) {
            finishTest();
          }
        };

        OverlayView overlay = OverlayView.newInstance(mapWidget, onDrawHandler, onAddHandler, onRemoveHnadler);
      }
    });
  }

  public void testfromLatLngToDivPixel() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng center = LatLng.newInstance(40.740, -74.18);
        MapOptions options = MapOptions.newInstance();
        options.setZoom(13);
        options.setCenter(center);
        options.setMapTypeId(MapTypeId.HYBRID);

        MapWidget mapWidget = new MapWidget(options);
        mapWidget.setSize("500px", "500px");
        RootPanel.get().add(mapWidget);

        OverlayViewOnDrawHandler onDrawHandler = new OverlayViewOnDrawHandler() {
          @Override
          public void onDraw(OverlayViewMethods methods) {
            MapCanvasProjection o = methods.getProjection();

            LatLng testPt = LatLng.newInstance(34.4344d, -89.2433d);
            Point actual = o.fromLatLngToDivPixel(testPt);

            assertEquals(10d, actual.getX());
            finishTest();
          }
        };

        OverlayViewOnAddHandler onAddHandler = new OverlayViewOnAddHandler() {
          @Override
          public void onAdd(OverlayViewMethods methods) {
            finishTest();
          }
        };

        OverlayViewOnRemoveHandler onRemoveHnadler = new OverlayViewOnRemoveHandler() {
          @Override
          public void onRemove(OverlayViewMethods methods) {
            finishTest();
          }
        };

        OverlayView overlay = OverlayView.newInstance(mapWidget, onDrawHandler, onAddHandler, onRemoveHnadler);
      }
    });
  }

  public void testgetWorldWidth() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng center = LatLng.newInstance(40.740, -74.18);
        MapOptions options = MapOptions.newInstance();
        options.setZoom(13);
        options.setCenter(center);
        options.setMapTypeId(MapTypeId.HYBRID);

        MapWidget mapWidget = new MapWidget(options);
        mapWidget.setSize("500px", "500px");
        RootPanel.get().add(mapWidget);

        OverlayViewOnDrawHandler onDrawHandler = new OverlayViewOnDrawHandler() {
          @Override
          public void onDraw(OverlayViewMethods methods) {
            MapCanvasProjection o = methods.getProjection();

            double actual = o.getWorldWidth();
            double expected = 256;

            assertEquals(expected, actual, 1e-2);
            finishTest();
          }
        };

        OverlayViewOnAddHandler onAddHandler = new OverlayViewOnAddHandler() {
          @Override
          public void onAdd(OverlayViewMethods methods) {
            finishTest();
          }
        };

        OverlayViewOnRemoveHandler onRemoveHnadler = new OverlayViewOnRemoveHandler() {
          @Override
          public void onRemove(OverlayViewMethods methods) {
            finishTest();
          }
        };

        OverlayView overlay = OverlayView.newInstance(mapWidget, onDrawHandler, onAddHandler, onRemoveHnadler);
      }
    });
  }
}
