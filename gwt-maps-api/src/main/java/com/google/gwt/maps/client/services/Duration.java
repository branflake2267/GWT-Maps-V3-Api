package com.google.gwt.maps.client.services;

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
