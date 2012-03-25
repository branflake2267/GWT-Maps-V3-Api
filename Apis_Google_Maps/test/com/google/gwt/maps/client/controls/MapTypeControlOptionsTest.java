package com.google.gwt.maps.client.controls;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.MapTypeId;

public class MapTypeControlOptionsTest extends GWTTestCase {

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
        MapTypeControlOptions options = MapTypeControlOptions.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testSetMapTypeIds() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeControlOptions options = MapTypeControlOptions.newInstance();

        MapTypeId[] left = new MapTypeId[4];
        left[0] = MapTypeId.HYBRID; //1 
        left[1] = MapTypeId.ROADMAP; //2
        left[2] = MapTypeId.SATELLITE; //3
        left[3] = MapTypeId.TERRAIN; //4

        options.setMapTypeIds(left);

        MapTypeId[] right = options.getMapTypeIds();

        MapTypeId type1 = right[0];
        assertEquals(MapTypeId.HYBRID, type1);

        MapTypeId type2 = right[1];
        assertEquals(MapTypeId.ROADMAP, type2);

        MapTypeId type3 = right[2];
        assertEquals(MapTypeId.SATELLITE, type3);

        MapTypeId type4 = right[3];
        assertEquals(MapTypeId.TERRAIN, type4);

        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testPosition() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeControlOptions options = MapTypeControlOptions.newInstance();
        ControlPosition left = ControlPosition.TOP_CENTER;
        options.setPosition(left);
        ControlPosition right = options.getPosition();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }


}
