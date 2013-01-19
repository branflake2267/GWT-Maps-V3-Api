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
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.user.client.ui.RootPanel;

public class CircleGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        CircleOptions options = CircleOptions.newInstance();
        Circle o = Circle.newInstance(options);
        finishTest();
      }
    });

  }

  public void testBounds() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        CircleOptions options = CircleOptions.newInstance();
        LatLng center = LatLng.newInstance(23, 25);
        options.setCenter(center);
        options.setRadius(10);
        Circle o = Circle.newInstance(options);
        LatLngBounds right = o.getBounds();
        assertEquals("((22.999910168471587, 24.999902410586856), (23.000089831528413, 25.000097589413144))",
            right.getToString());
        finishTest();
      }
    });

  }

  public void testCenter() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        CircleOptions options = CircleOptions.newInstance();
        LatLng center = LatLng.newInstance(23, 25);
        options.setCenter(center);
        options.setRadius(10);
        Circle o = Circle.newInstance(options);
        LatLng right = o.getCenter();
        assertEquals("(23, 25)", right.getToString());
        finishTest();
      }
    });

  }

  public void testEditable() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        CircleOptions options = CircleOptions.newInstance();
        Circle o = Circle.newInstance(options);
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
        CircleOptions options = CircleOptions.newInstance();
        Circle o = Circle.newInstance(options);
        MapOptions opts = MapOptions.newInstance();

        // test getting null map
        assertNull(o.getMap());

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

  public void testRadius() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        CircleOptions options = CircleOptions.newInstance();
        LatLng center = LatLng.newInstance(23, 25);
        options.setCenter(center);
        options.setRadius(10d);
        Circle o = Circle.newInstance(options);
        LatLngBounds right = o.getBounds();
        assertEquals("((22.999910168471587, 24.999902410586856), (23.000089831528413, 25.000097589413144))",
            right.getToString());
        double radius = o.getRadius();
        assertEquals(10d, radius);
        finishTest();
      }
    });

  }

}
