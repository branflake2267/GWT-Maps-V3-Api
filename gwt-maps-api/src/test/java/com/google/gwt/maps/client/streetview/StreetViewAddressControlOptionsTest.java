package com.google.gwt.maps.client.streetview;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.controls.ControlPosition;

public class StreetViewAddressControlOptionsTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewAddressControlOptions options = StreetViewAddressControlOptions
						.newInstance();
				finishTest();
			}
		});

	}

	public void testPosition() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewAddressControlOptions o = StreetViewAddressControlOptions
						.newInstance();
				ControlPosition left = ControlPosition.TOP_CENTER;
				o.setPosition(left);
				ControlPosition right = o.getPosition();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

}
