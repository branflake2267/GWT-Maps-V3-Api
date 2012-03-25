package com.google.gwt.maps.client.controls;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Options for the rendering of the Street View pegman control on the map.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#StreetViewControlOptions} 
 */
public class StreetViewControlOptions extends JavaScriptObject {

  /**
   * creates Options for the rendering of the Street View pegman control on the map.
   * @return
   */
  public static StreetViewControlOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * Options for the rendering of the Street View pegman control on the map.
   * use newInstance()
   */
  protected StreetViewControlOptions() {}

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
