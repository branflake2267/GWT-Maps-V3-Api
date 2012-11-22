package com.google.gwt.maps.client.service;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.services.MaxZoomStatus;

public class MaxZoomStatusTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	public void testUse1() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MaxZoomStatus o = MaxZoomStatus.ERROR;
				assertEquals("error", o.value());
				assertEquals(MaxZoomStatus.ERROR,
						MaxZoomStatus.fromValue("error"));
				finishTest();
			}
		});
	}

	public void testUse2() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MaxZoomStatus o = MaxZoomStatus.OK;
				assertEquals("ok", o.value());
				assertEquals(MaxZoomStatus.OK, MaxZoomStatus.fromValue("ok"));
				finishTest();
			}
		});
	}

}
