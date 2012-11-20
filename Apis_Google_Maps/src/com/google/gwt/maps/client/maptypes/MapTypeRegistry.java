package com.google.gwt.maps.client.maptypes;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#ImageMapType"
 * >ImageMapType API Doc</a>
 */
public class MapTypeRegistry extends MVCObject<MapTypeRegistry> {

	/**
	 * The MapTypeRegistry holds the collection of custom map types available to
	 * the map for its use. The API consults this registry when providing the
	 * list of available map types within controls, for example.
	 */
	protected MapTypeRegistry() {
	}

	/**
	 * The MapTypeRegistry holds the collection of custom map types available to
	 * the map for its use. The API consults this registry when providing the
	 * list of available map types within controls, for example.
	 */
	public final static MapTypeRegistry newInstance() {
		return createJso().cast();
	}

	private final static native JavaScriptObject createJso() /*-{
		return new $wnd.google.maps.MapTypeRegistry();
	}-*/;

	/**
	 * Sets the registry to associate the passed string identifier with the
	 * passed MapType.
	 * 
	 * @param id
	 * @param mapType
	 *            is Object because of limitations of JSO's and interfaces in
	 *            GWT
	 */
	public final native void set(String id, Object mapType) /*-{
		this.set(id, mapType);
	}-*/;

}
