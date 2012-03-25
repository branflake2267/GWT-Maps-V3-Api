package com.google.gwt.maps.client.maptypes;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.Point;
import com.google.gwt.maps.client.base.Size;

/**
 * This class is used to create a MapType that renders image tiles.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#ImageMapTypeOptions} 
 */
public class ImageMapTypeOptions extends JavaScriptObject {
  
  /**
   * use newInstance();
   */
  protected ImageMapTypeOptions() {}

  /**
   * This class is used to create a MapType that renders image tiles.
   * @return
   */
  public final static ImageMapTypeOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }
 
  /**
   * set Alt text to display when this MapType's button is hovered over in the MapTypeControl.
   * @param alt
   */
  public final native void setAlt(String alt) /*-{
    this.alt = alt;
  }-*/;
  
  /**
   * get Alt text to display when this MapType's button is hovered over in the MapTypeControl.
   * @return
   */
  public final native String getAlt() /*-{
    return this.alt;
  }-*/;
  
  /**
   * setup a callback to process the url creation
   * Returns a string (URL) for given tile coordinate (x, y) and zoom level. This function should have a signature of: getTileUrl(Point, number):string
   * @param callback
   * @return
   */
  public final native void setTileUrl(TileUrlCallBack callback) /*-{
    this.getTileUrl = function(point, zoomLevel) {
      return @com.google.gwt.maps.client.maptypes.ImageMapTypeOptions::processTileUrlCallBack(Lcom/google/gwt/maps/client/base/Point;ILcom/google/gwt/maps/client/maptypes/TileUrlCallBack;)(point, zoomLevel, callback);
    };
  }-*/;
  
  /**
   * process the callback internally
   * @param point
   * @param zoomLevel
   * @param callback
   * @return
   */
  private final static String processTileUrlCallBack(Point point, int zoomLevel, TileUrlCallBack callback) {
    return callback.getTileUrl(point, zoomLevel);
  }
  
  /**
   * sets The maximum zoom level for the map when displaying this MapType.
   * @param maxZoom
   */
  public final native void setMaxZoom(int maxZoom) /*-{
    this.maxZoom = maxZoom;
  }-*/;
  
  /**
   * gets The maximum zoom level for the map when displaying this MapType.
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
   * set Name to display in the MapTypeControl.
   * @param name
   */
  public final native void setName(String name) /*-{
    this.name = name;
  }-*/;
  
  /**
   * gets Name to display in the MapTypeControl.
   * @return
   */
  public final native String getName() /*-{
    return this.name;
  }-*/;
  
  /**
   * The opacity to apply to the tiles. The opacity should be specified as a float value between 0 and 1.0, where 0 is fully transparent and 1 is fully opaque.
   * @param opacity
   */
  public final native void setOpacity(double opacity) /*-{
    this.opacity = opacity;
  }-*/;
  
  /**
   * gets The opacity to apply to the tiles. The opacity should be specified as a float value between 0 and 1.0, where 0 is fully transparent and 1 is fully opaque.
   * @return
   */
  public final native double getOpacity() /*-{
    return this.opacity;
  }-*/;
  
  /**
   * sets The tile size.
   * @param size
   */
  public final native void setTileSize(Size size) /*-{
    this.size = size;
  }-*/;
  
  /**
   * gets The tile size.
   * @return
   */
  public final native Size getTileSize() /*-{
    return this.size;
  }-*/;
  
}
