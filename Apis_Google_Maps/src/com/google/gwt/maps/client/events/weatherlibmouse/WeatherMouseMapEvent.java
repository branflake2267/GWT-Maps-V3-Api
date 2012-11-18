package com.google.gwt.maps.client.events.weatherlibmouse;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.ajaxloader.client.Properties.TypeException;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Size;
import com.google.gwt.maps.client.events.MapEvent;
import com.google.gwt.maps.client.overlays.InfoWindow;
import com.google.gwt.maps.client.weatherlib.WeatherFeature;

/**
 * The properties of a mouse event on a WeatherLayer<br>
 * <br>
 * <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#WeatherMouseEvent"
 * >See WeatherMouseEvent API Doc</a>
 */
public class WeatherMouseMapEvent extends
		MapEvent<WeatherMouseMapHandler, WeatherMouseMapEvent> {

	public static Type<WeatherMouseMapHandler> TYPE = new Type<WeatherMouseMapHandler>();

	public WeatherMouseMapEvent(Properties properties) {
		super(properties);
	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<WeatherMouseMapHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(WeatherMouseMapHandler handler) {
		handler.onEvent(this);
	}

	/**
	 * The position at which to anchor an info window on the clicked feature.
	 * 
	 * @return clicked position
	 */
	public final LatLng getLatLng() {
		LatLng latLng = null;
		try {
			latLng = (LatLng) properties.getObject("latLng");
		} catch (TypeException e) {
		}
		return latLng;
	}

	/**
	 * The offset to apply to an info window anchored on the clicked feature.
	 * 
	 * @return pixel offset of info window anchor
	 */
	public final Size getPixelOffset() {
		Size size = null;
		try {
			size = (Size) properties.getObject("pixelOffset");
		} catch (TypeException e) {
		}
		return size;
	}

	/**
	 * Pre-rendered HTML content to display within a feature's {@link InfoWindow} when clicked.
	 */
	public String getInfoWindowHtml() {
		String infoWindowHtml = null;
		try {
			infoWindowHtml = properties.getString("infoWindowHtml");
		} catch (TypeException e) {}
		return infoWindowHtml;
	}

	/**
	 * The offset to apply to an info window anchored on the clicked feature.
	 * 
	 * @return weather information for the clicked location
	 */
	public final WeatherFeature getFeatureDetails() {
		WeatherFeature feature = null;
		try {
			feature = (WeatherFeature) properties.getObject("featureDetails");
		} catch (TypeException e) {
		}
		return feature;
	}
}
