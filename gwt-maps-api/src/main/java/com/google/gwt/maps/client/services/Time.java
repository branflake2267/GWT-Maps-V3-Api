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

/**
 * A Time incorporate time and timezone information. Used within TRANSIT legs.<br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#Time" >Time API Doc</a>
 */
public class Time extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected Time() {
  }

  /**
   */
  public static final Time newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * A string representing the time's value. The time is displayed in the time zone of the transit stop.
   */
  public final native void setText(String text) /*-{
    this.text = text;
  }-*/;

  /**
   * A string representing the time's value. The time is displayed in the time zone of the transit stop.
   */
  public final native String getText() /*-{
    return this.text;
  }-*/;

  /**
   * The time zone in which this stop lies. The value is the name of the time zone as defined in the IANA Time Zone
   * Database, e.g. "America/New_York".
   */
  public final native void setTime_Zone(String timezone) /*-{
    this.time_zone = timezone;
  }-*/;

  /**
   * The time zone in which this stop lies. The value is the name of the time zone as defined in the IANA Time Zone
   * Database, e.g. "America/New_York".
   */
  public final native String getTime_Zone() /*-{
    return this.time_zone;
  }-*/;

  /**
   * The time of this departure or arrival, specified as a Java Date object.
   */
  public final void setValue(Date date) {
    setValue(JsDate.create(date.getTime()));
  }

  /**
   * The time of this departure or arrival, specified as a JavaScript Date object.
   */
  public final native void setValue(JsDate date) /*-{
    this.value = date;
  }-*/;

  /**
   * The time of this departure or arrival, specified as a Java Date object.
   */
  public final Date getValue() {
    return new Date((long) getValueAsJsDate().getTime());
  }

  /**
   * The time of this departure or arrival, specified as a JavaScript Date object.
   */
  public final native JsDate getValueAsJsDate()/*-{
    return this.value;
  }-*/;

}
