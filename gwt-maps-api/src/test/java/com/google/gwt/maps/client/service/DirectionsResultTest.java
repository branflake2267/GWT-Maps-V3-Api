package com.google.gwt.maps.client.service;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.services.DirectionsResult;
import com.google.gwt.maps.client.services.DirectionsRoute;

public class DirectionsResultTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsResult o = DirectionsResult.newInstance();
				finishTest();
			}
		});
	}

	public void testRoutes() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsResult o = DirectionsResult.newInstance();
				DirectionsRoute[] a = new DirectionsRoute[3];
				a[0] = DirectionsRoute.newInstance();
				a[1] = DirectionsRoute.newInstance();
				a[2] = DirectionsRoute.newInstance();
				JsArray<DirectionsRoute> left = ArrayHelper.toJsArray(a);
				o.setRoutes(left);
				JsArray<DirectionsRoute> right = o.getRoutes();
				assertEquals(left.length(), right.length());
				finishTest();
			}
		});
	}

}
