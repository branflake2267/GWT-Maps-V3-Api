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

import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class InfoWindowGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        InfoWindowOptions options = InfoWindowOptions.newInstance();
        InfoWindow o = InfoWindow.newInstance(options);
        finishTest();
      }
    });

  }

  public void testClose() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        InfoWindowOptions options = InfoWindowOptions.newInstance();
        InfoWindow o = InfoWindow.newInstance(options);
        o.close();
        finishTest();
      }
    });

  }

  public void testContentString() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        InfoWindowOptions options = InfoWindowOptions.newInstance();
        InfoWindow o = InfoWindow.newInstance(options);
        String left = "test123";
        o.setContent(left);
        String right = o.getContent_String();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testContentElement() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        InfoWindowOptions options = InfoWindowOptions.newInstance();
        InfoWindow o = InfoWindow.newInstance(options);
        FlowPanel fp = new FlowPanel();
        Element left = fp.getElement();
        o.setContent(left);
        Element right = o.getContent_Node();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testPosition() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        InfoWindowOptions options = InfoWindowOptions.newInstance();
        InfoWindow o = InfoWindow.newInstance(options);
        LatLng left = LatLng.newInstance(35, 38);
        o.setPosition(left);
        LatLng right = o.getPosition();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testZindex() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        InfoWindowOptions options = InfoWindowOptions.newInstance();
        InfoWindow o = InfoWindow.newInstance(options);
        int left = 2;
        o.setZindex(left);
        int right = o.getZindex();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testOpenMapwidget() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapOptions mopts = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(mopts);
        mapWidget.setSize("500px", "500px");
        RootPanel.get().add(mapWidget);

        LatLng center = mapWidget.getCenter();

        InfoWindowOptions options = InfoWindowOptions.newInstance();
        options.setContent("test123");
        options.setPosition(center);

        InfoWindow o = InfoWindow.newInstance(options);

        o.open(mapWidget);

        // TODO add to render testing

        finishTest();
      }
    });

  }

  // TODO open mapwidget anchor

  // TODO open streetviewpanoramawidget

  // TODO open streetviewpanoramawidget anchor

}
