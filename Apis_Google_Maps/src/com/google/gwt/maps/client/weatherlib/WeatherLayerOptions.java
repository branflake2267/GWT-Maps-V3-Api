package com.google.gwt.maps.client.weatherlib;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;

/**
 * This object defines the properties that can be set on a WeatherLayer object. <br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#WeatherLayerOptions"
 * >WeatherLayerOptions API Doc</a>
 */
public class WeatherLayerOptions extends JavaScriptObject {

	/**
	 * use newInstance();
	 */
	protected WeatherLayerOptions() {
	}

	/**
	 * creates - This object defines the properties that can be set on a
	 * WeatherLayer object.
	 */
	public static final WeatherLayerOptions newInstance() {
		return JavaScriptObject.createObject().cast();
	}

	/**
	 * sets If true, the layer receives mouse events. Default value is true.
	 * 
	 * @param clickable
	 */
	public final native void setClickable(boolean clickable) /*-{
		this.clickable = clickable;
	}-*/;

	/**
	 * gets If true, the layer receives mouse events. Default value is true.
	 */
	public final native boolean getClickable() /*-{
		return this.clickable;
	}-*/;
	
	/**
	 * Sets the color of labels on the weather layer. If this is not explicitly set, the label color is chosen automatically depending on the map type.
	 * 
	 * @param clickable
	 */
	public final native void setLabelColor(LabelColor labelColor) /*-{
		this.labelColor = labelColor;
	}-*/;
	
	/**
	 * Sets the color of labels on the weather layer.
	 */
	public final native LabelColor getLabelColor() /*-{
		return this.labelColor;
	}-*/;
	
	/**
	 * Sets the units to use for temperature.
	 * 
	 * @param clickable
	 */
	public final native void setTemperatureUnits(TemperatureUnit temperatureUnits) /*-{
		this.temperatureUnits = temperatureUnits;
	}-*/;
	
	/**
	 * Gets the units to use for temperature.
	 */
	public final native TemperatureUnit getTemperatureUnits() /*-{
		return this.temperatureUnits;
	}-*/;
	
	/**
	 * Sets the units to use for wind speed.
	 * 
	 * @param clickable
	 */
	public final native void setWindSpeedUnits(WindSpeedUnit windSpeedUnits) /*-{
		this.windSpeedUnits = windSpeedUnits;
	}-*/;
	
	/**
	 * Gets the units to use for wind speed.
	 */
	public final native WindSpeedUnit getWindSpeedUnits() /*-{
		return this.windSpeedUnits;
	}-*/;

	/**
	 * Layer will be rendered to this map
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
	 * Returns the map on which this layer is displayed.
	 */
	public final MapWidget getMap() {
		return MapWidget.newInstance(getMapImpl());
	}

	private final native MapImpl getMapImpl() /*-{
		return this.map;
	}-*/;

	/**
	 * Sets Suppress the rendering of info windows when layer features are
	 * clicked.
	 * 
	 * @param suppressInfoWindows
	 */
	public final native void setSuppressInfoWindows(boolean suppressInfoWindows) /*-{
		this.suppressInfoWindows = suppressInfoWindows;
	}-*/;

	/**
	 * gets Suppress the rendering of info windows when layer features are
	 * clicked.
	 */
	public final native boolean getSuppressInfoWindows() /*-{
		return this.suppressInfoWindows;
	}-*/;

}
