package com.google.gwt.maps.client.base;

import java.math.BigDecimal;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class LatLngBoundsTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;

  public String getModuleName() {
    return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
  }

  public void testWorks() {
    assertEquals(true, true);
  }

  /**
   * {@link http://code.google.com/apis/maps/documentation/javascript/events.html}
   */
  public void testUse() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng sw = LatLng.newInstance(new BigDecimal(-31.203405), new BigDecimal(125.244141));
        LatLng ne = LatLng.newInstance(new BigDecimal(-25.363882), new BigDecimal(131.044922));
        LatLngBounds left = LatLngBounds.newInstance(sw, ne);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testUse2() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng sw = LatLng.newInstance(-31.203405,125.244141);
        LatLng ne = LatLng.newInstance(-25.363882, 131.044922);
        LatLngBounds left = LatLngBounds.newInstance(sw, ne);
        assertEquals("((-31.203405, 125.24414100000001), (-25.363882, 131.04492200000004))", left.getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testContains() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng sw = LatLng.newInstance(new BigDecimal(-31.203405), new BigDecimal(125.244141));
        LatLng ne = LatLng.newInstance(new BigDecimal(-25.363882), new BigDecimal(131.044922));
        LatLngBounds llb = LatLngBounds.newInstance(sw, ne);
        LatLng ll = LatLng.newInstance(new BigDecimal(-30), new BigDecimal(126));
        boolean right = llb.contains(ll);
        assertEquals(true, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testEquals() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng sw1 = LatLng.newInstance(new BigDecimal(-31.203405), new BigDecimal(125.244141));
        LatLng ne1 = LatLng.newInstance(new BigDecimal(-25.363882), new BigDecimal(131.044922));
        LatLngBounds llb1 = LatLngBounds.newInstance(sw1, ne1);
        LatLng sw2 = LatLng.newInstance(new BigDecimal(-31.203405), new BigDecimal(125.244141));
        LatLng ne2 = LatLng.newInstance(new BigDecimal(-25.363882), new BigDecimal(131.044922));
        LatLngBounds llb2 = LatLngBounds.newInstance(sw2, ne2);
        boolean right = llb1.equals(llb2);
        assertEquals(true, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testNotEquals() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng sw1 = LatLng.newInstance(new BigDecimal(-31.203405), new BigDecimal(125.244141));
        LatLng ne1 = LatLng.newInstance(new BigDecimal(-25.3633882), new BigDecimal(131.0434922));
        LatLngBounds llb1 = LatLngBounds.newInstance(sw1, ne1);
        LatLng sw2 = LatLng.newInstance(new BigDecimal(-31.203405), new BigDecimal(125.244141));
        LatLng ne2 = LatLng.newInstance(new BigDecimal(-25.363882), new BigDecimal(131.044922));
        LatLngBounds llb2 = LatLngBounds.newInstance(sw2, ne2);
        boolean right = llb1.equals(llb2);
        assertEquals(false, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testExtend() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng sw = LatLng.newInstance(new BigDecimal(-31.203405), new BigDecimal(125.244141));
        LatLng ne = LatLng.newInstance(new BigDecimal(-25.363882), new BigDecimal(131.044922));
        LatLngBounds llb = LatLngBounds.newInstance(sw, ne);
        LatLng point = LatLng.newInstance(new BigDecimal(-24), new BigDecimal(132));
        LatLngBounds llb2 = llb.extend(point);
        assertEquals("((-31.203405, 125.24414100000001), (-24, 132))", llb2.toString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testGetNESW() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng sw = LatLng.newInstance(new BigDecimal(-31.203405), new BigDecimal(125.244141));
        LatLng ne = LatLng.newInstance(new BigDecimal(-25.363882), new BigDecimal(131.044922));
        LatLngBounds llb = LatLngBounds.newInstance(sw, ne);
        LatLng llsw = llb.getSouthWest();
        LatLng llne = llb.getNorthEast();
        assertEquals("(-31.203405, 125.24414100000001)", llsw.toString());
        assertEquals("(-25.363882, 131.04492200000004)", llne.toString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testIntersects() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng sw1 = LatLng.newInstance(new BigDecimal(-31.203405), new BigDecimal(125.244141));
        LatLng ne1 = LatLng.newInstance(new BigDecimal(-25.3633882), new BigDecimal(131.0434922));
        LatLngBounds llb1 = LatLngBounds.newInstance(sw1, ne1);
        LatLng sw2 = LatLng.newInstance(new BigDecimal(-32.203405), new BigDecimal(126.244141));
        LatLng ne2 = LatLng.newInstance(new BigDecimal(-26.363882), new BigDecimal(132.044922));
        LatLngBounds llb2 = LatLngBounds.newInstance(sw2, ne2);
        boolean llb3 = llb1.intersects(llb2);
        assertEquals(true, llb3);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testIsEmpty() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng sw = LatLng.newInstance(new BigDecimal(-31.203405), new BigDecimal(125.244141));
        LatLng ne = LatLng.newInstance(new BigDecimal(-25.363882), new BigDecimal(131.044922));
        LatLngBounds llb = LatLngBounds.newInstance(sw, ne);
        boolean empty = llb.isEmpty();
        assertEquals(false, empty);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testToSpan() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng sw = LatLng.newInstance(new BigDecimal(-31.203405), new BigDecimal(125.244141));
        LatLng ne = LatLng.newInstance(new BigDecimal(-25.363882), new BigDecimal(131.044922));
        LatLngBounds llb = LatLngBounds.newInstance(sw, ne);
        LatLng ll = llb.toSpan();
        assertEquals("(5.839523, 5.800781000000029)", ll.toString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testGetToString() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng sw = LatLng.newInstance(new BigDecimal(-31.203405), new BigDecimal(125.244141));
        LatLng ne = LatLng.newInstance(new BigDecimal(-25.363882), new BigDecimal(131.044922));
        LatLngBounds llb = LatLngBounds.newInstance(sw, ne);
        assertEquals("((-31.203405, 125.24414100000001), (-25.363882, 131.04492200000004))", llb.getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testToUrlValue() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng sw = LatLng.newInstance(new BigDecimal(-31.203405), new BigDecimal(125.244141));
        LatLng ne = LatLng.newInstance(new BigDecimal(-25.363882), new BigDecimal(131.044922));
        LatLngBounds llb = LatLngBounds.newInstance(sw, ne);
        String ll = llb.toUrlValue(7);
        assertEquals("-31.203405,125.244141,-25.363882,131.044922", ll);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testUnion() {
    LoadApi.go(new Runnable() {
      public void run() {
        LatLng sw1 = LatLng.newInstance(new BigDecimal(-31.203405), new BigDecimal(125.244141));
        LatLng ne1 = LatLng.newInstance(new BigDecimal(-25.3633882), new BigDecimal(131.0434922));
        LatLngBounds llb1 = LatLngBounds.newInstance(sw1, ne1);
        LatLng sw2 = LatLng.newInstance(new BigDecimal(-32.203405), new BigDecimal(126.244141));
        LatLng ne2 = LatLng.newInstance(new BigDecimal(-27), new BigDecimal(133.044922));
        LatLngBounds llb2 = LatLngBounds.newInstance(sw2, ne2);
        LatLngBounds llb3 = llb1.union(llb2);
        assertEquals("((-32.203405, 125.24414100000001), (-25.3633882, 133.04492200000004))", llb3.toString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
}
