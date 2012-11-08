package com.google.gwt.maps.client.maptypes;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.controls.MapTypeStyle;

/**
 * Creates a MapType with a custom style.
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#StyledMapType">StyledMapType API Doc</a> 
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
   */
  public static StyledMapType newInstance(JsArray<MapTypeStyle> styles, StyledMapTypeOptions options) {
    return createJso(styles, options).cast();
  }

  /**
   * Create native JSO
   * @param styles
   * @param options
   * @return
   */
  private final static native JavaScriptObject createJso(JsArray<MapTypeStyle> styles, StyledMapTypeOptions options) /*-{
    return new $wnd.google.maps.StyledMapType(styles, options);
  }-*/;
  
  
}
