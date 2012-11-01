package com.google.gwt.maps.client.weatherlib;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.user.client.ui.RootPanel;

public class WeatherLayerOptionsTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.WEATHER };
	}

	public void testValueOf() {
		asyncLibTest(new Runnable() {
			@Override
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
				assertEquals(mapWidget.getCenter().getToString(), mapWidget
						.getCenter().getToString());

				// test clearing from map
				opts.setMap(null);
				assertNull(opts.getMap());

				finishTest();
			}
		});

	}

}
