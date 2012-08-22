package com.google.gwt.maps.client.weatherlib;

/**
 * The color of the labels displayed on the weather layer. <br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#LabelColor"
 * >LabelColor API Doc</a>
 */
public enum LabelColor {

	/**
	 * Weather labels will be displayed as black text with a white border.
	 */
	BLACK("black"),

	/**
	 * Weather labels will be displayed as white text with a black border.
	 */
	WHITE("white");

	private final String value;
	
	private LabelColor(String value) {
		this.value = value;
	}

	public String value() {
		return value;
	}

	public String toString() {
		return name();
	}

}
