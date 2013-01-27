package com.google.gwt.maps.client.main;

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

import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.base.Point;
import com.google.gwt.maps.client.controls.ControlPosition;
import com.google.gwt.maps.client.maptypes.Projection;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class MapWidgetGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapOptions options = MapOptions.newInstance();
        MapWidget w = new MapWidget(options);
        RootPanel.get().add(w);
        finishTest();
      }
    });

  }

  public void testJso() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapOptions options = MapOptions.newInstance();
        MapWidget w = new MapWidget(options);
        RootPanel.get().add(w);
        String center = w.getCenter().getToString();
        MapImpl impl = w.getJso();
        assertNotNull(impl);
        assertEquals(center, impl.getCenter().getToString());
        w.setJso(impl);
        finishTest();
      }
    });

  }

  public void testFitBounds() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapOptions options = MapOptions.newInstance();
        MapWidget o = new MapWidget(options);
        o.setSize("500px", "500px");
        RootPanel.get().add(o);
        LatLng ne = LatLng.newInstance(41.239045d, -73.508142d);
        LatLng sw = LatLng.newInstance(42.88679d, -69.927992d);
        LatLngBounds left = LatLngBounds.newInstance(sw, ne);
        o.fitBounds(left);
        LatLngBounds right = o.getBounds();
        assertEquals("((30.792110938675897, 108.28193299999998), (51.64751462536006, 108.28193299999998))",
            right.getToString());
        finishTest();
      }
    });

  }

  public void testGetDiv() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);
        fp.setSize("103px", "204px");

        MapOptions options = MapOptions.newInstance();
        MapWidget o = new MapWidget(options);
        Element e = o.getDiv();
        int right = e.getAbsoluteRight();
        int bottom = e.getAbsoluteBottom();
        assertEquals(0, right);
        assertEquals(20, bottom);
        finishTest();
      }
    });

  }

  public void testGetHeading() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);

        MapOptions options = MapOptions.newInstance();
        MapWidget o = new MapWidget(options);

        // TODO should this return null?
        // try {
        // int heading1 = o.getHeading();
        // } catch (Exception e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }

        o.setHeading(45);
        int heading2 = o.getHeading();
        assertEquals(45, heading2);
        finishTest();
      }
    });

  }

  public void testgetMapTypeId() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);

        MapOptions options = MapOptions.newInstance();
        MapWidget o = new MapWidget(options);
        MapTypeId left = MapTypeId.HYBRID;
        o.setMapTypeId(left);
        MapTypeId right = o.getMapTypeId();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testGetProjection() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);

        MapOptions options = MapOptions.newInstance();
        final MapWidget w = new MapWidget(options);
        fp.add(w);
        
//        w.addProjectionChangeHandler(new ProjectionChangeMapHandler() {
//          @Override
//          public void onEvent(ProjectionChangeMapEvent event) {
            Projection projection = w.getProjection();
            assertNotNull(projection);
            
            boolean nowrap = false;
            Point pixel = Point.newInstance(10d, 10d);
            LatLng a = projection.fromPointToLatLng(pixel, nowrap);
            assertEquals("(83.67694304841554, -165.9375)", a.getToString());
            finishTest();
