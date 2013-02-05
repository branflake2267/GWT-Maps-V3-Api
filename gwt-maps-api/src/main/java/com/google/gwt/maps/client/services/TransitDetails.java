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

/**
 * Details of a transit leg, if the leg is of type TRANSIT.<br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#TransitDetails" >TransitDetails
 * API Doc</a>
 */
public class TransitDetails extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected TransitDetails() {
  }

  /**
   */
  public static final TransitDetails newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * The arrival stop of this transit step.
   */
  public final native void setArrival_Stop(TransitStop arrivalStop) /*-{
    this.arrival_stop = arrivalStop;
  }-*/;

  /**
   * The arrival stop of this transit step.
   */
  public final native TransitStop getArrival_Stop() /*-{
    return this.arrival_stop;
  }-*/;

  /**
   * The arrival time of this step, specified as a Time object.
   */
  public final native void setArrival_Time(Time time) /*-{
    this.arrival_time = time;
  }-*/;

  /**
   * The arrival time of this step, specified as a Time object.
   */
  public final native Time getArrival_Time() /*-{
    return this.arrival_time;
  }-*/;

  /**
   * The departure stop of this transit step.
   */
  public final native void setDeparture_Stop(TransitStop departureStop) /*-{
    this.departure_stop = departureStop;
  }-*/;

  /**
   * The departure stop of this transit step.
   */
  public final native TransitStop getDeparture_Stop() /*-{
    return this.departure_stop;
  }-*/;

  /**
   * The departure time of this step, specified as a Time object.
   */
  public final native void setDeparture_Time(Time time) /*-{
    this.departure_time = time;
  }-*/;

  /**
   * The departure time of this step, specified as a Time object.
   */
  public final native Time getDeparture_Time() /*-{
    return this.departure_time;
  }-*/;

  /**
   * The direction in which to travel on this line, as it is marked on the vehicle or at the departure stop.
   */
  public final native void setHeadsign(String headsign) /*-{
    this.headsign = headsign;
  }-*/;

  /**
   * The direction in which to travel on this line, as it is marked on the vehicle or at the departure stop.
   */
  public final native String getHeadsign() /*-{
    return this.headsign;
  }-*/;

  /**
   * The expected number of seconds between equivalent vehicles at this stop.
   */
  public final native int setHeadway(int headway) /*-{
    this.headway = headway;
  }-*/;

  /**
   * The expected number of seconds between equivalent vehicles at this stop.
   */
  public final native int getHeadway() /*-{
    return this.headway;
  }-*/;

  /**
   * Details about the transit line used in this step.
   */
  public final native void setLine(TransitLine line) /*-{
    this.line = line;
  }-*/;

  /**
   * Details about the transit line used in this step.
   */
  public final native TransitLine getLine() /*-{
    return this.line;
  }-*/;

  /**
   * The number of stops on this step. Includes the arrival stop, but not the departure stop.
   */
  public final native void setNum_Stops(int numStops) /*-{
    this.num_stops = numStops;
  }-*/;

  /**
   * The number of stops on this step. Includes the arrival stop, but not the departure stop.
   */
  public final native int getNum_Stops() /*-{
    return this.num_stops;
  }-*/;

}
