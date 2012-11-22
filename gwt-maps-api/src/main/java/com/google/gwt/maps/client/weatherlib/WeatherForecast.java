package com.google.gwt.maps.client.weatherlib;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Describes a single day's weather forecast. <br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#WeatherForecast"
 * >WeatherForecast API Doc</a>
 */
public class WeatherForecast extends JavaScriptObject {

	/**
	 * use newInstance();
	 */
	protected WeatherForecast() {
	}

	/**
	 * creates - Describes a single day's weather forecast.
	 */
	public static final WeatherForecast newInstance() {
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

}
