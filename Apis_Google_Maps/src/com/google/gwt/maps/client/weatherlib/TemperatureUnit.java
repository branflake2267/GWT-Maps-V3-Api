package com.google.gwt.maps.client.weatherlib;

/**
 * The temperature unit displayed by the weather layer. <br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#TemperatureUnit"
 * >TemperatureUnit API Doc</a>
 */
public enum TemperatureUnit {

	/**
	 * Specifies that temperatures should be displayed in degrees Celsius.
	 */
	CELSIUS("c"),

	/**
	 * Specifies that temperatures should be displayed in degrees Fahrenheit.
	 */
	FAHRENHEIT("f");

	private final String value;
	
	private TemperatureUnit(String value) {
		this.value = value;
	}
	
	public String value() {
		return value;
	}
	public String toString() {
		return name();
	}

}
