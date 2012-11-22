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

	/**
	 * Maps the value to an instance of the enum
	 * 
	 * @param type
	 * @return NULL if not matched
	 */
	public static TemperatureUnit fromValue(String type) {
		for (TemperatureUnit val : values()) {
			if (val.value().equals(type)) {
				return val;
			}
		}
		return null;
	}

	public String value() {
		return value;
	}

	@Override
	public String toString() {
		return name();
	}

}
