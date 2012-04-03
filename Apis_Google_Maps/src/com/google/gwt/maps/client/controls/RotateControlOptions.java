package com.google.gwt.maps.client.controls;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Options for the rendering of the rotate control.
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#RotateControlOptions">RotateControlOptions API Doc</a> 
 */
public class RotateControlOptions extends JavaScriptObject {

  /**
   * create a new instance of Options for the rendering of the rotate control.
   * @return
   */
  public final static RotateControlOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * Options for the rendering of the rotate control.
   * use newInstance()
   */
  protected RotateControlOptions() {}
  
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
   * @param position {@link ControlPosition}
   */
  public final void setPosition(ControlPosition position) {
    setPositionImpl(position.value());
  }

  private final native void setPositionImpl(int position) /*-{
    this.position = position;
  }-*/;

}
