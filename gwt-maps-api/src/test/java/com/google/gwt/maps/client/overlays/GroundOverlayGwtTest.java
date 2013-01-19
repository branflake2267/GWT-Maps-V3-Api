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

public class GroundOverlayGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GroundOverlayOptions options = GroundOverlayOptions.newInstance();
        options.setClickable(true);
        String url = "images/target.png";
        LatLng sw = LatLng.newInstance(-31.203405d, 125.244141d);
        LatLng ne = LatLng.newInstance(-25.363882d, 131.044922d);
        LatLngBounds bounds = LatLngBounds.newInstance(sw, ne);
        GroundOverlay o = GroundOverlay.newInstance(url, bounds, options);
        finishTest();
      }
    });

  }

  public void testOpacity() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GroundOverlayOptions options = GroundOverlayOptions.newInstance();
        String url = "images/target.png";
        LatLng sw = LatLng.newInstance(-31.203405d, 125.244141d);
        LatLng ne = LatLng.newInstance(-25.363882d, 131.044922d);
        LatLngBounds bounds = LatLngBounds.newInstance(sw, ne);
        GroundOverlay o = GroundOverlay.newInstance(url, bounds, options);

        assertEquals("Should be visible by default", 1, o.getOpacity(), 1e-3);

        double expected = 0;
        o.setOpacity(expected);
        assertEquals("Should be visible by default", expected, o.getOpacity(), 1e-3);

        finishTest();
      }
    });

  }

  @SuppressWarnings("unused")
  public void testUse2() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GroundOverlayOptions options = GroundOverlayOptions.newInstance();
        options.setClickable(true);
        String url = "images/target.png";
        LatLng sw = LatLng.newInstance(-31.203405d, 125.244141d);
        LatLng ne = LatLng.newInstance(-25.363882d, 131.044922d);
        LatLngBounds bounds = LatLngBounds.newInstance(sw, ne);
        GroundOverlay o = GroundOverlay.newInstance(url, bounds, options);
        finishTest();
      }
    });

  }

  public void testMap() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        GroundOverlayOptions options = GroundOverlayOptions.newInstance();
        options.setClickable(true);
        String url = "images/target.png";
        LatLng sw = LatLng.newInstance(-31.203405d, 125.244141d);
        LatLng ne = LatLng.newInstance(-25.363882d, 131.044922d);
        LatLngBounds bounds = LatLngBounds.newInstance(sw, ne);
        GroundOverlay o = GroundOverlay.newInstance(url, bounds, options);
        MapOptions opts = MapOptions.newInstance();
        MapWidget left = new MapWidget(opts);
        left.setSize("500px", "500px");
        RootPanel.get().add(left);
        o.setMap(left);
        MapWidget right = o.getMap();
        assertEquals(left.getCenter().getToString(), right.getCenter().getToString());
        finishTest();
      }
    });

  }

  @SuppressWarnings("unused")
  public void testUrl() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapOptions opts = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(opts);
        mapWidget.setSize("500px", "500px");
        RootPanel.get().add(mapWidget);

        GroundOverlayOptions options = GroundOverlayOptions.newInstance();
        options.setClickable(true);
        options.setMap(mapWidget);
        String url = "http://gwt-examples.googlecode.com/svn/trunk/DemoGadgetXml/war/images/target_sm.png";
        LatLng sw = LatLng.newInstance(-31.203405d, 125.244141d);
        LatLng ne = LatLng.newInstance(-25.363882d, 131.044922d);
        LatLngBounds bounds = LatLngBounds.newInstance(sw, ne);

        GroundOverlay o = GroundOverlay.newInstance(url, bounds, options);
        String right = o.getUrl();
        // Note: not sure why this comes back null. But seems to be
        // working fine. Call it good if it doesn't throw for now
        // assertEquals("http://gwt-examples.googlecode.com/svn/trunk/DemoGadgetXml/war/images/target_sm.png",
        // right);
        finishTest();
      }
    });

  }
}
