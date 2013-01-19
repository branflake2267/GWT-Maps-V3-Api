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
import com.google.gwt.user.client.ui.RootPanel;

public class CircleOptionsGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        CircleOptions o = CircleOptions.newInstance();
        finishTest();
      }
    });

  }

  public void testCenter() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        CircleOptions o = CircleOptions.newInstance();
        LatLng left = LatLng.newInstance(24, 33);
        o.setCenter(left);
        LatLng right = o.getCenter();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    });

  }

  public void testClickable() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        CircleOptions o = CircleOptions.newInstance();
        boolean left = true;
        o.setClickable(left);
        boolean right = o.getClickable();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testFillColor() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        CircleOptions o = CircleOptions.newInstance();
        String left = "red";
        o.setFillColor(left);
        String right = o.getFillColor();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testFillOpacity() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        CircleOptions o = CircleOptions.newInstance();
        double left = .50d;
        o.setFillOpacity(left);
        double right = o.getFillOpacity();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testMapWidget() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        CircleOptions o = CircleOptions.newInstance();
        MapOptions opts = MapOptions.newInstance();
        MapWidget left = new MapWidget(opts);
        left.setSize("500px", "500px");
        RootPanel.get().add(left);
        o.setMap(left);
        @SuppressWarnings("deprecation")
        MapWidget right = o.getMapWidget();
        assertLatLngEquals(left.getCenter(), right.getCenter());
        finishTest();
      }
    });
  }

  public void testMap() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        CircleOptions o = CircleOptions.newInstance();
        MapOptions opts = MapOptions.newInstance();
        MapWidget left = new MapWidget(opts);
        left.setSize("500px", "500px");
        RootPanel.get().add(left);
        o.setMap(left);

        MapWidget right = o.getMap();
        assertLatLngEquals(left.getCenter(), right.getCenter());
        finishTest();
      }
    });
  }

  public void testRadius() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        CircleOptions o = CircleOptions.newInstance();
        double left = 110.1d;
        o.setRadius(left);
        double right = o.getRadius();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testStrokeColor() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        CircleOptions o = CircleOptions.newInstance();
        String left = "red";
        o.setStrokeColor(left);
        String right = o.getStrokeColor();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testStrokeOpacity() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        CircleOptions o = CircleOptions.newInstance();
        double left = .50d;
        o.setStrokeOpacity(left);
        double right = o.getStrokeOpacity();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testStrokeWeight() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        CircleOptions o = CircleOptions.newInstance();
        int left = 5;
        o.setStrokeWeight(left);
        int right = o.getStrokeWeight();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testZindex() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        CircleOptions o = CircleOptions.newInstance();
        int left = 5;
        o.setZindex(left);
        int right = o.getZindex();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

}
