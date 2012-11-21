package com.google.gwt.maps.client.controls;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class ZoomControlOptionsTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testPosition() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ZoomControlOptions o = ZoomControlOptions.newInstance();
				ControlPosition left = ControlPosition.TOP_CENTER;
				o.setPosition(left);
				ControlPosition right = o.getPosition();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testStyle() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ZoomControlOptions options = ZoomControlOptions.newInstance();
				ZoomControlStyle left = ZoomControlStyle.LARGE;
				options.setStyle(left);
				int right = options.getStyleJs();
				assertEquals(2, right);
				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ZoomControlOptions options = ZoomControlOptions.newInstance();
				finishTest();
			}
		});

	}

}
