package com.google.gwt.maps.client.maptypes;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.controls.MapTypeStyle;

/**
 * Creates a MapType with a custom style.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#StyledMapType} 
 */
public class StyledMapType extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected StyledMapType() {}
  
  /**
   * Creates a styled MapType with the specified options. The StyledMapType takes an array of MapTypeStyles, where each MapTypeStyle is applied to the map consecutively. A later MapTypeStyle that applies the same MapTypeStylers to the same selectors as an earlier MapTypeStyle will override the earlier MapTypeStyle.
   * @param styles
   * @param options
   * @return
   */
  public static StyledMapType newInstance(JsArray<MapTypeStyle> styles, StyledMapTypeOptions options) {
    return createJso(styles, options).cast();
  }

  private final static native JavaScriptObject createJso(JsArray<MapTypeStyle> styles, StyledMapTypeOptions options) /*-{
    return new $wnd.google.maps.StyledMapType(styles, options);
  }-*/;
  
  
}
