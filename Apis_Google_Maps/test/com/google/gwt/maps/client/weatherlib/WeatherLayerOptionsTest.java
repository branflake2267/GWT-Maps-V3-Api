package com.google.gwt.maps.client.weatherlib;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.user.client.ui.RootPanel;

public class WeatherLayerOptionsTest extends GWTTestCase {

	public static final int ASYNC_DELAY_MS = 5000;

	public String getModuleName() {
		return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
	}

	public void testValueOf() {
		boolean sensor = false;
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.WEATHER);
		LoadApi.go(new Runnable() {
			public void run() {

				WeatherLayerOptions opts = WeatherLayerOptions.newInstance();

				// test all sets/gets
				opts.setClickable(true);
				assertTrue(opts.getClickable());
				opts.setClickable(false);
				assertFalse(opts.getClickable());

				for (LabelColor color : LabelColor.values()) {
					opts.setLabelColor(color);
					assertEquals(color, opts.getLabelColor());
				}

				opts.setSuppressInfoWindows(true);
				assertTrue(opts.getSuppressInfoWindows());
				opts.setSuppressInfoWindows(false);
				assertFalse(opts.getSuppressInfoWindows());

				for (TemperatureUnit unit : TemperatureUnit.values()) {
					opts.setTemperatureUnits(unit);
					assertEquals(unit, opts.getTemperatureUnits());
				}

				for (WindSpeedUnit unit : WindSpeedUnit.values()) {
					opts.setWindSpeedUnits(unit);
					assertEquals(unit, opts.getWindSpeedUnits());
				}

				// and setting the map
				MapOptions options = MapOptions.newInstance();
				MapWidget mapWidget = new MapWidget(options);
				mapWidget.setSize("500px", "500px");
				RootPanel.get().add(mapWidget);

				// test getting null map
				assertNull(opts.getMap());
				// apply to map and read back
				opts.setMap(mapWidget);
				assertEquals(mapWidget.getCenter().getToString(), mapWidget.getCenter()
						.getToString());
				
				// test clearing from map
				opts.setMap(null);
				assertNull(opts.getMap());
				
				finishTest();
			}
		}, loadLibraries, sensor);
		delayTestFinish(ASYNC_DELAY_MS);
	}

}
