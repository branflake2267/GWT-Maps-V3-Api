package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.workaround.WorkAroundUtils;

/**
 * A service for computing distances between multiple origins and destinations.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#DistanceMatrixService}
 */
public class DistanceMatrixService extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected DistanceMatrixService() {}
  
  /**
   * Creates a new instance of a DistanceMatrixService that sends distance matrix queries to Google servers.
   * @return
   */
  public static final DistanceMatrixService newInstance() {
    JavaScriptObject jso = createJso();
    WorkAroundUtils.removeGwtObjectId(jso);
    return jso.cast();
  }
  
  private static final native JavaScriptObject createJso() /*-{
    return new $wnd.google.maps.DistanceMatrixService();
  }-*/;
  
  public final native void getDistanceMatrix(DistanceMatrixRequest request, DistanceMatrixRequestHandler handler) /*-{
    var callback = function(response, status) {
      @com.google.gwt.maps.client.services.DistanceMatrixService::getDistanceMatrixImpl(Lcom/google/gwt/maps/client/services/DistanceMatrixResponse;Ljava/lang/String;Lcom/google/gwt/maps/client/services/DistanceMatrixRequestHandler;)(response, status, handler);
    };
    this.getDistanceMatrix(request, callback);
  }-*/;
  
  private static final void getDistanceMatrixImpl(DistanceMatrixResponse response, String status, DistanceMatrixRequestHandler handler) {
    handler.onCallback(response, DistanceMatrixStatus.fromValue(status));
  }
  
}
