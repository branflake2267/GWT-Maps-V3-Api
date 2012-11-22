package com.google.gwt.maps.client.weatherlib;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class LabelColorTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.WEATHER };
	}

	public void testValueOf() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				for (LabelColor windUnit : LabelColor.values()) {
					assertEquals(windUnit,
							LabelColor.valueOf(windUnit.toString()));
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

		for (LabelColor labelColor : LabelColor.values()) {
			String expected = reverseEngineer(labelColor.toString());
			assertEquals(expected, labelColor.value());
		}
	}

	private native String reverseEngineer(String type) /*-{
		return $wnd.google.maps.weather.LabelColor.valueOf()[type];
	}-*/;

}
