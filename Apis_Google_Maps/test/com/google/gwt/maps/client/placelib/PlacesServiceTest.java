package com.google.gwt.maps.client.placelib;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.placeslib.PlaceDetailsHandler;
import com.google.gwt.maps.client.placeslib.PlaceDetailsRequest;
import com.google.gwt.maps.client.placeslib.PlaceResult;
import com.google.gwt.maps.client.placeslib.PlaceSearchHandler;
import com.google.gwt.maps.client.placeslib.PlaceSearchRequest;
import com.google.gwt.maps.client.placeslib.PlacesService;
import com.google.gwt.maps.client.placeslib.PlacesServiceStatus;
import com.google.gwt.maps.client.services.GeocoderAddressComponent;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class PlacesServiceTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FlowPanel fp = new FlowPanel();
				RootPanel.get().add(fp);

				MapOptions options = MapOptions.newInstance();
				MapWidget mapWidget = new MapWidget(options);
				RootPanel.get().add(mapWidget);
				mapWidget.setSize("500px", "500px");

				PlacesService o = PlacesService.newInstance(mapWidget);

				Element htmlDivElement = fp.getElement();
				PlacesService o1 = PlacesService.newInstance(htmlDivElement);

				finishTest();
			}
		});
	}

	/**
	 * TODO add some more tests
	 */
	@SuppressWarnings("unused")
	public void testDetails1() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FlowPanel fp = new FlowPanel();
				RootPanel.get().add(fp);

				MapOptions options = MapOptions.newInstance();
				MapWidget mapWidget = new MapWidget(options);
				RootPanel.get().add(mapWidget);
				mapWidget.setSize("500px", "500px");

				PlacesService o = PlacesService.newInstance(mapWidget);

				String reference = "CnRkAAAAGnBVNFDeQoOQHzgdOpOqJNV7K9-c5IQrWFUYD9TNhUmz5-aHhfqyKH0zmAcUlkqVCrpaKcV8ZjGQKzB6GXxtzUYcP-muHafGsmW-1CwjTPBCmK43AZpAwW0FRtQDQADj3H2bzwwHVIXlQAiccm7r4xIQmjt_Oqm2FejWpBxLWs3L_RoUbharABi5FMnKnzmRL2TGju6UA4k";
				PlaceDetailsRequest request = PlaceDetailsRequest.newInstance();
				request.setReference(reference);

				o.getDetails(request, new PlaceDetailsHandler() {
					@Override
					public void onCallback(PlaceResult result,
							PlacesServiceStatus status) {

						System.out.println("status=" + status.toString());

						if (status == PlacesServiceStatus.OK) {
							System.out.println("OK");

							String address = result.getFormatted_Address();
							JsArray<GeocoderAddressComponent> addressComp = result
									.getAddress_Components();
							String name = result.getName();

							System.out.println("source=" + result.toSource());

							assertTrue(true);

						} else if (status == PlacesServiceStatus.INVALID_REQUEST) {
							System.out.println("INVALID_REQUEST");
							fail();

						} else if (status == PlacesServiceStatus.OVER_QUERY_LIMIT) {
							System.out.println("OVER_QUERY_LIMIT");
							fail();

						} else if (status == PlacesServiceStatus.REQUEST_DENIED) {
							System.out.println("REQUEST_DENIED");
							fail();

						} else if (status == PlacesServiceStatus.UNKNOWN_ERROR) {
							System.out.println("UNKNOWN_ERROR");
							fail();

						} else if (status == PlacesServiceStatus.ZERO_RESULTS) {
							System.out.println("ZERO_RESULTS");
							assertTrue(true);

						}

						finishTest();
					}
				});

			}
		});
	}

	/**
	 * TODO add some more tests
	 */
	public void testSearch() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FlowPanel fp = new FlowPanel();
				RootPanel.get().add(fp);

				MapOptions options = MapOptions.newInstance();
				MapWidget mapWidget = new MapWidget(options);
				RootPanel.get().add(mapWidget);
				mapWidget.setSize("500px", "500px");

				PlacesService placeService = PlacesService
						.newInstance(mapWidget);

				PlaceSearchRequest request = PlaceSearchRequest.newInstance();
				request.setName("Seattle");
				request.setBounds(mapWidget.getBounds());
				// request.setLocation(LatLng.newInstance(47.6107, -122.3348));

				placeService.search(request, new PlaceSearchHandler() {
					@Override
					public void onCallback(JsArray<PlaceResult> results,
							PlacesServiceStatus status) {
						System.out.println("status=" + status.toString());

						if (status == PlacesServiceStatus.OK) {
							System.out.println("OK");
							assertTrue(true);

						} else if (status == PlacesServiceStatus.INVALID_REQUEST) {
							System.out.println("INVALID_REQUEST");
							fail();

						} else if (status == PlacesServiceStatus.OVER_QUERY_LIMIT) {
							System.out.println("OVER_QUERY_LIMIT");
							fail();

						} else if (status == PlacesServiceStatus.REQUEST_DENIED) {
							System.out.println("REQUEST_DENIED");
							fail();

						} else if (status == PlacesServiceStatus.UNKNOWN_ERROR) {
							System.out.println("UNKNOWN_ERROR");
							fail();

						} else if (status == PlacesServiceStatus.ZERO_RESULTS) {
							System.out.println("ZERO_RESULTS");
							assertTrue(true);
						}

						finishTest();
					}
				});

			}
		});
	}
}
