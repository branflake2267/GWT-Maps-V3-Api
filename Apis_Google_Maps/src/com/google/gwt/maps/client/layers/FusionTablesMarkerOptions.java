package com.google.gwt.maps.client.layers;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#FusionTablesMarkerOptions}
 */
public class FusionTablesMarkerOptions extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected FusionTablesMarkerOptions() {}
  
  /**
   * Options which control the appearance of point features in a FusionTablesLayer.
   * @return
   */
  public static final FusionTablesMarkerOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * sets The name of a Fusion Tables supported iconm {@link http://www.google.com/fusiontables/DataSource?dsrcid=308519}
   * @param iconName
   */
  public final native void setIconName(String iconName) /*-{
    this.iconName = iconName;
  }-*/;
  
  /**
   * gets The name of a Fusion Tables supported icon {@link http://www.google.com/fusiontables/DataSource?dsrcid=308519}
   * @return
   */
  public final native String getIconName() /*-{
    return this.iconName;
  }-*/;
  
}
