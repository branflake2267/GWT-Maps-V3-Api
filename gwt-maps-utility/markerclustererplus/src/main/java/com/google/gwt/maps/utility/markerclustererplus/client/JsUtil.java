package com.google.gwt.maps.utility.markerclustererplus.client;

/*
 * #%L
 * GWT Maps API V3 - Utility API - MarkerClustererPlus
 * %%
 * Copyright (C) 2011 - 2013 GWT Maps API V3
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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayInteger;

import java.util.Collection;

public final class JsUtil {

  static <T extends JavaScriptObject> JsArray<T> toArray(final Collection<T> collection) {
    JsArray<T> array = JavaScriptObject.createArray().cast();
    for (T t : collection) {
      array.push(t);
    }
    return array;
  }

  static JsArrayInteger toIntegerArray(int... javaArray) {
    JsArrayInteger jsArray = JavaScriptObject.createArray().cast();
    for (int integer : javaArray) {
      jsArray.push(integer);
    }
    return jsArray;
  }

  static JsArrayInteger toIntegerArray(final Collection<Integer> collection) {
    JsArrayInteger array = JavaScriptObject.createArray().cast();
    for (Integer integer : collection) {
      array.push(integer);
    }
    return array;
  }

}
