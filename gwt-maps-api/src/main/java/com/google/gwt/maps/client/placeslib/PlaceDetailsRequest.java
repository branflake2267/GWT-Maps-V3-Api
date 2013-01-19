package com.google.gwt.maps.client.placeslib;

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

/**
 * A Place details query to be sent to the {@link PlacesService}.
 */
public class PlaceDetailsRequest extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected PlaceDetailsRequest() {
  }

  /**
   * A Place details query to be sent to the PlacesService.
   */
  public static final PlaceDetailsRequest newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * The reference of the Place for which details are being requested.
   * 
   * @param reference
   */
  public final native void setReference(String reference) /*-{
    this.reference = reference;
  }-*/;

  /**
   * The reference of the Place for which details are being requested.
   */
  public final native String getReference() /*-{
    return this.reference;
  }-*/;

}
