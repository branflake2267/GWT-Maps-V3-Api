package com.google.gwt.maps.client.maptypes;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * This class implements the MapType interface and is provided for rendering image tiles.
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#ImageMapType">ImageMapType API Doc</a> 
 */
public class ImageMapType extends JavaScriptObject {
  
  /**
   * use newInstance();
   */
  protected ImageMapType() {}
  
  /**
   * Constructs an ImageMapType using the provided ImageMapTypeOptions
   * @param options
   */
  public final static ImageMapType newInstance(ImageMapTypeOptions options) {
      return createJso(options).cast();
  }
  
  private final static native JavaScriptObject createJso(ImageMapTypeOptions options) /*-{
    return new $wnd.google.maps.ImageMapType(options);
  }-*/;
 
}
