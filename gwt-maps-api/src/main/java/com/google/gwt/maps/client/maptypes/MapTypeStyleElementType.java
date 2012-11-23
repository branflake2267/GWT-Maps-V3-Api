package com.google.gwt.maps.client.maptypes;

/**
 * Each MapTypeStyleElementType distinguishes between the different representations of a feature.
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#MapTypeStyleElementType">MapTypeStyleElementType API Doc</a>
 */
public enum MapTypeStyleElementType {

  /**
   * Apply the rule to all elements of the specified feature.
   */
  ALL,
  
  /**
   * Apply the rule to the feature's geometry.
   */
  GEOMETRY,
  
  /**
   * Apply the rule to the feature's labels.
   */
  LABELS;
  
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
  public static MapTypeStyleElementType fromValue(String type) {
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
