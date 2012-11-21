package com.google.gwt.maps.client.base;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A point on a two-dimensional plane.
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#Point">Point API Doc</a>
 */
public class Point extends JavaScriptObject {
  
  /**
   * A point on a two-dimensional plane.
   * use newInstance();
   */
  protected Point() {}

  /**
   * creates A point on a two-dimensional plane.
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
