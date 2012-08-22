package com.google.gwt.maps.client.weatherlib;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class TemperatureUnitTest extends GWTTestCase {

	public static final int ASYNC_DELAY_MS = 5000;

	public String getModuleName() {
		return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
	}

	public void testValueOf() {
		boolean sensor = false;
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.WEATHER);
		LoadApi.go(new Runnable() {
			public void run() {
				
				for(TemperatureUnit windUnit : TemperatureUnit.values()) {			
					assertEquals(windUnit, TemperatureUnit.valueOf(windUnit.toString()));
				}
				
				finishTest();
			}
		}, loadLibraries, sensor);
		delayTestFinish(ASYNC_DELAY_MS);
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

	protected void reverseEngineerValues() {
		
		for(TemperatureUnit tempUnit : TemperatureUnit.values()) {			
			String expected = reverseEngineer( tempUnit.toString() );
			assertEquals(expected, tempUnit.value());
		}
	}

	private native String reverseEngineer(String type) /*-{
		return $wnd.google.maps.weather.TemperatureUnit.valueOf()[type];
	}-*/;


}
