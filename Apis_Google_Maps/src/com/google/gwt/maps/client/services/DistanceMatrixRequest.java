package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.workaround.WorkAroundUtils;

/**
 * A distance matrix query sent by the DistanceMatrixService containing arrays of origin and destination locations, and various options for computing metrics.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#DistanceMatrixRequest}
 */
public class DistanceMatrixRequest extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected DistanceMatrixRequest() {}
  
  /**
   * A distance matrix query sent by the DistanceMatrixService containing arrays of origin and destination locations, and various options for computing metrics.
   * @return
   */
  public static final DistanceMatrixRequest newInstance() {
    JavaScriptObject jso = JavaScriptObject.createObject();
    WorkAroundUtils.removeGwtObjectId(jso);
    return jso.cast();
  }
  
  /**
   * If true, instructs the Distance Matrix service to avoid highways where possible. Optional.
   * @param avoidHighways
   */
  public final native void setAvoidHighways(boolean avoidHighways) /*-{
    this.avoidHighways = avoidHighways;
  }-*/;
  
  /**
   * If true, instructs the Distance Matrix service to avoid highways where possible. Optional.
   * @return
   */
  public final native boolean getAvoidHighways() /*-{
    return this.avoidHighways;
  }-*/;
  
  /**
   * If true, instructs the Distance Matrix service to avoid toll roads where possible. Optional.
   * @param avoidTolls
   */
  public final native void setAvoidTolls(boolean avoidTolls) /*-{
    this.avoidTolls = avoidTolls;
  }-*/;
  
  /**
   * If true, instructs the Distance Matrix service to avoid toll roads where possible. Optional.
   * @return
   */
  public final native boolean getAvoidTolls() /*-{
    return this.avoidTolls;
  }-*/;
  
  /**
   * An array containing destination address strings and/or LatLngs, to which to calculate distance and time. Required.
   * @param destinations
   */
  public final native void setDestinations(JsArray<LatLng> destinations) /*-{
    this.destinations = destinations;
  }-*/;
  
  /**
   * An array containing destination address strings and/or LatLngs, to which to calculate distance and time. Required.
   * @return
   */
  public final native JsArray<LatLng> getDestinations() /*-{
    return this.destinations;
  }-*/;
  
  /**
   * An array containing destination address strings and/or LatLngs, to which to calculate distance and time. Required.
   * @param destinations
   */
  public final native void setDestinations(JsArrayString destinations) /*-{
    this.destinations = destinations;
  }-*/;
  
  /**
   * An array containing destination address strings and/or LatLngs, to which to calculate distance and time. Required.
   * @return
   */
  public final native JsArrayString getDestinations_Strings() /*-{
    return this.destinations;
  }-*/;

  /**
   * An array containing origin address strings and/or LatLngs, from which to calculate distance and time. Required.
   * @param origins
   */
  public final native void setOrigins(JsArray<LatLng> origins) /*-{
    this.origins = origins;
  }-*/;
  
  /**
   * An array containing origin address strings and/or LatLngs, from which to calculate distance and time. Required.
   * @return
   */
  public final native JsArray<LatLng> getOrigins() /*-{
    return this.origins;
  }-*/;
  
  /**
   * An array containing origin address strings and/or LatLngs, from which to calculate distance and time. Required.
   * @param origins
   */
  public final native void setOrigins(JsArrayString origins) /*-{
    this.origins = origins;
  }-*/;
  
  /**
   * An array containing origin address strings and/or LatLngs, from which to calculate distance and time. Required.
   * @return
   */
  public final native JsArrayString getOrigins_Strings() /*-{
    return this.origins;
  }-*/;
  
  /**
   * Region code used as a bias for geocoding requests. Optional.
   * @param region
   */
  public final native void setRegion(String region) /*-{
    this.region = region;
  }-*/;
  
  /**
   * 
   * @return
   */
  public final native String getRegion() /*-{
    return this.region;
  }-*/;
  
  /**
   * Region code used as a bias for geocoding requests. Optional.
   * @param travelMode
   */
  public final void setTravelMode(TravelMode travelMode) {
    setTravelModeImpl(travelMode.value());
  }

  private final native void setTravelModeImpl(String travelMode) /*-{
    this.travelMode = travelMode;
  }-*/;
  
  /**
   * Type of routing requested. Required.
   * @return
   */
  public final TravelMode getTravelMode() {
    return TravelMode.fromValue(getTravelModeImpl());
  }
  
  private final native String getTravelModeImpl() /*-{
    return this.travelMode;
  }-*/;
  
  /**
   * Type of routing requested. Required.
   * @param unitSystem
   */
  public final void setUnitSystem(UnitSystem unitSystem) {
    setUnitSystemImpl(unitSystem.value());
  }
  
  private final native void setUnitSystemImpl(int unitSystem) /*-{
    this.unitSystem = unitSystem;
  }-*/;
  
  /**
   * Preferred unit system to use when displaying distance. Optional; defaults to metric.
   * @return
   */
  public final UnitSystem getUnitSystem() {
    return UnitSystem.fromValue(getUnitSystemImpl());
  }
  
  private final native int getUnitSystemImpl() /*-{
    return this.unitSystem;
  }-*/;
  
}
