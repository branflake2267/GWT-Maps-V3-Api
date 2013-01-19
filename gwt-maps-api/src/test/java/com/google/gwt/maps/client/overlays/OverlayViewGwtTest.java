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
import com.google.gwt.maps.client.overlays.overlayhandlers.OverlayViewOnAddHandler;
import com.google.gwt.maps.client.overlays.overlayhandlers.OverlayViewOnDrawHandler;
import com.google.gwt.maps.client.overlays.overlayhandlers.OverlayViewOnRemoveHandler;
import com.google.gwt.maps.client.overlays.overlayhandlers.OverlayViewMethods;
import com.google.gwt.user.client.ui.RootPanel;

public class OverlayViewGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  public void testDraw() {
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
            // Window.alert("OverlayView draw() called...");
            System.out.println("OverlayView draw() called...");

            assertTrue(true);
            finishTest();
          }
        };

        OverlayViewOnAddHandler onAddHandler = new OverlayViewOnAddHandler() {
          @Override
          public void onAdd(OverlayViewMethods methods) {
            // Window.alert("OverlayView add() called...");
            System.out.println("OverlayView add() called...");
          }
        };

        OverlayViewOnRemoveHandler onRemoveHnadler = new OverlayViewOnRemoveHandler() {
          @Override
          public void onRemove(OverlayViewMethods methods) {
            // Window.alert("OverlayView remove() called...");
            System.out.println("OverlayView remove() called...");
          }
        };

        OverlayView overlay = OverlayView.newInstance(mapWidget, onDrawHandler, onAddHandler, onRemoveHnadler);
      }
    });

  }

  // public void testMapWidget() {
  // asyncLibTest(new Runnable() {
  // @Override
  // public void run() {
  //
  // // no map - confirm null
  // OverlayView o = OverlayView.newInstance();
  // MapWidget actual = o.getMap();
  // assertNull(actual);
  //
  // // set a map
  // MapOptions options = MapOptions.newInstance();
  // MapWidget mapWidget = new MapWidget(options);
  // mapWidget.setSize("500px", "500px");
  // RootPanel.get().add(mapWidget);
  //
  // o.setMap(mapWidget);
  // actual = o.getMap();
  // assertLatLngEquals(mapWidget.getCenter(), o.getMap().getCenter());
  //
  // finishTest();
  // }
  // });
  // }

  // public void testPanoMapWidget() {
  // asyncLibTest(new Runnable() {
  // @Override
  // public void run() {
  //
  // // no map - confirm null
  // OverlayView o = OverlayView.newInstance();
  // MapWidget actual = o.getMap();
  // assertNull(actual);
  //
  // LatLng position = LatLng.newInstance(21.271525, -157.822731);
  //
  // StreetViewPov pov = StreetViewPov.newInstance();
  // pov.setHeading(250);
  // pov.setZoom(1);
  // pov.setPitch(10);
  //
  // StreetViewPanoramaOptions options =
  // StreetViewPanoramaOptions.newInstance();
  // options.setPosition(position);
  // options.setStreeViewPov(pov);
  //
  // StreetViewPanoramaWidget wStreet = new StreetViewPanoramaWidget(options);
  // // set a map
  // RootPanel.get().add(wStreet);
  //
  // o.setMap(wStreet);
  // // assertNotNull(o.getMap());
  // // can't tests because a MapWidget is not being used
  //
  // finishTest();
  // }
  // });
  // }

  public void testProjection() {
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
            System.out.println("OverlayView draw() called...");

            assertTrue(true);
            finishTest();
          }
        };

        OverlayViewOnAddHandler onAddHandler = new OverlayViewOnAddHandler() {
          @Override
          public void onAdd(OverlayViewMethods methods) {
            System.out.println("OverlayView add() called...");

            assertTrue(true);
            finishTest();
          }
        };

        OverlayViewOnRemoveHandler onRemoveHnadler = new OverlayViewOnRemoveHandler() {
          @Override
          public void onRemove(OverlayViewMethods methods) {
            System.out.println("OverlayView remove() called...");

            assertTrue(true);
            finishTest();
          }
        };

        OverlayView overlay = OverlayView.newInstance(mapWidget, onDrawHandler, onAddHandler, onRemoveHnadler);

        mapWidget.setZoom(5);
      }
    });
  }

  public void testGetPanes() {
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
            System.out.println("OverlayView draw() called...");

            assertTrue(true);
            finishTest();
          }
        };

        OverlayViewOnAddHandler onAddHandler = new OverlayViewOnAddHandler() {
          @Override
          public void onAdd(OverlayViewMethods methods) {
            System.out.println("OverlayView add() called...");

            assertTrue(true);
            finishTest();
          }
        };

        OverlayViewOnRemoveHandler onRemoveHnadler = new OverlayViewOnRemoveHandler() {
          @Override
          public void onRemove(OverlayViewMethods methods) {
            System.out.println("OverlayView remove() called...");

            assertTrue(true);
            finishTest();
          }
        };

        OverlayView overlay = OverlayView.newInstance(mapWidget, onDrawHandler, onAddHandler, onRemoveHnadler);

        mapWidget.setZoom(5);
      }
    });
  }

  public void testOnAdd() {
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
            System.out.println("OverlayView draw() called...");
          }
        };

        OverlayViewOnAddHandler onAddHandler = new OverlayViewOnAddHandler() {
          @Override
          public void onAdd(OverlayViewMethods methods) {
            System.out.println("OverlayView add() called...");

            assertTrue(true);
            finishTest();
          }
        };

        OverlayViewOnRemoveHandler onRemoveHnadler = new OverlayViewOnRemoveHandler() {
          @Override
          public void onRemove(OverlayViewMethods methods) {
            System.out.println("OverlayView remove() called...");
          }
        };

        OverlayView overlay = OverlayView.newInstance(mapWidget, onDrawHandler, onAddHandler, onRemoveHnadler);
      }
    });

  }

  public void testOnRemove() {
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
            System.out.println("OverlayView draw() called...");

            assertTrue(true);
            finishTest();
          }
        };

        OverlayViewOnAddHandler onAddHandler = new OverlayViewOnAddHandler() {
          @Override
          public void onAdd(OverlayViewMethods methods) {
            System.out.println("OverlayView add() called...");

            assertTrue(true);
            finishTest();
          }
        };

        OverlayViewOnRemoveHandler onRemoveHnadler = new OverlayViewOnRemoveHandler() {
          @Override
          public void onRemove(OverlayViewMethods methods) {
            System.out.println("OverlayView remove() called...");

            assertTrue(true);
            finishTest();
          }
        };

        OverlayView overlay = OverlayView.newInstance(mapWidget, onDrawHandler, onAddHandler, onRemoveHnadler);

        mapWidget.setZoom(5);
      }
    });

  }

}
