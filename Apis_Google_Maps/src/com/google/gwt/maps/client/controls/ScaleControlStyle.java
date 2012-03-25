package com.google.gwt.maps.client.controls;

/**
 * Identifiers for scale control ids.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#ScaleControlStyle} 
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
