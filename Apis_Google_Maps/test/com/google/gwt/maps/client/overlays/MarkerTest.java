package com.google.gwt.maps.client.overlays;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaOptions;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaWidget;

public class MarkerTest extends GWTTestCase {

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
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testAnimation() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        Animation left = Animation.BOUNCE;
        o.setAnimation(left);
        Animation right = o.getAnimation();
        assertEquals(left.value(), right.value());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testClickable() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        String left = "help";
        o.setCursor(left);
        String right = o.getCursor();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testCursor() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        boolean left = true;
        o.setClickable(left);
        boolean right = o.getClickable();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testDraggable() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        boolean left = true;
        o.setDraggable(left);
        boolean right = o.getDraggable();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testFlat() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        boolean left = true;
        o.setFlat(left);
        boolean right = o.getFlat();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testIcon_String() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        String left = "icontest";
        o.setIcon(left);
        String right = o.getIcon_String();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testIcon_MarkerImage_() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        String url = "images/target.png";
        MarkerImage left = MarkerImage.newInstance(url);
        o.setIcon(left);
        MarkerImage right = o.getIcon_MarkerImage();
        assertEquals(left.getUrl(), right.getUrl());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testMap_Map() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        MapOptions mapOptions = MapOptions.newInstance();
        MapWidget left = new MapWidget(mapOptions);
        o.setMap(left);
        MapWidget right = o.getMap();
        assertEquals(left.getCenter().getToString(), right.getCenter().getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testMap_StreetViewPanorama() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        StreetViewPanoramaOptions optionsStreet = StreetViewPanoramaOptions.newInstance();
        optionsStreet.setPano("test");
        StreetViewPanoramaWidget left = new StreetViewPanoramaWidget(optionsStreet);
        o.setMap(left);
        StreetViewPanoramaWidget right = o.getMap_StreetViewPanorama();
        assertEquals(left.getPano(), right.getPano());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testPosition() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        LatLng left = LatLng.newInstance(35, 38);
        o.setPosition(left);
        LatLng right = o.getPosition();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testShadow_String() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        String left = "test";
        o.setShadow(left);
        String right = o.getShadow_String();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testShadow_Marker() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        MarkerImage left = MarkerImage.newInstance("images/target.png");
        o.setShadow(left);
        MarkerImage right = o.getShadow_MarkerImage();
        assertEquals(left.getUrl(), right.getUrl());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testShadow_Shape() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        MarkerShape left = MarkerShape.newInstance();
        left.setType(MarkerShapeType.CIRCLE);
        o.setShape(left);
        MarkerShape right = o.getShape();
        assertEquals(left.getType().value(), right.getType().value());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testTitle() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        String left = "test";
        o.setTitle(left);
        String right = o.getTitle();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testVisible() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        boolean left = true;
        o.setVisible(left);
        boolean right = o.getVisible();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testZindex() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        int left = 5;
        o.setZindex(left);
        int right = o.getZindex();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testMaxZindex() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        int right = o.getMax_Zindex();
        assertEquals(1000000, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testClose() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        MapOptions mapOptions = MapOptions.newInstance();
        MapWidget left = new MapWidget(mapOptions);
        o.setMap(left);
        MapWidget right = o.getMap();
        o.close();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  
  public void testClose2() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions options = MarkerOptions.newInstance();
        Marker o = Marker.newInstance(options);
        MapOptions mapOptions = MapOptions.newInstance();
        MapWidget left = new MapWidget(mapOptions);
        o.setMap(left);
        MapWidget right = o.getMap();
        o.setMap((MapWidget)null);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
}
