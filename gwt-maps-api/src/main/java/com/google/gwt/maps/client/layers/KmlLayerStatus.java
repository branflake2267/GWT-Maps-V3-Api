package com.google.gwt.maps.client.layers;

/**
 * The status returned by {@link KmlLayer} on the completion of loading a
 * document.<br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#KmlLayerStatus"
 * >KmlLayerStatus API Doc</a>
 */
public enum KmlLayerStatus {

	/**
	 * The document could not be found. Most likely it is an invalid URL, or the
	 * document is not publicly available.
	 */
	DOCUMENT_NOT_FOUND,

	/**
	 * The document exceeds the file size limits of KmlLayer.
	 */
	DOCUMENT_TOO_LARGE,

	/**
	 * The document could not be fetched.
	 */
	FETCH_ERROR,

	/**
	 * The document is not a valid KML, KMZ or GeoRSS document.
	 */
	INVALID_DOCUMENT,

	/**
	 * The {@link KmlLayer} is invalid.
	 */
	INVALID_REQUEST,

	/**
	 * The document exceeds the feature limits of KmlLayer.
	 */
	LIMITS_EXCEEDED,

	/**
	 * The layer loaded successfully.
	 */
	OK,

	/**
	 * The document could not be loaded within a reasonable amount of time.
	 */
	TIMED_OUT,

	/**
	 * The document failed to load for an unknown reason.
	 */
	UNKNOWN;

	public String value() {
		return name();
	}

	public static KmlLayerStatus fromValue(String type) {
		return valueOf(type.toUpperCase());
	}

	@Override
	public String toString() {
		return name();
	}
}
