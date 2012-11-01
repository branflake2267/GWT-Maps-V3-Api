package com.google.gwt.maps.client.streetview;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class StreetViewPovTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewPov o = StreetViewPov.newInstance();
				finishTest();
			}
		});

	}

	public void testHeading() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewPov o = StreetViewPov.newInstance();
				int left = 10;
				o.setHeading(left);
				int right = o.getHeading();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testPitch() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewPov o = StreetViewPov.newInstance();
				int left = 12;
				o.setPitch(left);
				int right = o.getPitch();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testZoom() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewPov o = StreetViewPov.newInstance();
				int left = 12;
				o.setZoom(left);
				int right = o.getZoom();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

}
