package com.google.gwt.maps.client.layers;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class FusionTablesQueryTest extends GWTTestCase {

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
        FusionTablesQuery o = FusionTablesQuery.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testFrom() {
    LoadApi.go(new Runnable() {
      public void run() {
        FusionTablesQuery o = FusionTablesQuery.newInstance();
        String left = "test123";
        o.setFrom(left);
        String right = o.getFrom();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testSelect() {
    LoadApi.go(new Runnable() {
      public void run() {
        FusionTablesQuery o = FusionTablesQuery.newInstance();
        String left = "test123";
        o.setSelect(left);
        String right = o.getSelect();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testWhere() {
    LoadApi.go(new Runnable() {
      public void run() {
        FusionTablesQuery o = FusionTablesQuery.newInstance();
        String left = "test123";
        o.setWhere(left);
        String right = o.getWhere();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
}
