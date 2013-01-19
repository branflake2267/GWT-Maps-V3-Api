package com.google.gwt.maps.client.base;

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

public class LatLngGwtTest extends AbstractMapsGWTTestHelper {

  public static final double MOCK_LAT = 38.0d;
  public static final double MOCK_LNG = 35.5d;

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  public void testEqualsIsEqual() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng left = LatLng.newInstance(MOCK_LAT, MOCK_LNG);
        LatLng right = LatLng.newInstance(MOCK_LAT, MOCK_LNG);
        boolean equals = left.equals(right);
        assertEquals(true, equals);
        finishTest();
      }
    });
  }

  public void testEqualsIsNotEqual() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng left = LatLng.newInstance(MOCK_LAT + 0.3d, MOCK_LNG, false);
        LatLng right = LatLng.newInstance(MOCK_LAT, MOCK_LNG);
        boolean equals = left.equals(right);
        assertEquals(false, equals);
        finishTest();
      }
    });
  }

  public void testGetLatitude() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        double expected = MOCK_LAT + 0.3;
        LatLng ll = LatLng.newInstance(MOCK_LAT + 0.3d, MOCK_LNG);
        double actual = ll.getLatitude();
        assertEquals(expected, actual);
        finishTest();
      }
    });
  }

  public void testGetLongitude() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng ll = LatLng.newInstance(MOCK_LAT + 0.3d, MOCK_LNG);
        double right = ll.getLongitude();
        assertEquals(MOCK_LNG, right);
        finishTest();
      }
    });
  }

  public void testGetToString() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng ll = LatLng.newInstance(MOCK_LAT + 0.3d, MOCK_LNG);
        String left = "(38.3, 35.5)";
        String right = ll.getToString();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testGetToUrlValue() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng ll = LatLng.newInstance(38.12345678901234567890d, 35.12345678901234567890d);
        String left = "38.123456789,35.123456789";
        String right = ll.getToUrlValue(10);
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng ll = LatLng.newInstance(MOCK_LAT, MOCK_LNG);
        finishTest();
      }
    });

  }

  @SuppressWarnings("unused")
  public void testUse2() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng ll = LatLng.newInstance(MOCK_LAT, MOCK_LNG);
        finishTest();
      }
    });
  }

  @SuppressWarnings("unused")
  public void testUse3() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng ll = LatLng.newInstance(MOCK_LAT, MOCK_LNG, true);
        finishTest();
      }
    });

  }

  public void testWrapping() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        // range overflow
        LatLng ll = LatLng.newInstance(99.4d, 184.4d);
        assertEquals(90d, ll.getLatitude());
        assertEquals(-175.60000000000002d, ll.getLongitude());

        // range underflow
        LatLng ll2 = LatLng.newInstance(-99.4d, -184.4d);
        assertEquals(-90d, ll2.getLatitude());
        assertEquals(175.60000000000002d, ll2.getLongitude()); // TODO
        // precision
        // issue,
        finishTest();
      }
    });
  }

}
