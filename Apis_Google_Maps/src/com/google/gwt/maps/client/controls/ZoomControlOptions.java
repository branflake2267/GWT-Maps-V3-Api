package com.google.gwt.maps.client.controls;

import com.google.gwt.core.client.JavaScriptObject;

/** 
 * Options for the rendering of the zoom control.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#ZoomControlOptions}
 */
public class ZoomControlOptions extends JavaScriptObject {

  /**
   * creates Options for the rendering of the zoom control.
   * @return
   */
  public final static ZoomControlOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * Options for the rendering of the zoom control.
   * use newInstance();
   */
  protected ZoomControlOptions() {}
  
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
  
  public final native int getStyleJs() /*-{
    return this.style;
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
  
  private final native void setStyle(String type) /*-{
    this.style = $wnd.google.maps.ZoomControlStyle[type]
  }-*/;
  
  /*
   * gets Style id. Used to select what style of zoom control to display.
   * @return   
  public final ZoomControlStyle getStyle() {
    return ZoomControlStyle.fromValue(getStyleJs());
  }
  */
  
  /**
   * sets Style id. Used to select what style of zoom control to display.
   * @param zoomControlStyle
   */
  public final void setStyle(ZoomControlStyle zoomControlStyle) {
    setStyle(zoomControlStyle.value());
  }
  
}
