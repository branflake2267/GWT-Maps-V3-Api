package com.google.gwt.maps.client.panoramio;

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
import com.google.gwt.maps.client.panoramiolib.PanoramioLayerOptions;
import com.google.gwt.user.client.ui.RootPanel;

public class PanoramioOptionsGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PanoramioLayerOptions o = PanoramioLayerOptions.newInstance();
        finishTest();
      }
    });

  }

  public void testClickable() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PanoramioLayerOptions o = PanoramioLayerOptions.newInstance();
        boolean left = true;
        o.setClickable(left);
        boolean right = o.getClickable();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testMap() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PanoramioLayerOptions o = PanoramioLayerOptions.newInstance();
        MapOptions options = MapOptions.newInstance();
        MapWidget left = new MapWidget(options);
        left.setSize("500px", "500px");
        RootPanel.get().add(left);
        o.setMap(left);
        MapWidget right = o.getMap();
        assertEquals(left.getCenter(), right.getCenter());
        finishTest();
      }
    });

  }

  public void testSupresseInfoWidnows() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PanoramioLayerOptions o = PanoramioLayerOptions.newInstance();
        boolean left = true;
        o.setSuppressInfoWindows(left);
        boolean right = o.getSuppressInfoWindows();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testTag() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PanoramioLayerOptions o = PanoramioLayerOptions.newInstance();
        String left = "tagtest";
        o.setTag(left);
        String right = o.getTag();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testUserId() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        PanoramioLayerOptions o = PanoramioLayerOptions.newInstance();
        String left = "userIdTest";
        o.setUserId(left);
        String right = o.getUserId();
        assertEquals(left, right);
        finishTest();
      }
    });

  }
}
