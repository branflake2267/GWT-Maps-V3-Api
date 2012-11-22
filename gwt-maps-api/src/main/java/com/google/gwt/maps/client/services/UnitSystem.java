package com.google.gwt.maps.client.services;

/**
 * The valid unit systems that can be specified in a DirectionsRequest.
 * <br><br>
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
