package com.google.gwt.maps.client.visualizationlib;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;

public class WeightedLocationTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.VISUALIZATION };
	}
	
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				
				@SuppressWarnings("unused")
				WeightedLocation location =  WeightedLocation.newInstance( LatLng.newInstance(37.782551d, -122.445368d), 9d);
				
				finishTest();
			}
		});
	}

	public void testGetSetValue() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				
				LatLng expectedLatLng = LatLng.newInstance(37.782551d, -122.445368d);
				double expectedWeight = 9.4d;
				
				WeightedLocation location =  WeightedLocation.newInstance( expectedLatLng, expectedWeight);
				assertNotNull(location);

				// test get/set
				assertEquals(expectedLatLng.toString(), location.getLocation().toString());
				assertEquals(expectedWeight, location.getWeight(), 1e-5);

				finishTest();
			}
		});
	}

}
