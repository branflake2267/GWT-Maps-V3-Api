package com.google.gwt.maps.client.service;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.services.GeocoderLocationType;

public class GeocoderLocationTypeTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	public void testUse1() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				GeocoderLocationType o = GeocoderLocationType.APPROXIMATE;
				assertEquals("approximate", o.value());
				assertEquals(GeocoderLocationType.APPROXIMATE,
						GeocoderLocationType.fromValue("approximate"));
				finishTest();
			}
		});
	}

	public void testUse2() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				GeocoderLocationType o = GeocoderLocationType.GEOMETRIC_CENTER;
				assertEquals("geometric_center", o.value());
				assertEquals(GeocoderLocationType.GEOMETRIC_CENTER,
						GeocoderLocationType.fromValue("geometric_center"));
				finishTest();
			}
		});
	}

	public void testUse3() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				GeocoderLocationType o = GeocoderLocationType.RANGE_INTERPOLATED;
				assertEquals("range_interpolated", o.value());
				assertEquals(GeocoderLocationType.RANGE_INTERPOLATED,
						GeocoderLocationType.fromValue("range_interpolated"));
				finishTest();
			}
		});
	}

	public void testUse4() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				GeocoderLocationType o = GeocoderLocationType.ROOFTOP;
				assertEquals("rooftop", o.value());
				assertEquals(GeocoderLocationType.ROOFTOP,
						GeocoderLocationType.fromValue("rooftop"));
				finishTest();
			}
		});
	}

}
