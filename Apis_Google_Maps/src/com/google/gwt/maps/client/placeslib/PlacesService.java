package com.google.gwt.maps.client.placeslib;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;

/**
 * Contains methods related to searching for Places and retrieving details about a Place.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#PlaceSearchRequest}
 */
public class PlacesService extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected PlacesService() {}
  
  /**
   * Contains methods related to searching for Places and retrieving details about a Place.
   * @param attrContainer
   * @param mapWidget
   * @return
   */
  public static final PlacesService newInstance(Element attrContainer, MapWidget mapWidget) {
    return createJso(attrContainer, mapWidget.getJso());
  }

  private static final native PlacesService createJso(Element attrContainer, MapImpl map) /*-{
    return new $wnd.google.maps.places.PlacesService(attrContainer, map);
  }-*/;
  
  
  /**
   * Retrieves details about the Place identified by the given reference.
   * @param request
   * @param handler
   */
  public final native void getDetails(PlaceDetailsRequest request, PlaceDetailsHandler handler) /*-{
    var callback = function(result, status) {
      @com.google.gwt.maps.client.placeslib.PlacesService::processDetailsCallback(Lcom/google/gwt/maps/client/placeslib/PlaceResult;Ljava/lang/String;Lcom/google/gwt/maps/client/placeslib/PlaceDetailsHandler;)(result, status, handler);
    };
    this.getDetails(request, callback);
  }-*/;
  
  private static final void processDetailsCallback(PlaceResult result, String status, PlaceDetailsHandler handler) {
    handler.onCallback(result, PlacesServiceStatus.fromValue(status));
  }
  
  
  /**
   * Retrieves a list of Places in a given area. The PlaceResultss passed to the callback are stripped-down versions of a full PlaceResult. A more detailed PlaceResult for each Place can be obtained by sending a Place Details request with the desired Place's reference value.
   * @param request
   * @param handler
   */
  public final native void search(PlaceSearchRequest request, PlaceSearchHandler handler) /*-{
    var callback = function (results, status) {
      @com.google.gwt.maps.client.placeslib.PlacesService::processSearchCallback(Lcom/google/gwt/core/client/JsArray;Ljava/lang/String;Lcom/google/gwt/maps/client/placeslib/PlaceSearchHandler;)(results, status, handler); 
    };
    this.search(request, callback);
  }-*/;
  
  private static final void processSearchCallback(JsArray<PlaceResult> results, String status, PlaceSearchHandler handler) {
    handler.onCallback(results, PlacesServiceStatus.fromValue(status));
  }
  
  
  
}
