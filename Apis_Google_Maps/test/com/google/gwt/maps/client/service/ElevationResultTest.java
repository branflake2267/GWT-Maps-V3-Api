package com.google.gwt.maps.client.service;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.services.ElevationResult;

public class ElevationResultTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ElevationResult o = ElevationResult.newInstance();
				finishTest();
			}
		});
	}

	public void testElevation() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ElevationResult o = ElevationResult.newInstance();
				int left = 10;
				o.setElevation(left);
				double right = o.getElevation();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testLocation() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ElevationResult o = ElevationResult.newInstance();
				LatLng left = LatLng.newInstance(25, 26);
				o.setLocation(left);
				LatLng right = o.getLocation();
				assertEquals(left.getToString(), right.getToString());
				finishTest();
			}
		});
	}

	public void testResolution() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ElevationResult o = ElevationResult.newInstance();
				double left = 10;
				o.setResolution(left);
				double right = o.getResolution();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

}
