package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * A row of the response to a DistanceMatrixService request, consisting of a sequence of DistanceMatrixResponseElements, one for each corresponding destination address.
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#DistanceMatrixResponseRow">DistanceMatrixResponseRow API Doc</a>
 */
public class DistanceMatrixResponseRow extends JavaScriptObject {

  protected DistanceMatrixResponseRow() {}
  
  public static final DistanceMatrixResponseRow newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * The row's elements, corresponding to the destination addresses.
   * @param elements
   */
  public final native void setElements(JsArray<DistanceMatrixResponseElement> elements) /*-{
    this.elements = elements;
  }-*/;
  
  /**
   * The row's elements, corresponding to the destination addresses.
   * @return
   */
  public final native JsArray<DistanceMatrixResponseElement> getElements() /*-{
    return this.elements;
  }-*/;
  
  
  
}
