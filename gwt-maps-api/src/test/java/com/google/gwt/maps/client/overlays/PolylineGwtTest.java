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

public class PolylineGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PolylineOptions options = PolylineOptions.newInstance();
        Polyline o = Polyline.newInstance(options);

        finishTest();
      }
    });

  }

  public void testEditable() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PolylineOptions options = PolylineOptions.newInstance();
        Polyline o = Polyline.newInstance(options);
        boolean left = true;
        o.setEditable(left);
        boolean right = o.getEditable();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testVisible() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PolylineOptions options = PolylineOptions.newInstance();
        Polyline o = Polyline.newInstance(options);

        o.setVisible(false);
        assertFalse("Polyline should not be visible", o.getVisible());

        o.setVisible(true);
        assertTrue("Polyline should be visible", o.getVisible());

        finishTest();
      }
    });
  }

  public void testMap() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PolylineOptions options = PolylineOptions.newInstance();
        Polyline o = Polyline.newInstance(options);

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

  public void testPath_JsArray() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PolylineOptions options = PolylineOptions.newInstance();
        Polyline o = Polyline.newInstance(options);
        LatLng[] a = new LatLng[3];
        a[0] = LatLng.newInstance(35, 36);
        a[1] = LatLng.newInstance(36, 37);
        a[2] = LatLng.newInstance(38, 39);
        JsArray<LatLng> left = ArrayHelper.toJsArray(a);
        o.setPath(left);
        // fail and it will throw
        finishTest();
      }
    });

  }

  public void testPath_MVCArray() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PolylineOptions options = PolylineOptions.newInstance();
        Polyline o = Polyline.newInstance(options);
        LatLng[] a = new LatLng[3];
        a[0] = LatLng.newInstance(35, 36);
        a[1] = LatLng.newInstance(36, 37);
        a[2] = LatLng.newInstance(38, 39);
        MVCArray<LatLng> left = MVCArray.newInstance(a);
        o.setPath(left);
        // fail and it will throw
        finishTest();
      }
    });

  }

}
