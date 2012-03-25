package com.google.gwt.maps.client.placeslib;


/**
 * Supported types are 'establishment' for businesses and 'geocode' for addresses. If no type is specified, both types will be returned.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#Autocomplete}
 */
public enum AutocompleteType {
  
  /**
   * Sets the types of predictions to be returned. Supported type 'establishment' for businesses
   */
  ESTABLISHMENT,
  
  /**
   * Sets the types of predictions to be returned. Supported type 'geocode' for addresses
   */
  GEOCODE;
  
  public String value() {
    return name().toLowerCase();
  }
  
  public static AutocompleteType fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  public String toString() {
    return name();
  }

}
