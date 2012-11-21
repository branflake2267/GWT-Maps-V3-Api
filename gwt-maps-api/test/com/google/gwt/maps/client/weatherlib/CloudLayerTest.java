package com.google.gwt.maps.client.weatherlib;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.user.client.ui.RootPanel;

public class CloudLayerTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.WEATHER };
	}

	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				CloudLayer o = CloudLayer.newInstance();
				assertNotNull("CloudLayer should have been created.", o);

				finishTest();
			}
		});

	}

	public void testCloudLayer() {

		asyncLibTest(new Runnable() {
			@Override
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
		});

	}
}
