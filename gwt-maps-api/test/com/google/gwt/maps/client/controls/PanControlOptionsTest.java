package com.google.gwt.maps.client.controls;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class PanControlOptionsTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testPosition() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PanControlOptions options = PanControlOptions.newInstance();
				ControlPosition left = ControlPosition.TOP_CENTER;
				options.setPosition(left);
				ControlPosition right = options.getPosition();
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
				PanControlOptions options = PanControlOptions.newInstance();
				finishTest();
			}
		});
	}

}
