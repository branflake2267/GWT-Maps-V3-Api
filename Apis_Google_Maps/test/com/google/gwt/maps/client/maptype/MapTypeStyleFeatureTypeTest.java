package com.google.gwt.maps.client.maptype;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.maptypes.MapTypeStyleFeatureType;

public class MapTypeStyleFeatureTypeTest extends GWTTestCase {

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
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.ADMINISTRATIVE;
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum1() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.ADMINISTRATIVE;
        String left = "administrative";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum2() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.ADMINISTRATIVE__COUNTRY;
        String left = "administrative.country";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum3() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.ADMINISTRATIVE__LAND_PARCEL;
        String left = "administrative.land_parcel";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
 
  public void testEnum4() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.ADMINISTRATIVE__LOCALITY;
        String left = "administrative.locality";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum5() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.ADMINISTRATIVE__NEIGHBORHOOD;
        String left = "administrative.neighborhood";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum6() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.ADMINISTRATIVE__PROVINCE;
        String left = "administrative.province";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum7() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.ALL;
        String left = "all";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum8() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.LANDSCAPE;
        String left = "landscape";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum9() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.LANDSCAPE__MAN_MADE;
        String left = "landscape.man_made";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum10() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.LANDSCAPE__NATURAL;
        String left = "landscape.natural";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum11() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.POI;
        String left = "poi";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum12() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.POI__ATTRACTION;
        String left = "poi.attraction";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum13() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.POI__BUSINESS;
        String left = "poi.business";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum14() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.POI__GOVERNMENT;
        String left = "poi.government";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum15() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.POI__MEDICAL;
        String left = "poi.medical";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum16() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.POI__PARK;
        String left = "poi.park";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum17() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.POI__PLACE_OF_WORSHIP;
        String left = "poi.place_of_worship";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum18() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.POI__SCHOOL;
        String left = "poi.school";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  
  public void testEnum19() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.POI__SPORTS_COMPLEX;
        String left = "poi.sports_complex";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum20() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.ROAD;
        String left = "road";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum21() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.ROAD__ARTERIAL;
        String left = "road.arterial";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum22() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.ROAD__HIGHWAY;
        String left = "road.highway";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum23() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.ROAD__LOCAL;
        String left = "road.local";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum24() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.TRANSIT;
        String left = "transit";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum25() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.TRANSIT__LINE;
        String left = "transit.line";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum26() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.TRANSIT__STATION;
        String left = "transit.station";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum27() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.TRANSIT__STATION__AIRPORT;
        String left = "transit.station.airport";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum28() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.TRANSIT__STATION__BUS;
        String left = "transit.station.bus";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum29() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.TRANSIT__STATION__RAIL;
        String left = "transit.station.rail";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEnum30() {
    LoadApi.go(new Runnable() {
      public void run() {
        MapTypeStyleFeatureType type = MapTypeStyleFeatureType.WATER;
        String left = "water";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
}
