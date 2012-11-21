package com.google.gwt.maps.client.layers;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * A traffic layer. This class extends MVCObject. <br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#TrafficLayer"
 * >TrafficLayer API Doc</a>
 */
public class TrafficLayer extends MVCObject<TrafficLayer> {

	/**
	 * use newInstance();
	 */
	protected TrafficLayer() {
	}

	/**
	 * creates a traffic layer
	 */
	public static final TrafficLayer newInstance() {
		return createJso().cast();
	}

	private static final native JavaScriptObject createJso() /*-{
		return new $wnd.google.maps.TrafficLayer();
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
