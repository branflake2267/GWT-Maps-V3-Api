package com.google.gwt.maps.client.layers;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Specifies the appearance for a FusionTablesLayer when rendered as a heatmap.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#FusionTablesHeatmap}
 */
public class FusionTableHeatmap extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected FusionTableHeatmap() {}
  
  /**
   * Specifies the appearance for a FusionTablesLayer when rendered as a heatmap.
   * @return
   */
  public static final FusionTableHeatmap newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * sets If true, render the layer as a heatmap.
   * @param enabled
   */
  public final native void setEnabled(boolean enabled) /*-{
    this.enabled = enabled;
  }-*/;
  
  /**
   * gets If true, render the layer as a heatmap.
   */
  public final native boolean getEnabled() /*-{
    return this.enabled;
  }-*/;
  
}
