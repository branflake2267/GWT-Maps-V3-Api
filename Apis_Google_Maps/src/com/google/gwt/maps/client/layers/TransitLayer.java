package com.google.gwt.maps.client.layers;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.interfaces.HasMapWidget;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * A transit layer. This class extends MVCObject. <br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#TransitLayer"
 * >TransitLayer API Doc</a>
 */
public class TransitLayer extends MVCObject<TransitLayer> implements
		HasMapWidget {

	/**
	 * use newInstance();
	 */
	protected TransitLayer() {
	}

	/**
	 * creates a traffic layer
	 */
	public static final TransitLayer newInstance() {
		return createJso().cast();
	}

	private static final native JavaScriptObject createJso() /*-{
		return new $wnd.google.maps.TransitLayer();
	}-*/;

	@Override
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

	@Override
	public final MapWidget getMap() {
		return MapWidget.newInstance(getMapImpl());
	}

	private final native MapImpl getMapImpl() /*-{
		return this.getMap();
	}-*/;
}
