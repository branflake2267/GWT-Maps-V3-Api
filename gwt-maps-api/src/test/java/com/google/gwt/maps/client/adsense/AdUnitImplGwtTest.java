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
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class AdUnitImplGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.ADSENSE };
  }

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

        FlowPanel fp = new FlowPanel();
        Element element = fp.getElement();
        AdUnitImpl o = AdUnitImpl.newInstance(element, options);

        assertEquals(options.getMap().getElement(), o.getMap().getElement());
        assertEquals(options.getPublisherId(), o.getPublisherId());
        assertEquals(options.getChannelNumber(), o.getChannelNumber());
        assertEquals(options.getFormat(), o.getFormat());
        assertNotNull(o.getContainer());

        finishTest();
      }
    });
  }
}
