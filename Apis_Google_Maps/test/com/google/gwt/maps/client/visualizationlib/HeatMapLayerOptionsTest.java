package com.google.gwt.maps.client.visualizationlib;

import java.util.ArrayList;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.mvc.MVCArray;
import com.google.gwt.maps.client.testutil.AbstractTest;
import com.google.gwt.user.client.ui.RootPanel;

public class HeatMapLayerOptionsTest extends AbstractTest {

	public void testUse() {
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.VISUALIZATION);
		LoadApi.go(new Runnable() {
			public void run() {

				HeatMapLayerOptions options = HeatMapLayerOptions.newInstance();
				@SuppressWarnings("unused")
				HeatMapLayer layer = HeatMapLayer.newInstance(options);
				finishTest();
			}
		}, loadLibraries, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testGetSetMap() {
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.VISUALIZATION);
		LoadApi.go(new Runnable() {
			public void run() {
				HeatMapLayerOptions options = HeatMapLayerOptions.newInstance();
				assertNotNull(options);

				// getting/setting map
				MapOptions mapOptions = MapOptions.newInstance();
				mapOptions.setMapTypeId(MapTypeId.TERRAIN);
				MapWidget mapWidget = new MapWidget(mapOptions);
				mapWidget.setSize("500px", "500px");
				RootPanel.get().add(mapWidget);

				assertNull(options.getMap());

				options.setMap(mapWidget);
				MapWidget actual = options.getMap();
				assertEquals(mapWidget.getMapTypeId(), actual.getMapTypeId());

				options.setMap(null);
				assertNull(options.getMap());
				finishTest();
			}
		}, loadLibraries, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testGetSetData() {
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.VISUALIZATION);
		LoadApi.go(new Runnable() {
			public void run() {
				HeatMapLayerOptions options = HeatMapLayerOptions.newInstance();
				assertNotNull(options);

				// getting/setting data

				assertNull(options.getData());

				MVCArray<LatLng> expected = HeatMapLayerTest.getMVCLatLngData();
				options.setData(expected);

				// test set
				MVCArray<LatLng> actual = options.getData();
				assertEquals(expected.getLength(), actual.getLength());
				assertEquals(expected.get(0).toString(), actual.get(0)
						.toString());

				// test clear
				MVCArray<LatLng> emptySet = MVCArray.newInstance();
				options.setData(emptySet);
				actual = options.getData();
				assertEquals(0, actual.getLength());

				finishTest();
			}
		}, loadLibraries, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testGetSetOthers() {
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.VISUALIZATION);
		LoadApi.go(new Runnable() {
			public void run() {
				HeatMapLayerOptions options = HeatMapLayerOptions.newInstance();
				assertNotNull(options);

				// dissipating
				// assertFalse(options.getDissipating());
				boolean expected = true;
				options.setDissipating(expected);
				assertEquals(expected, options.getDissipating());

				// gradient
				assertNull(options.getGradient());
				String[] colors = new String[] { "red", "blue", "orange",
						"green" };
				JsArrayString expectedGradient = ArrayHelper.toJsArrayString(colors);
				options.setGradient(expectedGradient);
				assertEquals(expectedGradient, options.getGradient());
				
				// maxIntensity
				// assertNotNull(options.getMaxIntensity());
				double expectedMax = 554.45d;
				options.setMaxIntensity(expectedMax);
				assertEquals(expectedMax, options.getMaxIntensity());

				// opacity
				assertEquals(0.6d, options.getOpacity());
				double expectedOpacity = 0.45d;
				options.setOpacity(expectedOpacity);
				assertEquals(expectedOpacity, options.getOpacity());

				// radius
				// assertNotNull(options.getRadius());
				double expectedRadius = 0.45d;
				options.setRadius(expectedRadius);
				assertEquals(expectedRadius, options.getRadius());

				finishTest();
			}
		}, loadLibraries, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}
}
