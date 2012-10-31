package com.google.gwt.maps.client.service;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.services.DirectionsRequest;
import com.google.gwt.maps.client.services.DirectionsWaypoint;
import com.google.gwt.maps.client.services.TravelMode;
import com.google.gwt.maps.client.services.UnitSystem;

public class DirectionsRequestTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsRequest o = DirectionsRequest.newInstance();
				finishTest();
			}
		});
	}

	public void testAvoidHighways() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsRequest o = DirectionsRequest.newInstance();
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
				DirectionsRequest o = DirectionsRequest.newInstance();
				boolean left = true;
				o.setAvoidTolls(left);
				boolean right = o.getAvoidTolls();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testAvoidDest1() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsRequest o = DirectionsRequest.newInstance();
				String left = "test";
				o.setDestination(left);
				String right = o.getDestination_String();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testAvoidDest2() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsRequest o = DirectionsRequest.newInstance();
				LatLng left = LatLng.newInstance(25, 26);
				o.setDestination(left);
				LatLng right = o.getDestination_LatLng();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testOptimizedWaypoints() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsRequest o = DirectionsRequest.newInstance();
				boolean left = true;
				o.setOptimizeWaypoints(left);
				boolean right = o.getOptimizeWaypoints();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testOrigin1() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsRequest o = DirectionsRequest.newInstance();
				String left = "test";
				o.setOrigin(left);
				String right = o.getOrigin_String();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testOrigin2() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsRequest o = DirectionsRequest.newInstance();
				LatLng left = LatLng.newInstance(25, 26);
				o.setOrigin(left);
				LatLng right = o.getOrigin_LatLng();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testProvideRA() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsRequest o = DirectionsRequest.newInstance();
				boolean left = true;
				o.setProvideRouteAlternatives(left);
				boolean right = o.getProvideRouteAlternatives();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testRegion() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsRequest o = DirectionsRequest.newInstance();
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
				DirectionsRequest o = DirectionsRequest.newInstance();
				TravelMode left = TravelMode.BICYCLING;
				o.setTravelMode(left);
				TravelMode right = o.getTravelMode();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testUnitSystem() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsRequest o = DirectionsRequest.newInstance();
				UnitSystem left = UnitSystem.METRIC;
				o.setUnitSystem(left);
				UnitSystem right = o.getUnitSystem();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testWaypoint() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsRequest o = DirectionsRequest.newInstance();
				DirectionsWaypoint[] a = new DirectionsWaypoint[3];
				a[0] = DirectionsWaypoint.newInstance();
				a[1] = DirectionsWaypoint.newInstance();
				a[2] = DirectionsWaypoint.newInstance();
				JsArray<DirectionsWaypoint> left = ArrayHelper.toJsArray(a);
				o.setWaypoints(left);
				JsArray<DirectionsWaypoint> right = o.getWaypoints();
				assertEquals(left.length(), right.length());
				finishTest();
			}
		});
	}
}