//          }
//        });
      }
    });
  }

  // /**
  // * TODO come back and finish this when I have some street view properties
  // to add
  // */
  // public void testStreetView() {
  // asyncLibTest(new Runnable() {
  // public void run() {
  // FlowPanel fpSv = new FlowPanel();
  // RootPanel.get().add(fpSv);
  //
  // FlowPanel fp = new FlowPanel();
  // RootPanel.get().add(fp);
  //
  // MapOptions options = MapOptions.newInstance();
  // MapWidget o = new MapWidget(options);
  //
  // StreetViewPanoramaOptions svOptions =
  // StreetViewPanoramaOptions.newInstance();
  // svOptions.setPano("testingPano");
  //
  // StreetViewPanorama left =
  // StreetViewPanorama.newInstance(fpSv.getElement(), svOptions );
  // o.setStreetView(left);
  //
  // StreetViewPanorama right = o.getStreetView();
  //
  // assertEquals(left.getPano(), right.getPano());
  //
  // finishTest();
  // }
  // });

  // }

  public void testGetTilt() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);

        MapOptions options = MapOptions.newInstance();
        MapWidget o = new MapWidget(options);
        int tilt = o.getTilt();
        assertEquals(0, tilt);
        o.setTilt(20); // TODO Find out what i need to do for options to
        // get this workable?
        int t = o.getTilt();
        assertEquals(0, t);
        finishTest();
      }
    });

  }

  public void testGetZoom() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);

        MapOptions options = MapOptions.newInstance();
        MapWidget o = new MapWidget(options);
        int zoom = o.getZoom();
        assertEquals(0, zoom);
        o.setZoom(5);
        assertEquals(5, o.getZoom());
        finishTest();
      }
    });

  }

  public void testGetPanBy() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);

        MapOptions options = MapOptions.newInstance();
        MapWidget o = new MapWidget(options);
        o.panBy(50, 52);
        LatLng latlng = o.getCenter();
        assertEquals("(-41.53468367361192, 61.31249999999999)", latlng.getToString());
        finishTest();
      }
    });
  }

  public void testPanTo() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);
        fp.setSize("500px", "500px");

        MapOptions options = MapOptions.newInstance();
        MapWidget o = new MapWidget(options);
        fp.add(o);
        
        LatLng latLng = LatLng.newInstance(35.3, 38.5);
        o.panTo(latLng);
        assertTrue(latLng.getLatitude() > 35);
        assertTrue(latLng.getLongitude() > 35);
        finishTest();
      }
    });
  }

  public void testPanToBounds() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);

        MapOptions options = MapOptions.newInstance();
        MapWidget o = new MapWidget(options);
        LatLng ne = LatLng.newInstance(41.239045d, -73.508142d);
        LatLng sw = LatLng.newInstance(42.88679d, -69.927992d);
        LatLngBounds left = LatLngBounds.newInstance(sw, ne);
        o.panToBounds(left);
        LatLng center = o.getCenter();
        assertEquals("(32.92888675928454, -71.33424200000006)", center.getToString());
        finishTest();
      }
    });
  }

  public void testSetCenter() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);

        MapOptions options = MapOptions.newInstance();
        MapWidget o = new MapWidget(options);
        LatLng center = LatLng.newInstance(41.239045d, -73.508142d);
        o.setCenter(center);
        assertEquals("(41.239045, -73.50814200000002)", o.getCenter().getToString());
        finishTest();
      }
    });

  }

  // /**
  // * setControls
  // * getControls
  // */
  // public void testSetControls() {
  // asyncLibTest(new Runnable() {
  // public void run() {
  // FlowPanel fp = new FlowPanel();
  // RootPanel.get().add(fp);
  //
  // MapOptions options = MapOptions.newInstance();
  // MapWidget o = new MapWidget(options);
  //
  // MVCArray<Element> controls = null;
  // o.setControls(controls );
  //
  // finishTest();
  // }
  // });

  // }

  // public void testMapTypesRegistry() {
  // asyncLibTest(new Runnable() {
  // public void run() {
  // FlowPanel fp = new FlowPanel();
  // RootPanel.get().add(fp);
  //
  // MapOptions options = MapOptions.newInstance();
  // MapWidget o = new MapWidget(options);
  //
  //
  // finishTest();
  // }
  // });

  // }

  // public void testSetOverlayMapTypes() {
  // asyncLibTest(new Runnable() {
  // public void run() {
  // FlowPanel fp = new FlowPanel();
  // RootPanel.get().add(fp);
  //
  // MapOptions options = MapOptions.newInstance();
  // MapWidget o = new MapWidget(options);
  //
  //
  // finishTest();
  // }
  // });

  // }

  public void testGetControl() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);

        MapOptions options = MapOptions.newInstance();
        MapWidget o = new MapWidget(options);
        Label label = new Label("test");
        assertEquals(0, o.getControls(ControlPosition.TOP_CENTER).getLength());
        o.setControls(ControlPosition.TOP_CENTER, label);
        assertEquals(1, o.getControls(ControlPosition.TOP_CENTER).getLength());
        finishTest();
      }
    });
  }

  public void testResize() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);

        MapOptions options = MapOptions.newInstance();
        MapWidget o = new MapWidget(options);
        LatLng center = o.getCenter();
        o.triggerResize();
        assertEquals(center.getLatitude(), o.getCenter().getLatitude());
        assertEquals(center.getLongitude(), o.getCenter().getLongitude());
        finishTest();
      }
    });
  }

}
