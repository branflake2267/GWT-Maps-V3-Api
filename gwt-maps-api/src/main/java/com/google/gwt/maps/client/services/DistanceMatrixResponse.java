package com.google.gwt.maps.client.services;

/*
 * #%L
 * GWT Maps API V3 - Core API
 * %%
 * Copyright (C) 2011 - 2012 GWT Maps API V3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

/**
 * The response to a DistanceMatrixService request, consisting of the formatted origin and destination addresses, and a
 * sequence of DistanceMatrixResponseRows, one for each corresponding origin address. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#DistanceMatrixResponse">
 * DistanceMatrixResponse API Doc</a>
 */
public class DistanceMatrixResponse extends JavaScriptObject {

  /**
   * this is generated from callback use newInstance();
   */
  protected DistanceMatrixResponse() {
  }

  /**
   * The response to a DistanceMatrixService request, consisting of the formatted origin and destination addresses, and
   * a sequence of DistanceMatrixResponseRows, one for each corresponding origin address.
   */
  public static final DistanceMatrixResponse newInstance() {
    return createJso().cast();
  }

  private static final native JavaScriptObject createJso() /*-{
    return new $wnd.google.maps.DistanceMatrixResponse();
  }-*/;

  /**
   * The formatted destination addresses.
   * 
   * @param destinationAddresses
   */
  public final native void setDestinationAddresses(JsArrayString destinationAddresses) /*-{
    this.destinationAddresses = destinationAddresses;
  }-*/;

  /**
   * The formatted destination addresses.
   */
  public final native JsArrayString getDestinationAddresses() /*-{
    return this.destinationAddresses;
  }-*/;

  /**
   * The formatted origin addresses.
   * 
   * @param originAddresses
   */
  public final native void setOriginAddresses(JsArrayString originAddresses) /*-{
    this.originAddresses = originAddresses;
  }-*/;

  /**
   * The formatted origin addresses.
   */
  public final native JsArrayString getOriginAddresses() /*-{
    return this.originAddresses;
  }-*/;

  /**
   * The rows of the matrix, corresponding to the origin addresses.
   * 
   * @param rows
   */
  public final native void setRows(JsArray<DistanceMatrixResponseRow> rows) /*-{
    this.rows = rows;
  }-*/;

  /**
   * The rows of the matrix, corresponding to the origin addresses.
   */
  public final native JsArray<DistanceMatrixResponseRow> getRows() /*-{
    return this.rows;
  }-*/;

}
