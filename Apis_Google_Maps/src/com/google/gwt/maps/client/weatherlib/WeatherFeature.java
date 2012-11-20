package com.google.gwt.maps.client.weatherlib;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * This object describes a single Weather feature.. <br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#WeatherFeature"
 * >WeatherFeature API Doc</a>
 */
public class WeatherFeature extends JavaScriptObject {

	/**
	 * use newInstance();
	 */
	protected WeatherFeature() {
	}

	/**
	 * creates - This object describes a single Weather feature.
	 */
	public static final WeatherFeature newInstance() {
		return JavaScriptObject.createObject().cast();
	}

	/**
	 * The location name of this feature, e.g. "San Francisco, California".
	 * 
	 * @param location
	 */
	public final native void setLocation(String location) /*-{
		this.location = location;
	}-*/;

	/**
	 * Gets the location name of this feature, e.g. "San Francisco, California".
	 */
	public final native String getLocation() /*-{
		return this.location;
	}-*/;
	
	/**
	 * Sets the forecast of weather conditions over the next four days. The forecast array is always in chronological order.
	 * 
	 * @param forecast
	 */
	public final native void setForecast(JsArray<WeatherForecast> forecast) /*-{
		this.forecast = forecast;
	}-*/;
	
	/**
	 * Gets the forecast of weather conditions over the next four days. The forecast array is always in chronological order.
	 */
	public final native JsArray<WeatherForecast> getForecast() /*-{
		return this.forecast;
	}-*/;
	
	/**
	 * The current weather conditions at this location.
	 * 
	 * @param current
	 */
	public final native void setCurrent(WeatherConditions current) /*-{
		this.current = current;
	}-*/;
	
	/**
	 * Gets the current weather conditions at this location.
	 */
	public final native WeatherConditions getCurrent() /*-{
		return this.current;
	}-*/;

	/**
	 * Sets the units to use for temperature.
	 * 
	 * @param temperatureUnit
	 */
	public final void setTemperatureUnits(TemperatureUnit temperatureUnit) {
		setTemperatureUnitsImpl(temperatureUnit.value());
	}

	private final native void setTemperatureUnitsImpl(String temperatureUnit) /*-{
		this.temperatureUnit = temperatureUnit;
	}-*/;

	/**
	 * Gets the units to use for temperature.
	 */
	public final TemperatureUnit getTemperatureUnits() {
		String val = getTemperatureUnitsImpl();
		return (val == null) ? null : TemperatureUnit.fromValue(val);
	}

	private final native String getTemperatureUnitsImpl() /*-{
		return this.temperatureUnit;
	}-*/;

	/**
	 * Sets the units to use for wind speed.
	 * 
	 * @param windSpeedUnit
	 */
	public final void setWindSpeedUnits(WindSpeedUnit windSpeedUnit) {
		setWindSpeedUnitsImpl(windSpeedUnit.value());
	}

	private final native void setWindSpeedUnitsImpl(String windSpeedUnit) /*-{
		this.windSpeedUnit = windSpeedUnit;
	}-*/;

	/**
	 * Gets the units to use for wind speed.
	 */
	public final WindSpeedUnit getWindSpeedUnits() {
		String val = getWindSpeedUnitsImpl();
		return (val == null) ? null : WindSpeedUnit.fromValue(val);
	}

	private final native String getWindSpeedUnitsImpl() /*-{
		return this.windSpeedUnit;
	}-*/;
}
