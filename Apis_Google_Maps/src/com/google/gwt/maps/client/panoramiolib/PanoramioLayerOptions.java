package com.google.gwt.maps.client.panoramiolib;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;

/**
 * This object defines the properties that can be set on a PanoramioLayer object.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#PanoramioLayerOptions}
 */
public class PanoramioLayerOptions extends JavaScriptObject {

  /**
   * This object defines the properties that can be set on a PanoramioLayer object.
   * @return
   */
  public final static PanoramioLayerOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * use newInstance();
   */
  protected PanoramioLayerOptions() {} 
  
  /**
   * If true, the layer receives mouse events. Default value is true.
   * @return
   */
  public final native boolean getClickable() /*-{
    return this.clickable;
  }-*/;
  
  /**
   * The map on which to display the layer.
   * @return
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }
  
  private final native MapImpl getMapImpl() /*-{
    return this.map;
  }-*/;

  /**
   * Suppress the rendering of info windows when layer features are clicked.
   * @return
   */
  public final native boolean getSuppressInfoWindows() /*-{
    return this.suppressInfoWindows;
  }-*/;

  /**
   * A panoramio tag used to filter the photos which are displayed. Only photos which have been tagged with the supplied string will be shown.
   */
  public final native String getTag() /*-{
    return this.tag;
  }-*/;
  
  /**
   * A Panoramio user ID. If provided, only photos by this user will be displayed on the map. If both a tag and user ID are provided, the tag will take precedence.
   */
  public final native String getUserId() /*-{
    return this.userId;
  }-*/;
  
  /**
   * If true, the layer receives mouse events. Default value is true.
   * @param clickable
   */
  public final native void setClickable(boolean clickable) /*-{
    this.clickable = clickable;
  }-*/;
  
  /**
   * The map on which to display the layer.
   * @param mapWidget
   */
  public final void setMap(MapWidget mapWidget) {
    setMapImpl(mapWidget.getJso());
  }
  
  private final native void setMapImpl(MapImpl map) /*-{
    this.map = map;
  }-*/;
  
  /**
   * Suppress the rendering of info windows when layer features are clicked.
   * @param suppressInfoWindows
   */
  public final native void setSuppressInfoWindows(boolean suppressInfoWindows) /*-{
    this.suppressInfoWindows = suppressInfoWindows;
  }-*/;
  
  /**
   * A panoramio tag used to filter the photos which are displayed. Only photos which have been tagged with the supplied string will be shown.
   * @param tag
   */
  public final native void setTag(String tag) /*-{
    this.tag = tag;
  }-*/;
  
  /**
   * A Panoramio user ID. If provided, only photos by this user will be displayed on the map. If both a tag and user ID are provided, the tag will take precedence.
   * @param userId
   */
  public final native void setUserId(String userId) /*-{
    this.userId = userId;
  }-*/;
  
}
