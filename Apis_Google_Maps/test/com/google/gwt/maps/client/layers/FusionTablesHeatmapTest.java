package com.google.gwt.maps.client.layers;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class FusionTablesHeatmapTest extends GWTTestCase {

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
        FusionTableHeatmap o = FusionTableHeatmap.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
   
  public void testEnabled() {
    LoadApi.go(new Runnable() {
      public void run() {
        FusionTableHeatmap o = FusionTableHeatmap.newInstance();
        boolean left = true;
        o.setEnabled(left);
        boolean right = o.getEnabled();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
}
