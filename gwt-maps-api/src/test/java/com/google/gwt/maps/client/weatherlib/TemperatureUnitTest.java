package com.google.gwt.maps.client.weatherlib;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class TemperatureUnitTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.WEATHER };
	}

	public void testValueOf() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				for (TemperatureUnit windUnit : TemperatureUnit.values()) {
					assertEquals(windUnit,
							TemperatureUnit.valueOf(windUnit.toString()));
				}

				finishTest();
			}
		});

	}

	public void testReverseEngineer() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				reverseEngineerValues();
				finishTest();
			}
		});

	}

	protected void reverseEngineerValues() {

		for (TemperatureUnit tempUnit : TemperatureUnit.values()) {
			String expected = reverseEngineer(tempUnit.toString());
			assertEquals(expected, tempUnit.value());
		}
	}

	private native String reverseEngineer(String type) /*-{
		return $wnd.google.maps.weather.TemperatureUnit.valueOf()[type];
	}-*/;

}
