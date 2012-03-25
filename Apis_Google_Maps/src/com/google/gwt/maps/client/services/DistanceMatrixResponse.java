package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

/**
 * The response to a DistanceMatrixService request, consisting of the formatted origin and destination addresses, and a sequence of DistanceMatrixResponseRows, one for each corresponding origin address.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#DistanceMatrixResponse}
 */
public class DistanceMatrixResponse extends JavaScriptObject {

  /**
   * this is generated from callback
   * use newInstance();
   */
  protected DistanceMatrixResponse() {}
  
  /**
   * The response to a DistanceMatrixService request, consisting of the formatted origin and destination addresses, and a sequence of DistanceMatrixResponseRows, one for each corresponding origin address.
   * @return
   */
  public static final DistanceMatrixResponse newInstance() {
    return createJso().cast();
  }

  private static final native JavaScriptObject createJso() /*-{
    return new $wnd.google.maps.DistanceMatrixResponse();
  }-*/;
  
  /**
   * The formatted destination addresses.
   * @param destinationAddresses
   */
  public final native void setDestinationAddresses(JsArrayString destinationAddresses) /*-{
    this.destinationAddresses = destinationAddresses;
  }-*/;
  
  /**
   * The formatted destination addresses.
   * @return
   */
  public final native JsArrayString getDestinationAddresses() /*-{
    return this.destinationAddresses;
  }-*/;
  
  /**
   * The formatted origin addresses.
   * @param originAddresses
   */
  public final native void setOriginAddresses(JsArrayString originAddresses) /*-{
    this.originAddresses = originAddresses;
  }-*/;
  
  /**
   * The formatted origin addresses.
   * @return
   */
  public final native JsArrayString getOriginAddresses() /*-{
    return this.originAddresses;
  }-*/;
 
  /**
   * The rows of the matrix, corresponding to the origin addresses.
   * @param rows
   */
  public final native void setRows(JsArray<DistanceMatrixResponseRow> rows) /*-{
    this.rows = rows;
  }-*/;
  
  /**
   * The rows of the matrix, corresponding to the origin addresses.
   * @return
   */
  public final native JsArray<DistanceMatrixResponseRow> getRows() /*-{
    return this.rows;
  }-*/;
  
}
