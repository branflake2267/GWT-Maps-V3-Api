package com.google.gwt.maps.client.weatherlib;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.events.MapEventType;
import com.google.gwt.maps.client.events.MapHandlerRegistration;
import com.google.gwt.maps.client.events.weatherlibmouse.WeatherMouseEventFormatter;
import com.google.gwt.maps.client.events.weatherlibmouse.WeatherMouseMapHandler;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * A layer showing current weather conditions. This class extends MVCObject. <br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/layers#WeatherLayer"
 * >WeatherLayer API Doc</a>
 */
public class WeatherLayer extends MVCObject<WeatherLayer> {

	/**
	 * use newInstance();
	 */
	protected WeatherLayer() {
	}

	/**
	 * A layer that displays graphics showing current weather conditions.
	 * 
	 * @param options
	 *            {@link WeatherLayerOptions} configuration for layer (units,
	 *            style, behaviors)
	 * @return WeatherLayer object
	 */
	public static final WeatherLayer newInstance(WeatherLayerOptions options) {
		return createJso(options).cast();
	}

	private static final native JavaScriptObject createJso(
			WeatherLayerOptions options) /*-{
		return new $wnd.google.maps.weather.WeatherLayer(options);
	}-*/;

	/**
	 * Renders the layer on the specified map. If map is set to NULL, the layer
	 * will be removed.
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
		this.setMap(map);
	}-*/;

	/**
	 * Sets the WeatherLayer's options.
	 */
	public final native void setOptions(WeatherLayerOptions options) /*-{
		this.setOptions(options);
	}-*/;

	/**
	 * Returns the map on which this layer is displayed.
	 * 
	 * @return NULL if not on any map
	 */
	public final MapWidget getMap() {
		return MapWidget.newInstance(getMapImpl());
	}

	private final native MapImpl getMapImpl() /*-{
		return this.getMap();
	}-*/;

	/**
	 * This event is fired when a feature in the layer is clicked.
	 * 
	 * @param handler
	 */
	public final HandlerRegistration addClickHandler(
			WeatherMouseMapHandler handler) {
		return MapHandlerRegistration.addHandler(this, MapEventType.CLICK,
				handler, new WeatherMouseEventFormatter());
	}
}
