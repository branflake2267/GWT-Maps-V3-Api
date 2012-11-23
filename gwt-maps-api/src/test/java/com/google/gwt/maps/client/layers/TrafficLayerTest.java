package com.google.gwt.maps.client.layers;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * 
 * <br>
 * <br>
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/layers.html#KMLLayers"
 * >KMLLayers API Doc</a>
 */
public class TrafficLayerTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				TrafficLayer o = TrafficLayer.newInstance();
				finishTest();
			}
		});

	}

	public void testUse2() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				LatLng center = LatLng.newInstance(49.496675, -102.65625);
				MapOptions opts = MapOptions.newInstance();
				opts.setZoom(4);
				opts.setCenter(center);
				opts.setMapTypeId(MapTypeId.ROADMAP);

				MapWidget mapWidget = new MapWidget(opts);
				RootPanel.get().add(mapWidget);
				mapWidget.setSize("500px", "500px");

				TrafficLayer o = TrafficLayer.newInstance();

				// test clearing from map
				o.setMap(null);
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
		});

	}
}
