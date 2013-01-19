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
 * The valid unit systems that can be specified in a DirectionsRequest. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#UnitSystem">UnitSystem API Doc</a>
 */
public enum UnitSystem {

  /**
   * Specifies that distances in the DirectionsResult should be expressed in imperial units.
   */
  IMPERIAL(1),

  /**
   * Specifies that distances in the DirectionsResult should be expressed in metric units.
   */
  METRIC(0);

  private int type;

  UnitSystem(int type) {
    this.type = type;
  }

  public int value() {
    return type;
  }

  public static UnitSystem fromValue(int type) {
    UnitSystem u = null;
    switch (type) {
    case 0:
      u = UnitSystem.METRIC;
      break;
    case 1:
      u = UnitSystem.IMPERIAL;
      break;
    }
    return u;
  }

  public String toString() {
    return name() + "(" + type + ")";
  }

}
