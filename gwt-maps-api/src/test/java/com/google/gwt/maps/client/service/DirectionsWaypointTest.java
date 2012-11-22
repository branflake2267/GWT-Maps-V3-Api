package com.google.gwt.maps.client.service;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.services.DirectionsWaypoint;

public class DirectionsWaypointTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsWaypoint o = DirectionsWaypoint.newInstance();
				finishTest();
			}
		});
	}

	public void testLocation() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsWaypoint o = DirectionsWaypoint.newInstance();
				String left = "test";
				o.setLocation(left);
				String right = o.getLocation_String();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testLocaiton2() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsWaypoint o = DirectionsWaypoint.newInstance();
				LatLng left = LatLng.newInstance(25, 26);
				o.setLocation(left);
				LatLng right = o.getLocation_LatLng();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testStopover() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DirectionsWaypoint o = DirectionsWaypoint.newInstance();
				boolean left = true;
				o.setStopOver(left);
				boolean right = o.getStopOver();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

}
