package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * A single address component within a GeocoderResult. A full address may consist of multiple address components.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#GeocoderAddressComponent}
 */
public class GeocoderAddressComponent extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected GeocoderAddressComponent() {}
 
  /**
   * A single address component within a GeocoderResult. A full address may consist of multiple address components.
   * @return
   */
  public static final GeocoderAddressComponent newInstace() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * The full text of the address component
   * @param long_name
   */
  public final native void setLong_Name(String long_name) /*-{
    this.long_name = long_name;
  }-*/;
  
  /**
   * The full text of the address component
   * @return
   */
  public final native String getLong_Name() /*-{
    return this.long_name;
  }-*/;
  
  /**
   * The abbreviated, short text of the given address component
   * @param short_name
   */
  public final native void setShort_Name(String short_name) /*-{
    this.short_name = short_name;
  }-*/;
  
  /**
   * The abbreviated, short text of the given address component
   * @return
   */
  public final native String getShort_Name() /*-{
    return this.short_name;
  }-*/;
  
  /**
   * An array of strings denoting the type of this address component
   * @param types
   */
  public final native void setTypes(JsArrayString types) /*-{
    this.types = types;
  }-*/;
  
  /**
   * An array of strings denoting the type of this address component
   * @return
   */
  public final native JsArrayString getTypes() /*-{
    return this.types;
  }-*/;
  
}
