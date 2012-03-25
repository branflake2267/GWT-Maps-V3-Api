package com.google.gwt.maps.client.layers;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class KmlLayerMetadataTest extends GWTTestCase {

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
        KmlLayerMetadata o = KmlLayerMetadata.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testAuthor() {
    LoadApi.go(new Runnable() {
      public void run() {        
        KmlLayerMetadata o = KmlLayerMetadata.newInstance();
        KmlAuthor left = KmlAuthor.newInstance();
        left.setEmail("test123");
        o.setAuthor(left);
        KmlAuthor right = o.getAuthor();
        assertEquals(left.getEmail(), right.getEmail());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testDescription() {
    LoadApi.go(new Runnable() {
      public void run() {        
        KmlLayerMetadata o = KmlLayerMetadata.newInstance();
        String left = "test123";
        o.setDescription(left);
        String right = o.getDescription();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testName() {
    LoadApi.go(new Runnable() {
      public void run() {        
        KmlLayerMetadata o = KmlLayerMetadata.newInstance();
        String left = "test123";
        o.setName(left);
        String right = o.getName();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testSnippet() {
    LoadApi.go(new Runnable() {
      public void run() {        
        KmlLayerMetadata o = KmlLayerMetadata.newInstance();
        String left = "test123";
        o.setSnippet(left);
        String right = o.getSnippet();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
}
