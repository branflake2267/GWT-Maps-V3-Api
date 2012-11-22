package com.google.gwt.maps.client.service;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.services.TravelMode;

public class TravelModeTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	public void testReverseEngineer() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				reverseEngineer();
				finishTest();
			}
		});
	}

	private native void reverseEngineer() /*-{
		var array = [ "BICYCLING", "DRIVING", "WALKING" ]
		for ( var i = 0; i < array.length; i++) {
			var s = "$wnd.google.maps.TravelMode." + array[i];
			alert(array[i] + "=" + eval(s));
		}
	}-*/;

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				TravelMode o = TravelMode.BICYCLING;
				assertEquals("BICYCLING", TravelMode.BICYCLING.value());
				assertEquals(TravelMode.BICYCLING,
						TravelMode.fromValue("BICYCLING"));
				finishTest();
			}
		});
	}

	@SuppressWarnings("unused")
	public void testUse2() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				TravelMode o = TravelMode.DRIVING;
				assertEquals("DRIVING", TravelMode.DRIVING.value());
				assertEquals(TravelMode.DRIVING,
						TravelMode.fromValue("DRIVING"));
				finishTest();
			}
		});
	}

	@SuppressWarnings("unused")
	public void testUse3() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				TravelMode o = TravelMode.WALKING;
				assertEquals("WALKING", TravelMode.WALKING.value());
				assertEquals(TravelMode.WALKING,
						TravelMode.fromValue("WALKING"));
				finishTest();
			}
		});
	}

}
