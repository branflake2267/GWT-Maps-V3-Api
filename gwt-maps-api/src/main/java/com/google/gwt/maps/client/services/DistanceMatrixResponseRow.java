package com.google.gwt.maps.client.services;

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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * A row of the response to a DistanceMatrixService request, consisting of a sequence of DistanceMatrixResponseElements,
 * one for each corresponding destination address. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#DistanceMatrixResponseRow">
 * DistanceMatrixResponseRow API Doc</a>
 */
public class DistanceMatrixResponseRow extends JavaScriptObject {

  protected DistanceMatrixResponseRow() {
  }

  public static final DistanceMatrixResponseRow newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * The row's elements, corresponding to the destination addresses.
   * 
   * @param elements
   */
  public final native void setElements(JsArray<DistanceMatrixResponseElement> elements) /*-{
    this.elements = elements;
  }-*/;

  /**
   * The row's elements, corresponding to the destination addresses.
   */
  public final native JsArray<DistanceMatrixResponseElement> getElements() /*-{
    return this.elements;
  }-*/;

}
