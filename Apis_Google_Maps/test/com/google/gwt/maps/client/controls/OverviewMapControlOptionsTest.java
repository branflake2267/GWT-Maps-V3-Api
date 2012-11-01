package com.google.gwt.maps.client.controls;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class OverviewMapControlOptionsTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testOpened() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				OverviewMapControlOptions options = OverviewMapControlOptions
						.newInstance();
				boolean left = true;
				options.setOpened(left);
				boolean right = options.getOpened();
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
				OverviewMapControlOptions options = OverviewMapControlOptions
						.newInstance();
				finishTest();
			}
		});
	}
}
