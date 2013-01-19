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
import com.google.gwt.maps.client.drawinglib.DrawingControlOptions;
import com.google.gwt.maps.client.drawinglib.DrawingManagerOptions;
import com.google.gwt.maps.client.drawinglib.OverlayType;
import com.google.gwt.maps.client.overlays.CircleOptions;
import com.google.gwt.maps.client.overlays.MarkerOptions;
import com.google.gwt.maps.client.overlays.PolygonOptions;
import com.google.gwt.maps.client.overlays.PolylineOptions;
import com.google.gwt.maps.client.overlays.RectangleOptions;
import com.google.gwt.user.client.ui.RootPanel;

public class DrawingManagerOptionsGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  public void testCircleOptions() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DrawingManagerOptions o = DrawingManagerOptions.newInstance();
        CircleOptions left = CircleOptions.newInstance();
        left.setClickable(true);
        o.setCircleOptions(left);
        CircleOptions right = o.getCircleOptions();
        assertEquals(left.getClickable(), right.getClickable());
        finishTest();
      }
    });

  }

  public void testDefault() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DrawingManagerOptions o = DrawingManagerOptions.newInstance();

        assertTrue("Should be TRUE by default", o.getDrawingControl());

        finishTest();
      }
    });

  }

  @SuppressWarnings("unused")
  public void testDrawingControl() {
    boolean sensor = false;
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DrawingManagerOptions o = DrawingManagerOptions.newInstance();
        boolean left = true;
        o.setDrawingControl(left);
        boolean right = o.getDrawingControl();
        finishTest();
      }
    });

  }

  public void testDrawingControlOptions() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DrawingManagerOptions o = DrawingManagerOptions.newInstance();
        DrawingControlOptions left = DrawingControlOptions.newInstance();
        left.setDrawingModes(OverlayType.values());
        o.setDrawingControlOptions(left);
        DrawingControlOptions right = o.getDrawingControlOptions();
        assertEquals(left.getDrawingModes().length, right.getDrawingModes().length);
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
        options.setMap(left);
        MapWidget right = options.getMap();
        assertEquals(left.getCenter().getToString(), right.getCenter().getToString());

        finishTest();
      }
    });

  }

  public void testMarkerOptions() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        DrawingManagerOptions o = DrawingManagerOptions.newInstance();
        MarkerOptions left = MarkerOptions.newInstance();
        left.setClickable(true);
        o.setMarkerOptions(left);
        MarkerOptions right = o.getMarkerOptions();
        assertEquals(left.getClickable(), right.getClickable());
        finishTest();
      }
    });

  }

  public void testPolygonOptions() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DrawingManagerOptions o = DrawingManagerOptions.newInstance();
        PolygonOptions left = PolygonOptions.newInstance();
        left.setClickable(true);
        o.setPolygonOptions(left);
        PolygonOptions right = o.getPolygonOptions();
        assertEquals(left.getClickable(), right.getClickable());
        finishTest();
      }
    });

  }

  public void testPolylineOptions() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DrawingManagerOptions o = DrawingManagerOptions.newInstance();
        PolylineOptions left = PolylineOptions.newInstance();
        left.setClickable(true);
        o.setPolylineOptions(left);
        PolylineOptions right = o.getPolylineOptions();
        assertEquals(left.getClickable(), right.getClickable());
        finishTest();
      }
    });

  }

  public void testRectangleOptions() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DrawingManagerOptions o = DrawingManagerOptions.newInstance();
        RectangleOptions left = RectangleOptions.newInstance();
        left.setClickable(true);
        o.setRectangleOptions(left);
        RectangleOptions right = o.getRectangleOptions();
        assertEquals(left.getClickable(), right.getClickable());
        finishTest();
      }
    });

  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DrawingManagerOptions o = DrawingManagerOptions.newInstance();
        finishTest();
      }
    });

  }
}
