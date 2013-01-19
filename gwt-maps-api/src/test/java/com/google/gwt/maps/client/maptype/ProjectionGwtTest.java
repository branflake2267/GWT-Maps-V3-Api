package com.google.gwt.maps.client.maptype;

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
import com.google.gwt.maps.client.base.Point;
import com.google.gwt.maps.client.events.projection.ProjectionChangeMapEvent;
import com.google.gwt.maps.client.events.projection.ProjectionChangeMapHandler;
import com.google.gwt.maps.client.maptypes.Projection;
import com.google.gwt.user.client.ui.RootPanel;

public class ProjectionGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapOptions options = MapOptions.newInstance();
        MapWidget wMap = new MapWidget(options);
        Projection p = wMap.getProjection();
        finishTest();
      }
    });
  }

  public void testFromLatLngToPoint() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapOptions options = MapOptions.newInstance();
        MapWidget wMap = new MapWidget(options);
        Projection p = wMap.getProjection();
        Point point = Point.newInstance(4d, 3d);
        LatLng latlng = LatLng.newInstance(35d, 38d);
        Point p2 = p.fromLatLngToPoint(latlng, point);
        assertEquals("(155.0222222222222, 101.40104481443532)", p2.getToString());
        finishTest();
      }
    });
  }

  public void testFromPointToLatLng() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapOptions options = MapOptions.newInstance();
        final MapWidget w = new MapWidget(options);
        RootPanel.get().add(w);
        
//        w.addProjectionChangeHandler(new ProjectionChangeMapHandler() {
//          @Override
//          public void onEvent(ProjectionChangeMapEvent event) {
            Projection projection = w.getProjection();
            assertNotNull(projection);
            
            Projection p = w.getProjection();
            Point point = Point.newInstance(4d, 3d);
            LatLng p2 = p.fromPointToLatLng(point, false);
            assertEquals("(84.67351256610525, -174.375)", p2.getToString());
            finishTest();
//          }
//        });
      }
    });
  }

}
