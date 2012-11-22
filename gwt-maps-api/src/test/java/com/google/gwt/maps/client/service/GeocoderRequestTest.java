package com.google.gwt.maps.client.service;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.services.GeocoderRequest;

public class GeocoderRequestTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				GeocoderRequest o = GeocoderRequest.newInstance();
				finishTest();
			}
		});
	}

	public void testAddress() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				GeocoderRequest o = GeocoderRequest.newInstance();
				String left = "test";
				o.setAddress(left);
				String right = o.getAddress();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testBounds() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				GeocoderRequest o = GeocoderRequest.newInstance();
				LatLng sw = LatLng.newInstance(-31.203405d, 125.244141d);
				LatLng ne = LatLng.newInstance(-25.363882d, 131.044922d);
				LatLngBounds left = LatLngBounds.newInstance(sw, ne);
				o.setBounds(left);
				LatLngBounds right = o.getBounds();
				assertEquals(left.getToString(), right.getToString());
				finishTest();
			}
		});
	}

	public void testLocation() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				GeocoderRequest o = GeocoderRequest.newInstance();
				LatLng left = LatLng.newInstance(-31.203405d, 125.244141d);
				o.setLocation(left);
				LatLng right = o.getLocation();
				assertEquals(left.getToString(), right.getToString());
				finishTest();
			}
		});
	}

	public void testRegion() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				GeocoderRequest o = GeocoderRequest.newInstance();
				String left = "test";
				o.setRegion(left);
				String right = o.getRegion();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

}
