package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A representation of distance as a numeric value and a display string.
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#Distance">Distance API Doc</a>
 */
public class Distance extends JavaScriptObject {
  
  /**
   * use newInstance();
   */
  protected Distance() {}
  
  /**
   * A representation of distance as a numeric value and a display string.
   */
  public static final Distance newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * A string representation of the distance value, using the UnitSystem specified in the request.
   * @param text
   */
  public final native void setText(String text) /*-{
    this.text = text;
  }-*/;
  
  /**
   * A string representation of the distance value, using the UnitSystem specified in the request.
   */
  public final native String getText() /*-{
    return this.text;
  }-*/;
  
  /**
   * The distance in meters.
   * @param value
   */
  public final native void setValue(int value) /*-{
    this.value = value;
  }-*/;
  
  /**
   * The distance in meters.
   */
  public final native int getValue() /*-{
    return this.value;
  }-*/;
  
}
