package com.google.gwt.maps.client.maptype;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.maptypes.MapTypeStyler;

public class MapTypeStylerTest extends GWTTestCase {

	public static final int ASYNC_DELAY_MS = 5000;

	@Override
	public String getModuleName() {
		return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
	}

	public void testWorks() {
		assertEquals(true, true);
	}

	@SuppressWarnings("unused")
	public void testUse() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapTypeStyler options = MapTypeStyler.newGammaStyler(44.4);

				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testGamma() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				double left = 0.01f;
				MapTypeStyler options = MapTypeStyler.newGammaStyler(left);

				double right = options.getGamma();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testHue() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				String left = "#ff0000";
				MapTypeStyler options = MapTypeStyler.newHueStyler(left);
				
				String right = options.getHue();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testInvertLightness() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				boolean left = true;
				MapTypeStyler options = MapTypeStyler.newInvertLightnessStyler(left);

				boolean right = options.getInvertLightness();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testLightness() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				int left = -10;
				MapTypeStyler options = MapTypeStyler.newLightnessStyler(left);

				int right = options.getLightness();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testSaturation() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				int left = -20;
				MapTypeStyler options = MapTypeStyler.newSaturationStyler(left);

				int right = options.getSaturation();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testVisibility() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				String left = "simplifed";
				MapTypeStyler options = MapTypeStyler.newVisibilityStyler(left);

				String right = options.getVisibility();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

}
