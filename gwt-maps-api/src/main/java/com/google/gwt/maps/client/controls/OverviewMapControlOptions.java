package com.google.gwt.maps.client.controls;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Options for the rendering of the Overview Map control
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#OverviewMapControlOptions">See OverviewMapControlOptions API</a>
 */
public class OverviewMapControlOptions extends JavaScriptObject {

  /**
   * Options for the rendering of the Overview Map control.
   * use newInstance();
   */
  protected OverviewMapControlOptions() {}
  
  /**
   * creates a new instance for, Options for the rendering of the Overview Map control.
   */
  public final static OverviewMapControlOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * sets Whether the control should display in opened mode or collapsed (minimized) mode. By default, the control is closed.
   * @param opened
   */
  public final native void setOpened(boolean opened) /*-{
    this.opened = opened;
  }-*/;
  
  /**
   * gets Whether the control should display in opened mode or collapsed (minimized) mode. By default, the control is closed.
   */
  public final native boolean getOpened() /*-{
    return this.opened;
  }-*/;
  
}
