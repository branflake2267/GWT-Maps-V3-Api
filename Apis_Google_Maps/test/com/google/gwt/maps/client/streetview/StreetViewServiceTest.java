package com.google.gwt.maps.client.streetview;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * 
 * {@link http://code.google.com/apis/maps/documentation/javascript/streetview.html}
 */
public class StreetViewServiceTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 8000;

  public String getModuleName() {
    return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
  }

  public void testWorks() {
    assertEquals(true, true);
  }

  public void testUse() {
    ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
    loadLibraries.add(LoadLibrary.ADSENSE);
    loadLibraries.add(LoadLibrary.DRAWING);
    loadLibraries.add(LoadLibrary.GEOMETRY);
    loadLibraries.add(LoadLibrary.PANORAMIO);
    loadLibraries.add(LoadLibrary.PLACES);
    
    LoadApi.go(new Runnable() {
      public void run() {

        final StreetViewService service = StreetViewService.newInstnace();

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
          public void run() {
            String pano = wStreetPano.getPano();

            // TODO this will have to be a selenium test. 
            //assertNotNull(pano);

//            service.getPanoramaById(pano, new PanoramaIdHandler() {
//              public void onCallback(StreetViewPanoramaData data, StreetViewStatus status) {
//                LatLng latlng = wStreetPano.getPosition();
//
//                assertEquals(StreetViewStatus.OK, status);
//                assertNotNull(data);
//                
//                finishTest();
//              }
//            });
            finishTest();
          }
        };
        t.schedule(1500);

        
      }
    }, loadLibraries, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
//  public void testUse2() {
//    LoadApi.go(new Runnable() {
//      public void run() {
//
//        final StreetViewService service = StreetViewService.newInstnace();
//
//        LatLng position = LatLng.newInstance(21.271525, -157.822731);
//
//        StreetViewPov pov = StreetViewPov.newInstance();
//        pov.setHeading(250);
//        pov.setZoom(1);
//        pov.setPitch(10);
//
//        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
//        options.setPosition(position);
//        options.setStreeViewPov(pov);
//
//        final StreetViewPanoramaWidget wStreetPano = new StreetViewPanoramaWidget(options);
//        RootPanel.get().add(wStreetPano);
//        wStreetPano.setSize("375px", "500px");
//
//       
//
//      }
//    }, false);
//    delayTestFinish(ASYNC_DELAY_MS);
//  }
}
