package com.google.gwt.maps.client.service;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.services.PathElevationRequest;

public class PathElevationRequestTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PathElevationRequest o = PathElevationRequest.newInstance();
				finishTest();
			}
		});
	}

	public void testPath() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PathElevationRequest o = PathElevationRequest.newInstance();
				LatLng[] a = new LatLng[3];
				a[0] = LatLng.newInstance(25, 26);
				a[1] = LatLng.newInstance(26, 28);
				a[2] = LatLng.newInstance(27, 29);
				JsArray<LatLng> left = ArrayHelper.toJsArray(a);
				o.setPath(left);
				JsArray<LatLng> right = o.getPath();
				assertEquals(left.length(), right.length());
				finishTest();
			}
		});
	}

	public void testSamples() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PathElevationRequest o = PathElevationRequest.newInstance();
				int left = 5;
				o.setSamples(left);
				int right = o.getSamples();
				assertEquals(left, right);
				finishTest();
			}
		});
	}
}
