package com.google.gwt.maps.client.main;

import java.math.BigDecimal;

import com.google.gwt.dom.client.Element;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.base.Point;
import com.google.gwt.maps.client.maptypes.Projection;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class MapImplTest extends GWTTestCase {

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
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);
        Element element = fp.getElement();
        MapOptions options = MapOptions.newInstance();
        MapImpl o = MapImpl.newInstance(element, options);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  /**
   * fitBounds()
   * getBounds()
   */
  public void testFitBounds() {
    LoadApi.go(new Runnable() {
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);
        Element element = fp.getElement();
        MapOptions options = MapOptions.newInstance();
        MapImpl o = MapImpl.newInstance(element, options);
        LatLng ne = LatLng.newInstance(new BigDecimal("41.239045"), new BigDecimal("-73.508142"));
        LatLng sw = LatLng.newInstance(new BigDecimal("42.88679"), new BigDecimal("-69.927992"));
        LatLngBounds left = LatLngBounds.newInstance(sw, ne);
        o.fitBounds(left);
        LatLngBounds right = o.getBounds();
        assertEquals("((30.792110938675897, -54.84306700000002), (51.64751462536006, -88.59306700000025))", right.getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testGetDiv() {
    LoadApi.go(new Runnable() {
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);
        fp.setSize("103px", "204px");
        Element element = fp.getElement();
        MapOptions options = MapOptions.newInstance();
        MapImpl o = MapImpl.newInstance(element, options);
        Element e = o.getDiv();
        int right = e.getAbsoluteRight();
        int bottom = e.getAbsoluteBottom();
        assertEquals(111, right);
        assertEquals(312, bottom);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testGetHeading() {
    LoadApi.go(new Runnable() {
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);
        Element element = fp.getElement();
        MapOptions options = MapOptions.newInstance();
        MapImpl o = MapImpl.newInstance(element, options);
        
        // TODO should this return null?
//        try {
//          int heading1 = o.getHeading();
//        } catch (Exception e) {
//          // TODO Auto-generated catch block
//          e.printStackTrace();
//        }
        
        o.setHeading(45);
        int heading2 = o.getHeading();
        assertEquals(45, heading2);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testgetMapTypeId() {
    LoadApi.go(new Runnable() {
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);
        Element element = fp.getElement();
        MapOptions options = MapOptions.newInstance();
        MapImpl o = MapImpl.newInstance(element, options);
        MapTypeId left = MapTypeId.HYBRID;
        o.setMapTypeId(left);
        MapTypeId right = o.getMapTypeId();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testGetProjection() {
    LoadApi.go(new Runnable() {
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);
        Element element = fp.getElement();
        MapOptions options = MapOptions.newInstance();
        MapImpl o = MapImpl.newInstance(element, options);
        Projection projection = o.getProjection();
        boolean nowrap = false;
        Point pixel = Point.newInstance(10, 10);
        Point a = projection.fromPointToLatLng(pixel, nowrap);
        assertEquals("(83.67694304841554, -165.9375)", a.getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
//  /**
//   * TODO come back and finish this when I have some street view properties to add
//   */
//  public void testStreetView() {
//    LoadApi.go(new Runnable() {
//      public void run() {
//        FlowPanel fpSv = new FlowPanel();
//        RootPanel.get().add(fpSv);
//        
//        FlowPanel fp = new FlowPanel();
//        RootPanel.get().add(fp);
//        Element element = fp.getElement();
//        MapOptions options = MapOptions.newInstance();
//        MapImpl o = MapImpl.newInstance(element, options);
//        
//        StreetViewPanoramaOptions svOptions = StreetViewPanoramaOptions.newInstance();
//        svOptions.setPano("testingPano");
//        
//        StreetViewPanorama left = StreetViewPanorama.newInstance(fpSv.getElement(), svOptions );
//        o.setStreetView(left);
//        
//        StreetViewPanorama right = o.getStreetView();
//        
//        assertEquals(left.getPano(), right.getPano());
//        
//        finishTest();
//      }
//    }, false);
//    delayTestFinish(ASYNC_DELAY_MS);
//  }
  
  public void testGetTilt() {
    LoadApi.go(new Runnable() {
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);
        Element element = fp.getElement();
        MapOptions options = MapOptions.newInstance();
        MapImpl o = MapImpl.newInstance(element, options);
        int tilt = o.getTilt();
        assertEquals(0, tilt);
        o.setTilt(20); // TODO Find out what i need to do for mapOptions to get this workable?
        int t = o.getTilt();
        assertEquals(0, t);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testGetZoom() {
    LoadApi.go(new Runnable() {
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);
        Element element = fp.getElement();
        MapOptions options = MapOptions.newInstance();
        MapImpl o = MapImpl.newInstance(element, options);
        int zoom = o.getZoom();
        assertEquals(0, zoom);
        o.setZoom(5);
        assertEquals(5, o.getZoom());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testGetPanBy() {
    LoadApi.go(new Runnable() {
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);
        Element element = fp.getElement();
        MapOptions options = MapOptions.newInstance();
        MapImpl o = MapImpl.newInstance(element, options);
        o.panBy(50, 52);
        LatLng latlng = o.getCenter();
        assertEquals("(-41.53468367361192, 61.31250000000003)", latlng.getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testPanTo() {
    LoadApi.go(new Runnable() {
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);
        Element element = fp.getElement();
        MapOptions options = MapOptions.newInstance();
        MapImpl o = MapImpl.newInstance(element, options);
        LatLng latLng = LatLng.newInstance(35.3d, 38.5d);
        o.panTo(latLng);
        LatLng latlng = o.getCenter();
        assertEquals("(35.29999999999999, 38.49999999999994)", latlng.getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testPanToBounds() {
    LoadApi.go(new Runnable() {
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);
        Element element = fp.getElement();
        MapOptions options = MapOptions.newInstance();
        MapImpl o = MapImpl.newInstance(element, options);
        LatLng ne = LatLng.newInstance(new BigDecimal("41.239045"), new BigDecimal("-73.508142"));
        LatLng sw = LatLng.newInstance(new BigDecimal("42.88679"), new BigDecimal("-69.927992"));
        LatLngBounds left = LatLngBounds.newInstance(sw, ne);
        o.panToBounds(left);
        LatLng center = o.getCenter();
        assertEquals("(32.92888675928454, -8.999999999999968)", center.getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testSetCenter() {
    LoadApi.go(new Runnable() {
      public void run() {
        FlowPanel fp = new FlowPanel();
        RootPanel.get().add(fp);
        Element element = fp.getElement();
        MapOptions options = MapOptions.newInstance();
        MapImpl o = MapImpl.newInstance(element, options);
        LatLng center = LatLng.newInstance(new BigDecimal("41.239045"), new BigDecimal("-73.508142"));
        o.setCenter(center);
        assertEquals("(41.239045, -73.50814200000002)", o.getCenter().getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
//  /**
//   * setControls
//   * getControls
//   */
//  public void testSetControls() {
//    LoadApi.go(new Runnable() {
//      public void run() {
//        FlowPanel fp = new FlowPanel();
//        RootPanel.get().add(fp);
//        Element element = fp.getElement();
//        MapOptions options = MapOptions.newInstance();
//        MapImpl o = MapImpl.newInstance(element, options);
//        
//        MVCArray<Element> controls = null;
//        o.setControls(controls );
//        
//        finishTest();
//      }
//    }, false);
//    delayTestFinish(ASYNC_DELAY_MS);
//  }
  
//  public void testMapTypesRegistry() {
//    LoadApi.go(new Runnable() {
//      public void run() {
//        FlowPanel fp = new FlowPanel();
//        RootPanel.get().add(fp);
//        Element element = fp.getElement();
//        MapOptions options = MapOptions.newInstance();
//        MapImpl o = MapImpl.newInstance(element, options);
//        
//        
//        finishTest();
//      }
//    }, false);
//    delayTestFinish(ASYNC_DELAY_MS);
//  }
  
//  public void testSetOverlayMapTypes() {
//    LoadApi.go(new Runnable() {
//      public void run() {
//        FlowPanel fp = new FlowPanel();
//        RootPanel.get().add(fp);
//        Element element = fp.getElement();
//        MapOptions options = MapOptions.newInstance();
//        MapImpl o = MapImpl.newInstance(element, options);
//        
//        
//        finishTest();
//      }
//    }, false);
//    delayTestFinish(ASYNC_DELAY_MS);
//  }
}
