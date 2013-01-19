package com.google.gwt.maps.client.overlays;

/*
 * #%L
 * GWT Maps API V3 - Core API
 * %%
 * Copyright (C) 2011 - 2012 GWT Maps API V3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.Point;
import com.google.gwt.maps.client.base.Size;

public class MarkerImageGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        String url = "images/target.png";
        // String url =
        // "http://gwt-examples.googlecode.com/svn/trunk/DemoGadgetXml/war/images/target_sm.png";
        MarkerImage o = MarkerImage.newInstance(url);
        assertEquals(url, o.getUrl());
        finishTest();
      }
    });

  }

  public void testUse2() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        String url = "images/target.png";
        // String url =
        // "http://gwt-examples.googlecode.com/svn/trunk/DemoGadgetXml/war/images/target_sm.png";
        double width = 21;
        double height = 32;
        Size size = Size.newInstance(width, height);
        MarkerImage o = MarkerImage.newInstance(url, size);
        assertEquals(size.getToString(), o.getSize().getToString());
        finishTest();
      }
    });

  }

  public void testUse3() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        String url = "images/target.png";
        // String url =
        // "http://gwt-examples.googlecode.com/svn/trunk/DemoGadgetXml/war/images/target_sm.png";
        double width = 21;
        double height = 32;
        Size size = Size.newInstance(width, height);
        Point origin = Point.newInstance(0d, 0d);
        MarkerImage o = MarkerImage.newInstance(url, size, origin);
        assertEquals(origin.getToString(), o.getOrigin().getToString());
        finishTest();
      }
    });

  }

  public void testUse4() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        String url = "images/target.png";
        // String url =
        // "http://gwt-examples.googlecode.com/svn/trunk/DemoGadgetXml/war/images/target_sm.png";
        double width = 21;
        double height = 32;
        Size size = Size.newInstance(width, height);
        Point origin = Point.newInstance(0d, 0d);
        Point anchor = Point.newInstance(width / 2d, height);
        MarkerImage o = MarkerImage.newInstance(url, size, origin, anchor);
        assertEquals(anchor.getToString(), o.getAnchor().getToString());
        finishTest();
      }
    });

  }

  public void testUse5() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        String url = "images/target.png";
        // String url =
        // "http://gwt-examples.googlecode.com/svn/trunk/DemoGadgetXml/war/images/target_sm.png";
        double width = 21d;
        double height = 32d;
        Size size = Size.newInstance(width, height);
        Point origin = Point.newInstance(0d, 0d);
        Point anchor = Point.newInstance(width / 2d, height);
        Size scaledSize = Size.newInstance(width, height);
        MarkerImage o = MarkerImage.newInstance(url, size, origin, anchor, scaledSize);
        assertEquals(scaledSize.getToString(), o.getScaledSize().getToString());
        finishTest();
      }
    });

  }

  public void testAnchor() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        String url = "images/target.png";
        // String url =
        // "http://gwt-examples.googlecode.com/svn/trunk/DemoGadgetXml/war/images/target_sm.png";
        double width = 21;
        double height = 32;
        Point left = Point.newInstance(width / 2d, height);
        MarkerImage o = MarkerImage.newInstance(url);
        o.setAnchor(left);
        Point right = o.getAnchor();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    });

  }

  public void testOrigin() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        String url = "images/target.png";
        // String url =
        // "http://gwt-examples.googlecode.com/svn/trunk/DemoGadgetXml/war/images/target_sm.png";
        Point left = Point.newInstance(0d, 0d);
        MarkerImage o = MarkerImage.newInstance(url);
        o.setOrigin(left);
        Point right = o.getOrigin();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    });

  }

  public void testScaledSize() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        String url = "images/target.png";
        // String url =
        // "http://gwt-examples.googlecode.com/svn/trunk/DemoGadgetXml/war/images/target_sm.png";
        double width = 21;
        double height = 32;
        Size left = Size.newInstance(width, height);
        MarkerImage o = MarkerImage.newInstance(url);
        o.setScaledSize(left);
        Size right = o.getScaledSize();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    });

  }

  public void testSize() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        String url = "images/target.png";
        // String url =
        // "http://gwt-examples.googlecode.com/svn/trunk/DemoGadgetXml/war/images/target_sm.png";
        double width = 21;
        double height = 32;
        Size left = Size.newInstance(width, height);
        MarkerImage o = MarkerImage.newInstance(url);
        o.setSize(left);
        Size right = o.getSize();
        assertEquals(left.getToString(), right.getToString());
        finishTest();
      }
    });

  }

  public void testUrl() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        String left = "images/target.png";
        String url = "http://gwt-examples.googlecode.com/svn/trunk/DemoGadgetXml/war/images/target_sm.png";
        MarkerImage o = MarkerImage.newInstance(url);
        o.setUrl(left);
        String right = o.getUrl();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

}
