package com.google.gwt.maps.client.service;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.services.MaxZoomResult;
import com.google.gwt.maps.client.services.MaxZoomStatus;

public class MaxZoomResultTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MaxZoomResult o = MaxZoomResult.newInstance();
				finishTest();
			}
		});
	}

	public void testStatus() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MaxZoomResult o = MaxZoomResult.newInstance();
				MaxZoomStatus left = MaxZoomStatus.OK;
				o.setStatus(left);
				MaxZoomStatus right = o.getStatus();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testZoom() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MaxZoomResult o = MaxZoomResult.newInstance();
				int left = 5;
				o.setZoom(left);
				int right = o.getZoom();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

}
