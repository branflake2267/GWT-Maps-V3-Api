package com.google.gwt.maps.client.drawinglib;

/**
 * The types of overlay that may be created by the DrawingManager.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#OverlayType}
 */
public enum OverlayType {

  /**
   * Specifies that the DrawingManager creates circles, and that the overlay given in the overlaycomplete event is a circle.
   */
  CIRCLE,
  
  /**
   * Specifies that the DrawingManager creates markers, and that the overlay given in the overlaycomplete event is a marker.
   */
  MARKER,
  
  /**
   * Specifies that the DrawingManager creates polygons, and that the overlay given in the overlaycomplete event is a polygon.
   */
  POLYGON,
  
  /**
   * Specifies that the DrawingManager creates polylines, and that the overlay given in the overlaycomplete event is a polyline.
   */
  POLYLINE,
  
  /**
   * Specifies that the DrawingManager creates rectangles, and that the overlay given in the overlaycomplete event is a rectangle.
   */
  RECTANGLE;
  
  
  public String value() {
    return name().toLowerCase();
  }
  
  public static OverlayType fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  public String toString() {
    return name();
  }
  
}
