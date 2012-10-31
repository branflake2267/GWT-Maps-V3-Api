package com.google.gwt.maps.client.panoramio;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Size;
import com.google.gwt.maps.client.events.panoramiomouse.PanoramioMouseMapEvent;
import com.google.gwt.maps.client.events.panoramiomouse.PanoramioMouseMapHandler;
import com.google.gwt.maps.client.panoramiolib.PanoramioFeature;
import com.google.gwt.maps.client.panoramiolib.PanoramioLayer;
import com.google.gwt.maps.client.panoramiolib.PanoramioLayerOptions;
import com.google.gwt.user.client.ui.RootPanel;

public class PanoramioLayerTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PANORAMIO };
	}

	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				MapOptions optionsMap = MapOptions.newInstance();
				MapWidget mapWidget = new MapWidget(optionsMap);
				RootPanel.get().add(mapWidget);
				mapWidget.setSize("500px", "500px");

				PanoramioLayerOptions optionsPano = PanoramioLayerOptions
						.newInstance();
				optionsPano.setClickable(true);
				optionsPano.setMap(mapWidget);
				optionsPano.setSuppressInfoWindows(false);
				optionsPano.setTag("hawaii");
				optionsPano.setUserId("2597317");
				PanoramioLayer pano = PanoramioLayer.newInstance(optionsPano);

				pano.addClickHandler(new PanoramioMouseMapHandler() {
					@Override
					@SuppressWarnings("unused")
					public void onEvent(PanoramioMouseMapEvent event) {
						PanoramioFeature feature = event.getFeatureDetails();
						String info = event.getInfoWindowHtml();
						LatLng latlng = event.getLatLng();
						Size pixeloffset = event.getPixelOffset();
					}
				});

				finishTest();
			}
		});
	}

	public void testMap() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				MapOptions optionsMap = MapOptions.newInstance();
				MapWidget mapWidget = new MapWidget(optionsMap);
				RootPanel.get().add(mapWidget);
				mapWidget.setSize("500px", "500px");

				PanoramioLayerOptions optionsPano = PanoramioLayerOptions
						.newInstance();
				optionsPano.setClickable(true);
				optionsPano.setMap(mapWidget);
				optionsPano.setSuppressInfoWindows(false);
				optionsPano.setTag("hawaii");
				optionsPano.setUserId("2597317");
				PanoramioLayer pano = PanoramioLayer.newInstance(optionsPano);

				MapWidget right = pano.getMap();
				assertEquals(mapWidget.getCenter().getToString(), right
						.getCenter().getToString());

				LatLng center = LatLng.newInstance(47.19, -121.51);
				mapWidget.setCenter(center);
				pano.setMap(mapWidget);

				MapWidget right2 = pano.getMap();
				assertEquals(mapWidget.getCenter().getToString(), right2
						.getCenter().getToString());

				finishTest();
			}
		});
	}

	public void testTag() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				MapOptions optionsMap = MapOptions.newInstance();
				MapWidget mapWidget = new MapWidget(optionsMap);
				RootPanel.get().add(mapWidget);
				mapWidget.setSize("500px", "500px");

				PanoramioLayerOptions optionsPano = PanoramioLayerOptions
						.newInstance();
				optionsPano.setClickable(true);
				optionsPano.setMap(mapWidget);
				optionsPano.setSuppressInfoWindows(false);
				optionsPano.setTag("hawaii");
				optionsPano.setUserId("2597317"); // 2597317?
				PanoramioLayer pano = PanoramioLayer.newInstance(optionsPano);

				String tag = pano.getTag();
				assertEquals("hawaii", tag);

				pano.setTag("france");
				assertEquals("france", pano.getTag());

				finishTest();
			}
		});
	}

	public void testUserId() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				MapOptions optionsMap = MapOptions.newInstance();
				MapWidget mapWidget = new MapWidget(optionsMap);
				RootPanel.get().add(mapWidget);
				mapWidget.setSize("500px", "500px");

				PanoramioLayerOptions optionsPano = PanoramioLayerOptions
						.newInstance();
				optionsPano.setClickable(true);
				optionsPano.setMap(mapWidget);
				optionsPano.setSuppressInfoWindows(false);
				optionsPano.setTag("hawaii");
				optionsPano.setUserId("2597317"); // 2597317?
				PanoramioLayer pano = PanoramioLayer.newInstance(optionsPano);

				String tag = pano.getUserId();
				assertEquals("2597317", tag);

				pano.setUserId("4128216");
				assertEquals("hawaii", pano.getTag());

				finishTest();
			}
		});
	}

	public void testOptions() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				MapOptions optionsMap = MapOptions.newInstance();
				MapWidget mapWidget = new MapWidget(optionsMap);
				RootPanel.get().add(mapWidget);
				mapWidget.setSize("500px", "500px");

				PanoramioLayerOptions optionsPano = PanoramioLayerOptions
						.newInstance();
				optionsPano.setClickable(true);
				optionsPano.setMap(mapWidget);
				optionsPano.setSuppressInfoWindows(false);
				optionsPano.setTag("hawaii");
				optionsPano.setUserId("2597317"); // 2597317?
				PanoramioLayer pano = PanoramioLayer.newInstance(optionsPano);

				pano.setOption(optionsPano);

				finishTest();
			}
		});
	}

}
