package com.google.gwt.maps.client.controls;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class RotateControlOptionsTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testPosition() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				RotateControlOptions o = RotateControlOptions.newInstance();
				ControlPosition left = ControlPosition.TOP_CENTER;
				o.setPosition(left);
				ControlPosition right = o.getPosition();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				RotateControlOptions options = RotateControlOptions
						.newInstance();
				finishTest();
			}
		});
	}

}
