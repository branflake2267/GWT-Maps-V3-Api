package com.google.gwt.maps.client.layers;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * 
 * {@link http://code.google.com/apis/maps/documentation/javascript/layers.html#KMLLayers}
 */
public class TrafficLayerTest extends GWTTestCase {

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
        TrafficLayer o = TrafficLayer.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testUse2() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng center = LatLng.newInstance(49.496675,-102.65625);
        MapOptions opts = MapOptions.newInstance();
        opts.setZoom(4);
        opts.setCenter(center);
        opts.setMapTypeId(MapTypeId.ROADMAP);
        
        MapWidget mapWidget = new MapWidget(opts);
        RootPanel.get().add(mapWidget);
        mapWidget.setSize("500px", "500px");
        
        TrafficLayer o = TrafficLayer.newInstance();
        o.setMap(mapWidget);
        
        MapWidget right = o.getMap();
        assertEquals(mapWidget.getCenter().getToString(), right.getCenter().getToString());
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  }
