package com.google.gwt.maps.client.overlays;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaOptions;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaWidget;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class MarkerOptionsTest extends GWTTestCase {

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
        MarkerOptions o = MarkerOptions.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testAnimation() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
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
        MarkerOptions o = MarkerOptions.newInstance();
        boolean left = true;
        o.setClickable(left);
        boolean right = o.getClickable();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testCursor() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        String left = "test";
        o.setCursor(left);
        String right = o.getCursor();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testDraggable() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
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
        MarkerOptions o = MarkerOptions.newInstance();
        boolean left = true;
        o.setFlat(left);
        boolean right = o.getFlat();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testIcon() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        String left = "test";
        o.setIcon(left);
        String right = o.getIcon_String();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testIconAsMarkerImage() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        String url = "image/target.png";
        MarkerImage left = MarkerImage.newInstance(url);
        o.setIcon(left);
        MarkerImage right = o.getIcon_MarkerImage();
        assertEquals(left.getUrl(), right.getUrl());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testIconMap() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        MapOptions options = MapOptions.newInstance();
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);
        MapWidget left = new MapWidget(options);
        o.setMap(left);
        MapWidget right = o.getMapWidget();
        assertEquals(left.getCenter().getToString(), right.getCenter().getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testIconStreetViewPanorama() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        FlowPanel fp = new FlowPanel();
        StreetViewPanoramaOptions options = StreetViewPanoramaOptions.newInstance();
        options.setPano("testing");
        StreetViewPanoramaWidget left = new StreetViewPanoramaWidget(options);
        o.setMap(left);
        StreetViewPanoramaWidget right = o.getMapStreetViewPanoramaWidget();
        assertEquals(left.getPano(), right.getPano());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testOptimized() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        boolean left = true;
        o.setOptimized(left);
        boolean right = o.getOptimized();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testPosition() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        LatLng left = LatLng.newInstance(35, 38);
        o.setPosition(left);
        LatLng right = o.getPosition();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testRaiseOnDrag() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        boolean left = true;
        o.setRaiseOnDrag(left);
        boolean right = o.getRaiseOnDrag();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testShadow() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        String left = "shadow";
        o.setShadow(left);
        String right = o.getShadow_String();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testShadowMarkerImage() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        MarkerImage left = MarkerImage.newInstance("images/target.png");
        o.setShadow(left);
        MarkerImage right = o.getShadow_MarkerImage();
        assertEquals(left.getUrl(), right.getUrl());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testShape() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
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
        MarkerOptions o = MarkerOptions.newInstance();
        String left = "testing123";
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
        MarkerOptions o = MarkerOptions.newInstance();
        boolean left = true;
        o.setVisible(left);
        boolean right = o.getVisible();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testZIndex() {
    LoadApi.go(new Runnable() {
      public void run() {
        MarkerOptions o = MarkerOptions.newInstance();
        int left = 5;
        o.setZindex(left);
        int right = o.getZindex();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
 
}

