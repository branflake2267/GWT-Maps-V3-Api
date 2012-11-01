package com.google.gwt.maps.client.maptype;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.controls.MapTypeStyle;
import com.google.gwt.maps.client.maptypes.MapTypeStyleElementType;
import com.google.gwt.maps.client.maptypes.MapTypeStyleFeatureType;
import com.google.gwt.maps.client.maptypes.MapTypeStyler;

public class MapTypeStyleTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapTypeStyle options = MapTypeStyle.newInstance();
				finishTest();
			}
		});

	}

	public void testElementType() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapTypeStyle options = MapTypeStyle.newInstance();
				MapTypeStyleElementType left = MapTypeStyleElementType.GEOMETRY;
				options.setElementType(left);
				MapTypeStyleElementType right = options.getElementType();
				assertEquals(left.value(), right.value());
				finishTest();
			}
		});

	}

	public void testElementTypes() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapTypeStyle options = MapTypeStyle.newInstance();
				MapTypeStyleElementType[] values = MapTypeStyleElementType
						.values();
				for (int i = 0; i < values.length; i++) {
					MapTypeStyleElementType left = values[i];
					options.setElementType(left);
					MapTypeStyleElementType right = options.getElementType();
					assertEquals(left, right);
				}
				finishTest();
			}
		});

	}

	public void testFeatureType() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapTypeStyle options = MapTypeStyle.newInstance();
				MapTypeStyleFeatureType left = MapTypeStyleFeatureType.ADMINISTRATIVE__LOCALITY;
				options.setFeatureType(left);
				MapTypeStyleFeatureType right = options.getFeatureType();
				assertEquals(left.value(), right.value());
				finishTest();
			}
		});

	}

	public void testFeatureTypes() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapTypeStyle options = MapTypeStyle.newInstance();
				MapTypeStyleFeatureType[] values = MapTypeStyleFeatureType
						.values();
				for (int i = 0; i < values.length; i++) {
					MapTypeStyleFeatureType left = values[i];
					options.setFeatureType(left);
					MapTypeStyleFeatureType right = options.getFeatureType();
					assertEquals(left, right);
				}
				finishTest();
			}
		});

	}

	public void testStylers() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapTypeStyle options = MapTypeStyle.newInstance();
				MapTypeStyler[] left = new MapTypeStyler[] {
						MapTypeStyler.newHueStyler("#ffff00"),
						MapTypeStyler.newInvertLightnessStyler(false),
						MapTypeStyler.newSaturationStyler(75),
						MapTypeStyler.newVisibilityStyler("on"),
						MapTypeStyler.newGammaStyler(0.01d),
						MapTypeStyler.newLightnessStyler(1) };

				options.setStylers(left);
				MapTypeStyler[] right = options.getStylers();

				assertEquals(left[0].getHue(), right[0].getHue());
				assertEquals(left[1].getInvertLightness(),
						right[1].getInvertLightness());
				assertEquals(left[2].getSaturation(), right[2].getSaturation());
				assertEquals(left[3].getVisibility(), right[3].getVisibility());
				assertEquals(left[4].getGamma(), right[4].getGamma());
				assertEquals(left[5].getLightness(), right[5].getLightness());

				finishTest();
			}
		});

	}

}
