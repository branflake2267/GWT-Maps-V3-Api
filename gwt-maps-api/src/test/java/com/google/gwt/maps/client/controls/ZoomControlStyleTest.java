package com.google.gwt.maps.client.controls;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class ZoomControlStyleTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testEnum1() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ZoomControlStyle type = ZoomControlStyle.DEFAULT;
				String left = "DEFAULT";
				String right = type.value();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testEnum2() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ZoomControlStyle type = ZoomControlStyle.LARGE;
				String left = "LARGE";
				String right = type.value();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testEnum3() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ZoomControlStyle type = ZoomControlStyle.SMALL;
				String left = "SMALL";
				String right = type.value();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ZoomControlStyle type = ZoomControlStyle.DEFAULT;
				finishTest();
			}
		});

	}

}
