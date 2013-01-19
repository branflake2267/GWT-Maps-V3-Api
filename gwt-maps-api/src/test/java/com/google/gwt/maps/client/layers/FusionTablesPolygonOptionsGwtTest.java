package com.google.gwt.maps.client.layers;

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

public class FusionTablesPolygonOptionsGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  public void testFillColor() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FusionTablesPolygonOptions o = FusionTablesPolygonOptions.newInstance();
        String left = "test";
        o.setFillColor(left);
        String right = o.getFillColor();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testFillOpacity() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FusionTablesPolygonOptions o = FusionTablesPolygonOptions.newInstance();
        double left = .50;
        o.setFillOpacity(left);
        double right = o.getFillOpacity();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testSrokeOpacity() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FusionTablesPolygonOptions o = FusionTablesPolygonOptions.newInstance();
        double left = .50;
        o.setStrokeOpacity(left);
        double right = o.getStrokeOpacity();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testSrokeWeight() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FusionTablesPolygonOptions o = FusionTablesPolygonOptions.newInstance();
        int left = 2;
        o.setStrokeWeight(left);
        int right = o.getStrokeWeight();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testStrokeColor() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FusionTablesPolygonOptions o = FusionTablesPolygonOptions.newInstance();
        String left = "test";
        o.setStrokeColor(left);
        String right = o.getStrokeColor();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FusionTablesPolygonOptions o = FusionTablesPolygonOptions.newInstance();
        finishTest();
      }
    });

  }

}
