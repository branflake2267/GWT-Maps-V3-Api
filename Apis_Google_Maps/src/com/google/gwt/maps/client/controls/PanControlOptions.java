package com.google.gwt.maps.client.controls;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Options for the rendering of the pan control.
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#PanControlOptions">PanControlOptions API Doc</a>
 */
public class PanControlOptions extends JavaScriptObject {

  /**
   * creates a new instance of, Options for the rendering of the pan control.
   */
  public final static PanControlOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * Options for the rendering of the pan control.
   * use newInstance
   */
  protected PanControlOptions() {}
  
  /**
   * Position id. Used to specify the position of the control on the map. The default position is TOP_LEFT.
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
