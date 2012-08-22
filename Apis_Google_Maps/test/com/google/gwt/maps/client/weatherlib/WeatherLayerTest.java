package com.google.gwt.maps.client.weatherlib;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.weatherlib.WeatherLayer;
import com.google.gwt.user.client.ui.RootPanel;

public class WeatherLayerTest extends GWTTestCase {

	public static final int ASYNC_DELAY_MS = 5000;

	public String getModuleName() {
		return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
	}

	@SuppressWarnings("unused")
	public void testWeatherLayerUse() {
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.WEATHER);
		LoadApi.go(new Runnable() {
			public void run() {
				
				WeatherLayerOptions options = WeatherLayerOptions.newInstance();
				options.setTemperatureUnits(TemperatureUnit.FAHRENHEIT);
				options.setWindSpeedUnits(WindSpeedUnit.MILES_PER_HOUR);
				options.setLabelColor(LabelColor.BLACK);
				
				WeatherLayer o = WeatherLayer.newInstance(options);
				finishTest();
			}
		}, loadLibraries, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testWeatherLayerOnMap() {
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.WEATHER);
		LoadApi.go(new Runnable() {
			public void run() {
				MapOptions opts = MapOptions.newInstance();
				MapWidget mapWidget = new MapWidget(opts);
				mapWidget.setSize("500px", "500px");
				RootPanel.get().add(mapWidget);

				WeatherLayerOptions options = WeatherLayerOptions.newInstance();
				options.setTemperatureUnits(TemperatureUnit.FAHRENHEIT);
				options.setWindSpeedUnits(WindSpeedUnit.MILES_PER_HOUR);
				options.setLabelColor(LabelColor.BLACK);
				
				WeatherLayer o = WeatherLayer.newInstance(options);

				// test getting null map
				assertNull(o.getMap());

				o.setMap(mapWidget);
				MapWidget right = o.getMap();

				assertEquals(mapWidget.getCenter().getToString(), right
						.getCenter().getToString());

				// test clearing from map
				o.setMap(null);
				assertNull(o.getMap());

				finishTest();
			}
		},loadLibraries, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}
}
