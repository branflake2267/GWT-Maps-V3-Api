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

public class PlaceRequestOpens extends JavaScriptObject {

  protected PlaceRequestOpens() {
  }

  /**
   * Day a number from 0–6, corresponding to the days of the week, starting on Sunday. For example, 2 means Tuesday.
   */
  public final native int getDay() /*-{
    return this.day;
  }-*/;

  /**
   * Time may contain a time of day in 24-hour hhmm format (values are in the range 0000–2359). The time will be
   * reported in the Place’s timezone.
   */
  public final native String getTime() /*-{
    return this.time;
  }-*/;

  public final native int getHours() /*-{
    return this.hours;
  }-*/;

  public final native int getMinutes() /*-{
    return this.minutes;
  }-*/;

  public final native int getNextDate() /*-{
    return this.nextDate;
  }-*/;

}
