package com.google.gwt.maps.client.events;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.events.click.ClickMapEvent;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.user.client.ui.RootPanel;

public class MapHandlerRegistrationTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;
  
  public String getModuleName() {
    return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
  }

  public void testWorks() {
    assertEquals(true, true);
  }
  
  public void testUse() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapOptions options = MapOptions.newInstance();
        MapWidget wMap = new MapWidget(options);
        RootPanel.get().add(wMap);
        wMap.addClickHandler(new ClickMapHandler() {
          public void onEvent(ClickMapEvent event) {
          }
        });
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

//  public void testClick() {
//    LoadApi.go(new Runnable() {
//      public void run() {
//        
//        MapOptions options = MapOptions.newInstance();
//        MapWidget wMap = new MapWidget(options);
//        RootPanel.get().add(wMap);
//        
//        wMap.addClickHandler(new ClickMapHandler() {
//          public void onEvent(ClickMapEvent event) {
//            MouseEvent me = event.getMouseEvent();
//            LatLng ll = me.getLatLng();
//            System.out.println("click worked " + ll.getToString()); 
//            
//            // TODO
//            
//            finishTest();
//          }
//        });
//        
//        
//        //LatLng objects = LatLng.newInstance(35d, 35d);
//        
//        // TODO add marker here
//        
//        
//        //MapHandlerRegistration.trigger(wMap, MapEventType.CLICK, objects);
//      }
//    }, false);
//    delayTestFinish(ASYNC_DELAY_MS);
//  }
  
}
