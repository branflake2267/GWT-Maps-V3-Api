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

/**
 * Possible values for vehicle types. These values are specifed as strings, i.e. 'BUS' or 'TRAIN'. <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#VehicleType" >VehicleType API
 * Doc</a>
 */
public enum VehicleType {

  /**
   * Bus.
   */
  BUS,

  /**
   * A vehicle that operates on a cable, usually on the ground. Aerial cable cars may be of the type GONDOLA_LIFT.
   */
  CABLE_CAR,

  /**
   * Commuter rail.
   */
  COMMUTER_TRAIN,

  /**
   * Ferry.
   */
  FERRY,

  /**
   * A vehicle that is pulled up a steep incline by a cable.
   */
  FUNICULAR,

  /**
   * An aerial cable car.
   */
  GONDOLA_LIFT,

  /**
   * Heavy rail.
   * 
   */
  HEAVY_RAIL,

  /**
   * High speed train.
   */
  HIGH_SPEED_TRAIN,

  /**
   * Intercity bus.
   */
  INTERCITY_BUS,

  /**
   * Light rail.
   */
  METRO_RAIL,

  /**
   * Monorail.
   */
  MONORAIL,

  /**
   * Other vehicles.
   */
  OTHER,

  /**
   * Rail.
   */
  RAIL,

  /**
   * Share taxi is a sort of bus transport with ability to drop off and pick up passengers anywhere on its route.
   * Generally share taxi uses minibus vehicles.
   */
  SHARE_TAXI,

  /**
   * Underground light rail.
   */
  SUBWAY,

  /**
   * Above ground light rail.
   */
  TRAM,

  /**
   * Trolleybus.
   */
  TROLLEYBUS;

  public String value() {
    return name();
  }

  public static VehicleType fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  public String toString() {
    return name();
  }

}
