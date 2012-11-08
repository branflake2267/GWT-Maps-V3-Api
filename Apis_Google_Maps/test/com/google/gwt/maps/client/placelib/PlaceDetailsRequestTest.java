package com.google.gwt.maps.client.placelib;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.placeslib.PlaceDetailsRequest;

public class PlaceDetailsRequestTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PlaceDetailsRequest o = PlaceDetailsRequest.newInstance();
				String left = "test";
				o.setReference(left);
				String right = o.getReference();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

}
