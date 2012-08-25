package com.google.gwt.maps.client.visualizationlib;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.mvc.MVCArray;

/**
 * This object defines the properties that can be set on a HeatmapLayer object. <br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#HeatmapLayerOptions"
 * >HeapMapLayerOptions API Doc</a>
 */
public class HeatMapLayerOptions extends JavaScriptObject {

	/**
	 * See {@link #newInstance()}
	 */
	protected HeatMapLayerOptions() {
	}

	/**
	 * creates - This object defines the properties that can be set on a HeatmapLayer object.
	 */
	public static final HeatMapLayerOptions newInstance() {
		return newInstanceDefault();
	}

	/**
	 * Setup a Javascript object to store the values in
	 * 
	 * @return WeightedLocation
	 */
	private final static HeatMapLayerOptions newInstanceDefault() {
		JavaScriptObject jso = HeatMapLayerOptions.createObject();
		// WorkAroundUtils.removeGwtObjectId(jso); TODO Still needed?
		return jso.cast();
	}
	
	/**
	 * The data points to display. Required.
	 * 
	 * @param dataPoints
	 */
	public final native void setData(MVCArray<LatLng> dataPoints) /*-{
		this.data = dataPoints;
	}-*/;
	
	/**
	 * Get the data points to display. Required.
	 * 
	 * @returns dataPoints
	 */
	public final native MVCArray<LatLng> getData() /*-{
		return this.data;
	}-*/;
	
	/**
	 * Specifies whether heatmaps dissipate on zoom. By default, the radius of influence of a data point is specified by the radius option only. When dissipating is disabled, the radius option is intepreted as a radius at zoom level 0.
	 * 
	 * @param dissipating enables/disables dissipating
	 */
	public final native void setDissipating(boolean dissipating) /*-{
		this.dissipating = dissipating;
	}-*/;
	
	/**
	 * Get the dissipating property
	 * 
	 * @returns dissipating state
	 */
	public final native boolean getDissipating() /*-{
		return this.dissipating;
	}-*/;
	
	/**
	 * The color gradient of the heatmap, specified as an array of CSS color strings. All CSS3 colors are supported except for extended named colors.
	 * 
	 * @param gradient
	 */
	public final native void setGradient(JsArrayString gradient) /*-{
		this.gradient = gradient;
	}-*/;
	
	/**
	 * Get color gradient of the heatmap.
	 * 
	 * @returns gradient
	 */
	public final native JsArrayString getGradient() /*-{
		return this.gradient;
	}-*/;
	
	/**
	 * Renders the heatmap on the specified map. If map is set to null, the heatmap will be removed.
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
		this.setMap(map);
	}-*/;

	/**
	 * Gets map layer is rendered to, or NULL if not associated with map.
	 * @return
	 */
	public final MapWidget getMap() {
		return MapWidget.newInstance(getMapImpl());
	}

	private final native MapImpl getMapImpl() /*-{
		return this.getMap();
	}-*/;
	
	/**
	 * The maximum intensity of the heatmap. By default, heatmap colors are dynamically scaled according to the greatest concentration of points at any particular pixel on the map. This property allows you to specify a fixed maximum. Setting the maximum intensity can be helpful when your dataset contains a few outliers with an unusually high intensity.
	 * 
	 * @param maxIntensity
	 */
	public final native void setMaxIntensity(double maxIntensity) /*-{
		this.maxIntensity = maxIntensity;
	}-*/;
	
	/**
	 * Get maximum intensity
	 * 
	 * @returns maxIntensity
	 */
	public final native double getMaxIntensity() /*-{
		return this.maxIntensity;
	}-*/;
	
	/**
	 * The opacity of the heatmap, expressed as a number between 0 and 1. Defaults to 0.6.
	 * 
	 * @param opacity [0-1] 
	 */
	public final native void setOpacity(double opacity) /*-{
		this.opacity = opacity;
	}-*/;
	
	/**
	 * Get layer opacity
	 * 
	 * @returns opacity
	 */
	public final native double getOpacity() /*-{
		return this.opacity;
	}-*/;
	
	/**
	 * The radius of influence for each data point, in pixels.
	 * 
	 * @param radius (pixels) 
	 */
	public final native void setRadius(double radius) /*-{
		this.radius = radius;
	}-*/;
	
	/**
	 * Get data point influence in pixels.
	 * 
	 * @returns radius (pixels)
	 */
	public final native double getRadius() /*-{
		return this.radius;
	}-*/;
}