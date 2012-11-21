package com.google.gwt.maps.client.streetview;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class StreetViewLinkTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewLink o = StreetViewLink.newInstance();
				finishTest();
			}
		});

	}

	public void testDescription() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewLink o = StreetViewLink.newInstance();
				String left = "test";
				o.setDescription(left);
				String right = o.getDescription();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testHeading() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewLink o = StreetViewLink.newInstance();
				int left = 11;
				o.setHeading(left);
				int right = o.getHeading();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testPano() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewLink o = StreetViewLink.newInstance();
				String left = "test";
				o.setPano(left);
				String right = o.getPano();
				assertEquals(left, right);
				finishTest();
			}
		});

	}
}
