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
import com.google.gwt.maps.client.base.Size;

public class StreetViewTileDataGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewTileData o = StreetViewTileData.newInstance();
        finishTest();
      }
    });

  }

  // TODO try this after the provider call back
  // public void testTileUrl() {
  // asyncLibTest(new Runnable() {
  // public void run() {
  // StreetViewTileData o = StreetViewTileData.newInstance();
  // String pano = "panooo";
  // int tileZoom = 10;
  // int tileX = 1;
  // int tileY = 2;
  // String url = o.getTileUrl(pano, tileZoom, tileX, tileY);
  // assertEquals("", url);
  // finishTest();
  // }
  // });

  // }

  public void testCenterHeading() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewTileData o = StreetViewTileData.newInstance();
        int left = 15;
        o.setCenterHeading(left);
        int right = o.getCenterHeading();
        assertEquals(left, right);
        finishTest();
      }
    });

  }

  public void testTileSize() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewTileData o = StreetViewTileData.newInstance();
        Size tileSize = Size.newInstance(10d, 12d);
        o.setTileSize(tileSize);
        assertEquals("(10, 12)", o.getTileSize().getToString());
        finishTest();
      }
    });

  }

  public void testWorldSize() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewTileData o = StreetViewTileData.newInstance();
        Size worldSize = Size.newInstance(13d, 14d);
        o.setWorldSize(worldSize);
        assertEquals("(13, 14)", o.getWorldSize().getToString());
        finishTest();
      }
    });

  }

}
