package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A MaxZoom result in JSON format retrieved from the MaxZoomService.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#MaxZoomResult}
 */
public class MaxZoomResult extends JavaScriptObject {
  
  /**
   * generated from callback
   * use newInstance();
   */
  protected MaxZoomResult() {}

  /**
   * A MaxZoom result in JSON format retrieved from the MaxZoomService.
   * @return
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
   * @return
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
   * @return
   */
  public final native int getZoom() /*-{
    return this.zoom;
  }-*/;
  
}
