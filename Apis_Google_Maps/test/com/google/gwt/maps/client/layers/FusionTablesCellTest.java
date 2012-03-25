package com.google.gwt.maps.client.layers;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class FusionTablesCellTest extends GWTTestCase {

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
        FusionTablesCell o = FusionTablesCell.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testColumnName() {
    LoadApi.go(new Runnable() {
      public void run() {
        FusionTablesCell o = FusionTablesCell.newInstance();
        String left = "test";
        o.setColumnName(left);
        String right = o.getColumnName();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testValue() {
    LoadApi.go(new Runnable() {
      public void run() {
        FusionTablesCell o = FusionTablesCell.newInstance();
        String left = "test";
        o.setValue(left);
        String right = o.getValue();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
}
