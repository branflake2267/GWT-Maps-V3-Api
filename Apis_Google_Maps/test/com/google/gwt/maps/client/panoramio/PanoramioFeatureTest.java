package com.google.gwt.maps.client.panoramio;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.panoramiolib.PanoramioFeature;

public class PanoramioFeatureTest extends GWTTestCase {

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
        PanoramioFeature o = PanoramioFeature.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testAuthor() {
    LoadApi.go(new Runnable() {
      public void run() {
        PanoramioFeature o = PanoramioFeature.newInstance();
        String left = "test";
        o.setAuthor(left);
        String right = o.getAuthor();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
 
  public void testPhotoId() {
    LoadApi.go(new Runnable() {
      public void run() {
        PanoramioFeature o = PanoramioFeature.newInstance();
        String left = "test";
        o.setPhotoId(left);
        String right = o.getPhotoId();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testTitle() {
    LoadApi.go(new Runnable() {
      public void run() {
        PanoramioFeature o = PanoramioFeature.newInstance();
        String left = "test";
        o.setTitle(left);
        String right = o.getTitle();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testUrl() {
    LoadApi.go(new Runnable() {
      public void run() {
        PanoramioFeature o = PanoramioFeature.newInstance();
        String left = "test";
        o.setUrl(left);
        String right = o.getUrl();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testUserId() {
    LoadApi.go(new Runnable() {
      public void run() {
        PanoramioFeature o = PanoramioFeature.newInstance();
        String left = "userIdTest";
        o.setUserId(left);
        String right = o.getUserId();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
}
