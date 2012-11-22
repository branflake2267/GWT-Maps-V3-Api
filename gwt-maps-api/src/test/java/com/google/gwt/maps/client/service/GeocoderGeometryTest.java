package com.google.gwt.maps.client.service;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.services.GeocoderGeometry;
import com.google.gwt.maps.client.services.GeocoderLocationType;

public class GeocoderGeometryTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				GeocoderGeometry o = GeocoderGeometry.newInstance();
				finishTest();
			}
		});
	}

	public void testBounds() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				GeocoderGeometry o = GeocoderGeometry.newInstance();
				LatLng sw = LatLng.newInstance(-31.203405, 125.244141);
				LatLng ne = LatLng.newInstance(-25.363882, 131.044922);
				LatLngBounds left = LatLngBounds.newInstance(sw, ne);
				assertEquals(
						"((-31.203405, 125.24414100000001), (-25.363882, 131.04492200000004))",
						left.getToString());
				o.setBounds(left);
				LatLngBounds right = o.getBounds();
				assertEquals(left.getToString(), right.getToString());
				finishTest();
			}
		});
	}

	public void testLocation() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				GeocoderGeometry o = GeocoderGeometry.newInstance();
				LatLng left = LatLng.newInstance(25, 26);
				o.setLocation(left);
				LatLng right = o.getLocation();
				assertEquals(left.getToString(), right.getToString());
				finishTest();
			}
		});
	}

	public void testLocationType() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				GeocoderGeometry o = GeocoderGeometry.newInstance();
				GeocoderLocationType left = GeocoderLocationType.APPROXIMATE;
				o.setLocation_Type(left);
				GeocoderLocationType right = o.getLocation_Type();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testViewPort() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				GeocoderGeometry o = GeocoderGeometry.newInstance();
				LatLng sw = LatLng.newInstance(-31.203405, 125.244141);
				LatLng ne = LatLng.newInstance(-25.363882, 131.044922);
				LatLngBounds left = LatLngBounds.newInstance(sw, ne);
				assertEquals(
						"((-31.203405, 125.24414100000001), (-25.363882, 131.04492200000004))",
						left.getToString());
				o.setViewPort(left);
				LatLngBounds right = o.getViewPort();
				assertEquals(left.getToString(), right.getToString());
				finishTest();
			}
		});
	}
}
