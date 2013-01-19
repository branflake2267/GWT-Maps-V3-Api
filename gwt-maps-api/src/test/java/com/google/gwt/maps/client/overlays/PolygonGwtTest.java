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

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.mvc.MVCArray;
import com.google.gwt.user.client.ui.RootPanel;

public class PolygonGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PolygonOptions options = PolygonOptions.newInstance();
        Polygon o = Polygon.newInstance(options);
        finishTest();
      }
    });

  }

  public void testSetVisible() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PolygonOptions options = PolygonOptions.newInstance();
        Polygon o = Polygon.newInstance(options);

        // set value
        o.setVisible(false);
        assertFalse("Polygon should NOT be visible", o.getVisible());

        // set back to default
        o.setVisible(true);
        assertTrue("Polygon should be visible", o.getVisible());

        finishTest();
      }
    });

  }

  public void testEditable() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PolygonOptions options = PolygonOptions.newInstance();
        Polygon o = Polygon.newInstance(options);
        boolean left = true;
        o.setEditable(left);
        boolean right = o.getEditable();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testMap() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PolygonOptions options = PolygonOptions.newInstance();
        Polygon o = Polygon.newInstance(options);

        // test getting null map
        assertNull(o.getMap());

        MapOptions opts = MapOptions.newInstance();
        MapWidget left = new MapWidget(opts);
        left.setSize("500px", "500px");
        RootPanel.get().add(left);
        o.setMap(left);
        MapWidget right = o.getMap();
        assertEquals(left.getCenter().getToString(), right.getCenter().getToString());

        // test clearing from map
        o.setMap(null);
        assertNull(o.getMap());

        finishTest();
      }
    });

  }

  /**
   * this thows some red? not sure why. It runs ok by it self? Types?
   */
  public void testPaths_JSArray() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PolygonOptions options = PolygonOptions.newInstance();
        Polygon o = Polygon.newInstance(options);
        LatLng[] a = new LatLng[3];
        a[0] = LatLng.newInstance(35, 36);
        a[1] = LatLng.newInstance(36, 37);
        a[2] = LatLng.newInstance(38, 39);
        JsArray<LatLng> left = ArrayHelper.toJsArray(a);
        o.setPaths(left);
        // JsArray<LatLng> right = o.getPaths_JsArray();
        // assertEquals(left.get(0).getToString(),
        // right.get(0).getToString());
        finishTest();
      }
    });

  }

  /**
   * this thows some red? not sure why. It runs ok by it self? Types?
   */
  public void testPathss_JSArray() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PolygonOptions options = PolygonOptions.newInstance();
        Polygon o = Polygon.newInstance(options);
        LatLng[] a = new LatLng[3];
        a[0] = LatLng.newInstance(35, 36);
        a[1] = LatLng.newInstance(36, 37);
        a[2] = LatLng.newInstance(38, 39);
        JsArray<LatLng> left1 = ArrayHelper.toJsArray(a);

        LatLng[] a2 = new LatLng[3];
        a2[0] = LatLng.newInstance(25, 26);
        a2[1] = LatLng.newInstance(26, 27);
        a2[2] = LatLng.newInstance(28, 29);
        JsArray<LatLng> left2 = ArrayHelper.toJsArray(a2);

        JsArray<JsArray<LatLng>> left = JsArray.createArray().cast();
        left.push(left1);
        left.push(left2);

        o.setPathss(left);
        // JsArray<JsArray<LatLng>> right = o.getPathss_JsArray();
        // assertEquals(left.get(0).get(0).getToString(),
        // right.get(0).get(0).getToString());
        finishTest();
      }
    });

  }

  public void testPaths_MVCArray() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PolygonOptions options = PolygonOptions.newInstance();
        Polygon o = Polygon.newInstance(options);
        LatLng[] a = new LatLng[3];
        a[0] = LatLng.newInstance(35, 36);
        a[1] = LatLng.newInstance(36, 37);
        a[2] = LatLng.newInstance(38, 39);
        MVCArray<LatLng> left = MVCArray.newInstance(a);
        o.setPaths(left);
        // MVCArray<LatLng> right = o.getPaths_MVCArray();
        // assertEquals(left.get(0).getToString(),
        // right.get(0).getToString());
        finishTest();
      }
    });

  }

  public void testPathss_MVCArray() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PolygonOptions options = PolygonOptions.newInstance();
        Polygon o = Polygon.newInstance(options);
        LatLng[] a = new LatLng[3];
        a[0] = LatLng.newInstance(35, 36);
        a[1] = LatLng.newInstance(36, 37);
        a[2] = LatLng.newInstance(38, 39);
        MVCArray<LatLng> left1 = MVCArray.newInstance(a);

        LatLng[] a2 = new LatLng[3];
        a2[0] = LatLng.newInstance(25, 26);
        a2[1] = LatLng.newInstance(26, 27);
        a2[2] = LatLng.newInstance(28, 29);
        MVCArray<LatLng> left2 = MVCArray.newInstance(a2);

        MVCArray<MVCArray<LatLng>> left = MVCArray.newInstance();
        left.push(left1);
        left.push(left2);

        o.setPathss(left);
        // MVCArray<MVCArray<LatLng>> right = o.getPathss_MVCArray();
        // assertEquals(left.get(0).get(0).getToString(),
        // right.get(0).get(0).getToString());
        finishTest();
      }
    });

  }

}
