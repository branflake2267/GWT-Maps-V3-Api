package com.google.gwt.maps.client.geometrylib;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.mvc.MVCArray;

/**
 * Utility functions for computing geodesic angles, distances and areas.<br>
 * The default radius is Earth's radius of 6378137 meters.<br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#spherical"
 * >Encoding Utils API Doc</a>
 */
public class SphericalUtils {

	/**
	 * Computes the area of the given loop. Loops must be closed.
	 * 
	 * @param loop
	 */
	public static final native double computeArea(JsArray<LatLng> loop) /*-{
		return $wnd.google.maps.geometry.spherical.computeArea(loop);
	}-*/;

	/**
	 * Computes the area of the given loop. Loops must be closed.
	 * 
	 * @param loop
	 */
	public static final native double computeArea(MVCArray<LatLng> loop) /*-{
		return $wnd.google.maps.geometry.spherical.computeArea(loop);
	}-*/;

	/**
	 * Computes the area of the given loop. Loops must be closed.
	 * 
	 * @param loop
	 * @param radius
	 */
	public static final native double computeArea(JsArray<LatLng> loop, int radius) /*-{
		return $wnd.google.maps.geometry.spherical.computeArea(loop, radius);
	}-*/;

	/**
	 * Computes the area of the given loop. Loops must be closed.
	 * 
	 * @param loop
	 * @param radius
	 */
	public static final native double computeArea(MVCArray<LatLng> loop, int radius) /*-{
		return $wnd.google.maps.geometry.spherical.computeArea(loop, radius);
	}-*/;

	/**
	 * Computes the distance between two LatLngs.
	 * 
	 * @param from
	 * @param to
	 */
	public static final native double computeDistanceBetween(LatLng from, LatLng to) /*-{
		return $wnd.google.maps.geometry.spherical.computeDistanceBetween(from,
				to);
	}-*/;

	/**
	 * Computes the distance between two LatLngs.
	 * 
	 * @param from
	 * @param to
	 * @param radius
	 */
	public static final native double computeDistanceBetween(LatLng from, LatLng to, int radius) /*-{
		return $wnd.google.maps.geometry.spherical.computeDistanceBetween(from,
				to, radius);
	}-*/;

	/**
	 * Computes the heading from one LatLng to another LatLng.
	 * 
	 * @param from
	 * @param to
	 */
	public static final native double computeHeading(LatLng from, LatLng to) /*-{
		return $wnd.google.maps.geometry.spherical.computeHeading(from, to);
	}-*/;

	/**
	 * Computes the length of the given path.
	 * 
	 * @param path
	 */
	public static final native double computeLength(JsArray<LatLng> path) /*-{
		return $wnd.google.maps.geometry.spherical.computeLength(path);
	}-*/;

	/**
	 * Computes the length of the given path.
	 * 
	 * @param path
	 */
	public static final native double computeLength(MVCArray<LatLng> path) /*-{
		return $wnd.google.maps.geometry.spherical.computeLength(path);
	}-*/;

	/**
	 * Computes the length of the given path.
	 * 
	 * @param path
	 * @param radius
	 */
	public static final native double computeLength(JsArray<LatLng> path, int radius) /*-{
		return $wnd.google.maps.geometry.spherical.computeLength(path, radius);
	}-*/;

	/**
	 * Computes the length of the given path.
	 * 
	 * @param path
	 * @param radius
	 */
	public static final native double computeLength(MVCArray<LatLng> path, int radius) /*-{
		return $wnd.google.maps.geometry.spherical.computeLength(path, radius);
	}-*/;

	/**
	 * Computes the LatLng produced by starting from a given LatLng and heading
	 * a given distance.
	 * 
	 * @param from
	 * @param distance
	 * @param heading
	 */
	public static final native LatLng computeOffset(LatLng from, int distance, int heading) /*-{
		return $wnd.google.maps.geometry.spherical.computeOffset(from,
				distance, heading);
	}-*/;

	/**
	 * Computes the LatLng produced by starting from a given LatLng and heading
	 * a given distance.
	 * 
	 * @param from
	 * @param distance
	 * @param heading
	 * @param radius
	 */
	public static final native LatLng computeOffset(LatLng from, int distance, int heading,
			int radius) /*-{
		return $wnd.google.maps.geometry.spherical.computeOffset(from,
				distance, heading, radius);
	}-*/;

	/**
	 * Computes the signed area of the given loop. Loops must be closed. The
	 * signed area may be used to determine the orientation of a loop.
	 * 
	 * @param loop
	 */
	public static final native double computeSignedArea(JsArray<LatLng> loop) /*-{
		return $wnd.google.maps.geometry.spherical.computeSignedArea(loop);
	}-*/;

	/**
	 * Computes the signed area of the given loop. Loops must be closed. The
	 * signed area may be used to determine the orientation of a loop.
	 * 
	 * @param loop
	 */
	public static final native double computeSignedArea(MVCArray<LatLng> loop) /*-{
		return $wnd.google.maps.geometry.spherical.computeSignedArea(loop);
	}-*/;

	/**
	 * Computes the signed area of the given loop. Loops must be closed. The
	 * signed area may be used to determine the orientation of a loop.
	 * 
	 * @param loop
	 * @param radius
	 */
	public static final native double computeSignedArea(JsArray<LatLng> loop, int radius) /*-{
		return $wnd.google.maps.geometry.spherical.computeSignedArea(loop,
				radius);
	}-*/;

	/**
	 * Computes the signed area of the given loop. Loops must be closed. The
	 * signed area may be used to determine the orientation of a loop.
	 * 
	 * @param loop
	 * @param radius
	 */
	public static final native double computeSignedArea(MVCArray<LatLng> loop, int radius) /*-{
		return $wnd.google.maps.geometry.spherical.computeSignedArea(loop,
				radius);
	}-*/;

	/**
	 * Travels a fraction of the way from one LatLng to another LatLng.
	 * 
	 * @param from
	 * @param to
	 * @param fraction
	 */
	public static final native LatLng interpolate(LatLng from, LatLng to, double fraction) /*-{
		return $wnd.google.maps.geometry.spherical.interpolate(from, to,
				fraction);
	}-*/;

}
