package com.google.gwt.maps.client.weatherlib;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.user.client.ui.RootPanel;

public class WeatherLayerTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.WEATHER };
	}

	@SuppressWarnings("unused")
	public void testWeatherLayerUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				WeatherLayerOptions options = WeatherLayerOptions.newInstance();
				options.setTemperatureUnits(TemperatureUnit.FAHRENHEIT);
				options.setWindSpeedUnits(WindSpeedUnit.MILES_PER_HOUR);
				options.setLabelColor(LabelColor.BLACK);

				WeatherLayer o = WeatherLayer.newInstance(options);
				finishTest();
			}
		});

	}

	public void testSetOptions() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				
				WeatherLayerOptions options = WeatherLayerOptions.newInstance();
				options.setTemperatureUnits(TemperatureUnit.FAHRENHEIT);
				options.setWindSpeedUnits(WindSpeedUnit.MILES_PER_HOUR);
				options.setLabelColor(LabelColor.BLACK);
				
				WeatherLayer o = WeatherLayer.newInstance(options);
				
				// now set different options
				WeatherLayerOptions options2 = WeatherLayerOptions.newInstance();
				options.setTemperatureUnits(TemperatureUnit.CELSIUS);
				options.setWindSpeedUnits(WindSpeedUnit.METERS_PER_SECOND);
				options.setLabelColor(LabelColor.WHITE);
				o.setOptions(options2);

				finishTest();
			}
		});
		
	}

	public void testWeatherLayerOnMap() {
		asyncLibTest(new Runnable() {
			@Override
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
		});

	}
}
