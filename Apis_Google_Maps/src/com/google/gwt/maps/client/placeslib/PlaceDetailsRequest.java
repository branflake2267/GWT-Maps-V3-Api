package com.google.gwt.maps.client.placeslib;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A Place details query to be sent to the PlacesService. 
 * {@link }
 */
public class PlaceDetailsRequest extends JavaScriptObject  {

  /**
   * use newInstance();
   */
  protected PlaceDetailsRequest() {}
  
  /**
   * A Place details query to be sent to the PlacesService.
   * @return
   */
  public static final PlaceDetailsRequest newInstance() {
    return JavaScriptObject.createObject().cast();
  } 
  
  /**
   * The reference of the Place for which details are being requested.
   * @param reference
   */
  public final native void setReference(String reference) /*-{
    this.reference = reference;
  }-*/;
  
  /**
   * The reference of the Place for which details are being requested.
   * @return
   */
  public final native String getReference() /*-{
    return this.reference;
  }-*/;
  
}
