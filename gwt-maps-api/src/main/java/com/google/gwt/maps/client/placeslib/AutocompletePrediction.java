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

public class AutocompletePrediction extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected AutocompletePrediction() {
  }

  public static final AutocompletePrediction newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * The unformatted version of the query suggested by the Places service.
   */
  public final native String getDescription() /*-{
    return this.description;
  }-*/;

  /**
   * A stable ID for this place, intended to be interoperable with those returned by the place search service.
   */
  public final native String getId() /*-{
    return this.id;
  }-*/;

  /**
   * A reference that can be used to retrieve details about this place using the place details service
   * (see PlacesService.getDetails()).
   */
  public final native String getReference() /*-{
    return this.reference;
  }-*/;

}
