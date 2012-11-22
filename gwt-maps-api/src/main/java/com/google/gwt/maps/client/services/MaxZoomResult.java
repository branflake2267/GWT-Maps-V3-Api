package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A MaxZoom result in JSON format retrieved from the MaxZoomService.
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#MaxZoomResult">MaxZoomResult API Doc</a>
 */
public class MaxZoomResult extends JavaScriptObject {
  
  /**
   * generated from callback
   * use newInstance();
   */
  protected MaxZoomResult() {}

  /**
   * A MaxZoom result in JSON format retrieved from the MaxZoomService.
   */
  public static final MaxZoomResult newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * Status of the request.
   * @param status
   */
  public final void setStatus(MaxZoomStatus status) {
    setStatusImpl(status.value());
  }
  
  private final native void setStatusImpl(String status) /*-{
    this.status = status;
  }-*/;
  
  /**
   * Status of the request.
   */
  public final MaxZoomStatus getStatus() {
    return MaxZoomStatus.fromValue(getStatusImpl());
  }

  private final native String getStatusImpl() /*-{
    return this.status;
  }-*/;
  
  /**
   * The maximum zoom level found at the given LatLng.
   * @param zoom
   */
  public final native void setZoom(int zoom) /*-{
    this.zoom = zoom;
  }-*/;
  
  /**
   * The maximum zoom level found at the given LatLng.
   */
  public final native int getZoom() /*-{
    return this.zoom;
  }-*/;
  
}
