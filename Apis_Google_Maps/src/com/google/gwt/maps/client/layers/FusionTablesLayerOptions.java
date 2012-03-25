package com.google.gwt.maps.client.layers;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;

/**
 * This object defines the properties that can be set on a FusionTablesLayer object.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#FusionTablesLayerOptions}
 */
public class FusionTablesLayerOptions extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected FusionTablesLayerOptions() {}
  
  /**
   * creates - This object defines the properties that can be set on a FusionTablesLayer object.
   * @return
   */
  public static final FusionTablesLayerOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * sets If true, the layer receives mouse events. Default value is true.
   * @param clickable
   */
  public final native void setClickable(boolean clickable) /*-{
    this.clickable = clickable;
  }-*/;
  
  /**
   * gets If true, the layer receives mouse events. Default value is true.
   * @return
   */
  public final native boolean getClickable() /*-{
    return this.clickable;
  }-*/;
  
  /**
   * sets Options which define the appearance of the layer as a heatmap.
   * @param heatmap
   */
  public final native void setHeatmap(FusionTableHeatmap heatmap) /*-{
    this.heatmap = heatmap;
  }-*/;
  
  /**
   * gets Options which define the appearance of the layer as a heatmap.
   * @return
   */
  public final native FusionTableHeatmap getHeatmap() /*-{
    return this.heatmap;
  }-*/;
  
  /**
   * Renders the layer on the specified map. If map is set to null, the layer will be removed.
   * @param mapWidget
   */
  public final void setMap(MapWidget mapWidget) {
    setMapImpl(mapWidget.getJso());
  }

  private final native void setMapImpl(MapImpl map) /*-{
    this.map = map;
  }-*/;
  
  /**
   * Returns the map on which this layer is displayed.
   * @return
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }

  private final native MapImpl getMapImpl() /*-{
    return this.map;
  }-*/;
  
  /**
   * sets Options defining the data to display.
   * @param query
   */
  public final native void setQuery(FusionTablesQuery query) /*-{
    this.query = query;
  }-*/;
  
  /**
   * gets Options defining the data to display.
   * @return
   */
  public final native FusionTablesQuery getQuery() /*-{
    return this.query;
  }-*/;
  
  /**
   * sets An array of up to 5 style specifications, which control the appearance of features within the layer.
   * @param styles
   */
  public final native void setStyles(JsArray<FusionTablesStyle> styles) /*-{
    this.styles = styles;
  }-*/;
  
  /**
   * gets An array of up to 5 style specifications, which control the appearance of features within the layer.
   * @return
   */
  public final native JsArray<FusionTablesStyle> getStyles() /*-{
    return this.styles;
  }-*/;
  
  /**
   * sets Suppress the rendering of info windows when layer features are clicked.
   * @param suppressInfoWindows
   */
  public final native void setSuppressInfoWindows(boolean suppressInfoWindows) /*-{
    this.suppressInfoWindows = suppressInfoWindows;
  }-*/;
  
  /**
   * gets Suppress the rendering of info windows when layer features are clicked.
   * @return
   */
  public final native boolean getSuppressInfoWindows() /*-{
    return this.suppressInfoWindows;
  }-*/;
  
}
