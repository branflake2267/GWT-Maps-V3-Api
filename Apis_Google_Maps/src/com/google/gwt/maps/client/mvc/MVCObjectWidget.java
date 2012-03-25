package com.google.gwt.maps.client.mvc;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

/**
 * top class to emulate MVCObject Jso Overlay
 */
public abstract class MVCObjectWidget<T extends JavaScriptObject> extends Widget {

  /**
   * JSO instance
   */
  protected T impl;
  
  /**
   * top class for the map widgets
   */
  protected MVCObjectWidget() {
  }
  
  /**
   * Convenience method to get the JSO/MVC object (MapWidget, StreetViewPanoRamaWidget, AdUnitWidget, ...?)
   * @return
   */
  public T getMVCObject() {
    return impl;
  }
  
  // TODO add mvc methods here?
  
}
