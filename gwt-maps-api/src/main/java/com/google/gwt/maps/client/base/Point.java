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
 * A point on a two-dimensional plane. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#Point">Point API Doc</a>
 */
public class Point extends JavaScriptObject {

  /**
   * A point on a two-dimensional plane. use newInstance();
   */
  protected Point() {
  }

  /**
   * creates A point on a two-dimensional plane.
   * 
   * @param x
   * @param y
   */
  public final static Point newInstance(double x, double y) {
    return createJso(x, y).cast();
  }

  private final static native JavaScriptObject createJso(double x, double y) /*-{
    return new $wnd.google.maps.Point(x, y);
  }-*/;

  /**
   * Compares two Points
   * 
   * @param other
   */
  public final native boolean equals(Point other) /*-{
    return this.equals(other);
  }-*/;

  /**
   * Returns a string representation of this Point.
   */
  public final native String getToString() /*-{
    return this.toString();
  }-*/;

  /**
   * get X coordinate
   */
  public final native double getX() /*-{
    return this.x;
  }-*/;

  /**
   * get Y coordinate
   */
  public final native double getY() /*-{
    return this.y;
  }-*/;
  
}
