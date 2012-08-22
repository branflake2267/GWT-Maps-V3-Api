package com.google.gwt.maps.client.layers;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/reference#TransitLayer"
 * >TransitLayer API Doc</a>
 */
public class TransitLayerTest extends GWTTestCase {

	public static final int ASYNC_DELAY_MS = 5000;

	public String getModuleName() {
		return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
	}

	public void testWorks() {
		assertEquals(true, true);
	}

	public void testLoadNewInstance() {
		LoadApi.go(new Runnable() {
			public void run() {
				@SuppressWarnings("unused")
				TransitLayer o = TransitLayer.newInstance();
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testLayerOnMap() {
		LoadApi.go(new Runnable() {
			public void run() {
				LatLng center = LatLng.newInstance(49.496675, -102.65625);
				MapOptions opts = MapOptions.newInstance();
				opts.setZoom(4);
				opts.setCenter(center);
				opts.setMapTypeId(MapTypeId.ROADMAP);

				MapWidget mapWidget = new MapWidget(opts);
				RootPanel.get().add(mapWidget);
				mapWidget.setSize("500px", "500px");

				TransitLayer o = TransitLayer.newInstance();

				// test clearing from map
				o.setMap(null);
				assertNull(o.getMap());

				o.setMap(mapWidget);
				MapWidget expected = o.getMap();
				assertEquals(mapWidget.getCenter().getToString(), expected
						.getCenter().getToString());

				// test clearing from map
				o.setMap(null);
				assertNull(o.getMap());

				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}
}
