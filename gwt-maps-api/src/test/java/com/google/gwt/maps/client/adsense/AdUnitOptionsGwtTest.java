package com.google.gwt.maps.client.adsense;

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
import com.google.gwt.maps.client.controls.ControlPosition;

public class AdUnitOptionsGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  public void testAdFormat() {

    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        AdUnitOptions o = AdUnitOptions.newInstance();
        AdFormat left = AdFormat.BANNER;
        o.setFormat(left);
        AdFormat right = o.getFormat();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testChannel() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        AdUnitOptions o = AdUnitOptions.newInstance();
        String left = "test";
        o.setChannelNumber(left);
        String right = o.getChannelNumber();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testPosition() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        AdUnitOptions o = AdUnitOptions.newInstance();
        ControlPosition left = ControlPosition.TOP_CENTER;
        o.setPosition(left);
        ControlPosition right = o.getPosition();
        assertEquals(left, right);
        finishTest();
      }
    });
  }

  public void testPublisherId() {

    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        AdUnitOptions o = AdUnitOptions.newInstance();
        String left = "test";
        o.setPublisherId(left);
        String right = o.getPublisherId();
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
        AdUnitOptions o = AdUnitOptions.newInstance();
        finishTest();
      }
    });
  }

}
