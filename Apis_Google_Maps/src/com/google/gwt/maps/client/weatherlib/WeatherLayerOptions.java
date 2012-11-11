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
	 * @param labelColor
	 */
	public final void setLabelColor(LabelColor labelColor) {
		setLabelColorImpl(labelColor.value());
	}
	
	private final native void setLabelColorImpl(String labelColor) /*-{
		this.labelColor = labelColor;
	}-*/;
	
	/**
	 * Sets the color of labels on the weather layer.
	 */
	public final LabelColor getLabelColor() {
		String val = getLabelColorImpl();
		return (val==null) ? null : LabelColor.fromValue(val);
	}

	private final native String getLabelColorImpl() /*-{
		return this.labelColor;
	}-*/;
	
	/**
	 * Sets the units to use for temperature.
	 * 
	 * @param temperatureUnits
	 */
	public final void setTemperatureUnits(TemperatureUnit temperatureUnits) {
		setTemperatureUnitsImpl(temperatureUnits.value());
	}
	
	private final native void setTemperatureUnitsImpl(String temperatureUnits) /*-{
		this.temperatureUnits = temperatureUnits;
	}-*/;
	
	/**
	 * Gets the units to use for temperature.
	 */
	public final TemperatureUnit getTemperatureUnits() {
		String val = getTemperatureUnitsImpl();
		return (val==null) ? null : TemperatureUnit.valueOf(val);
	}

	private final native String getTemperatureUnitsImpl() /*-{
		return this.temperatureUnits;
	}-*/;
	
	/**
	 * Sets the units to use for wind speed.
	 * 
	 * @param windSpeedUnits
	 */
	public final void setWindSpeedUnits(WindSpeedUnit windSpeedUnits) {
		setWindSpeedUnitsImpl(windSpeedUnits.value());
	}
	
	private final native void setWindSpeedUnitsImpl(String windSpeedUnits) /*-{
		this.windSpeedUnits = windSpeedUnits;
	}-*/;
	
	/**
	 * Gets the units to use for wind speed.
	 */
	public final WindSpeedUnit getWindSpeedUnits() {
		String val = getWindSpeedUnitsImpl();
		return (val==null) ? null : WindSpeedUnit.valueOf(val);
	}
	
	public final native String getWindSpeedUnitsImpl() /*-{
		return this.windSpeedUnits;
	}-*/;

	/**
	 * Layer will be rendered to this map
	 * 
	 * @param mapWidget
	 */
	public final void setMap(MapWidget mapWidget) {
		MapImpl value = (mapWidget != null) ? mapWidget.getJso() : null;
		setMapImpl(value);
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
