package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

/**
 * A single geocoder result retrieved from the geocode server. A geocode request may return multiple result objects. Note that though this result is "JSON-like," it is not strictly JSON, as it indirectly includes a LatLng object.
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#GeocoderResult">GeocoderResult API Doc</a>
 */
public class GeocoderResult extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected GeocoderResult() {}
  
  /**
   * A single geocoder result retrieved from the geocode server. A geocode request may return multiple result objects. Note that though this result is "JSON-like," it is not strictly JSON, as it indirectly includes a LatLng object.
   */
  public static final GeocoderResult newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * An array of GeocoderAddressComponents
   * @param address_components
   */
  public final native void setAddress_Components(JsArray<GeocoderAddressComponent> address_components) /*-{
    this.address_components = address_components;
  }-*/;
  
  /**
   * An array of GeocoderAddressComponents
   */
  public final native JsArray<GeocoderAddressComponent> getAddress_Components() /*-{
    return this.address_components;
  }-*/;
  
  /**
   * A string containing the human-readable address of this location.
   * @param formatted_address
   */
  public final native void setFormatted_Address(String formatted_address) /*-{
    this.formatted_address = formatted_address;
  }-*/;
  
  /**
   * A string containing the human-readable address of this location.
   */
  public final native String getFormatted_Address() /*-{
    return this.formatted_address;
  }-*/;
  
  /**
   * A GeocoderGeometry object
   * @param geometry
   */
  public final native void setGeometry(GeocoderGeometry geometry) /*-{
    this.geometry = geometry;
  }-*/;
  
  /**
   * A GeocoderGeometry object
   */
  public final native GeocoderGeometry getGeometry() /*-{
    return this.geometry;
  }-*/;
  
  /**
   * An array of strings denoting the type of the returned geocoded element. A type consists of a unique string identifying the geocode result. (For example, "administrative_area_level_1", "country", etc.)
   * @param types
   */
  public final native void setTypes(JsArrayString types) /*-{
    this.types = types;
  }-*/;
  
  /**
   * An array of strings denoting the type of the returned geocoded element. A type consists of a unique string identifying the geocode result. (For example, "administrative_area_level_1", "country", etc.)
   */
  public final native JsArrayString getTypes() /*-{
    return this.types;
  }-*/;
  
}
