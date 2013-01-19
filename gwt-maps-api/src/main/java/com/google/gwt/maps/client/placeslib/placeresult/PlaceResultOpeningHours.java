package com.google.gwt.maps.client.placeslib.placeresult;

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

public class PlaceResultOpeningHours extends JavaScriptObject {

  protected PlaceResultOpeningHours() {
  }

  /**
   * Is a boolean value indicating if the Place is open at the current time.
   */
  public final native boolean getOpenNow() /*-{
    return this.open_now;
  }-*/;

  /**
   * Is an array of opening periods covering seven days, starting from Sunday, in chronological order.
   */
  public final native JsArray<PlaceResultPeriods> getPeriods() /*-{
    return this.periods;
  }-*/;

}
