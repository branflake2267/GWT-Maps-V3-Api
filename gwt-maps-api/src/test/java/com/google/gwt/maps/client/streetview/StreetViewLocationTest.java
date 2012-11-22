package com.google.gwt.maps.client.streetview;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;

public class StreetViewLocationTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewLocation o = StreetViewLocation.newInstance();
				finishTest();
			}
		});

	}

	public void testDescription() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewLocation o = StreetViewLocation.newInstance();
				String left = "desc";
				o.setDescription(left);
				String right = o.getDescription();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testLatLng() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewLocation o = StreetViewLocation.newInstance();
				LatLng left = LatLng.newInstance(38d, 35d);
				o.setLatLng(left);
				LatLng right = o.getLatLng();
				assertEquals(left.getToString(), right.getToString());
				finishTest();
			}
		});

	}

	public void testPanon() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewLocation o = StreetViewLocation.newInstance();
				String left = "pano";
				o.setPano(left);
				String right = o.getPano();
				assertEquals(left, right);
				finishTest();
			}
		});

	}
}
