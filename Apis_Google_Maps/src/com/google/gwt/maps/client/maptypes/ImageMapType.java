package com.google.gwt.maps.client.maptypes;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.maps.client.events.MapEventType;
import com.google.gwt.maps.client.events.MapHandlerRegistration;
import com.google.gwt.maps.client.events.tiles.TilesLoadedEventFormatter;
import com.google.gwt.maps.client.events.tiles.TilesLoadedMapHandler;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * This class implements the MapType interface and is provided for rendering
 * image tiles. <br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#ImageMapType"
 * >ImageMapType API Doc</a>
 */
public class ImageMapType extends MVCObject<ImageMapType> {

	/**
	 * use newInstance();
	 */
	protected ImageMapType() {
	}

	/**
	 * Constructs an ImageMapType using the provided ImageMapTypeOptions
	 * 
	 * @param options
	 */
	public final static ImageMapType newInstance(ImageMapTypeOptions options) {
		return (ImageMapType) createJso(options);
	}

	private final static native JavaScriptObject createJso(ImageMapTypeOptions options) /*-{
		return new $wnd.google.maps.ImageMapType(options);
	}-*/;

	/**
	 * Returns the opacity level (0 (transparent) to 1.0) of the
	 * {@link ImageMapType} tiles.
	 * 
	 * @return
	 */
	public final native double getOpacity() /*-{
		return this.getOpacity();
	}-*/;

	/**
	 * Sets the opacity level (0 (transparent) to 1.0) of the
	 * {@link ImageMapType} tiles.
	 */
	public final native void setOpacity(double opacity) /*-{
		this.setOpacity(opacity);
	}-*/;

	/**
	 * This event is fired when the visible tiles finish loading.
	 * 
	 * @param handler
	 */
	public final HandlerRegistration addClickHandler(TilesLoadedMapHandler handler) {
		return MapHandlerRegistration.addHandler(this, MapEventType.TILESLOADED, handler,
				new TilesLoadedEventFormatter());
	}

}
