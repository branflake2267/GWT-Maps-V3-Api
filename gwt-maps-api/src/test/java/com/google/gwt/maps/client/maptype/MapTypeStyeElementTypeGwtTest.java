package com.google.gwt.maps.client.maptype;

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
import com.google.gwt.maps.client.maptypes.MapTypeStyleElementType;

public class MapTypeStyeElementTypeGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleElementType type = MapTypeStyleElementType.ALL;
        finishTest();
      }
    });

  }

  public void testEnum1() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleElementType type = MapTypeStyleElementType.ALL;
        String left = "all";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum2() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleElementType type = MapTypeStyleElementType.GEOMETRY;
        String left = "geometry";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testEnum3() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeStyleElementType type = MapTypeStyleElementType.LABELS;
        String left = "labels";
        String right = type.value();
        assertEquals(left, right);
        finishTest();
      }
    });

  }
}
