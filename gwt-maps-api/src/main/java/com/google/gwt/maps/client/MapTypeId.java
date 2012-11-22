package com.google.gwt.maps.client;

/**
 * Identifiers for common MapTypes
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#MapTypeId">MapTypeId API Doc</a>
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

  @Override
public String toString() {
    return name().toLowerCase();
  }

}


