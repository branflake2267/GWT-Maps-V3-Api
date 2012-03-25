package com.google.gwt.maps.client;

/**
 * Identifiers for common MapTypes
 * {@Link http://code.google.com/apis/maps/documentation/javascript/reference.html#MapTypeId}
 */
public enum MapTypeId {

  /**
   * This map type displays a transparent layer of major streets on satellite images.
   */
  HYBRID, 

  /**
   * This map type displays a normal street map.
   */
  ROADMAP, 

  /**
   * This map type displays satellite images.
   */
  SATELLITE, 

  /**
   * This map type displays maps with physical features such as terrain and vegetation.
   */
  TERRAIN;

  public String value() {
    return name();
  }
  
  public static MapTypeId fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  public String toString() {
    return name();
  }

}


