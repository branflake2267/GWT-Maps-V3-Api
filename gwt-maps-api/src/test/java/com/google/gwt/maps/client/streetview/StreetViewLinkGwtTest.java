package com.google.gwt.maps.client.streetview;

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

public class StreetViewLinkGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewLink o = StreetViewLink.newInstance();
        finishTest();
      }
    });

  }

  public void testDescription() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewLink o = StreetViewLink.newInstance();
        String left = "test";
        o.setDescription(left);
        String right = o.getDescription();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testHeading() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewLink o = StreetViewLink.newInstance();
        int left = 11;
        o.setHeading(left);
        int right = o.getHeading();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testPano() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewLink o = StreetViewLink.newInstance();
        String left = "test";
        o.setPano(left);
        String right = o.getPano();
        assertEquals(left, right);
        finishTest();
      }
    });

  }
}
