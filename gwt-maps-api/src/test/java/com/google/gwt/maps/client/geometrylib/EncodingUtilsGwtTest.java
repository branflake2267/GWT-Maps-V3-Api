package com.google.gwt.maps.client.geometrylib;

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
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.mvc.MVCArray;

public class EncodingUtilsGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return new LoadLibrary[] { LoadLibrary.GEOMETRY };
  }

  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng[] array = new LatLng[3];
        array[0] = LatLng.newInstance(49.496675, -102.65625);
        array[1] = LatLng.newInstance(50.496675, -103.65625);
        array[2] = LatLng.newInstance(51.496675, -104.65625);
        JsArray<LatLng> path = ArrayHelper.toJsArray(array);
        String encodedPath = EncodingUtils.encodePath(path);
        assertEquals("gibmHp`qqR_ibE~hbE_ibE~hbE", encodedPath);

        JsArray<LatLng> array2 = EncodingUtils.decodePath(encodedPath);
        assertEquals(array.length, array2.length());

        finishTest();
      }
    });

  }

  public void testUse2() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        LatLng[] array = new LatLng[3];
        array[0] = LatLng.newInstance(49.496675, -102.65625);
        array[1] = LatLng.newInstance(50.496675, -103.65625);
        array[2] = LatLng.newInstance(51.496675, -104.65625);

        JsArray<LatLng> path = ArrayHelper.toJsArray(array);
        MVCArray<LatLng> path2 = MVCArray.newInstance(path);
        String encodedPath = EncodingUtils.encodePath(path2);
        assertEquals("gibmHp`qqR_ibE~hbE_ibE~hbE", encodedPath);

        JsArray<LatLng> array2 = EncodingUtils.decodePath(encodedPath);
        assertEquals(array.length, array2.length());

        finishTest();
      }
    });

  }

}
