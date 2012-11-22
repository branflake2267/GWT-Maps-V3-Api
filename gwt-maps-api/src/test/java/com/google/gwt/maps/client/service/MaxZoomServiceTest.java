package com.google.gwt.maps.client.service;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.services.MaxZoomResult;
import com.google.gwt.maps.client.services.MaxZoomService;
import com.google.gwt.maps.client.services.MaxZoomServiceHandler;
import com.google.gwt.maps.client.services.MaxZoomStatus;

public class MaxZoomServiceTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MaxZoomService o = MaxZoomService.newInstance();
				finishTest();
			}
		});
	}

	public void testGet() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MaxZoomService o = MaxZoomService.newInstance();
				LatLng latlng = LatLng.newInstance(25, 26);
				o.getMaxZoomAtLatLng(latlng, new MaxZoomServiceHandler() {
					@Override
					public void onCallback(MaxZoomResult result) {
						if (result == null) {
							fail();
						}

						if (result.getStatus() == MaxZoomStatus.OK) {
							System.out.println("result.zoom="
									+ result.getZoom());
							assertEquals(16, result.getZoom());

						} else if (result.getStatus() == MaxZoomStatus.ERROR) {
							fail();
						}
						finishTest();
					}
				});

			}
		});
	}

}
