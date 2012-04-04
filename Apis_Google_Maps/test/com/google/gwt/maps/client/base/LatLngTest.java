package com.google.gwt.maps.client.base;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class LatLngTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;
  
  public static final double MOCK_LAT = 38.0d;
  public static final double MOCK_LNG = 35.5d;
  
  public String getModuleName() {
    return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
  }

  public void testWorks() {
    assertEquals(true, true);
  }
  
  @SuppressWarnings("unused")
  public void testUse() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng ll = LatLng.newInstance(MOCK_LAT, MOCK_LNG);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  @SuppressWarnings("unused")
  public void testUse2() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng ll = LatLng.newInstance(MOCK_LAT, MOCK_LNG, false);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testWrapping() {
	  LoadApi.go(new Runnable() {
		  public void run() {
			  
			  // range overflow
			  LatLng ll = LatLng.newInstance(99.4d, 184.4d, false);
			  assertEquals( 90d, ll.getLatitude() );
			  assertEquals( -175.60000000000002d, ll.getLongitude() );

			  // range underflow
			  LatLng ll2 = LatLng.newInstance(-99.4d, -184.4d, false);
			  assertEquals( -90d, ll2.getLatitude() );
			  assertEquals( 175.60000000000002d, ll2.getLongitude() ); //TODO precision issue, 
			  
			  finishTest();
		  }
	  }, false);
	  delayTestFinish(ASYNC_DELAY_MS);
  }
  
  @SuppressWarnings("unused")
  public void testUse3() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng ll = LatLng.newInstance(MOCK_LAT, MOCK_LNG, true);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
 
  public void testEqualsIsEqual() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng left = LatLng.newInstance(MOCK_LAT, MOCK_LNG, false);
        LatLng right = LatLng.newInstance(MOCK_LAT, MOCK_LNG, false);
        boolean equals = left.equals(right);
        assertEquals(true, equals);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testEqualsIsNotEqual() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng left = LatLng.newInstance(MOCK_LAT+0.3d, MOCK_LNG, false);
        LatLng right = LatLng.newInstance(MOCK_LAT, MOCK_LNG, false);
        boolean equals = left.equals(right);
        assertEquals(false, equals);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testGetLatitude() {
    LoadApi.go(new Runnable() {
      public void run() {
    	double expected = MOCK_LAT+0.3;
        LatLng ll = LatLng.newInstance(MOCK_LAT+0.3d, MOCK_LNG, false);
        double actual = ll.getLatitude();
        assertEquals(expected, actual);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testGetLongitude() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng ll = LatLng.newInstance(MOCK_LAT+0.3d, MOCK_LNG, false);
        double right = ll.getLongitude();
        assertEquals(MOCK_LNG, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testGetToString() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng ll = LatLng.newInstance(MOCK_LAT+0.3d, MOCK_LNG, false);
        String left = "(38.3, 35.5)";
        String right = ll.getToString();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testGetToUrlValue() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng ll = LatLng.newInstance(38.12345678901234567890d, 35.12345678901234567890d, false);
        String left = "38.123456789,35.123456789";
        String right = ll.getToUrlValue(10);
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

}
