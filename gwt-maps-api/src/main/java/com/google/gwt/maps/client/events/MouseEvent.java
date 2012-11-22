package com.google.gwt.maps.client.events;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.ajaxloader.client.Properties.TypeException;
import com.google.gwt.maps.client.base.LatLng;

/**
 * This object is returned from various mouse events on the map and overlays,
 * and contains all the fields shown below. <br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#MouseEvent"
 * >MouseEvent API Doc</a>
 */
public class MouseEvent {

	/**
	 * {@link LatLng}
	 */
	private LatLng latLng;

	/**
	 * Create a new MouseEvent from properties of the map event call back
	 * 
	 * @param properties
	 *            {@link com.google.gwt.ajaxloader.client.Properties}
	 */
	public MouseEvent(Properties properties) {
		parseProperties(properties);
	}

	/**
	 * Parse the properties for {@link LatLng}
	 * 
	 * @param properties
	 */
	private void parseProperties(Properties properties) {
		try {
			latLng = (LatLng) properties.getObject("latLng");
		} catch (TypeException e) {
			e.printStackTrace();
		}
	}

	/**
	 * The latitude/longitude that was below the cursor when the event occurred.
	 * 
	 * @return point of mouse event
	 */
	public final LatLng getLatLng() {
		return latLng;
	}

	/**
	 * Prevents this event from propagating further.
	 */
	public final native void stop() /*-{
		this.stop();
	}-*/;

}
