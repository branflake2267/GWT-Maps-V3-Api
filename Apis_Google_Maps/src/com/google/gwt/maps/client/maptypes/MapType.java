package com.google.gwt.maps.client.maptypes;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.base.Point;
import com.google.gwt.maps.client.base.Size;

/**
 * This interface defines map type. This interface is typically used for base maps such as road, satellite or hybrid maps. Immutable.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#MapType}
 */
public interface MapType {
  
  /**
   * Returns a tile for the given tile coordinate (x, y) and zoom level. This tile will be appended to the given ownerDocument.
   * @param tileCoord
   * @param zoom
   * @param ownerDocument
   * @return
   */
  public Element getTile(Point tileCoord, int zoom, Document ownerDocument);
  
  /**
   * Releases the given tile, performing any necessary cleanup. The provided tile will have already been removed from the document. Optional.
   * @param tile
   */
  public void releaseTile(Element tile);
  
  /**
   * sets Alt text to display when this MapType's button is hovered over in the MapTypeControl. Optional.
   * @param alt
   */
  public void setAlt(String alt);
  
  /**
   * gets Alt text to display when this MapType's button is hovered over in the MapTypeControl. Optional.
   * @return
   */
  public String getAlt();
  
  /**
   * sets The maximum zoom level for the map when displaying this MapType. Required for base MapTypes, ignored for overlay MapTypes.
   * @param maxZoom
   */
  public void setMaxZoom(int maxZoom);
  
  /**
   * sets The minimum zoom level for the map when displaying this MapType. Optional; defaults to 0.
   * @param minZoom
   */
  public void setMinZoom(int minZoom);
  
  /**
   * sets Name to display in the MapTypeControl. Optional.
   * @param name
   */
  public void setName(String name);
  
  /**
   * sets The Projection used to render this MapType. Optional; defaults to Mercator.
   * @param projection
   */
  public void setProjection(Projection projection);
  
  /**
   * sets Radius of the planet for the map, in meters. Optional; defaults to Earth's equatorial radius of 6378137 meters.
   * @param radius
   */
  public void setRadius(int radius);
  
  /**
   * sets The dimensions of each tile. Required.
   * @param tileSize
   */
  public void setTileSize(Size tileSize);
}
