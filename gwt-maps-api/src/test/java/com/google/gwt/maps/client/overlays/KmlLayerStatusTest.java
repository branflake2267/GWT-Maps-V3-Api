package com.google.gwt.maps.client.overlays;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.layers.KmlLayerStatus;

public class KmlLayerStatusTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] {};
	}

	public void testUse1() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				for (KmlLayerStatus status : KmlLayerStatus.values()) {
					assertEquals("value and from value should match", status,
							KmlLayerStatus.fromValue(status.value()));
				}

				finishTest();
			}
		});
	}
}
