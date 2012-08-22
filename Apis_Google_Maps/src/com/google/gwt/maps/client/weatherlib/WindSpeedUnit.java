package com.google.gwt.maps.client.weatherlib;

/**
 * The wind speed unit displayed by the weather layer. <br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#WindSpeedUnit"
 * >WindSpeedUnit API Doc</a>
 */
public enum WindSpeedUnit {
	
	/**
	 * Specifies that wind speeds should be displayed in kilometers per hour.
	 */
	KILOMETERS_PER_HOUR("kph"),
	
	/**
	 * Specifies that wind speeds should be displayed in meters per second.
	 */
	METERS_PER_SECOND("ms"),

	/**
	 * Specifies that wind speeds should be displayed in miles per hour.
	 */
	MILES_PER_HOUR("mph");

	private final String value;
	
	private WindSpeedUnit(String value) {
		this.value = value;
	}
	
	public String value() {
		return value;
	}

	public String toString() {
		return name();
	}

}
