package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.workaround.WorkAroundUtils;

/**
 * A service for computing directions between two or more places.
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#DirectionsService">DirectionsService API Doc</a>
 */
public class DirectionsService extends JavaScriptObject {
  
  /**
   * use newInstance();
   */
  protected DirectionsService() {}

  /**
   * Creates a new instance of a DirectionsService that sends directions queries to Google servers.
   */
  public static final DirectionsService newInstance() {
    JavaScriptObject jso = createJso();
    return jso.cast();
  }

  private static final native JavaScriptObject createJso() /*-{
    return new $wnd.google.maps.DirectionsService();
  }-*/;
  
  /**
   * Issue a directions search request.
   * 
   *  TODO I can't test this in dev mode, but seems to be working in production deployed. maps api can't find <__gwt_ObjectId>
   * 
   * @param request
   * @param handler
   */
  public final native void route(DirectionsRequest request, DirectionsResultHandler handler) /*-{
    var callback = function(result, status) {
      @com.google.gwt.maps.client.services.DirectionsService::routeImpl(Lcom/google/gwt/maps/client/services/DirectionsResult;Ljava/lang/String;Lcom/google/gwt/maps/client/services/DirectionsResultHandler;)(result, status, handler);
    };
    
    this.route(request, callback);
  }-*/;
  
  private static final void routeImpl(DirectionsResult result, String status, DirectionsResultHandler handler) {
    handler.onCallback(result, DirectionsStatus.fromValue(status));
  }
 
}
