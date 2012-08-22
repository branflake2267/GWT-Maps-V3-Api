package com.google.gwt.maps.client.weatherlib;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
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
	 * @param options {@link WeatherLayerOptions} configuration for layer (units, style, behaviors)
	 * @return
	 */
	public static final WeatherLayer newInstance(WeatherLayerOptions options) {
		return createJso(options).cast();
	}

	private static final native JavaScriptObject createJso(WeatherLayerOptions options) /*-{
		return new $wnd.google.maps.weather.WeatherLayer(options);
	}-*/;

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

	public final MapWidget getMap() {
		return MapWidget.newInstance(getMapImpl());
	}

	private final native MapImpl getMapImpl() /*-{
		return this.getMap();
	}-*/;

}
