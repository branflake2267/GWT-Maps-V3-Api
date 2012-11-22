package com.google.gwt.maps.client.controls;

/**
 * Identifiers for scale control ids.
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#ScaleControlStyle">ScaleControlStyle API Doc</a> 
 */
public enum ScaleControlStyle {
  
  /**
   * The standard scale control.
   */
  DEFAULT;
  
  /**
   * return the enum value as a String
   * @return String
   */
  public String value() {
    return name();
  }

  /**
   * convert a String value to enum Type
   * @param type
   * @return TYPE
   */
  public static ScaleControlStyle fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  /**
   * return the enum Type as a String
   */
  @Override
  public String toString() {
    return name();
  }
  
}
