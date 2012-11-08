package com.google.gwt.maps.client.overlays;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;

/**
 * {@link Circle} Options <br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#CircleOptions"
 * >CircleOptions API Doc</a>
 */
public class CircleOptions extends JavaScriptObject {

	/**
	 * use newInstance();
	 */
	protected CircleOptions() {
	}

	/**
	 * creates Circle options
	 */
	public final static CircleOptions newInstance() {
		return JavaScriptObject.createObject().cast();
	}

	/**
	 * Sets the center
	 * 
	 * @param center
	 */
	public final native void setCenter(LatLng center) /*-{
		this.center = center;
	}-*/;

	/**
	 * Gets the center
	 */
	public final native LatLng getCenter() /*-{
		return this.center;
	}-*/;

	/**
	 * Sets Indicates whether this Polyline handles click events. Defaults to
	 * true.
	 * 
	 * @param clickable
	 */
	public final native void setClickable(boolean clickable) /*-{
		this.clickable = clickable;
	}-*/;

	/**
	 * Gets Indicates whether this Polyline handles click events. Defaults to
	 * true.
	 */
	public final native boolean getClickable() /*-{
		return this.clickable;
	}-*/;

	/**
	 * The fill color. All CSS3 colors are supported except for extended named
	 * colors.
	 * 
	 * @param fillColor
	 */
	public final native void setFillColor(String fillColor) /*-{
		this.fillColor = fillColor;
	}-*/;

	/**
	 * The fill color. All CSS3 colors are supported except for extended named
	 * colors.
	 */
	public final native String getFillColor() /*-{
		return this.fillColor;
	}-*/;

	/**
	 * The fill opacity between 0.0 and 1.0
	 * 
	 * @param fillOpacity
	 */
	public final native void setFillOpacity(double fillOpacity) /*-{
		this.fillOpacity = fillOpacity;
	}-*/;

	/**
	 * The fill opacity between 0.0 and 1.0
	 */
	public final native double getFillOpacity() /*-{
		return this.fillOpacity;
	}-*/;

	/**
	 * Sets Map on which to display Polyline.
	 * 
	 * @param mapWidget
	 */
	public final void setMap(MapWidget mapWidget) {
		if (mapWidget == null) {
			setMapImpl(null);
		} else {
			setMapImpl(mapWidget.getJso());
		}
	}

	private final native void setMapImpl(MapImpl map) /*-{
		this.map = map;
	}-*/;

	/**
	 * Gets Map on which to display Polyline.
	 */
	public final MapWidget getMap() {
		MapImpl obj = getMapImpl();
		return obj != null ? MapWidget.newInstance(obj) : null;
	}

	/**
	 * Gets Map on which to display Polyline. <br>
	 * 
	 * @See {@link #getMap()}
	 */
	@Deprecated
	public final MapWidget getMapWidget() {
		MapImpl obj = getMapImpl();
		return obj != null ? MapWidget.newInstance(obj) : null;
	}

	private final native MapImpl getMapImpl() /*-{
		return this.map;
	}-*/;

	/**
	 * Sets The radius in meters on the Earth's surface
	 * 
	 * @param radius
	 */
	public final native void setRadius(double radius) /*-{
		this.radius = radius;
	}-*/;

	/**
	 * Gets The radius in meters on the Earth's surface
	 */
	public final native double getRadius() /*-{
		return this.radius;
	}-*/;

	/**
	 * Sets The stroke color. All CSS3 colors are supported except for extended
	 * named colors.
	 * 
	 * @param strokeColor
	 */
	public final native void setStrokeColor(String strokeColor) /*-{
		this.strokeColor = strokeColor;
	}-*/;

	/**
	 * Gets The stroke color. All CSS3 colors are supported except for extended
	 * named colors.
	 */
	public final native String getStrokeColor() /*-{
		return this.strokeColor;
	}-*/;

	/**
	 * Sets The stroke opacity between 0.0 and 1.0
	 * 
	 * @param strokeOpacity
	 */
	public final native void setStrokeOpacity(double strokeOpacity) /*-{
		this.strokeOpacity = strokeOpacity;
	}-*/;

	/**
	 * Gets The stroke opacity between 0.0 and 1.0
	 */
	public final native double getStrokeOpacity() /*-{
		return this.strokeOpacity;
	}-*/;

	/**
	 * Sets The stroke width in pixels.
	 * 
	 * @param strokeWeight
	 */
	public final native void setStrokeWeight(int strokeWeight) /*-{
		this.strokeWeight = strokeWeight;
	}-*/;

	/**
	 * Gets The stroke width in pixels.
	 */
	public final native int getStrokeWeight() /*-{
		return this.strokeWeight;
	}-*/;

	/**
	 * Sets The zIndex compared to other rectangles.
	 * 
	 * @param zIndex
	 */
	public final native void setZindex(int zIndex) /*-{
		this.zIndex = zIndex;
	}-*/;

	/**
	 * Gets The zIndex compared to other rectangles.
	 */
	public final native int getZindex() /*-{
		return this.zIndex;
	}-*/;
}
