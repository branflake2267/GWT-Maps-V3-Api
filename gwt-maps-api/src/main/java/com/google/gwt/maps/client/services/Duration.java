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

/**
 * A representation of duration as a numeric value and a display string.
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#Duration">Duration API Doc</a>
 */
public class Duration extends JavaScriptObject {
  
  /**
   * use newInstance();
   */
  protected Duration() {}

  /**
   * A representation of duration as a numeric value and a display string.
   */
  public static final Duration newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * A string representation of the duration value.
   * @param text
   */
  public final native void setText(String text) /*-{
    this.text = text;
  }-*/;
  
  /**
   * A string representation of the duration value.
   */
  public final native String getText() /*-{
    return this.text;
  }-*/;
  
  /**
   * The duration in seconds.
   * @param value
   */
  public final native void setValue(int value) /*-{
    this.value = value;
  }-*/;
  
  /**
   * The duration in seconds.
   */
  public final native int getValue() /*-{
    return this.value;
  }-*/;
  
}
