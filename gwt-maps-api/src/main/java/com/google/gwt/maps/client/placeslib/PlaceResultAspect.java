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

public class PlaceResultAspect extends JavaScriptObject {

  protected PlaceResultAspect() {
  }

  /**
   * The user's rating for this particular aspect, from 0 to 3.
   */
  public final native int getRating() /*-{
    return this.rating;
  }-*/;

  /**
   * The name of the aspect that is being rated. eg. atmosphere, service, food, overall, etc.
   */
  public final native String getType() /*-{
    return this.type;
  }-*/;

}
