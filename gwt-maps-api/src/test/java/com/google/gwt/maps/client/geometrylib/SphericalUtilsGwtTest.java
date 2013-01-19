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

import java.util.ArrayList;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.mvc.MVCArray;

public class SphericalUtilsGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.GEOMETRY };
  }

  public void testComputeArea1() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng[] array = new LatLng[4];
        array[0] = LatLng.newInstance(49.496675, -102.65625);
        array[1] = LatLng.newInstance(50.496675, -103.65625);
        array[2] = LatLng.newInstance(51.496675, -104.65625);
        array[3] = LatLng.newInstance(49.496675, -102.65625);
        JsArray<LatLng> loop = ArrayHelper.toJsArray(array);
        double area = SphericalUtils.computeArea(loop);
        assertTrue("Area should be positive", area > 0);

        finishTest();
      }
    });

  }

  public void testComputeArea1_radius() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng[] array = new LatLng[3];
        array[0] = LatLng.newInstance(49.496675, -102.65625);
        array[1] = LatLng.newInstance(50.496675, -103.65625);
        array[2] = LatLng.newInstance(51.496675, -104.65625); // unclosed
        // loop
        JsArray<LatLng> loop = ArrayHelper.toJsArray(array);
        double area = SphericalUtils.computeArea(loop, 2006);
        assertTrue("Area should be positive", area > 0);

        finishTest();
      }
    });

  }

  public void testComputeArea2() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng[] array = new LatLng[3];
        array[0] = LatLng.newInstance(49.496675, -102.65625);
        array[1] = LatLng.newInstance(50.496675, -103.65625);
        array[2] = LatLng.newInstance(51.496675, -104.65625);
        JsArray<LatLng> path = ArrayHelper.toJsArray(array);
        MVCArray<LatLng> loop = MVCArray.newInstance(path);
        double area = SphericalUtils.computeArea(loop);
        if (area > 0) {
          assertTrue(true);
        } else {
          assertTrue(false);
        }
        finishTest();
      }
    });

  }

  public void testComputeArea2_radius() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng[] array = new LatLng[3];
        array[0] = LatLng.newInstance(49.496675, -102.65625);
        array[1] = LatLng.newInstance(50.496675, -103.65625);
        array[2] = LatLng.newInstance(51.496675, -104.65625);
        JsArray<LatLng> path = ArrayHelper.toJsArray(array);
        MVCArray<LatLng> loop = MVCArray.newInstance(path);
        double area = SphericalUtils.computeArea(loop, 2006);
        assertTrue("Area should be positive", area > 0);

        finishTest();
      }
    });

  }

  public void testComputeDistance() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng from = LatLng.newInstance(49.496675, -102.65625);
        LatLng to = LatLng.newInstance(50.496675, -103.65625);
        double distance = SphericalUtils.computeDistanceBetween(from, to);
        assertTrue("Distance should be > 0", distance > 0);

        finishTest();
      }
    });

  }

  public void testComputeDistanceRadius() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng from = LatLng.newInstance(49.496675, -102.65625);
        LatLng to = LatLng.newInstance(50.496675, -103.65625);
        double distance = SphericalUtils.computeDistanceBetween(from, to, 2006);
        assertTrue("Distance should be > 0", distance > 0);

        finishTest();
      }
    });

  }

  public void testComputeHeading() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng from = LatLng.newInstance(49.496675, -102.65625);
        LatLng to = LatLng.newInstance(50.496675, -103.65625);
        double heading = SphericalUtils.computeHeading(from, to);
        if (heading < 0) {
          assertTrue(true);
        } else {
          assertTrue(false);
        }
        finishTest();
      }
    });

  }

  public void testComputeLength() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng[] array = new LatLng[3];
        array[0] = LatLng.newInstance(49.496675, -102.65625);
        array[1] = LatLng.newInstance(50.496675, -103.65625);
        array[2] = LatLng.newInstance(51.496675, -104.65625);
        JsArray<LatLng> path = ArrayHelper.toJsArray(array);
        double length = SphericalUtils.computeLength(path);
        assertTrue("Length should be > 0", length > 0);

        finishTest();
      }
    });

  }

  public void testComputeLength_radius() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng[] array = new LatLng[3];
        array[0] = LatLng.newInstance(49.496675, -102.65625);
        array[1] = LatLng.newInstance(50.496675, -103.65625);
        array[2] = LatLng.newInstance(51.496675, -104.65625);
        JsArray<LatLng> path = ArrayHelper.toJsArray(array);
        double length = SphericalUtils.computeLength(path, 2006);
        assertTrue("Length should be > 0", length > 0);

        finishTest();
      }
    });

  }

  public void testComputeLength2() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng[] array = new LatLng[3];
        array[0] = LatLng.newInstance(49.496675, -102.65625);
        array[1] = LatLng.newInstance(50.496675, -103.65625);
        array[2] = LatLng.newInstance(51.496675, -104.65625);
        JsArray<LatLng> path = ArrayHelper.toJsArray(array);
        MVCArray<LatLng> path2 = MVCArray.newInstance(path);
        double length = SphericalUtils.computeLength(path2);
        assertTrue("Length should be > 0", length > 0);

        finishTest();
      }
    });

  }

  public void testComputeLength2_radius() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng[] array = new LatLng[3];
        array[0] = LatLng.newInstance(49.496675, -102.65625);
        array[1] = LatLng.newInstance(50.496675, -103.65625);
        array[2] = LatLng.newInstance(51.496675, -104.65625);
        JsArray<LatLng> path = ArrayHelper.toJsArray(array);
        MVCArray<LatLng> path2 = MVCArray.newInstance(path);
        double length = SphericalUtils.computeLength(path2, 2006);
        assertTrue("Length should be > 0", length > 0);

        finishTest();
      }
    });

  }

  @SuppressWarnings("unused")
  public void testComputeOffset() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng from = LatLng.newInstance(49.496675, -102.65625);
        LatLng to = LatLng.newInstance(50.496675, -103.65625);
        int distance = 2006;
        int heading = 45;
        LatLng offset = SphericalUtils.computeOffset(from, distance, heading);
        assertEquals("(49.50941554956089, -102.63662616512198)", offset.getToString());

        finishTest();
      }
    });

  }

  @SuppressWarnings("unused")
  public void testComputeOffset_radius() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng from = LatLng.newInstance(49.496675, -102.65625);
        LatLng to = LatLng.newInstance(50.496675, -103.65625);
        int distance = 2006;
        int heading = 45;
        LatLng offset = SphericalUtils.computeOffset(from, distance, heading, 2006);
        assertEquals("(52.87142257631697, -2.9751884784654976)", offset.getToString());

        finishTest();
      }
    });

  }

  public void testComputeSignedArea1() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng[] array = new LatLng[3];
        array[0] = LatLng.newInstance(49.496675, -102.65625);
        array[1] = LatLng.newInstance(50.496675, -103.65625);
        array[2] = LatLng.newInstance(51.496675, -104.65625);
        JsArray<LatLng> loop = ArrayHelper.toJsArray(array);
        double area = SphericalUtils.computeSignedArea(loop);
        assertTrue("Area should be negative", area < 0);

        finishTest();
      }
    });

  }

  public void testComputeSignedArea1_radius() {

    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng[] array = new LatLng[3];
        array[0] = LatLng.newInstance(49.496675, -102.65625);
        array[1] = LatLng.newInstance(50.496675, -103.65625);
        array[2] = LatLng.newInstance(51.496675, -104.65625);
        JsArray<LatLng> loop = ArrayHelper.toJsArray(array);
        double area = SphericalUtils.computeSignedArea(loop, 2006);
        if (area < 0) {
          assertTrue(true);
        } else {
          assertTrue(false);
        }
        finishTest();
      }
    });

  }

  public void testComputeSignedArea2() {
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.GEOMETRY);

    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng[] array = new LatLng[3];
        array[0] = LatLng.newInstance(49.496675, -102.65625);
        array[1] = LatLng.newInstance(50.496675, -103.65625);
        array[2] = LatLng.newInstance(51.496675, -104.65625);
        JsArray<LatLng> path = ArrayHelper.toJsArray(array);
        MVCArray<LatLng> loop = MVCArray.newInstance(path);
        double area = SphericalUtils.computeSignedArea(loop);
        if (area < 0) {
          assertTrue(true);
        } else {
          assertTrue(false);
        }
        finishTest();
      }
    });

  }

  public void testComputeSignedArea2_radius() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng[] array = new LatLng[3];
        array[0] = LatLng.newInstance(49.496675, -102.65625);
        array[1] = LatLng.newInstance(50.496675, -103.65625);
        array[2] = LatLng.newInstance(51.496675, -104.65625);
        JsArray<LatLng> path = ArrayHelper.toJsArray(array);
        MVCArray<LatLng> loop = MVCArray.newInstance(path);
        double area = SphericalUtils.computeSignedArea(loop, 2006);
        assertTrue("Area should be negative", area < 0);

        finishTest();
      }
    });

  }

  public void testInterpolate() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng from = LatLng.newInstance(49.496675, -102.65625);
        LatLng to = LatLng.newInstance(50.496675, -103.65625);
        LatLng ll = SphericalUtils.interpolate(from, to, .50d);
        assertEquals("(49.99774917449739, -103.15105034281981)", ll.getToString());
        finishTest();
      }
    });

  }

}
