package com.google.gwt.maps.client.controls;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Options for the rendering of the scale control.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#ScaleControlOptions} 
 */
public class ScaleControlOptions extends JavaScriptObject {

  /**
   * Options for the rendering of the scale control.
   */
  protected ScaleControlOptions() {}
  
  /**
   * Options for the rendering of the scale control.
   * @return ScaleControlOptions
   */
  public final static ScaleControlOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
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
  
  /**
   * set Style id. Used to select what style of scale control to display.
   * @param style {@link ScaleControlStyle}
   */
  public final void setStyle(ScaleControlStyle style) {
    setStyle(style.value());
  }
  
  /**
   * set Style id. Used to select what style of scale control to display.
   * @param style 
   */
  private final native void setStyle(String style) /*-{
    this.style = style;
  }-*/;
  
  /**
   * get Style id. Used to select what style of scale control to display.
   * @return {@link ScaleControlStyle}
   */
  public final ScaleControlStyle getStyle() {
    return ScaleControlStyle.fromValue(getStyleJs());
  }
  
  /**
   * get Style id. Used to select what style of scale control to display.
   * @return String
   */
  private final native String getStyleJs() /*-{
    return this.style;
  }-*/;
  
}
