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

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.controls.MapTypeStyle;
import com.google.gwt.maps.client.maptypes.MapTypeRegistry;
import com.google.gwt.maps.client.maptypes.StyledMapType;
import com.google.gwt.maps.client.maptypes.StyledMapTypeOptions;

public class MapTypeRegistryGwtTest extends AbstractMapsGWTTestHelper {

  @Override
  public LoadLibrary[] getLibraries() {
    return null;
  }

  @SuppressWarnings("unused")
  public void testUse() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeRegistry o = MapTypeRegistry.newInstance();
        finishTest();
      }
    });

  }

  public void testSet() {
    asyncLibTest(new Runnable() {
      @Override
      public void run() {
        MapTypeRegistry o = MapTypeRegistry.newInstance();
        assertNotNull(o);

        String id = "myId";

        MapTypeStyle[] array = new MapTypeStyle[3];
        array[0] = MapTypeStyle.newInstance();
        array[1] = MapTypeStyle.newInstance();
        array[2] = MapTypeStyle.newInstance();
        JsArray<MapTypeStyle> styles = ArrayHelper.toJsArray(array);
        StyledMapTypeOptions options = StyledMapTypeOptions.newInstance();
        StyledMapType styledType = StyledMapType.newInstance(styles, options);

        o.set(id, styledType);

        finishTest();
      }
    });

  }

}
