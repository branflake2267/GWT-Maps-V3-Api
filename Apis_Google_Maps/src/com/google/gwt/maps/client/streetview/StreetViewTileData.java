package com.google.gwt.maps.client.streetview;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.Size;

/**
 * The properties of the tile set used in a Street View panorama.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#StreetViewTileData}
 */
public class StreetViewTileData extends JavaScriptObject {
  
  /**
   * The properties of the tile set used in a Street View panorama.
   * use newInstance();
   */
  protected StreetViewTileData() {} 

  /**
   * creates The properties of the tile set used in a Street View panorama.
   * @return
   */
  public final static StreetViewTileData newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * Gets the tile image URL for the specified tile.
   * @param pano is the panorama ID of the Street View tile.
   * @param zoom is the zoom level of the tile.
   * @param tileX is the x-coordinate of the tile.
   * @param tileY is the y-coordinate of the tile. 
   * @param handler
   * @return
   */
  public final native String getTileUrl(String pano, int zoom, int tileX, int tileY, TileUrlHandler handler) /*-{
    this.getTileUrl = function(pano, zoom, tileX, tileY) {
      return @com.google.gwt.maps.client.streetview.StreetViewTileData::getTileUrlImpl(Ljava/lang/String;IIILcom/google/gwt/maps/client/streetview/TileUrlHandler;)(pano, zoom, tileX, tileY, handler);
    };
  }-*/;
  
  private final static String getTileUrlImpl(String pano, int zoom, int tileX, int tileY, TileUrlHandler handler) {
    return handler.getTileUrl(pano, zoom, tileX, tileY);
  }
  
  /**
   * sets The heading (in degrees) at the center of the panoramic tiles.
   * @param centerHeading
   */
  public final native void setCenterHeading(int centerHeading) /*-{
    this.centerHeading = centerHeading;
  }-*/;
   
  /**
   * gets The heading (in degrees) at the center of the panoramic tiles.
   * @return
   */
  public final native int getCenterHeading() /*-{
    return this.centerHeading;
  }-*/;
  
  /**
   * sets The size (in pixels) at which tiles will be rendered. This may not be the native tile image size.
   * @param tileSize
   */
  public final native void setTileSize(Size tileSize) /*-{
    this.tileSize = tileSize;
  }-*/;
  
  /**
   * gets The size (in pixels) at which tiles will be rendered. This may not be the native tile image size.
   * @return
   */
  public final native Size getTileSize() /*-{
    return this.tileSize;
  }-*/;
  
  /**
   * sets The size (in pixels) of the whole panorama's "world".
   * @param worldSize
   */
  public final native void setWorldSize(Size worldSize) /*-{
    this.worldSize = worldSize;
  }-*/;
  
  /**
   * gets The size (in pixels) of the whole panorama's "world".
   * @return
   */
  public final native Size getWorldSize() /*-{
    return this.worldSize;
  }-*/;
  
}
