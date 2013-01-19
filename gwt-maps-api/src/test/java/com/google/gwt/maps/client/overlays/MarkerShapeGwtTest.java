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

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class MarkerShapeGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerShape o = MarkerShape.newInstance();
        finishTest();
      }
    });

  }

  public void testCoords() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerShape o = MarkerShape.newInstance();
        int[] integers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        JsArrayInteger left = ArrayHelper.toJsArrayInteger(integers);
        o.setCoordinates(left);
        JsArrayInteger right = o.getCoordinates();
        int two = right.get(2);
        assertEquals(integers[2], two);
        finishTest();
      }
    });

  }

  public void testType() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MarkerShape o = MarkerShape.newInstance();
        MarkerShapeType left = MarkerShapeType.RECT;
        o.setType(left);
        MarkerShapeType right = o.getType();
        assertEquals(left.value(), right.value());
        finishTest();
      }
    });

  }
}
