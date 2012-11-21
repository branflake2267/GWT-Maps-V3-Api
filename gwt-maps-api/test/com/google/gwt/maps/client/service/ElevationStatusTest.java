package com.google.gwt.maps.client.service;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.services.ElevationStatus;

public class ElevationStatusTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	public void testUse1() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ElevationStatus o = ElevationStatus.INVALID_REQUEST;
				assertEquals("invalid_request", o.value());
				assertEquals(ElevationStatus.INVALID_REQUEST,
						ElevationStatus.fromValue("invalid_request"));
				finishTest();
			}
		});
	}

	public void testUse4() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ElevationStatus o = ElevationStatus.OK;
				assertEquals("ok", o.value());
				assertEquals(ElevationStatus.OK,
						ElevationStatus.fromValue("ok"));
				finishTest();
			}
		});
	}

	public void testUse5() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ElevationStatus o = ElevationStatus.OVER_QUERY_LIMIT;
				assertEquals("over_query_limit", o.value());
				assertEquals(ElevationStatus.OVER_QUERY_LIMIT,
						ElevationStatus.fromValue("over_query_limit"));
				finishTest();
			}
		});
	}

	public void testUse6() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ElevationStatus o = ElevationStatus.REQUEST_DENIED;
				assertEquals("request_denied", o.value());
				assertEquals(ElevationStatus.REQUEST_DENIED,
						ElevationStatus.fromValue("request_denied"));
				finishTest();
			}
		});
	}

	public void testUse7() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ElevationStatus o = ElevationStatus.UNKNOWN_ERROR;
				assertEquals("unknown_error", o.value());
				assertEquals(ElevationStatus.UNKNOWN_ERROR,
						ElevationStatus.fromValue("unknown_error"));
				finishTest();
			}
		});
	}

}
