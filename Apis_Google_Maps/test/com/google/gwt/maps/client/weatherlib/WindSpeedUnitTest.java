package com.google.gwt.maps.client.weatherlib;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class WindSpeedUnitTest extends GWTTestCase {

	public static final int ASYNC_DELAY_MS = 5000;

	public String getModuleName() {
		return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
	}

	public void testReverseEngineer() {
		boolean sensor = false;
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.WEATHER);
		LoadApi.go(new Runnable() {
			public void run() {
				reverseEngineerValues();
				finishTest();
			}
		}, loadLibraries, sensor);
		delayTestFinish(ASYNC_DELAY_MS);
	}
	
	public void testValueOf() {
		boolean sensor = false;
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.WEATHER);
		LoadApi.go(new Runnable() {
			public void run() {
				
				for(WindSpeedUnit windUnit : WindSpeedUnit.values()) {			
					assertEquals(windUnit, WindSpeedUnit.valueOf(windUnit.toString()));
				}
				
				finishTest();
			}
		}, loadLibraries, sensor);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	protected void reverseEngineerValues() {
		
		for(WindSpeedUnit windUnit : WindSpeedUnit.values()) {			
			String expected = reverseEngineer( windUnit.toString() );
			assertEquals(expected, windUnit.value());
		}
	}

	private native String reverseEngineer(String type) /*-{
		return $wnd.google.maps.weather.WindSpeedUnit.valueOf()[type];
	}-*/;


}
