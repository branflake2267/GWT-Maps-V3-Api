package com.google.gwt.maps.client.base;

import com.google.gwt.core.client.JavaScriptObject;

/** 
 * Two-dimensonal size, where width is the distance on the x-axis, and height is the distance on the y-axis.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#Size}
 */
public class Size extends JavaScriptObject {
  
  /**
   * creates Two-dimensonal size, where width is the distance on the x-axis, and height is the distance on the y-axis.
   * use newInstance();
   */
  protected Size() {}

  /**
   * creates Two-dimensonal size, where width is the distance on the x-axis, and height is the distance on the y-axis.
   * @param width
   * @param height
   * @param widthUnit
   * @param heightUnit
   * @return {@link Size}
   */
  public final static Size newInstance(int width, int height, String widthUnit, String heightUnit) {
    return createJso(width, height, widthUnit, heightUnit).cast();
  }
  
  /**
   * creates Two-dimensonal size, where width is the distance on the x-axis, and height is the distance on the y-axis.
   * @param width
   * @param height
   * @return {@link Size}
   */
  public final static Size newInstance(int width, int height) {
    return createJso(width, height).cast();
  }

  private final static native Size createJso(int width, int height, String widthUnit, String heightUnit) /*-{
    return new $wnd.google.maps.Size(width, height, widthUnit, heightUnit);
  }-*/;
  
  private final static native Size createJso(int width, int height) /*-{
    return new $wnd.google.maps.Size(width, height);
  }-*/;
  
  /**
   * Compares two Sizes.
   * @param other
   * @return boolean
   */
  public final native boolean equals(Size other) /*-{
    return this.equals(other);
  }-*/;
  
  /**
   * Returns a string representation of this Size.
   * @return
   */
  public final native String getToString() /*-{
    return this.toString();
  }-*/;
  
  /**
   * sets The height along the y-axis, in pixels.
   * @param height
   */
  public final native void setHeight(int height) /*-{
    this.height = height;
  }-*/;
  
  /**
   * gets The height along the y-axis, in pixels.
   * @return
   */
  public final native int getHeight() /*-{
    return this.height;
  }-*/;
  
  /**
   * sets The width along the x-axis, in pixels.
   * @param width
   */
  public final native void setWidth(int width) /*-{
    this.width = width;
  }-*/;
  
  /**
   * gets The width along the x-axis, in pixels.
   * @return
   */
  public final native int getWidth() /*-{
    return this.width;
  }-*/;
}
