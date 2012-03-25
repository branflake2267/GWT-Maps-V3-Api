package com.google.gwt.maps.client.mvc;

import com.google.gwt.dom.client.Element;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class MVCObjectTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;

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
        MVCObject<Element> o = MVCObject.createInstanceOfMVCObject(); 
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  
  // TODO add all the bindtos...
  
  @SuppressWarnings("unused")
  public void testBindTo() {
    LoadApi.go(new Runnable() {
      public void run() {
        MVCObject<Element> o = MVCObject.createInstanceOfMVCObject();

        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  @SuppressWarnings("unused")
  public void testChanged() {
    LoadApi.go(new Runnable() {
      public void run() {
        MVCObject<Element> o = MVCObject.createInstanceOfMVCObject();
        
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  @SuppressWarnings("unused")
  public void testGet() {
    LoadApi.go(new Runnable() {
      public void run() {
        MVCObject<Element> o = MVCObject.createInstanceOfMVCObject();
        
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  @SuppressWarnings("unused")
  public void testNotify() {
    LoadApi.go(new Runnable() {
      public void run() {
        MVCObject<Element> o = MVCObject.createInstanceOfMVCObject();
        
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  @SuppressWarnings("unused")
  public void testSet() {
    LoadApi.go(new Runnable() {
      public void run() {
        MVCObject<Element> o = MVCObject.createInstanceOfMVCObject();
        
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  @SuppressWarnings("unused")
  public void testSetValues() {
    LoadApi.go(new Runnable() {
      public void run() {
        MVCObject<Element> o = MVCObject.createInstanceOfMVCObject();
        
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  @SuppressWarnings("unused")
  public void testUnbind() {
    LoadApi.go(new Runnable() {
      public void run() {
        MVCObject<Element> o = MVCObject.createInstanceOfMVCObject();
        
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  @SuppressWarnings("unused")
  public void testUnbindAll() {
    LoadApi.go(new Runnable() {
      public void run() {
        MVCObject<Element> o = MVCObject.createInstanceOfMVCObject();
        
        
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  
  
}
