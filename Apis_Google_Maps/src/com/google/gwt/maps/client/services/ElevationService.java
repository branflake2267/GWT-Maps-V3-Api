package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.workaround.WorkAroundUtils;

/**
 * Defines a service class that talks directly to Google servers for requesting elevation data.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#ElevationService}
 */
public class ElevationService extends JavaScriptObject {
  
  /**
   * use newInstance();
   */
  protected ElevationService() {}

  /**
   * Creates a new instance of a ElevationService that sends elevation queries to Google servers.
   * @return
   */
  public static final ElevationService newInstance() {
    JavaScriptObject jso = createJso();
    WorkAroundUtils.removeGwtObjectId(jso);
    return jso.cast();
  }

  private static final native JavaScriptObject createJso() /*-{
    return new $wnd.google.maps.ElevationService();
  }-*/;

  /**
   * Makes an elevation request along a path, where the elevation data are returned as distance-based samples along that path.
   * @param request
   * @param handler
   */
  public final native void getElevationAlongPath(PathElevationRequest request, ElevationServiceHandler handler) /*-{
    var callback = function(result, status) {
      @com.google.gwt.maps.client.services.ElevationService::processHandler(Lcom/google/gwt/core/client/JsArray;Ljava/lang/String;Lcom/google/gwt/maps/client/services/ElevationServiceHandler;)(result, status, handler);
    };
    this.getElevationAlongPath(request, callback);
  }-*/;
    
  /**
   * Makes an elevation request for a list of discrete locations.
   * @param request
   * @param handler
   */
  public final native void getElevationForLocations(LocationElevationRequest request, ElevationServiceHandler handler) /*-{
    var callback = function(result, status) {
      @com.google.gwt.maps.client.services.ElevationService::processHandler(Lcom/google/gwt/core/client/JsArray;Ljava/lang/String;Lcom/google/gwt/maps/client/services/ElevationServiceHandler;)(result, status, handler);
    };
    this.getElevationForLocations(request, callback);
  }-*/;
  
  private final static void processHandler(JsArray<ElevationResult> result, String status, ElevationServiceHandler handler) {
    handler.onCallback(result, ElevationStatus.fromValue(status));
  }
  
}
