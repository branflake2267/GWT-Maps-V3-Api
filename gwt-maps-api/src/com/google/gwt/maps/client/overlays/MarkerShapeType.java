package com.google.gwt.maps.client.overlays;

public enum MarkerShapeType {
  
  CIRCLE,
  
  POLY,
  
  RECT;
  
  /**
   * return the enum value as a String
   * @return String
   */
  public String value() {
    return name().toLowerCase();
  }

  /**
   * convert a String value to enum Type
   * @param type
   * @return TYPE
   */
  public static MarkerShapeType fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  /**
   * return the enum Type as a String
   */
  @Override
  public String toString() {
    return name().toLowerCase();
  }
  
}
