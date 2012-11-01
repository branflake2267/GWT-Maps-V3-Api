package com.google.gwt.maps.client.service;

import java.util.ArrayList;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.services.DirectionsStep;
import com.google.gwt.maps.client.services.Distance;
import com.google.gwt.maps.client.services.Duration;
import com.google.gwt.maps.client.services.TravelMode;

public class DirectionsStepTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsStep o = DirectionsStep.newInstance();
				finishTest();
			}
		});
	}

	public void testDistance() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsStep o = DirectionsStep.newInstance();
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
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.PLACES);
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsStep o = DirectionsStep.newInstance();
				Duration left = Duration.newInstance();
				left.setText("test");
				o.setDuration(left);
				Duration right = o.getDuration();
				assertEquals(left.getText(), right.getText());
				finishTest();
			}
		});
	}

	public void testEndLocation() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsStep o = DirectionsStep.newInstance();
				LatLng left = LatLng.newInstance(25, 26);
				o.setEnd_Location(left);
				LatLng right = o.getEnd_Location();
				assertEquals(left.getToString(), right.getToString());
				finishTest();
			}
		});
	}

	public void testInstructions() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsStep o = DirectionsStep.newInstance();
				String left = "test";
				o.setInstructions(left);
				String right = o.getInstructions();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testPath() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsStep o = DirectionsStep.newInstance();
				LatLng[] a = new LatLng[3];
				a[0] = LatLng.newInstance(25, 26);
				a[1] = LatLng.newInstance(26, 27);
				a[1] = LatLng.newInstance(28, 29);
				JsArray<LatLng> left = ArrayHelper.toJsArray(a);
				o.setPath(left);
				JsArray<LatLng> right = o.getPath();
				assertEquals(left.length(), right.length());
				finishTest();
			}
		});
	}

	public void testStartLocation() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsStep o = DirectionsStep.newInstance();
				LatLng left = LatLng.newInstance(25, 26);
				o.setStart_Location(left);
				LatLng right = o.getStart_Location();
				assertEquals(left.getToString(), right.getToString());
				finishTest();
			}
		});
	}

	public void testTravelMode() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsStep o = DirectionsStep.newInstance();
				TravelMode left = TravelMode.BICYCLING;
				o.setTravel_Mode(left);
				TravelMode right = o.getTravelMode();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

}
