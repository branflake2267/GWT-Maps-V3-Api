package com.google.gwt.maps.client.events;

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
import com.google.gwt.maps.client.events.click.ClickMapEvent;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.user.client.ui.RootPanel;

public class MapHandlerRegistrationGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapOptions options = MapOptions.newInstance();
        MapWidget wMap = new MapWidget(options);
        RootPanel.get().add(wMap);
        wMap.addClickHandler(new ClickMapHandler() {
          @Override
          public void onEvent(ClickMapEvent event) {
          }
        });
        finishTest();
      }
    });

  }

  // public void testClick() {
  // asyncLibTest(new Runnable() {
  // public void run() {
  //
  // MapOptions options = MapOptions.newInstance();
  // MapWidget wMap = new MapWidget(options);
  // RootPanel.get().add(wMap);
  //
  // wMap.addClickHandler(new ClickMapHandler() {
  // public void onEvent(ClickMapEvent event) {
  // MouseEvent me = event.getMouseEvent();
  // LatLng ll = me.getLatLng();
  // System.out.println("click worked " + ll.getToString());
  //
  // // TODO
  //
  // finishTest();
  // }
  // });
  //
  //
  // //LatLng objects = LatLng.newInstance(35d, 35d);
  //
  // // TODO add marker here
  //
  //
  // //MapHandlerRegistration.trigger(wMap, MapEventType.CLICK, objects);
  // }
  // });

  // }

}
