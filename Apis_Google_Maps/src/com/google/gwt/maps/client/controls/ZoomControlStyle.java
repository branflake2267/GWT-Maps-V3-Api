package com.google.gwt.maps.client.controls;

/**
 * Identifiers for the zoom control.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#ZoomControlStyle} 
 */
public enum ZoomControlStyle {

  /**
   * The default zoom control. The control which DEFAULT maps to will vary according to map size and other factors. It may change in future versions of the API.
   */
  DEFAULT,
  
  /**
   * The larger control, with the zoom slider in addition to +/- buttons.
   */
  LARGE,
  
  /**
   * A small control with buttons to zoom in and out.
   */
  SMALL;
  
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
  public static ZoomControlStyle fromValue(String type) {
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
