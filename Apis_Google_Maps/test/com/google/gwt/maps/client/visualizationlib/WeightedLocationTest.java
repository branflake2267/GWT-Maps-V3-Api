package com.google.gwt.maps.client.visualizationlib;

import java.util.ArrayList;

import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.testutil.AbstractTest;

public class WeightedLocationTest extends AbstractTest {

	
	public void testUse() {
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.VISUALIZATION);
		LoadApi.go(new Runnable() {
			public void run() {
				
				@SuppressWarnings("unused")
				WeightedLocation location =  WeightedLocation.newInstance( LatLng.newInstance(37.782551d, -122.445368d), 9d);
				finishTest();
			}
		}, loadLibraries, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testGetSetValue() {
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.VISUALIZATION);  
		LoadApi.go(new Runnable() {
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
		}, loadLibraries, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

}
