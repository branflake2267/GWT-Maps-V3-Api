package com.google.gwt.maps.client.service;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.services.DirectionsLeg;
import com.google.gwt.maps.client.services.DirectionsStep;
import com.google.gwt.maps.client.services.Distance;
import com.google.gwt.maps.client.services.Duration;

public class DirectionsLegTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsLeg o = DirectionsLeg.newInstance();
				finishTest();
			}
		});
	}

	public void testDistance() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsLeg o = DirectionsLeg.newInstance();
				Distance left = Distance.newInstance();
				left.setText("test");
				o.setDistance(left);
				Distance right = o.getDistance();
				assertEquals(left.getText(), right.getText());
				finishTest();
			}
		});
	}

	public void testDuration() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsLeg o = DirectionsLeg.newInstance();
				Duration left = Duration.newInstance();
				left.setText("test");
				o.setDuration(left);
				Duration right = o.getDuration();
				assertEquals(left.getText(), right.getText());
				finishTest();
			}
		});
	}

	public void testEnd_Address() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsLeg o = DirectionsLeg.newInstance();
				String left = "test";
				o.setEnd_Address(left);
				String right = o.getEnd_Address();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testEnd_Location() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsLeg o = DirectionsLeg.newInstance();
				LatLng left = LatLng.newInstance(25, 26);
				o.setEnd_Location(left);
				LatLng right = o.getEnd_Location();
				assertEquals(left.getToString(), right.getToString());
				finishTest();
			}
		});
	}

	public void testStart_Address() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsLeg o = DirectionsLeg.newInstance();
				String left = "test";
				o.setStart_Address(left);
				String right = o.getStart_Address();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testStart_Location() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsLeg o = DirectionsLeg.newInstance();
				LatLng left = LatLng.newInstance(25, 26);
				o.setStart_Location(left);
				LatLng right = o.getStart_Location();
				assertEquals(left.getToString(), right.getToString());
				finishTest();
			}
		});
	}

	public void testSteps() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsLeg o = DirectionsLeg.newInstance();
				DirectionsStep[] a = new DirectionsStep[3];
				a[0] = DirectionsStep.newInstance();
				a[1] = DirectionsStep.newInstance();
				a[2] = DirectionsStep.newInstance();
				JsArray<DirectionsStep> left = ArrayHelper.toJsArray(a);
				o.setSteps(left);
				JsArray<DirectionsStep> right = o.getSteps();
				assertEquals(left.length(), right.length());
				finishTest();
			}
		});
	}

	public void testVia() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsLeg o = DirectionsLeg.newInstance();
				LatLng[] a = new LatLng[3];
				a[0] = LatLng.newInstance(25, 26);
				a[1] = LatLng.newInstance(27, 28);
				a[2] = LatLng.newInstance(29, 30);
				JsArray<LatLng> left = ArrayHelper.toJsArray(a);
				o.setVia_Waypoints(left);
				JsArray<LatLng> right = o.getVia_Waypoints();
				assertEquals(left.length(), right.length());
				finishTest();
			}
		});
	}

}
