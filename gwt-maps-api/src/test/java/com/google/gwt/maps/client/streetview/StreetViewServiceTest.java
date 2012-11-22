package com.google.gwt.maps.client.streetview;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * 
 * See <a href=
 * "https://developers.google.com/maps/documentation/javascript/streetview"
 * >StreetView API Doc</a>
 */
public class StreetViewServiceTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.ADSENSE, LoadLibrary.DRAWING,
				LoadLibrary.GEOMETRY, LoadLibrary.PANORAMIO, LoadLibrary.PLACES };
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				final StreetViewService service = StreetViewService
						.newInstnace();

				LatLng position = LatLng.newInstance(21.271525, -157.822731);

				StreetViewPov pov = StreetViewPov.newInstance();
				pov.setHeading(250);
				pov.setZoom(1);
				pov.setPitch(10);

				StreetViewPanoramaOptions options = StreetViewPanoramaOptions
						.newInstance();
				options.setPosition(position);
				options.setStreeViewPov(pov);

				final StreetViewPanoramaWidget wStreetPano = new StreetViewPanoramaWidget(
						options);
				RootPanel.get().add(wStreetPano);
				wStreetPano.setSize("375px", "500px");

				Timer t = new Timer() {
					@Override
					public void run() {
						String pano = wStreetPano.getPano();

						// TODO this will have to be a selenium test.
						// assertNotNull(pano);

						// service.getPanoramaById(pano, new PanoramaIdHandler()
						// {
						// public void onCallback(StreetViewPanoramaData data,
						// StreetViewStatus status) {
						// LatLng latlng = wStreetPano.getPosition();
						//
						// assertEquals(StreetViewStatus.OK, status);
						// assertNotNull(data);
						//
						// finishTest();
						// }
						// });
						finishTest();
					}
				};
				t.schedule(1500);

			}
		});

	}

	// public void testUse2() {
	// asyncLibTest(new Runnable() {
	// public void run() {
	//
	// final StreetViewService service = StreetViewService.newInstnace();
	//
	// LatLng position = LatLng.newInstance(21.271525, -157.822731);
	//
	// StreetViewPov pov = StreetViewPov.newInstance();
	// pov.setHeading(250);
	// pov.setZoom(1);
	// pov.setPitch(10);
	//
	// StreetViewPanoramaOptions options =
	// StreetViewPanoramaOptions.newInstance();
	// options.setPosition(position);
	// options.setStreeViewPov(pov);
	//
	// final StreetViewPanoramaWidget wStreetPano = new
	// StreetViewPanoramaWidget(options);
	// RootPanel.get().add(wStreetPano);
	// wStreetPano.setSize("375px", "500px");
	//
	//
	//
	// }
	// }, false);

	// }
}
