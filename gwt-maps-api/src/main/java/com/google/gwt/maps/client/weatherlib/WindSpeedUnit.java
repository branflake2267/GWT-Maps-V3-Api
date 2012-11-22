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
	
	/**
	 * Maps the value to an instance of the enum
	 * @param type
	 * @return NULL if not matched
	 */
	public static WindSpeedUnit fromValue(String type) {
		for(WindSpeedUnit val : values()) {
			if(val.value().equals(type)) {
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
