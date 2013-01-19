package com.google.gwt.maps.client.service;

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

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.overlays.InfoWindow;
import com.google.gwt.maps.client.overlays.InfoWindowOptions;
import com.google.gwt.maps.client.overlays.MarkerOptions;
import com.google.gwt.maps.client.overlays.PolylineOptions;
import com.google.gwt.maps.client.services.DirectionsRendererOptions;
import com.google.gwt.maps.client.services.DirectionsResult;
import com.google.gwt.maps.client.services.DirectionsRoute;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

public class DirectionsRendererOptionsGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.PLACES };
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        finishTest();
      }
    });
  }

  public void testDirections() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        DirectionsRoute[] a = new DirectionsRoute[3];
        a[0] = DirectionsRoute.newInstance();
        a[1] = DirectionsRoute.newInstance();
        a[2] = DirectionsRoute.newInstance();
        JsArray<DirectionsRoute> ll = ArrayHelper.toJsArray(a);
        DirectionsResult left = DirectionsResult.newInstance();
        left.setRoutes(ll);
        o.setDirections(left);
        DirectionsResult right = o.getDirections();
        assertEquals(left.getRoutes().length(), right.getRoutes().length());
        finishTest();
      }
    });
  }

  public void testDraggable() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        boolean left = true;
        o.setDraggable(left);
        boolean right = o.getDraggable();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testHideRouteList() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        boolean left = true;
        o.setHideRouteList(left);
        boolean right = o.getHideRouteList();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testInfoWindow() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        InfoWindowOptions options = InfoWindowOptions.newInstance();
        options.setContent("test");
        options.setZindex(5);
        InfoWindow left = InfoWindow.newInstance(options);
        o.setInfoWindow(left);
        InfoWindow right = o.getInfoWindow();
        assertEquals(left.getZindex(), right.getZindex());
        finishTest();
      }
    });
  }

  public void testMap() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        MapOptions options = MapOptions.newInstance();
        MapWidget left = new MapWidget(options);
        left.setSize("500px", "500px");
        RootPanel.get().add(left);

        o.setMap(left);
        MapWidget right = o.getMap();

        assertLatLngEquals(left.getCenter(), right.getCenter());

        finishTest();
      }
    });
  }

  public void testMarkerOptions() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        MarkerOptions left = MarkerOptions.newInstance();
        left.setClickable(true);
        o.setMarkerOptions(left);
        MarkerOptions right = o.getMarkerOptions();
        assertEquals(left.getClickable(), right.getClickable());
        finishTest();
      }
    });
  }

  public void testPanel() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        FlowPanel fp = new FlowPanel();
        fp.add(new HTML("test"));
        Element left = fp.getElement();
        o.setPanel(left);
        Element right = o.getPanel();
        assertEquals(left.toString(), right.toString());
        finishTest();
      }
    });
  }

  public void testPolylineOptions() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        PolylineOptions left = PolylineOptions.newInstance();
        left.setClickable(true);
        o.setPolylineOptions(left);
        PolylineOptions right = o.getPolylineOptions();
        assertEquals(left.getClickable(), right.getClickable());
        finishTest();
      }
    });
  }

  public void testPreserveViewport() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        boolean left = true;
        o.setPreserveViewport(left);
        boolean right = o.getPreserveViewport();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testRouteIndex() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        int left = 5;
        o.setRouteIndex(left);
        int right = o.getRouteIndex();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testSuppressBicyclingLayer() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        boolean left = true;
        o.setSuppressBicyclingLayer(left);
        boolean right = o.getSuppressBicyclingLayer();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testSuppressInfoWindows() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        boolean left = true;
        o.setSuppressInfoWindows(left);
        boolean right = o.getSuppressInfoWindows();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testMarkers() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        boolean left = true;
        o.setSuppressMarkers(left);
        boolean right = o.getSuppressMarkers();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testPolyline() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsRendererOptions o = DirectionsRendererOptions.newInstance();
        boolean left = true;
        o.setSuppressPolylines(left);
        boolean right = o.getSuppressPolylines();
        assertEquals(left, right);
        finishTest();
      }
    });
  }
}
