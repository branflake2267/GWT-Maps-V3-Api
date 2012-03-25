package com.google.gwt.maps.client.layers;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class KmlAuthorTest extends GWTTestCase {

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
        KmlAuthor o = KmlAuthor.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testEmail() {
    LoadApi.go(new Runnable() {
      public void run() {        
        KmlAuthor o = KmlAuthor.newInstance();
        String left = "test";
        o.setEmail(left);
        String right = o.getEmail();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testName() {
    LoadApi.go(new Runnable() {
      public void run() {        
        KmlAuthor o = KmlAuthor.newInstance();
        String left = "test";
        o.setName(left);
        String right = o.getName();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testUri() {
    LoadApi.go(new Runnable() {
      public void run() {        
        KmlAuthor o = KmlAuthor.newInstance();
        String left = "test";
        o.setUri(left);
        String right = o.getUri();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  
}
