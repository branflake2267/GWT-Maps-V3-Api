package com.google.gwt.maps.client.drawing;

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
import com.google.gwt.maps.client.controls.ControlPosition;
import com.google.gwt.maps.client.drawinglib.DrawingControlOptions;
import com.google.gwt.maps.client.drawinglib.OverlayType;

public class DrawingControlOptionsGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  public void testDefaults() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DrawingControlOptions o = DrawingControlOptions.newInstance();

        ControlPosition actual = o.getPosition();
        assertEquals("Should be default value", ControlPosition.TOP_LEFT, actual);

        OverlayType[] expected = new OverlayType[] { OverlayType.MARKER, OverlayType.POLYLINE, OverlayType.RECTANGLE,
            OverlayType.CIRCLE, OverlayType.POLYGON };
        OverlayType[] actualTypes = o.getDrawingModes();
        for (int n = 0; n < expected.length; n++) {
          assertEquals("Value [" + n + "] should match default", expected[n], actualTypes[n]);
        }
        assertEquals("Arrays should be same size", expected.length, actualTypes.length);

        finishTest();
      }
    });

  }

  public void testDrawingModes() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        OverlayType[] left = OverlayType.values();
        DrawingControlOptions o = DrawingControlOptions.newInstance();
        o.setDrawingModes(left);
        OverlayType[] right = o.getDrawingModes();
        assertEquals(left.length, right.length);
        assertEquals(left[0].value(), right[0].value());
        assertEquals(left[1].value(), right[1].value());
        assertEquals(left[2].value(), right[2].value());
        finishTest();
      }
    });

  }

  public void testPosition() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DrawingControlOptions o = DrawingControlOptions.newInstance();
        ControlPosition left = ControlPosition.TOP_CENTER;
        o.setPosition(left);
        ControlPosition right = o.getPosition();
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
        DrawingControlOptions o = DrawingControlOptions.newInstance();
        finishTest();
      }
    });

  }
}
