package com.google.gwt.maps.client.drawing;

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
import com.google.gwt.maps.client.drawinglib.OverlayType;

public class OverlayTypeGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.DRAWING };
  }

  private native void reverseEngineer(String type) /*-{
                                                   var s = "$wnd.google.maps.drawing.OverlayType." + type;
                                                   var v = eval(s);
                                                   alert("google.maps.drawing.OverlayType." + type + " == " + v);
                                                   }-*/;

  protected void reverseEngineer1() {
    OverlayType[] a = OverlayType.values();
    for (int i = 0; i < a.length; i++) {
      String type = a[i].value();
      reverseEngineer(type);
    }
  }

  public void testReverseEngineer() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        reverseEngineer1();
        finishTest();
      }
    });

  }

  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        OverlayType o = OverlayType.CIRCLE;
        String right = "circle";
        assertEquals(o.value(), right);
        finishTest();
      }
    });
  }

  public void testUse2() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        OverlayType o = OverlayType.MARKER;
        String right = "marker";
        assertEquals(o.value(), right);
        finishTest();
      }
    });

  }

  public void testUse3() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        OverlayType o = OverlayType.POLYGON;
        String right = "polygon";
        assertEquals(o.value(), right);
        finishTest();
      }
    });
  }

  public void testUse4() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        OverlayType o = OverlayType.POLYLINE;
        String right = "polyline";
        assertEquals(o.value(), right);
        finishTest();
      }
    });
  }

  public void testUse5() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        OverlayType o = OverlayType.RECTANGLE;
        String right = "rectangle";
        assertEquals(o.value(), right);
        finishTest();
      }
    });

  }
}
