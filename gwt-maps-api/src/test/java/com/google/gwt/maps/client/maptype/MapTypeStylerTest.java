package com.google.gwt.maps.client.maptype;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.maptypes.MapTypeStyler;

public class MapTypeStylerTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapTypeStyler options = MapTypeStyler.newGammaStyler(44.4);

				finishTest();
			}
		});

	}

	public void testGamma() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				double left = 0.01f;
				MapTypeStyler options = MapTypeStyler.newGammaStyler(left);

				double right = options.getGamma();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testHue() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				String left = "#ff0000";
				MapTypeStyler options = MapTypeStyler.newHueStyler(left);

				String right = options.getHue();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testInvertLightness() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				boolean left = true;
				MapTypeStyler options = MapTypeStyler
						.newInvertLightnessStyler(left);

				boolean right = options.getInvertLightness();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testLightness() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				int left = -10;
				MapTypeStyler options = MapTypeStyler.newLightnessStyler(left);

				int right = options.getLightness();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testSaturation() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				int left = -20;
				MapTypeStyler options = MapTypeStyler.newSaturationStyler(left);

				int right = options.getSaturation();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testVisibility() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				String left = "simplifed";
				MapTypeStyler options = MapTypeStyler.newVisibilityStyler(left);

				String right = options.getVisibility();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

}
