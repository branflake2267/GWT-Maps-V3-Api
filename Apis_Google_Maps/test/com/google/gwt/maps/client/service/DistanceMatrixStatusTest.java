package com.google.gwt.maps.client.service;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.services.DistanceMatrixStatus;

public class DistanceMatrixStatusTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	public void testUse1() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DistanceMatrixStatus o = DistanceMatrixStatus.INVALID_REQUEST;
				assertEquals("invalid_request", o.value());
				assertEquals(DistanceMatrixStatus.INVALID_REQUEST,
						DistanceMatrixStatus.fromValue("invalid_request"));
				finishTest();
			}
		});
	}

	public void testUse2() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DistanceMatrixStatus o = DistanceMatrixStatus.MAX_DIMENSIONS_EXCEEDED;
				assertEquals("max_dimensions_exceeded", o.value());
				assertEquals(DistanceMatrixStatus.MAX_DIMENSIONS_EXCEEDED,
						DistanceMatrixStatus
								.fromValue("max_dimensions_exceeded"));
				finishTest();
			}
		});
	}

	public void testUse3() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DistanceMatrixStatus o = DistanceMatrixStatus.MAX_ELEMENTS_EXCEEDED;
				assertEquals("max_elements_exceeded", o.value());
				assertEquals(DistanceMatrixStatus.MAX_ELEMENTS_EXCEEDED,
						DistanceMatrixStatus.fromValue("max_elements_exceeded"));
				finishTest();
			}
		});
	}

	public void testUse4() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DistanceMatrixStatus o = DistanceMatrixStatus.OK;
				assertEquals("ok", o.value());
				assertEquals(DistanceMatrixStatus.OK,
						DistanceMatrixStatus.fromValue("ok"));
				finishTest();
			}
		});
	}

	public void testUse5() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DistanceMatrixStatus o = DistanceMatrixStatus.OVER_QUERY_LIMIT;
				assertEquals("over_query_limit", o.value());
				assertEquals(DistanceMatrixStatus.OVER_QUERY_LIMIT,
						DistanceMatrixStatus.fromValue("over_query_limit"));
				finishTest();
			}
		});
	}

	public void testUse6() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DistanceMatrixStatus o = DistanceMatrixStatus.REQUEST_DENIED;
				assertEquals("request_denied", o.value());
				assertEquals(DistanceMatrixStatus.REQUEST_DENIED,
						DistanceMatrixStatus.fromValue("request_denied"));
				finishTest();
			}
		});
	}

	public void testUse7() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DistanceMatrixStatus o = DistanceMatrixStatus.UNKNOWN_ERROR;
				assertEquals("unknown_error", o.value());
				assertEquals(DistanceMatrixStatus.UNKNOWN_ERROR,
						DistanceMatrixStatus.fromValue("unknown_error"));
				finishTest();
			}
		});
	}

}
