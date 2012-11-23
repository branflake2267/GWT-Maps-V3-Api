package com.google.gwt.maps.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import com.google.gwt.ajaxloader.client.AjaxLoader;
import com.google.gwt.ajaxloader.client.AjaxLoader.AjaxLoaderOptions;

/**
 * Load Maps javascript v3 api
 * 
 * TODO maybe move to the new loading system they have in google apis
 */
public class LoadApi {

	/**
	 * Note: If you use 3, it will take the newest stable available. Don't want
	 * that. We didn't test with that yet!
	 */
	public final static String API_VERSION = "3.9";

	/**
	 * Libraries not loaded by default <br>
	 * <br>
	 * See <a href=
	 * "https://developers.google.com/maps/documentation/javascript/basics.html#Libraries"
	 * >Libraries API Doc</a>
	 */
	public static enum LoadLibrary {

		/**
		 * Allows your Maps API application to include context-sensitive text
		 * ads, allowing you to share in ad revenue for ads shown to your users.
		 * Consult the AdSense Library documentation for more information.
		 */
		ADSENSE,

		/**
		 * Provides a graphical interface for users to draw polygons,
		 * rectangles, polylines, circles, and markers on the map. Consult the
		 * Drawing Library documentation for more information.
		 */
		DRAWING,

		/**
		 * Geometry includes utility functions for calculating scalar geometric
		 * values (such as distance and area) on the the surface of the earth.
		 * Consult the Geometry Library documentation for more information.
		 */
		GEOMETRY,

		/**
		 * Panoramio contains functionality for adding Panoramio photo layers to
		 * your Maps API application. Consult the Panoramio Layers documentation
		 * for more information.
		 */
		PANORAMIO,

		/**
		 * Places enables your application to search for businesses, geographic
		 * locations, and points of interest near a given location, or as a user
		 * types. Consult the Places Library documentation for more information.
		 */
		PLACES,

		/**
		 * Weather contains functionality for adding meterological layers to
		 * your Maps API application. Consult the Weather Layers documentation
		 * for more information.
		 */
		WEATHER,

		/**
		 * Visualization contains functionality for adding advanced
		 * visualization layers to your Maps API application. Consult the
		 * Visualization documentation for more information.
		 */
		VISUALIZATION;

		public String value() {
			return name().toLowerCase();
		}

		public static LoadLibrary fromValue(String value) {
			return valueOf(value.toUpperCase());
		}

		@Override
		public String toString() {
			return name().toLowerCase();
		}
	}

	/**
	 * Load Maps javascript v3 api with default libraries. these are not loaded
	 * {@link LoadLibrary}
	 * 
	 * @param onLoad
	 *            - callback on success
	 * @param sensor
	 *            - derive location [true|false]
	 */
	public static void go(Runnable onLoad, boolean sensor) {
		load(onLoad, sensor, null, null);
	}

	/**
	 * loads maps api
	 * 
	 * @param onLoad
	 *            callback on success
	 * @param loadLibraries
	 *            load additional libraries like geometry
	 * @param sensor
	 *            derive location [true|false]
	 */
	public static void go(Runnable onLoad, ArrayList<LoadLibrary> loadLibraries, boolean sensor) {
		load(onLoad, sensor, loadLibraries, null);
	}

	/**
	 * loads maps api
	 * 
	 * @param onLoad
	 *            callback on success
	 * @param loadLibraries
	 *            load additional libraries like geometry
	 * @param sensor
	 *            derive location [true|false]
	 */
	public static void go(Runnable onLoad, LoadLibrary[] loadLibraries, boolean sensor) {
		ArrayList<LoadLibrary> loadLibrariesList = new ArrayList<LoadLibrary>(
				Arrays.asList(loadLibraries));
		load(onLoad, sensor, loadLibrariesList, null);
	}

	/**
	 * Load Maps javascript v3 api
	 * 
	 * @param onLoad
	 *            callback on success
	 * @param sensor
	 *            derive location [true|false]
	 * @param otherParams
	 *            add additional params. like "key=YOUR_API_KEY"
	 */
	public static void go(Runnable onLoad, boolean sensor, String otherParams) {
		load(onLoad, sensor, null, otherParams);
	}

	/**
	 * loads maps api
	 * 
	 * @param onLoad
	 *            callback on success
	 * @param loadLibraries
	 *            load additional libraries like geometry
	 * @param sensor
	 *            sensor derive location [true|false]
	 * @param otherParams
	 *            add additional params. like "key=YOUR_API_KEY"
	 */
	public static void go(Runnable onLoad, ArrayList<LoadLibrary> loadLibraries, boolean sensor,
			String otherParams) {
		load(onLoad, sensor, loadLibraries, otherParams);
	}

	/**
	 * load the maps library
	 * 
	 * @param onLoad
	 * @param sensor
	 * @param loadLibraries
	 * @param otherParams
	 */
	private static void load(Runnable onLoad, boolean sensor, ArrayList<LoadLibrary> loadLibraries,
			String otherParams) {

		String op = "sensor=" + sensor;
		if (otherParams != null) {
			op += "&" + otherParams;
		}

		if (loadLibraries != null) {
			op += "&" + getLibraries(loadLibraries);
		}

		AjaxLoaderOptions settings = AjaxLoaderOptions.newInstance();
		settings.setOtherParms(op);
		AjaxLoader.loadApi("maps", API_VERSION, onLoad, settings);
	}

	/**
	 * get the url libraries parameter
	 * 
	 * @param loadLibraries
	 */
	private static String getLibraries(ArrayList<LoadLibrary> loadLibraries) {
		if (loadLibraries == null) {
			return "";
		}
		String s = "libraries=";
		Iterator<LoadLibrary> itr = loadLibraries.iterator();
		int i = 0;
		while (itr.hasNext()) {
			LoadLibrary ll = itr.next();
			if (ll != null) {
				if (i > 0) {
					s += ",";
				}
				s += ll.value();
				i++;
			}
		}
		return s;
	}

	/**
	 * private constructor
	 */
	private LoadApi() {
	}
}
