package com.google.gwt.maps.client.streetview;

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
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * 
 * See <a href= "https://developers.google.com/maps/documentation/javascript/streetview" >StreetView API Doc</a>
 */
public class StreetViewServiceGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.ADSENSE, LoadLibrary.DRAWING, LoadLibrary.GEOMETRY, LoadLibrary.PANORAMIO,
        LoadLibrary.PLACES };
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {

        final StreetViewService service = StreetViewService.newInstance();

        LatLng position = LatLng.newInstance(21.271525, -157.822731);

        StreetViewPov pov = StreetViewPov.newInstance();
        pov.setHeading(250);
        pov.setZoom(1);
        pov.setPitch(10);

        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        options.setPosition(position);
        options.setStreeViewPov(pov);

        final StreetViewPanoramaWidget wStreetPano = new StreetViewPanoramaWidget(options);
        RootPanel.get().add(wStreetPano);
        wStreetPano.setSize("375px", "500px");

        Timer t = new Timer() {
          @Override
          public void run() {
            String pano = wStreetPano.getPano();

            // TODO this will have to be a selenium test.
            // assertNotNull(pano);

            // service.getPanoramaById(pano, new PanoramaIdHandler()
            // {
            // public void onCallback(StreetViewPanoramaData data,
            // StreetViewStatus status) {
            // LatLng latlng = wStreetPano.getPosition();
            //
            // assertEquals(StreetViewStatus.OK, status);
            // assertNotNull(data);
            //
            // finishTest();
            // }
            // });
            finishTest();
          }
        };
        t.schedule(1500);

      }
    });

  }

  // public void testUse2() {
  // asyncLibTest(new Runnable() {
  // public void run() {
  //
  // final StreetViewService service = StreetViewService.newInstnace();
  //
  // LatLng position = LatLng.newInstance(21.271525, -157.822731);
  //
  // StreetViewPov pov = StreetViewPov.newInstance();
  // pov.setHeading(250);
  // pov.setZoom(1);
  // pov.setPitch(10);
  //
  // StreetViewPanoramaOptions options =
  // StreetViewPanoramaOptions.newInstance();
  // options.setPosition(position);
  // options.setStreeViewPov(pov);
  //
  // final StreetViewPanoramaWidget wStreetPano = new
  // StreetViewPanoramaWidget(options);
  // RootPanel.get().add(wStreetPano);
  // wStreetPano.setSize("375px", "500px");
  //
  //
  //
  // }
  // }, false);

  // }
}
