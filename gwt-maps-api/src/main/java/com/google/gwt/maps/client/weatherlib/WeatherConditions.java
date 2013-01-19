package com.google.gwt.maps.client.weatherlib;

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
 * Describes a single weather feature.<br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#WeatherConditions"
 * >WeatherConditions API Doc</a>
 */
public class WeatherConditions extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected WeatherConditions() {
  }

  /**
   * creates - Describes a single weather feature
   */
  public static final WeatherConditions newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * Set the day of the week in long form, e.g. "Monday".
   * 
   * @param day
   */
  public final native void setDay(String day) /*-{
    this.day = day;
  }-*/;

  /**
   * Gets the day of the week in long form, e.g. "Monday".
   */
  public final native String getDay() /*-{
    return this.day;
  }-*/;

  /**
   * Set a description of the conditions, e.g. "Partly Cloudy".
   * 
   * @param description
   */
  public final native void setDescription(String description) /*-{
    this.description = description;
  }-*/;

  /**
   * Gets the description of the conditions, e.g. "Partly Cloudy".
   */
  public final native String getDescription() /*-{
    return this.description;
  }-*/;

  /**
   * Set the highest temperature reached during the day.
   * 
   * @param high
   */
  public final native void setHigh(double high) /*-{
    this.high = high;
  }-*/;

  /**
   * Gets the highest temperature reached during the day.
   */
  public final native double getHigh() /*-{
    return this.high;
  }-*/;

  /**
   * Set the lowest temperature reached during the day.
   * 
   * @param low
   */
  public final native void setLow(double low) /*-{
    this.low = low;
  }-*/;

  /**
   * Gets the lowest temperature reached during the day.
   */
  public final native double getLow() /*-{
    return this.low;
  }-*/;

  /**
   * Set the day of the week in short form, e.g. "M".
   * 
   * @param shortDay
   */
  public final native void setShortDay(String shortDay) /*-{
    this.shortDay = shortDay;
  }-*/;

  /**
   * Gets the day of the week in short form, e.g. "M".
   */
  public final native String getShortDay() /*-{
    return this.shortDay;
  }-*/;

  /**
   * Set the current humidity, expressed as a percentage.
   * 
   * @param humidity
   */
  public final native void setHumidity(double humidity) /*-{
    this.humidity = humidity;
  }-*/;

  /**
   * Gets the current humidity, expressed as a percentage.
   */
  public final native double getHumidity() /*-{
    return this.humidity;
  }-*/;

  /**
   * Set the current temperature, in the specified temperature units.
   * 
   * @param temperature
   */
  public final native void setTemperature(double temperature) /*-{
    this.temperature = temperature;
  }-*/;

  /**
   * Gets the current temperature, in the specified temperature units.
   */
  public final native double getTemperature() /*-{
    return this.temperature;
  }-*/;

  /**
   * Set the current wind direction.
   * 
   * @param windDirection
   */
  public final native void setWindDirection(String windDirection) /*-{
    this.windDirection = windDirection;
  }-*/;

  /**
   * Gets the current wind direction.
   */
  public final native String getWindDirection() /*-{
    return this.windDirection;
  }-*/;

  /**
   * Set the current wind speed, in the specified wind speed units.
   * 
   * @param windSpeed
   */
  public final native void setWindSpeed(double windSpeed) /*-{
    this.windSpeed = windSpeed;
  }-*/;

  /**
   * Gets the current wind speed, in the specified wind speed units.
   */
  public final native double getWindSpeed() /*-{
    return this.windSpeed;
  }-*/;

}
