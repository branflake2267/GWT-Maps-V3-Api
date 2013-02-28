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

import java.util.Date;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsDate;
import com.google.gwt.maps.client.workaround.WorkAroundUtils;

/**
 * The TransitOptions object to be included in a DirectionsRequest when the travel mode is set to TRANSIT.<br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#TransitOptions" >TransitOptions
 * API Doc</a>
 */
public class TransitOptions extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected TransitOptions() {
  }

  /**
   * Create new TransitOptions to be used within a DirectionRequest.
   */
  public static final TransitOptions newInstance() {
    JavaScriptObject jso = JavaScriptObject.createObject();
    WorkAroundUtils.removeGwtObjectId(jso);
    return jso.cast();
  }

  /**
   * The desired arrival time for the route, specified as a Date object. The Date object measures time in milliseconds
   * since 1 January 1970. If arrival time is specified, departure time is ignored.
   * 
   * @param time
   */
  public final void setArrivalTime(Date time) {
    this.setArrivalTime(JsDate.create(time.getTime()));
  }

  /**
   * The desired arrival time for the route, specified as a Date object. The Date object measures time in milliseconds
   * since 1 January 1970. If arrival time is specified, departure time is ignored.
   */
  public final Date getArrivalTime() {
    return new Date((long) this.getArrivalTimeImpl().getTime());
  }

  /**
   * The desired departure time for the route, specified as a Date object. The Date object measures time in milliseconds
   * since 1 January 1970. If neither departure time nor arrival time is specified, the time is assumed to be "now".
   * 
   * @param time
   */
  public final void setDepartureTime(Date time) {
    this.setDepartureTime(JsDate.create(time.getTime()));
  }

  /**
   * The desired departure time for the route, specified as a Date object. The Date object measures time in milliseconds
   * since 1 January 1970. If neither departure time nor arrival time is specified, the time is assumed to be "now".
   */
  public final Date getDepartureTime() {
    return new Date((long) this.getDepartureTimeImpl().getTime());
  }

  private final native void setArrivalTime(JsDate time) /*-{
    this.arrivalTime = time;
  }-*/;

  private final native JsDate getArrivalTimeImpl() /*-{
    return this.arrivalTime;
  }-*/;

  private final native void setDepartureTime(JsDate time) /*-{
    this.departureTime = time;
  }-*/;

  private final native JsDate getDepartureTimeImpl() /*-{
    return this.departureTime;
  }-*/;

}
