package com.google.gwt.maps.client.placeslib;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;

/**
 * Contains methods related to searching for Places and retrieving details about a Place.
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#PlaceSearchRequest">PlaceSearchRequest API Doc</a>
 */
public class PlacesService extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected PlacesService() {}
  
  /**
   * Creates a new instance of the PlacesService that renders attributions in the specified container.
   * @param attrContainer
   * @param mapWidget
   */
  public static final PlacesService newInstance(MapWidget mapWidget) {
    return createJso(mapWidget.getJso());
  }
  
  /**
   * Creates a new instance of the PlacesService that renders attributions in the specified container.
   * @param htmlDivElement
   */
  public static final PlacesService newInstance(Element htmlDivElement) {
    return createJso(htmlDivElement);
  }

  private static final native PlacesService createJso(MapImpl map) /*-{
    return new $wnd.google.maps.places.PlacesService(map);
  }-*/;
  
  private static final native PlacesService createJso(Element element) /*-{
    return new $wnd.google.maps.places.PlacesService(element);
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
