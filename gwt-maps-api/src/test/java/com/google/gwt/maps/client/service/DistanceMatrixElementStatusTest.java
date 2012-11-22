package com.google.gwt.maps.client.service;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.services.DistanceMatrixElementStatus;

public class DistanceMatrixElementStatusTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	public void testUse1() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DistanceMatrixElementStatus o = DistanceMatrixElementStatus.NOT_FOUND;
				assertEquals("not_found", o.value());
				assertEquals(DistanceMatrixElementStatus.NOT_FOUND,
						DistanceMatrixElementStatus.fromValue("not_found"));
				finishTest();
			}
		});
	}

	public void testUse2() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DistanceMatrixElementStatus o = DistanceMatrixElementStatus.OK;
				assertEquals("ok", o.value());
				assertEquals(DistanceMatrixElementStatus.OK,
						DistanceMatrixElementStatus.fromValue("ok"));
				finishTest();
			}
		});
	}

	public void testUse3() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DistanceMatrixElementStatus o = DistanceMatrixElementStatus.ZERO_RESULTS;
				assertEquals("zero_results", o.value());
				assertEquals(DistanceMatrixElementStatus.ZERO_RESULTS,
						DistanceMatrixElementStatus.fromValue("zero_results"));
				finishTest();
			}
		});
	}

}
