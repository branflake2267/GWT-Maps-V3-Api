package com.google.gwt.maps.client.layers;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#FusionTablesMarkerOptions">FusionTablesMarkerOptions API Doc</a>
 */
public class FusionTablesMarkerOptions extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected FusionTablesMarkerOptions() {}
  
  /**
   * Options which control the appearance of point features in a FusionTablesLayer.
   */
  public static final FusionTablesMarkerOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * sets The name of a Fusion Tables supported icon.<br>
   * See <a href="http://www.google.com/fusiontables/DataSource?dsrcid=308519">list of map icons</a>.
   * @param iconName
   */
  public final native void setIconName(String iconName) /*-{
    this.iconName = iconName;
  }-*/;
  
  /**
   * gets The name of a Fusion Tables supported icon.
   * See <a href="http://www.google.com/fusiontables/DataSource?dsrcid=308519">list of map icons</a>.
   */
  public final native String getIconName() /*-{
    return this.iconName;
  }-*/;
  
}
