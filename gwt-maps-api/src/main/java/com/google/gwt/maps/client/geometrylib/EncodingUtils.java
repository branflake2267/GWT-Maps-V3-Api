package com.google.gwt.maps.client.geometrylib;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.mvc.MVCArray;

/**
 * Utilities for polyline encoding and decoding.<br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#encoding"
 * >Encoding Utils API Doc</a>
 */
public class EncodingUtils {

	/**
	 * Decodes an encoded path string into a sequence of LatLngs.
	 * 
	 * @param encodedPath
	 */
	public final static native JsArray<LatLng> decodePath(String encodedPath) /*-{
		return $wnd.google.maps.geometry.encoding.decodePath(encodedPath);
	}-*/;

	/**
	 * Encodes a sequence of LatLngs into an encoded path string.
	 * 
	 * @param path
	 */
	public final static native String encodePath(JsArray<LatLng> path) /*-{
		return $wnd.google.maps.geometry.encoding.encodePath(path);
	}-*/;

	/**
	 * Encodes a sequence of LatLngs into an encoded path string.
	 * 
	 * @param path
	 */
	public final static native String encodePath(MVCArray<LatLng> path) /*-{
		return $wnd.google.maps.geometry.encoding.encodePath(path);
	}-*/;

}
