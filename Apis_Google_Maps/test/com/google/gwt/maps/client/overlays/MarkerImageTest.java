package com.google.gwt.maps.client.overlays;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.base.Point;
import com.google.gwt.maps.client.base.Size;

public class MarkerImageTest extends GWTTestCase {

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
        String url = "images/target.png";
        //String url = "http://gwt-examples.googlecode.com/svn/trunk/DemoGadgetXml/war/images/target_sm.png";
        MarkerImage o = MarkerImage.newInstance(url);
        assertEquals(url, o.getUrl());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testUse2() {
    LoadApi.go(new Runnable() {
      public void run() {
        String url = "images/target.png";
        //String url = "http://gwt-examples.googlecode.com/svn/trunk/DemoGadgetXml/war/images/target_sm.png";
        int width = 21;
        int height = 32;
        Size size = Size.newInstance(width, height);
        MarkerImage o = MarkerImage.newInstance(url, size);
        assertEquals(size.getToString(), o.getSize().getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testUse3() {
    LoadApi.go(new Runnable() {
      public void run() {
        String url = "images/target.png";
        //String url = "http://gwt-examples.googlecode.com/svn/trunk/DemoGadgetXml/war/images/target_sm.png";
        int width = 21;
        int height = 32;
        Size size = Size.newInstance(width, height);
        Point origin = Point.newInstance(0, 0);
        MarkerImage o = MarkerImage.newInstance(url, size, origin);
        assertEquals(origin.getToString(), o.getOrigin().getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testUse4() {
    LoadApi.go(new Runnable() {
      public void run() {
        String url = "images/target.png";
        //String url = "http://gwt-examples.googlecode.com/svn/trunk/DemoGadgetXml/war/images/target_sm.png";
        int width = 21;
        int height = 32;
        Size size = Size.newInstance(width, height);
        Point origin = Point.newInstance(0, 0);
        Point anchor = Point.newInstance(width / 2, height);
        MarkerImage o = MarkerImage.newInstance(url, size, origin, anchor);
        assertEquals(anchor.getToString(), o.getAnchor().getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testUse5() {
    LoadApi.go(new Runnable() {
      public void run() {
        String url = "images/target.png";
        //String url = "http://gwt-examples.googlecode.com/svn/trunk/DemoGadgetXml/war/images/target_sm.png";
        int width = 21;
        int height = 32;
        Size size = Size.newInstance(width, height);
        Point origin = Point.newInstance(0, 0);
        Point anchor = Point.newInstance(width / 2, height);
        Size scaledSize = Size.newInstance(width, height);
        MarkerImage o = MarkerImage.newInstance(url, size, origin, anchor, scaledSize);
        assertEquals(scaledSize.getToString(), o.getScaledSize().getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }

  public void testAnchor() {
    LoadApi.go(new Runnable() {
      public void run() {
        String url = "images/target.png";
        //String url = "http://gwt-examples.googlecode.com/svn/trunk/DemoGadgetXml/war/images/target_sm.png";
        int width = 21;
        int height = 32;
        Point left = Point.newInstance(width / 2, height);
        MarkerImage o = MarkerImage.newInstance(url);
        o.setAnchor(left);
        Point right = o.getAnchor();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testOrigin() {
    LoadApi.go(new Runnable() {
      public void run() {
        String url = "images/target.png";
        //String url = "http://gwt-examples.googlecode.com/svn/trunk/DemoGadgetXml/war/images/target_sm.png";
        Point left = Point.newInstance(0, 0);
        MarkerImage o = MarkerImage.newInstance(url);
        o.setOrigin(left);
        Point right = o.getOrigin();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testScaledSize() {
    LoadApi.go(new Runnable() {
      public void run() {
        String url = "images/target.png";
        //String url = "http://gwt-examples.googlecode.com/svn/trunk/DemoGadgetXml/war/images/target_sm.png";
        int width = 21;
        int height = 32;
        Size left = Size.newInstance(width, height);
        MarkerImage o = MarkerImage.newInstance(url);
        o.setScaledSize(left);
        Size right = o.getScaledSize();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testSize() {
    LoadApi.go(new Runnable() {
      public void run() {
        String url = "images/target.png";
        //String url = "http://gwt-examples.googlecode.com/svn/trunk/DemoGadgetXml/war/images/target_sm.png";
        int width = 21;
        int height = 32;
        Size left = Size.newInstance(width, height);
        MarkerImage o = MarkerImage.newInstance(url);
        o.setSize(left);
        Size right = o.getSize();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testUrl() {
    LoadApi.go(new Runnable() {
      public void run() {
        String left = "images/target.png";
        String url = "http://gwt-examples.googlecode.com/svn/trunk/DemoGadgetXml/war/images/target_sm.png";
        MarkerImage o = MarkerImage.newInstance(url);
        o.setUrl(left);
        String right = o.getUrl();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
}
