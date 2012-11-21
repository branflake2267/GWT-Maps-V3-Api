package com.google.gwt.maps.client.layers;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * A layer showing bike lanes and paths. This class extends MVCObject. <br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#BicyclingLayer"
 * >BicyclingLayer API Doc</a>
 */
public class BicyclingLayer extends MVCObject<BicyclingLayer> {

	/**
	 * use newInstance();
	 */
	protected BicyclingLayer() {
	}

	/**
	 * A layer that displays bike lanes and paths and demotes large roads.
	 */
	public static final BicyclingLayer newInstance() {
		return createJso().cast();
	}

	private static final native JavaScriptObject createJso() /*-{
		return new $wnd.google.maps.BicyclingLayer();
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
