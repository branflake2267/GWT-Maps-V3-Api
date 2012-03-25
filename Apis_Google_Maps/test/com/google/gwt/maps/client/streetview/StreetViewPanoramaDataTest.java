package com.google.gwt.maps.client.streetview;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class StreetViewPanoramaDataTest extends GWTTestCase {

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
        StreetViewPanoramaData o = StreetViewPanoramaData.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testCopyRight() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewPanoramaData o = StreetViewPanoramaData.newInstance();
        String left = "Brandon was here";
        o.setCopyright(left);
        assertEquals(left, o.getCopyright());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
 
  public void testStreetViewLinks() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewPanoramaData o = StreetViewPanoramaData.newInstance();
        StreetViewLink a = StreetViewLink.newInstance();
        a.setDescription("hi");
        a.setHeading(10);
        a.setPano("panooo");
        StreetViewLink b = StreetViewLink.newInstance();
        b.setDescription("hi there");
        b.setHeading(12);
        b.setPano("panooooooo");
        StreetViewLink[] c = new StreetViewLink[2];
        c[0] = a;
        c[1] = b;
        JsArray<StreetViewLink> svl = ArrayHelper.toJsArray(c);
        o.setLinks(svl);
        JsArray<StreetViewLink> right = o.getLinks();
        StreetViewLink aa = right.get(0);
        StreetViewLink bb = right.get(1);
        assertEquals(a.getDescription(), aa.getDescription());
        assertEquals(b.getDescription(), bb.getDescription());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testStreetViewLocation() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewPanoramaData o = StreetViewPanoramaData.newInstance();
        StreetViewLocation location = StreetViewLocation.newInstance();
        location.setDescription("desc");
        o.setLocation(location);
        assertEquals("desc", o.getLocation().getDescription());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testStreetViewTileData() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewPanoramaData o = StreetViewPanoramaData.newInstance();
        StreetViewTileData left = StreetViewTileData.newInstance();
        left.setCenterHeading(1);
        o.setTileData(left);
        StreetViewTileData right = o.getTileData();
        assertEquals(left.getCenterHeading(), right.getCenterHeading());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
}
