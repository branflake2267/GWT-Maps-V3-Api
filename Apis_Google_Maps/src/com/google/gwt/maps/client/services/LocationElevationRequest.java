package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.workaround.WorkAroundUtils;

/**
 * An elevation request sent by the ElevationService containing the list of discrete coordinates (LatLngs) for which to return elevation data.
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#LocationElevationRequest">LocationElevationRequest API Doc</a>
 */
public class LocationElevationRequest extends JavaScriptObject {
  
  /**
   * use newInstance();
   */
  protected LocationElevationRequest() {}

  /**
   * An elevation request sent by the ElevationService containing the list of discrete coordinates (LatLngs) for which to return elevation data.
   * @return
   */
  public final static LocationElevationRequest newInstance() {
    JavaScriptObject jso = JavaScriptObject.createObject();
    WorkAroundUtils.removeGwtObjectId(jso);
    return jso.cast();
  }
  
  /**
   * The discrete locations for which to retrieve elevations.
   * @param path
   */
  public final native void setLocations(JsArray<LatLng> locations) /*-{
    this.locations = locations;
  }-*/;
  
  /**
   * The discrete locations for which to retrieve elevations.
   * @return
   */
  public final native JsArray<LatLng> getLocations() /*-{
    return this.locations;
  }-*/;
  
 
  
}
