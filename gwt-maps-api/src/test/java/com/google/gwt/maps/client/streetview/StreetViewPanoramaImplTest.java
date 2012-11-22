package com.google.gwt.maps.client.streetview;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class StreetViewPanoramaImplTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				LatLng position = LatLng.newInstance(21.271525, -157.822731);

				StreetViewPov pov = StreetViewPov.newInstance();
				pov.setHeading(250);
				pov.setZoom(1);
				pov.setPitch(10);

				StreetViewPanoramaOptions options = StreetViewPanoramaOptions
						.newInstance();
				options.setPosition(position);
				options.setStreeViewPov(pov);

				FlowPanel fp = new FlowPanel();
				RootPanel.get().add(fp);
				StreetViewPanoramaImpl wStreet = StreetViewPanoramaImpl
						.newInstance(fp.getElement(), options);

				finishTest();
			}
		});

	}

}
