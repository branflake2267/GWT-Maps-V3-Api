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

import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class PointGwtTest extends AbstractMapsGWTTestHelper {

  public static final double MOCK_X = 2.2d;
  public static final double MOCK_Y = 3.3d;

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  public void testEquals() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        Point p = Point.newInstance(MOCK_X, MOCK_Y);
        Point p2 = Point.newInstance(MOCK_X, MOCK_Y);
        boolean b = p.equals(p2);
        assertEquals(true, b);
        finishTest();
      }
    });
  }

  public void testNotEquals() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        Point p = Point.newInstance(MOCK_X, MOCK_Y);
        Point p2 = Point.newInstance(MOCK_X, MOCK_Y + 1);
        boolean b = p.equals(p2);
        assertEquals(false, b);
        finishTest();
      }
    });
  }

  public void testToString() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        Point p = Point.newInstance(MOCK_X, MOCK_Y);

        String xStr = NumberFormat.getFormat("#.#").format(MOCK_X);
        String yStr = NumberFormat.getFormat("#.#").format(MOCK_Y);
        String expected = "(" + xStr + ", " + yStr + ")"; // oddly
        // trailing
        // zeros are
        // truncated
        // in API
        // toString

        assertEquals(expected, p.getToString());
        finishTest();
      }
    });
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        Point p = Point.newInstance(MOCK_X, MOCK_Y);
        finishTest();
      }
    });
  }

  public void testXandY() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        Point p = Point.newInstance(MOCK_X, MOCK_Y);
        assertEquals(MOCK_X, p.getX());
        assertEquals(MOCK_Y, p.getY());
        finishTest();
      }
    });
  }
}