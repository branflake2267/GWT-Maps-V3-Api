package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;

/**
 *  Geometry information about this GeocoderResult
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#GeocoderGeometry}
 */
public class GeocoderGeometry extends JavaScriptObject {
  
  /**
   * use newInstance();
   */
  protected GeocoderGeometry() {}
  
  /**
   * Geometry information about this GeocoderResult
   * @return
   */
  public static final GeocoderGeometry newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * The precise bounds of this GeocodeResult, if applicable
   * @param bounds
   */
  public final native void setBounds(LatLngBounds bounds) /*-{
    this.bounds = bounds;
  }-*/;
  
  /**
   * The precise bounds of this GeocodeResult, if applicable
   * @return
   */
  public final native LatLngBounds getBounds() /*-{
    return this.bounds;
  }-*/;

  /**
   * The latitude/longitude coordinates of this result
   * @param location
   */
  public final native void setLocation(LatLng location) /*-{
    this.location = location;
  }-*/;
  
  /**
   * The latitude/longitude coordinates of this result
   * @return
   */
  public final native LatLng getLocation() /*-{
    return this.location;
  }-*/;
  
  /**
   * The type of location returned in location
   * @param location_type
   */
  public final void setLocation_Type(GeocoderLocationType location_type)  {
    setLocation_TypeImpl(location_type.value());
  }
  
  private final native void setLocation_TypeImpl(String location_type) /*-{
    this.location_type = location_type;
  }-*/;
  
  /**
   * The type of location returned in location
   * @return
   */
  public final GeocoderLocationType getLocation_Type() {
    return GeocoderLocationType.fromValue(getLocation_TypeImpl());
  }
  
  private final native String getLocation_TypeImpl() /*-{
    return this.location_type;
  }-*/;

  /**
   * The bounds of the recommended viewport for displaying this GeocodeResult
   * @param viewport
   */
  public final native void setViewPort(LatLngBounds viewport) /*-{
    this.viewport = viewport;
  }-*/;
  
  /**
   * The bounds of the recommended viewport for displaying this GeocodeResult
   * @return
   */
  public final native LatLngBounds getViewPort() /*-{
    return this.viewport;
  }-*/;

}
