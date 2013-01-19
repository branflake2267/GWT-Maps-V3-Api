package com.google.gwt.maps.client.base;

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
 * Two-dimensional size, where width is the distance on the x-axis, and height is the distance on the y-axis. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#Size">Size API Doc</a>
 */
public class Size extends JavaScriptObject {

  /**
   * creates Two-dimensional size, where width is the distance on the x-axis, and height is the distance on the y-axis.
   * use newInstance();
   */
  protected Size() {
  }

  /**
   * creates Two-dimensional size, where width is the distance on the x-axis, and height is the distance on the y-axis.
   * 
   * @param width
   * @param height
   * @param widthUnit
   * @param heightUnit
   * @return {@link Size}
   */
  public final static Size newInstance(double width, double height, String widthUnit, String heightUnit) {
    return createJso(width, height, widthUnit, heightUnit).cast();
  }

  /**
   * creates Two-dimensional size, where width is the distance on the x-axis, and height is the distance on the y-axis.
   * 
   * @param width
   * @param height
   * @return {@link Size}
   */
  public final static Size newInstance(double width, double height) {
    return createJso(width, height).cast();
  }

  private final static native Size createJso(double width, double height, String widthUnit, String heightUnit) /*-{
    return new $wnd.google.maps.Size(width, height, widthUnit, heightUnit);
  }-*/;

  private final static native Size createJso(double width, double height) /*-{
    return new $wnd.google.maps.Size(width, height);
  }-*/;

  /**
   * Compares two Sizes.
   * 
   * @param other
   * @return boolean
   */
  public final native boolean equals(Size other) /*-{
    return this.equals(other);
  }-*/;

  /**
   * Returns a string representation of this Size.
   */
  public final native String getToString() /*-{
    return this.toString();
  }-*/;

  /**
   * sets The height along the y-axis, in pixels.
   * 
   * @param height
   */
  public final native void setHeight(double height) /*-{
    this.height = height;
  }-*/;

  /**
   * gets The height along the y-axis, in pixels.
   */
  public final native double getHeight() /*-{
    return this.height;
  }-*/;

  /**
   * sets The width along the x-axis, in pixels.
   * 
   * @param width
   */
  public final native void setWidth(double width) /*-{
    this.width = width;
  }-*/;

  /**
   * gets The width along the x-axis, in pixels.
   */
  public final native double getWidth() /*-{
    return this.width;
  }-*/;
  
}
