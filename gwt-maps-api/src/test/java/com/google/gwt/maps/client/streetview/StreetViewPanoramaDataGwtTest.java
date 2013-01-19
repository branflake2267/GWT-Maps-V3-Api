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

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class StreetViewPanoramaDataGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewPanoramaData o = StreetViewPanoramaData.newInstance();
        finishTest();
      }
    });

  }

  public void testCopyRight() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewPanoramaData o = StreetViewPanoramaData.newInstance();
        String left = "Brandon was here";
        o.setCopyright(left);
        assertEquals(left, o.getCopyright());
        finishTest();
      }
    });

  }

  public void testStreetViewLinks() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewPanoramaData o = StreetViewPanoramaData.newInstance();
        StreetViewLink a = StreetViewLink.newInstance();
        a.setDescription("hi");
        a.setHeading(10);
        a.setPano("panooo");
        StreetViewLink b = StreetViewLink.newInstance();
        b.setDescription("hi there");
        b.setHeading(12);
        b.setPano("panooooooo");
        StreetViewLink[] c = new StreetViewLink[2];
        c[0] = a;
        c[1] = b;
        JsArray<StreetViewLink> svl = ArrayHelper.toJsArray(c);
        o.setLinks(svl);
        JsArray<StreetViewLink> right = o.getLinks();
        StreetViewLink aa = right.get(0);
        StreetViewLink bb = right.get(1);
        assertEquals(a.getDescription(), aa.getDescription());
        assertEquals(b.getDescription(), bb.getDescription());
        finishTest();
      }
    });

  }

  public void testStreetViewLocation() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewPanoramaData o = StreetViewPanoramaData.newInstance();
        StreetViewLocation location = StreetViewLocation.newInstance();
        location.setDescription("desc");
        o.setLocation(location);
        assertEquals("desc", o.getLocation().getDescription());
        finishTest();
      }
    });

  }

  public void testStreetViewTileData() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        StreetViewPanoramaData o = StreetViewPanoramaData.newInstance();
        StreetViewTileData left = StreetViewTileData.newInstance();
        left.setCenterHeading(1);
        o.setTileData(left);
        StreetViewTileData right = o.getTileData();
        assertEquals(left.getCenterHeading(), right.getCenterHeading());
        finishTest();
      }
    });

  }
}
