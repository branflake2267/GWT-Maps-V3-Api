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

public class FusionTablesStyleGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  public void testMarkerOptions() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FusionTablesStyle o = FusionTablesStyle.newInstance();
        FusionTablesMarkerOptions left = FusionTablesMarkerOptions.newInstance();
        left.setIconName("test123");
        o.setMarkerOptions(left);
        FusionTablesMarkerOptions right = o.getMarkerOptions();
        assertEquals(left.getIconName(), right.getIconName());
        finishTest();
      }
    });

  }

  public void testPolygonOptions() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FusionTablesStyle o = FusionTablesStyle.newInstance();
        FusionTablesPolygonOptions left = FusionTablesPolygonOptions.newInstance();
        left.setFillColor("red");
        o.setPolygonOptions(left);
        FusionTablesPolygonOptions right = o.getPolygonOptions();
        assertEquals(left.getFillColor(), right.getFillColor());
        finishTest();
      }
    });

  }

  public void testPolylineOptions() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FusionTablesStyle o = FusionTablesStyle.newInstance();
        FusionTablesPolylineOptions left = FusionTablesPolylineOptions.newInstance();
        left.setStrokeColor("blue");
        o.setPolylineOptions(left);
        FusionTablesPolylineOptions right = o.getPolylineOptions();
        assertEquals(left.getStrokeColor(), right.getStrokeColor());
        finishTest();
      }
    });

  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FusionTablesStyle o = FusionTablesStyle.newInstance();
        finishTest();
      }
    });

  }

  public void testWhere() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FusionTablesStyle o = FusionTablesStyle.newInstance();
        String left = "where test";
        o.setWhere(left);
        String right = o.getWhere();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

}
