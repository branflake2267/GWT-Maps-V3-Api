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

public class FusionTablesQueryGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  public void testFrom() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FusionTablesQuery o = FusionTablesQuery.newInstance();
        String left = "test123";
        o.setFrom(left);
        String right = o.getFrom();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testSelect() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FusionTablesQuery o = FusionTablesQuery.newInstance();
        String left = "test123";
        o.setSelect(left);
        String right = o.getSelect();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testLimit() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FusionTablesQuery o = FusionTablesQuery.newInstance();

        int expected = 234;
        o.setLimit(expected);
        assertEquals(expected, o.getLimit());

        finishTest();
      }
    });
  }

  public void testOffset() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FusionTablesQuery o = FusionTablesQuery.newInstance();

        int expected = 234;
        o.setOffset(expected);
        assertEquals(expected, o.getOffset());

        finishTest();
      }
    });
  }

  public void testOrderBy() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FusionTablesQuery o = FusionTablesQuery.newInstance();

        String expected = "dim2 ASC";
        o.setOrderBy(expected);
        assertEquals(expected, o.getOrderBy());

        finishTest();
      }
    });
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FusionTablesQuery o = FusionTablesQuery.newInstance();
        finishTest();
      }
    });
  }

  public void testWhere() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        FusionTablesQuery o = FusionTablesQuery.newInstance();
        String left = "test123";
        o.setWhere(left);
        String right = o.getWhere();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

}
