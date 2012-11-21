package com.google.gwt.maps.client.service;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.services.ElevationResult;
import com.google.gwt.maps.client.services.ElevationService;
import com.google.gwt.maps.client.services.ElevationServiceHandler;
import com.google.gwt.maps.client.services.ElevationStatus;
import com.google.gwt.maps.client.services.LocationElevationRequest;

public class ElevationServiceTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ElevationService o = ElevationService.newInstance();
				finishTest();
			}
		});
	}

	/**
	 * TODO get this to work in test mode?
	 */
	@SuppressWarnings("unused")
	public void testUse2() {

		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				LatLng[] a = new LatLng[1];
				a[0] = LatLng.newInstance(63.3333333, -150.5);

				JsArray<LatLng> locations = ArrayHelper.toJsArray(a);

				LocationElevationRequest request = LocationElevationRequest
						.newInstance();
				request.setLocations(locations);

				ElevationService o = ElevationService.newInstance();
				o.getElevationForLocations(request,
						new ElevationServiceHandler() {
							@Override
							public void onCallback(
									JsArray<ElevationResult> result,
									ElevationStatus status) {

								if (status == ElevationStatus.INVALID_REQUEST) {
									fail();
								} else if (status == ElevationStatus.OK) {
									ElevationResult e = result.get(0);
									double elevation = e.getElevation();
									LatLng locaiton = e.getLocation();
									double res = e.getResolution();
									System.out.println("worked");
									assertTrue(true);
								} else if (status == ElevationStatus.OVER_QUERY_LIMIT) {
									fail();
								} else if (status == ElevationStatus.REQUEST_DENIED) {
									fail();
								} else if (status == ElevationStatus.UNKNOWN_ERROR) {
									fail();
								}

								System.out
										.println("elevation request finished");
								finishTest();
							}
						});

			}
		});
	}

}
