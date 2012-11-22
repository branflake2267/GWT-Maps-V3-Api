package com.google.gwt.maps.client.controls;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class ScaleControlOptionsTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testPosition() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ScaleControlOptions o = ScaleControlOptions.newInstance();
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
				ScaleControlOptions options = ScaleControlOptions.newInstance();
				ScaleControlStyle left = ScaleControlStyle.DEFAULT;
				options.setStyle(left);
				ScaleControlStyle right = options.getStyle();
				assertEquals(left.value(), right.value());
				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ScaleControlOptions options = ScaleControlOptions.newInstance();
				finishTest();
			}
		});

	}

}
