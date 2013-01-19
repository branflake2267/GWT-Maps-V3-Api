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
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.drawinglib.DrawingManager;
import com.google.gwt.maps.client.drawinglib.DrawingManagerOptions;
import com.google.gwt.maps.client.drawinglib.OverlayType;
import com.google.gwt.user.client.ui.RootPanel;

public class DrawingManagerGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.DRAWING };
  }

  public void testDrawingMode() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DrawingManagerOptions options = DrawingManagerOptions.newInstance();
        OverlayType left = OverlayType.CIRCLE;
        options.setDrawingMode(left);
        DrawingManager o = DrawingManager.newInstance(options);
        OverlayType right = o.getDrawingMode();
        assertEquals(left, right);
        o.setDrawingMode(OverlayType.MARKER);
        right = o.getDrawingMode();
        assertEquals(OverlayType.MARKER, right);

        finishTest();
      }
    });

  }

  public void testDrawingMode_null() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        DrawingManagerOptions options = DrawingManagerOptions.newInstance();

        // ensure we can set it null
        DrawingManager o = DrawingManager.newInstance(options);
        o.setDrawingMode(null);
        OverlayType actual = o.getDrawingMode();
        assertNull("DrawingMode should have been set null", actual);

        // ensure we can reset it
        OverlayType expectd = OverlayType.MARKER;
        o.setDrawingMode(expectd);
        actual = o.getDrawingMode();
        assertEquals("DrawingMode should have been set not null", expectd, actual);

        finishTest();
      }
    });

  }

  public void testMap() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapOptions optionsMap = MapOptions.newInstance();
        MapWidget left = new MapWidget(optionsMap);
        RootPanel.get().add(left);
        left.setSize("500px", "500px");

        DrawingManagerOptions options = DrawingManagerOptions.newInstance();
        options.setDrawingMode(OverlayType.CIRCLE);
        DrawingManager o = DrawingManager.newInstance(options);
        o.setMap(left);

        MapWidget right = o.getMap();
        assertEquals(left.getCenter().getToString(), right.getCenter().getToString());

        finishTest();
      }
    });

  }

  public void testMap_null() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapOptions optionsMap = MapOptions.newInstance();
        MapWidget expected = new MapWidget(optionsMap);
        RootPanel.get().add(expected);
        expected.setSize("500px", "500px");

        DrawingManagerOptions options = DrawingManagerOptions.newInstance();
        DrawingManager o = DrawingManager.newInstance(options);
        o.setMap(null);

        MapWidget actual = o.getMap();
        assertNull("Map should be null now", actual);

        finishTest();
      }
    });

  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DrawingManagerOptions options = DrawingManagerOptions.newInstance();
        DrawingManager o = DrawingManager.newInstance(options);
        finishTest();
      }
    });

  }
}
