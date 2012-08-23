package com.google.gwt.maps.client.weatherlib;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.weatherlib.CloudLayer;
import com.google.gwt.user.client.ui.RootPanel;

public class CloudLayerTest extends GWTTestCase {

	public static final int ASYNC_DELAY_MS = 5000;

	public String getModuleName() {
		return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
	}

	public void testUse() {
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.WEATHER);
		LoadApi.go(new Runnable() {
			public void run() {
				CloudLayer o = CloudLayer.newInstance();
				assertNotNull("CloudLayer should have been created.",o);
				
				finishTest();
			}
		}, loadLibraries, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testCloudLayer() {
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.WEATHER);  
		LoadApi.go(new Runnable() {
			public void run() {
				MapOptions options = MapOptions.newInstance();
				MapWidget mapWidget = new MapWidget(options);
				mapWidget.setSize("500px", "500px");
				RootPanel.get().add(mapWidget);

				CloudLayer o = CloudLayer.newInstance();

				// test getting null map
				assertNull(o.getMap());

				o.setMap(mapWidget);
				MapWidget right = o.getMap();

				assertEquals(mapWidget.getCenter().getToString(), right
						.getCenter().getToString());

				// test clearing from map
				o.setMap(null);
				assertNull(o.getMap());

				finishTest();
			}
		}, loadLibraries, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}
}
