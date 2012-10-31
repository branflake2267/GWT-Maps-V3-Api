package com.google.gwt.maps.client.service;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.services.DistanceMatrixRequest;
import com.google.gwt.maps.client.services.TravelMode;
import com.google.gwt.maps.client.services.UnitSystem;

public class DistanceMatrixRequestTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DistanceMatrixRequest o = DistanceMatrixRequest.newInstance();
				finishTest();
			}
		});
	}

	public void testAvoidHighways() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DistanceMatrixRequest o = DistanceMatrixRequest.newInstance();
				boolean left = true;
				o.setAvoidHighways(left);
				boolean right = o.getAvoidHighways();
				assertEquals(left, right);

				finishTest();
			}
		});
	}

	public void testAvoidTolls() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DistanceMatrixRequest o = DistanceMatrixRequest.newInstance();
				boolean left = true;
				o.setAvoidTolls(left);
				boolean right = o.getAvoidTolls();
				assertEquals(left, right);

				finishTest();
			}
		});
	}

	public void testDesinations1() {

		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DistanceMatrixRequest o = DistanceMatrixRequest.newInstance();
				String[] a = new String[3];
				a[0] = "a";
				a[1] = "b";
				a[2] = "c";
				JsArrayString left = ArrayHelper.toJsArrayString(a);
				o.setDestinations(left);
				JsArray<LatLng> right = o.getDestinations();
				assertEquals(left.length(), right.length());

				finishTest();
			}
		});
	}

	public void testDesinations2() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DistanceMatrixRequest o = DistanceMatrixRequest.newInstance();
				LatLng[] a = new LatLng[3];
				a[0] = LatLng.newInstance(25, 26);
				a[1] = LatLng.newInstance(28, 27);
				a[2] = LatLng.newInstance(29, 25);
				JsArray<LatLng> left = ArrayHelper.toJsArray(a);
				o.setDestinations(left);
				JsArray<LatLng> right = o.getDestinations();
				assertEquals(left.length(), right.length());
			}
		});
	}

	public void testOrigins1() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DistanceMatrixRequest o = DistanceMatrixRequest.newInstance();
				String[] a = new String[3];
				a[0] = "a";
				a[1] = "b";
				a[2] = "c";
				JsArrayString left = ArrayHelper.toJsArrayString(a);
				o.setOrigins(left);
				JsArray<LatLng> right = o.getOrigins();
				assertEquals(left.length(), right.length());

				finishTest();
			}
		});
	}

	public void testOrigins2() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DistanceMatrixRequest o = DistanceMatrixRequest.newInstance();
				LatLng[] a = new LatLng[3];
				a[0] = LatLng.newInstance(25, 26);
				a[1] = LatLng.newInstance(28, 27);
				a[2] = LatLng.newInstance(29, 25);
				JsArray<LatLng> left = ArrayHelper.toJsArray(a);
				o.setOrigins(left);
				JsArray<LatLng> right = o.getOrigins();
				assertEquals(left.length(), right.length());

				finishTest();
			}
		});
	}

	public void tesRegion() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DistanceMatrixRequest o = DistanceMatrixRequest.newInstance();
				String left = "test";
				o.setRegion(left);
				String right = o.getRegion();
				assertEquals(left, right);

				finishTest();
			}
		});
	}

	public void testTravelMode() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DistanceMatrixRequest o = DistanceMatrixRequest.newInstance();
				TravelMode left = TravelMode.BICYCLING;
				o.setTravelMode(left);
				TravelMode right = o.getTravelMode();
				assertEquals(left.value(), right.value());

				finishTest();
			}
		});
	}

	public void testUnitSystem() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DistanceMatrixRequest o = DistanceMatrixRequest.newInstance();
				UnitSystem left = UnitSystem.IMPERIAL;
				o.setUnitSystem(left);
				UnitSystem right = o.getUnitSystem();
				assertEquals(left, right);

				finishTest();
			}
		});
	}
}
