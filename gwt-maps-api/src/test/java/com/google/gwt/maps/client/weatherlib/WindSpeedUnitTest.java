package com.google.gwt.maps.client.weatherlib;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class WindSpeedUnitTest extends AbstractMapsGWTTest {
	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.WEATHER };
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

	public void testValueOf() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				for (WindSpeedUnit windUnit : WindSpeedUnit.values()) {
					assertEquals(windUnit,
							WindSpeedUnit.valueOf(windUnit.toString()));
				}

				finishTest();
			}
		});

	}

	protected void reverseEngineerValues() {

		for (WindSpeedUnit windUnit : WindSpeedUnit.values()) {
			String expected = reverseEngineer(windUnit.toString());
			assertEquals(expected, windUnit.value());
		}
	}

	private native String reverseEngineer(String type) /*-{
		return $wnd.google.maps.weather.WindSpeedUnit.valueOf()[type];
	}-*/;

}
