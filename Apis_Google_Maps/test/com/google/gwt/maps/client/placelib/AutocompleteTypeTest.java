package com.google.gwt.maps.client.placelib;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.placeslib.AutocompleteType;

public class AutocompleteTypeTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				AutocompleteType o = AutocompleteType.ESTABLISHMENT;
				assertEquals("establishment", o.value());

				AutocompleteType o2 = AutocompleteType.GEOCODE;
				assertEquals("geocode", o2.value());

				finishTest();
			}
		});
	}

}
