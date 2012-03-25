package com.google.gwt.maps.client.maptypes;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * This class is used to specify options when creating a StyledMapType. These options cannot be changed after the StyledMapType is instantiated.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#StyledMapTypeOptions}
 */
public class StyledMapTypeOptions extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected StyledMapTypeOptions() {}
  
  /**
   * creates options
   * @return
   */
  public final static StyledMapTypeOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * sets Text to display when this MapType's button is hovered over in the map type control.
   * @param alt
   */
  public final native void setAlt(String alt) /*-{
    this.alt = alt;
  }-*/;
  
  /**
   * gets Text to display when this MapType's button is hovered over in the map type control.
   * @return
   */
  public final native String getAlt() /*-{
    return this.alt;
  }-*/;
  
  /**
   * sets The maximum zoom level for the map when displaying this MapType. Optional.
   * @param maxZoom
   */
  public final native void setMaxZoom(int maxZoom) /*-{
    this.maxZoom = maxZoom;
  }-*/;
  
  /**
   * gets The maximum zoom level for the map when displaying this MapType. Optional.
   * @return
   */
  public final native int getMaxZoom() /*-{
    return this.maxZoom;
  }-*/;
  
  /**
   * sets The minimum zoom level for the map when displaying this MapType. Optional.
   * @param minZoom
   */
  public final native void setMinZoom(int minZoom) /*-{
    this.minZoom = minZoom;
  }-*/;
  
  /**
   * gets The minimum zoom level for the map when displaying this MapType. Optional.
   * @return
   */
  public final native int getMinZoom() /*-{
    return this.minZoom;
  }-*/;
  
  /**
   * sets The name to display in the map type control.
   * @param name
   */
  public final native void setName(String name) /*-{
    this.name = name;
  }-*/;

  /**
   * gets The name to display in the map type control.
   * @return
   */
  public final native String getName() /*-{
    return this.name;
  }-*/;
  
}
