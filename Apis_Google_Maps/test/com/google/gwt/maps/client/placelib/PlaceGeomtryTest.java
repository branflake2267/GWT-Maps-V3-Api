package com.google.gwt.maps.client.placelib;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.placeslib.PlaceGeometry;

public class PlaceGeomtryTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PlaceGeometry o = PlaceGeometry.newInstance();
				finishTest();
			}
		});
	}

	public void testLocation() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PlaceGeometry o = PlaceGeometry.newInstance();
				LatLng left = LatLng.newInstance(35, 38);
				o.setLocation(left);
				LatLng right = o.getLocation();
				assertEquals(left.getToString(), right.getToString());
				finishTest();
			}
		});
	}

	public void testViewport() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PlaceGeometry o = PlaceGeometry.newInstance();
				LatLng sw = LatLng.newInstance(-31.203405d, 125.244141d);
				LatLng ne = LatLng.newInstance(-25.363882d, 131.044922d);
				LatLngBounds left = LatLngBounds.newInstance(sw, ne);
				o.setViewPort(left);
				LatLngBounds right = o.getViewPort();
				assertEquals(left.getToString(), right.getToString());
				finishTest();
			}
		});
	}

}
