package com.google.gwt.maps.client.service;

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

import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.services.DirectionsRenderer;
import com.google.gwt.maps.client.services.DirectionsRendererOptions;
import com.google.gwt.maps.client.services.DirectionsResult;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class DirectionsRendererGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.PLACES };
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsRendererOptions options = DirectionsRendererOptions.newInstance();
        DirectionsRenderer o = DirectionsRenderer.newInstance(options);
        finishTest();
      }
    });
  }

  public void testDirections() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsRendererOptions options = DirectionsRendererOptions.newInstance();
        DirectionsRenderer o = DirectionsRenderer.newInstance(options);
        DirectionsResult left = DirectionsResult.newInstance();
        o.setDirections(left);
        DirectionsResult right = o.getDirections();
        assertEquals(left.getRoutes().length(), right.getRoutes().length());
        finishTest();
      }
    });
  }

  public void testMap() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsRendererOptions options = DirectionsRendererOptions.newInstance();
        DirectionsRenderer o = DirectionsRenderer.newInstance(options);
        MapOptions opts = MapOptions.newInstance();
        MapWidget left = new MapWidget(opts);
        RootPanel.get().add(left);
        o.setMap(left);
        MapWidget right = o.getMap();
        assertEquals(left.getCenter().getToString(), right.getCenter().getToString());
        finishTest();
      }
    });
  }

  public void testPanel() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsRendererOptions options = DirectionsRendererOptions.newInstance();
        DirectionsRenderer o = DirectionsRenderer.newInstance(options);
        FlowPanel fp = new FlowPanel();
        Element left = fp.getElement();
        o.setPanel(left);
        Element right = o.getPanel();
        assertEquals(left.toString(), right.toString());
        finishTest();
      }
    });
  }

  public void testRouteIndex() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        DirectionsRendererOptions options = DirectionsRendererOptions.newInstance();
        DirectionsRenderer o = DirectionsRenderer.newInstance(options);
        int left = 5;
        o.setRouteIndex(left);
        int right = o.getRouteIndex();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

}
