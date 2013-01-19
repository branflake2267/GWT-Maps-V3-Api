package com.google.gwt.maps.client.services;

/*
 * #%L
 * GWT Maps API V3 - Core API
 * %%
 * Copyright (C) 2011 - 2012 GWT Maps API V3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.workaround.WorkAroundUtils;

/**
 * A distance matrix query sent by the DistanceMatrixService containing arrays of origin and destination locations, and
 * various options for computing metrics. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#DistanceMatrixRequest">
 * DistanceMatrixRequest API Doc</a>
 */
public class DistanceMatrixRequest extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected DistanceMatrixRequest() {
  }

  /**
   * A distance matrix query sent by the DistanceMatrixService containing arrays of origin and destination locations,
   * and various options for computing metrics.
   */
  public static final DistanceMatrixRequest newInstance() {
    JavaScriptObject jso = JavaScriptObject.createObject();
    WorkAroundUtils.removeGwtObjectId(jso);
    return jso.cast();
  }

  /**
   * If true, instructs the Distance Matrix service to avoid highways where possible. Optional.
   * 
   * @param avoidHighways
   */
  public final native void setAvoidHighways(boolean avoidHighways) /*-{
    this.avoidHighways = avoidHighways;
  }-*/;

  /**
   * If true, instructs the Distance Matrix service to avoid highways where possible. Optional.
   */
  public final native boolean getAvoidHighways() /*-{
    return this.avoidHighways;
  }-*/;

  /**
   * If true, instructs the Distance Matrix service to avoid toll roads where possible. Optional.
   * 
   * @param avoidTolls
   */
  public final native void setAvoidTolls(boolean avoidTolls) /*-{
    this.avoidTolls = avoidTolls;
  }-*/;

  /**
   * If true, instructs the Distance Matrix service to avoid toll roads where possible. Optional.
   */
  public final native boolean getAvoidTolls() /*-{
    return this.avoidTolls;
  }-*/;

  /**
   * An array containing destination address strings and/or LatLngs, to which to calculate distance and time. Required.
   * 
   * @param destinations
   */
  public final native void setDestinations(JsArray<LatLng> destinations) /*-{
    this.destinations = destinations;
  }-*/;

  /**
   * An array containing destination address strings and/or LatLngs, to which to calculate distance and time. Required.
   */
  public final native JsArray<LatLng> getDestinations() /*-{
    return this.destinations;
  }-*/;

  /**
   * An array containing destination address strings and/or LatLngs, to which to calculate distance and time. Required.
   * 
   * @param destinations
   */
  public final native void setDestinations(JsArrayString destinations) /*-{
    this.destinations = destinations;
  }-*/;

  /**
   * An array containing destination address strings and/or LatLngs, to which to calculate distance and time. Required.
   */
  public final native JsArrayString getDestinations_Strings() /*-{
    return this.destinations;
  }-*/;

  /**
   * An array containing origin address strings and/or LatLngs, from which to calculate distance and time. Required.
   * 
   * @param origins
   */
  public final native void setOrigins(JsArray<LatLng> origins) /*-{
    this.origins = origins;
  }-*/;

  /**
   * An array containing origin address strings and/or LatLngs, from which to calculate distance and time. Required.
   */
  public final native JsArray<LatLng> getOrigins() /*-{
    return this.origins;
  }-*/;

  /**
   * An array containing origin address strings and/or LatLngs, from which to calculate distance and time. Required.
   * 
   * @param origins
   */
  public final native void setOrigins(JsArrayString origins) /*-{
    this.origins = origins;
  }-*/;

  /**
   * An array containing origin address strings and/or LatLngs, from which to calculate distance and time. Required.
   */
  public final native JsArrayString getOrigins_Strings() /*-{
    return this.origins;
  }-*/;

  /**
   * Region code used as a bias for geocoding requests. Optional.
   * 
   * @param region
   */
  public final native void setRegion(String region) /*-{
    this.region = region;
  }-*/;

  /**
   * Create new {@link DistanceMatrixRequest} instance
   */
  public final native String getRegion() /*-{
    return this.region;
  }-*/;

  /**
   * Region code used as a bias for geocoding requests. Optional.
   * 
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
   */
  public final TravelMode getTravelMode() {
    return TravelMode.fromValue(getTravelModeImpl());
  }

  private final native String getTravelModeImpl() /*-{
    return this.travelMode;
  }-*/;

  /**
   * Type of routing requested. Required.
   * 
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
   */
  public final UnitSystem getUnitSystem() {
    return UnitSystem.fromValue(getUnitSystemImpl());
  }

  private final native int getUnitSystemImpl() /*-{
    return this.unitSystem;
  }-*/;

}
