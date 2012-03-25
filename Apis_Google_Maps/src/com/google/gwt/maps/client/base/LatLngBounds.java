package com.google.gwt.maps.client.base;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A LatLngBounds instance represents a rectangle in geographical coordinates, including one that crosses the 180 degrees longitudinal meridian.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#LatLngBounds} 
 */
public class LatLngBounds extends JavaScriptObject {
  
  /**
   * A LatLngBounds instance represents a rectangle in geographical coordinates, including one that crosses the 180 degrees longitudinal meridian.
   * use newInstance(...);
   */
  protected LatLngBounds() {}
  
  /**
   * creates A LatLngBounds instance represents a rectangle in geographical coordinates, including one that crosses the 180 degrees longitudinal meridian.
   * @param sw {@link LatLng}
   * @param ne {@link LatLng}
   * @return
   */
  public final static LatLngBounds newInstance(LatLng sw, LatLng ne) {
    return createJso(sw, ne).cast(); 
  }

  private final static native JavaScriptObject createJso(LatLng sw, LatLng ne) /*-{
    return new $wnd.google.maps.LatLngBounds(sw, ne);
  }-*/;
  
  /**
   * Returns true if the given lat/lng is in this bounds.
   * @param latlng {@link LatLng}
   * @return
   */
  public final native boolean contains(LatLng latlng) /*-{
    return this.contains(latlng);
  }-*/;
  
  /**
   * Returns true if this bounds approximately equals the given bounds.
   * @param other {@link LatLngBounds}
   * @return
   */
  public final native boolean equals(LatLngBounds other) /*-{
    return this.equals(other);
  }-*/;
  
  /**
   * Extends this bounds to contain the given point.
   * @param point {@link LatLng}
   * @return {@link LatLngBounds}
   */
  public final native LatLngBounds extend(LatLng point) /*-{
    return this.extend(point);
  }-*/;
  
  /**
   * Computes the center of this LatLngBounds
   * @return {@link LatLng}
   */
  public final native LatLng getCenter() /*-{
    return this.getCenter();
  }-*/;
  
  /**
   * Returns the north-east corner of this bounds.
   * @return {@link LatLng}
   */
  public final native LatLng getNorthEast() /*-{
    return this.getNorthEast();
  }-*/;
  
  /**
   * Returns the south-west corner of this bounds.
   * @return {@link LatLng}
   */
  public final native LatLng getSouthWest() /*-{
    return this.getSouthWest();
  }-*/;
  
  /**
   * Returns true if this bounds shares any points with this bounds.
   * @param other {@link LatLngBounds}
   * @return boolean
   */
  public final native boolean intersects(LatLngBounds other) /*-{
    return this.intersects(other);
  }-*/;
  
  /**
   * Returns if the bounds are empty.
   * @return boolean
   */
  public final native boolean isEmpty() /*-{
    return this.isEmpty();
  }-*/;
  
  /**
   * Converts the given map bounds to a lat/lng span.
   * @return {@link LatLng}
   */
  public final native LatLng toSpan() /*-{
    return this.toSpan();
  }-*/;
  
  /**
   * Converts to string.
   * @return boolean
   */
  public final native String getToString() /*-{
    return this.toString();
  }-*/;
  
  /**
   * Returns a string of the form "lat_lo,lng_lo,lat_hi,lng_hi" for this bounds, where "lo" corresponds to the southwest corner of the bounding box, while "hi" corresponds to the northeast corner of that box.
   * @param precision
   * @return String
   */
  public final native String toUrlValue(int precision) /*-{
    return this.toUrlValue(precision);
  }-*/;
  
  /**
   * Extends this bounds to contain the union of this and the given bounds.
   * @param other {@link LatLngBounds}
   * @return {@link LatLngBounds}
   */
  public final native LatLngBounds union(LatLngBounds other) /*-{
    return this.union(other);
  }-*/;
  
}
