package com.google.gwt.maps.client.streetview;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class StreetViewStatusTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewStatus o = StreetViewStatus.OK;
				assertEquals("ok", o.value());
				finishTest();
			}
		});
	}

	public void testUse2() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewStatus o = StreetViewStatus.UNKNOWN_ERROR;
				assertEquals("unknown_error", o.value());
				finishTest();
			}
		});
	}

	public void testUse3() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewStatus o = StreetViewStatus.ZERO_RESULTS;
				assertEquals("zero_results", o.value());
				finishTest();
			}
		});
	}

}
