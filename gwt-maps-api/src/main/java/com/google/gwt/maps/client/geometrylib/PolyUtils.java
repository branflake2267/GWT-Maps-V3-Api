package com.google.gwt.maps.client.geometrylib;

import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.overlays.Polygon;
import com.google.gwt.maps.client.overlays.Polyline;

/**
 * Utility functions for computations involving polygons and polylines.<br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#poly"
 * >Poly Utils API Doc</a>
 */
public class PolyUtils {

	/**
	 * Computes whether the given point lies inside the specified polygon.
	 * 
	 * @param point
	 * @param polygon
	 * @return whether the polygon contains the point
	 */
	public final static native boolean containsLocation(LatLng point, Polygon polygon) /*-{
		return $wnd.google.maps.geometry.poly.containsLocation(point, polygon);
	}-*/;

	/**
	 * Computes whether the given point lies on or near to a polyline, or the
	 * edge of a polygon, within a specified tolerance.
	 * 
	 * @param point
	 *            test point
	 * @param polygon
	 *            within this polygon
	 * @return whether location is on edge
	 */
	public final static native boolean isLocationOnEdge(LatLng point, Polygon polygon) /*-{
		return $wnd.google.maps.geometry.poly.isLocationOnEdge(point, polygon);
	}-*/;

	/**
	 * Computes whether the given point lies on or near to a polyline, or the
	 * edge of a polygon, within a specified tolerance.
	 * 
	 * @param point
	 *            test point
	 * @param polyline
	 *            along this polyline
	 * @return whether location is on edge
	 */
	public final static native boolean isLocationOnEdge(LatLng point, Polyline polyline) /*-{
		return $wnd.google.maps.geometry.poly.isLocationOnEdge(point, polyline);
	}-*/;

	/**
	 * Computes whether the given point lies on or near to a polyline, or the
	 * edge of a polygon, within a specified tolerance.
	 * 
	 * @param point
	 *            test point
	 * @param polygon
	 *            within tolerance of this polygon
	 * @param tolerance
	 *            degrees from edge
	 * @return whether point is on edge
	 */
	public final static native boolean isLocationOnEdge(LatLng point, Polygon polygon,
			double tolerance) /*-{
		return $wnd.google.maps.geometry.poly.isLocationOnEdge(point, polygon,
				tolerance);
	}-*/;

	/**
	 * Computes whether the given point lies on or near to a polyline, or the
	 * edge of a polygon, within a specified tolerance.
	 * 
	 * @param point
	 *            test point
	 * @param polyline
	 *            within tolerance of this line
	 * @param tolerance
	 *            degrees from edge
	 * @return whether point is on edge
	 */
	public final static native boolean isLocationOnEdge(LatLng point, Polyline polyline,
			double tolerance) /*-{
		return $wnd.google.maps.geometry.poly.isLocationOnEdge(point, polyline,
				tolerance);
	}-*/;

}
