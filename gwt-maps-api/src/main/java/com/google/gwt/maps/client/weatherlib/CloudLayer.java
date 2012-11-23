package com.google.gwt.maps.client.weatherlib;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * A layer showing current clouds. This class extends MVCObject. <br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#CloudLayer"
 * >CloudLayer API Doc</a>
 */
public class CloudLayer extends MVCObject<CloudLayer> {

	/**
	 * use newInstance();
	 */
	protected CloudLayer() {
	}

	/**
	 * A layer that displays graphics showing current weather conditions.
	 */
	public static final CloudLayer newInstance() {
		return createJso().cast();
	}

	private static final native JavaScriptObject createJso() /*-{
		return new $wnd.google.maps.weather.CloudLayer();
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
