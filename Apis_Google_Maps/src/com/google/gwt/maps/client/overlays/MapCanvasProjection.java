package com.google.gwt.maps.client.overlays;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Point;

/**
 * This object is made available to the OverlayView from within the draw method. It is not guaranteed to be initialized until draw is called.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#MapCanvasProjection} 
 */
public class MapCanvasProjection extends JavaScriptObject {

  /**
   * returns from another object only
   */
  protected MapCanvasProjection() {}
  
  /**
   * returns from another object only
   * @return
   */
  public final static MapCanvasProjection newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * Computes the geographical coordinates from pixel coordinates in the map's container.
   * @param pixel
   * @return
   */
  public final native LatLng fromContainerPixelToLatLng(Point pixel) /*-{
    return this.fromContainerPixelToLatLng(pixel);
  }-*/; 
  
  /**
   * Computes the geographical coordinates from pixel coordinates in the div that holds the draggable map.
   * @param pixel
   * @return
   */
  public final native LatLng fromDivPixelToLatLng(Point pixel) /*-{
    this.fromDivPixelToLatLng(pixel);
  }-*/;
  
  /**
   * Computes the pixel coordinates of the given geographical location in the DOM element the map's outer container.
   * @param latlng
   * @return
   */
  public final native Point fromLatLngToContainerPixel(LatLng latlng) /*-{
    this.fromLatLngToContainerPixel(latlng);
  }-*/;
  
  /**
   * Computes the pixel coordinates of the given geographical location in the DOM element that holds the draggable map.
   * @param latlng
   */
  public final native void fromLatLngToDivPixel(LatLng latlng) /*-{
    this.fromLatLngToDivPixel(latlng);
  }-*/;
  
  /**
   * The width of the world in pixels in the current zoom level. For projections with a heading angle of either 90 or 270 degress, this corresponds to the pixel span in the Y-axis.
   * @return
   */
  public final native int getWorldWidth() /*-{
    return this.getWorldWidth();
  }-*/;
  
}
