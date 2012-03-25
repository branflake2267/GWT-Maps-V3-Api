package com.google.gwt.maps.client.streetview;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.controls.ControlPosition;

/**
 * Options for the rendering of the Street View address control.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#StreetViewAddressControlOptions}
 */
public class StreetViewAddressControlOptions extends JavaScriptObject {
  
  /**
   * creates Options for the rendering of the Street View address control.
   * @return
   */
  public final static StreetViewAddressControlOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * Options for the rendering of the Street View address control.
   * use newInstance();
   */
  protected StreetViewAddressControlOptions() {}
  
  /**
   * Position id. Used to specify the position of the control on the map. The default position is TOP_LEFT.
   * @return
   */
  public final ControlPosition getPosition() {
    return ControlPosition.fromValue(getPositionImpl());
  }
  
  private final native int getPositionImpl() /*-{
    return this.position;
  }-*/;
  
  /**
   * Position id. Used to specify the position of the control on the map. The default position is TOP_LEFT.
   * @param controlPosition {@link ControlPosition}
   */
  public final void setPosition(ControlPosition position) {
    setPositionImpl(position.value());
  }

  private final native void setPositionImpl(int position) /*-{
    this.position = position;
  }-*/;

}
