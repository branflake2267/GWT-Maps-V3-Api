package com.google.gwt.maps.client.controls;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class ScaleControlStyleTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testEnum1() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ScaleControlStyle type = ScaleControlStyle.DEFAULT;
				String left = "DEFAULT";
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
				ScaleControlStyle type = ScaleControlStyle.DEFAULT;
				finishTest();
			}
		});

	}

}
