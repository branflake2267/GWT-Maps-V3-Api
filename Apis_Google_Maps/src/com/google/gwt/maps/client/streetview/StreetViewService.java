package com.google.gwt.maps.client.streetview;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.LatLng;

/**
 * A StreetViewService object performs searches for Street View data.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#StreetViewService}
 */
public class StreetViewService extends JavaScriptObject {
  
  /**
   * use newInstance();
   */
  protected StreetViewService() {}

  /**
   * A StreetViewService object performs searches for Street View data.
   * @return
   */
  public static final StreetViewService newInstnace() {
    return createJso().cast();
  }

  private static final native JavaScriptObject createJso() /*-{
    return new $wnd.google.maps.StreetViewService();
  }-*/;
  
  /**
   * Retrieves the data for the given pano id and passes it to the provided callback as a StreetViewPanoramaData object. Pano ids are unique per panorama and stable for the lifetime of a session, but are liable to change between sessions.
   * @param pano
   * @param handler
   */
  public final native void getPanoramaById(String pano, PanoramaIdHandler handler) /*-{ // 
    var callback = function(data, status) {
      @com.google.gwt.maps.client.streetview.StreetViewService::getPanoramaByIdImpl(Lcom/google/gwt/maps/client/streetview/StreetViewPanoramaData;Ljava/lang/String;Lcom/google/gwt/maps/client/streetview/PanoramaIdHandler;)(data, status, handler);
    };
    this.getPanoramaById(pano, callback);
  }-*/;
  
  private static final void getPanoramaByIdImpl(StreetViewPanoramaData data, String status, PanoramaIdHandler handler) {
    handler.onCallback(data, StreetViewStatus.fromValue(status));
  }
  
  /**
   * Retrieves the StreetViewPanoramaData for a panorama within a given radius of the given LatLng. The StreetViewPanoramaData is passed to the provided callback. If the radius is less than 50 meters, the nearest panorama will be returned.
   * @param latlng
   * @param radius
   * @param handler
   */
  public final native void getPanoramaByLocation(LatLng latlng, double radius, PanoramaByLocationHandler handler) /*-{
    var callback = function(data, status) {
      @com.google.gwt.maps.client.streetview.StreetViewService::getPanoramaByLocationImpl(Lcom/google/gwt/maps/client/streetview/StreetViewPanoramaData;Ljava/lang/String;Lcom/google/gwt/maps/client/streetview/PanoramaByLocationHandler;)(data, status, handler);
    };
    this.getPanoramaByLocation(latlng, radius, callback);
  }-*/;
  
  private static final void getPanoramaByLocationImpl(StreetViewPanoramaData data, String status, PanoramaByLocationHandler handler) {
    handler.onCallback(data, StreetViewStatus.fromValue(status));
  }
  
}
