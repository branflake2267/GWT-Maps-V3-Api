package com.google.gwt.maps.client.service;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.services.Distance;

public class DistanceTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				Distance o = Distance.newInstance();
				finishTest();
			}
		});
	}

	public void testText() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				Distance o = Distance.newInstance();
				String left = "test";
				o.setText(left);
				String right = o.getText();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testValue() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				Distance o = Distance.newInstance();
				int left = 10;
				o.setValue(left);
				int right = o.getValue();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

}
