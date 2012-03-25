package com.google.gwt.maps.client.base;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A point on a two-dimensional plane.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#Point}
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
   * @return
   */
  public final static Point newInstance(int x, int y) {
    return createJso(x, y).cast();
  }
  
  private final static native JavaScriptObject createJso(int x, int y) /*-{
    return new $wnd.google.maps.Point(x, y);
  }-*/;
  
  /**
   * Compares two Points
   * @param other
   * @return
   */
  public final native boolean equals(Point other) /*-{
    return this.equals(other);
  }-*/;
  
  /**
   * Returns a string representation of this Point.
   * @return
   */
  public final native String getToString() /*-{
    return this.toString();
  }-*/;
  
  /**
   * get X coordinate
   * @return
   */
  public final native int getX() /*-{
    return this.x;
  }-*/;
  
  /**
   * get Y coordinate
   * @return
   */
  public final native int getY() /*-{
    return this.y;
  }-*/;
}
