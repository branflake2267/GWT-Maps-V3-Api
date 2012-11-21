package com.google.gwt.maps.client.streetview;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.controls.ControlPosition;
import com.google.gwt.maps.client.controls.StreetViewControlOptions;

public class StreetViewControlOptionsTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewControlOptions options = StreetViewControlOptions
						.newInstance();
				finishTest();
			}
		});

	}

	public void testPosition() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewControlOptions o = StreetViewControlOptions
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
