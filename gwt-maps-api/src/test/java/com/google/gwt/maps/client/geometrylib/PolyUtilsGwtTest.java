package com.google.gwt.maps.client.geometrylib;

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
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.mvc.MVCArray;
import com.google.gwt.maps.client.overlays.Polygon;
import com.google.gwt.maps.client.overlays.PolygonOptions;
import com.google.gwt.maps.client.overlays.Polyline;
import com.google.gwt.maps.client.overlays.PolylineOptions;

public class PolyUtilsGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.GEOMETRY };
  }

  /**
   * Create polygon for use in tests
   * 
   * @return
   */
  private Polygon createClosedPolygon() {
    PolygonOptions options = PolygonOptions.newInstance();
    Polygon o = Polygon.newInstance(options);

    // build our poly
    LatLng[] a2 = new LatLng[5];
    a2[0] = LatLng.newInstance(25, 35);
    a2[1] = LatLng.newInstance(27, 35);
    a2[2] = LatLng.newInstance(27, 37);
    a2[3] = LatLng.newInstance(25, 37);
    a2[4] = LatLng.newInstance(25, 35);
    JsArray<LatLng> path1 = ArrayHelper.toJsArray(a2);

    JsArray<JsArray<LatLng>> left = JsArray.createArray().cast();
    left.push(path1);
    o.setPathss(left);

    return o;
  }

  /**
   * Create polyline for use in tests
   * 
   * @return
   */
  private Polyline createPolyline() {
    PolylineOptions options = PolylineOptions.newInstance();
    Polyline o = Polyline.newInstance(options);
    LatLng[] a = new LatLng[2];
    a[0] = LatLng.newInstance(35, 37);
    a[1] = LatLng.newInstance(36, 37);
    MVCArray<LatLng> left = MVCArray.newInstance(a);
    o.setPath(left);

    return o;
  }

  public void testContainsLocation_true() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        Polygon polygon = createClosedPolygon();

        LatLng point = LatLng.newInstance(26d, 36d);
        boolean outcome = PolyUtils.containsLocation(point, polygon);
        assertTrue("Should contain internal point", outcome);

        finishTest();
      }
    });
  }

  public void testContainsLocation_false() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        Polygon polygon = createClosedPolygon();

        LatLng point = LatLng.newInstance(0d, 0d);
        boolean outcome = PolyUtils.containsLocation(point, polygon);

        assertFalse("Should NOT contain point", outcome);

        finishTest();
      }
    });
  }

  public void testIsLocationOnEdge_polygon_true() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        Polygon polygon = createClosedPolygon();

        LatLng point = LatLng.newInstance(26d, 35d);
        boolean outcome = PolyUtils.isLocationOnEdge(point, polygon);
        assertTrue("Should have edge point", outcome);

        finishTest();
      }
    });
  }

  public void testIsLocationOnEdge_polygon_false() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        Polygon polygon = createClosedPolygon();

        LatLng point = LatLng.newInstance(10d, 10d);
        boolean outcome = PolyUtils.isLocationOnEdge(point, polygon);
        assertFalse("Should not have edge point", outcome);

        finishTest();
      }
    });
  }

  public void testIsLocationOnEdge_polygon_tolerance_true() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        Polygon polygon = createClosedPolygon();

        LatLng point = LatLng.newInstance(0d, 0d);
        double tolerance = 100d;
        boolean outcome = PolyUtils.isLocationOnEdge(point, polygon, tolerance);
        assertTrue("Should have point within tolerance of edge", outcome);

        finishTest();
      }
    });
  }

  public void testIsLocationOnEdge_polygon_tolerance_false() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        Polygon polygon = createClosedPolygon();

        LatLng point = LatLng.newInstance(0d, 0d);
        double tolerance = 1d;
        boolean outcome = PolyUtils.isLocationOnEdge(point, polygon, tolerance);
        assertFalse("Should NOT have point within tolerance of edge", outcome);

        finishTest();
      }
    });
  }

  public void testIsLocationOnEdge_polyline_true() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        Polyline polyline = createPolyline();

        LatLng point = LatLng.newInstance(35.5d, 37d);
        boolean outcome = PolyUtils.isLocationOnEdge(point, polyline);
        assertTrue("Should have edge point", outcome);

        finishTest();
      }
    });
  }

  public void testIsLocationOnEdge_polyline_false() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        Polyline polyline = createPolyline();

        LatLng point = LatLng.newInstance(0d, 0d);
        boolean outcome = PolyUtils.isLocationOnEdge(point, polyline);
        assertFalse("Should not have edge point", outcome);

        finishTest();
      }
    });
  }

  public void testIsLocationOnEdge_polyline_tolerance_true() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        Polyline polyline = createPolyline();

        LatLng point = LatLng.newInstance(38d, 38d);
        double tolerance = 10d;
        boolean outcome = PolyUtils.isLocationOnEdge(point, polyline, tolerance);
        assertTrue("Should have point within tolerance of edge", outcome);

        finishTest();
      }
    });
  }

  public void testIsLocationOnEdge_polyline_tolerance_false() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        Polyline polyline = createPolyline();

        LatLng point = LatLng.newInstance(38d, 38d);
        double tolerance = 1e-3d;
        boolean outcome = PolyUtils.isLocationOnEdge(point, polyline, tolerance);
        assertFalse("Should NOT have point within tolerance of edge", outcome);

        finishTest();
      }
    });
  }
}
