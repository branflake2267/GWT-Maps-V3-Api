package com.google.gwt.maps.client.adsense;

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
import com.google.gwt.maps.client.controls.ControlPosition;
import com.google.gwt.user.client.ui.RootPanel;

public class AdUnitWidgetGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.ADSENSE };
  }

  public void testChannelNumber() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        MapOptions optionsMap = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(optionsMap);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        AdUnitOptions options = AdUnitOptions.newInstance();
        options.setFormat(AdFormat.HALF_BANNER);
        options.setPosition(ControlPosition.RIGHT_CENTER);
        options.setMap(mapWidget);
        options.setPublisherId("pub-0032065764310410");
        options.setChannelNumber("4000893900");
        AdUnitWidget o = new AdUnitWidget(options);

        String right = o.getChannelNumber();
        assertEquals("4000893900", right);

        finishTest();
      }
    });
  }

  public void testContainer() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        MapOptions optionsMap = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(optionsMap);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        AdUnitOptions options = AdUnitOptions.newInstance();
        options.setFormat(AdFormat.HALF_BANNER);
        options.setPosition(ControlPosition.RIGHT_CENTER);
        options.setMap(mapWidget);
        options.setPublisherId("pub-0032065764310410");
        options.setChannelNumber("4000893900");
        AdUnitWidget o = new AdUnitWidget(options);

        Element right = o.getContainer();
        String sright = right.getInnerHTML();
        assertEquals("<span></span>", sright);

        finishTest();
      }
    });
  }

  public void testFormat() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        MapOptions optionsMap = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(optionsMap);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        AdUnitOptions options = AdUnitOptions.newInstance();
        options.setFormat(AdFormat.HALF_BANNER);
        options.setPosition(ControlPosition.RIGHT_CENTER);
        options.setMap(mapWidget);
        options.setPublisherId("pub-0032065764310410");
        options.setChannelNumber("4000893900");

        AdUnitWidget o = new AdUnitWidget(options);
        AdFormat right = o.getFormat();

        assertEquals(options.getFormat(), right);

        finishTest();
      }
    });
  }

  public void testMap() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapOptions optionsMap = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(optionsMap);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        AdUnitOptions options = AdUnitOptions.newInstance();
        options.setFormat(AdFormat.HALF_BANNER);
        options.setPosition(ControlPosition.RIGHT_CENTER);
        options.setMap(mapWidget);
        options.setPublisherId("pub-0032065764310410");
        options.setChannelNumber("4000893900");
        AdUnitWidget o = new AdUnitWidget(options);

        MapWidget right = o.getMap();
        assertTrue(right.toString().contains("div"));

        finishTest();
      }
    });
  }

  public void testPosition() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        MapOptions optionsMap = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(optionsMap);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        AdUnitOptions options = AdUnitOptions.newInstance();
        options.setFormat(AdFormat.HALF_BANNER);
        options.setPosition(ControlPosition.RIGHT_CENTER);
        options.setMap(mapWidget);
        options.setPublisherId("pub-0032065764310410");
        options.setChannelNumber("4000893900");
        AdUnitWidget o = new AdUnitWidget(options);

        o.setPosition(ControlPosition.TOP_CENTER);
        ControlPosition right = o.getPosition();
        assertEquals(ControlPosition.TOP_CENTER, right);

        finishTest();
      }
    });
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        MapOptions optionsMap = MapOptions.newInstance();
        MapWidget mapWidget = new MapWidget(optionsMap);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");

        AdUnitOptions options = AdUnitOptions.newInstance();
        options.setFormat(AdFormat.HALF_BANNER);
        options.setPosition(ControlPosition.RIGHT_CENTER);
        options.setMap(mapWidget);
        options.setPublisherId("pub-0032065764310410");
        options.setChannelNumber("4000893900");
        AdUnitWidget o = new AdUnitWidget(options);

        finishTest();
      }
    });
  }

}
