package com.google.gwt.maps.client.placelib;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.placeslib.PlacesServiceStatus;

public class PlaceServiceStatusTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PlacesServiceStatus o = PlacesServiceStatus.INVALID_REQUEST;
				assertEquals("invalid_request", o.value());
				finishTest();
			}
		});
	}

	public void testUse2() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PlacesServiceStatus o = PlacesServiceStatus.OK;
				assertEquals("ok", o.value());
				finishTest();
			}
		});
	}

	public void testUse3() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PlacesServiceStatus o = PlacesServiceStatus.OVER_QUERY_LIMIT;
				assertEquals("over_query_limit", o.value());
				finishTest();
			}
		});
	}

	public void testUse4() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PlacesServiceStatus o = PlacesServiceStatus.REQUEST_DENIED;
				assertEquals("request_denied", o.value());
				finishTest();
			}
		});
	}

	public void testUse5() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PlacesServiceStatus o = PlacesServiceStatus.UNKNOWN_ERROR;
				assertEquals("unknown_error", o.value());
				finishTest();
			}
		});
	}

	public void testUse6() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PlacesServiceStatus o = PlacesServiceStatus.ZERO_RESULTS;
				assertEquals("zero_results", o.value());
				finishTest();
			}
		});
	}

}
