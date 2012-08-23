package com.google.gwt.maps.client.main;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.controls.ControlPosition;
import com.google.gwt.maps.client.controls.MapTypeControlOptions;
import com.google.gwt.maps.client.controls.MapTypeStyle;
import com.google.gwt.maps.client.controls.OverviewMapControlOptions;
import com.google.gwt.maps.client.controls.PanControlOptions;
import com.google.gwt.maps.client.controls.RotateControlOptions;
import com.google.gwt.maps.client.controls.StreetViewControlOptions;
import com.google.gwt.maps.client.controls.ZoomControlOptions;
import com.google.gwt.maps.client.maptypes.MapTypeStyleElementType;
import com.google.gwt.maps.client.maptypes.MapTypeStyleFeatureType;
import com.google.gwt.maps.client.maptypes.MapTypeStyler;

public class MapOptionsTest extends GWTTestCase {

	public static final int ASYNC_DELAY_MS = 5000;

	@Override
	public String getModuleName() {
		return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
	}

	@SuppressWarnings("unused")
	public void testUse() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testBackgroundColor() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				String left = "red";
				options.setBackgroundColor(left);
				String right = options.getBackgroundColor();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testCenter() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				LatLng left = LatLng.newInstance(35.1d, 38.2d);
				options.setCenter(left);
				LatLng right = options.getCenter();
				assertEquals(left, right);
				assertEquals(left.getLatitude(), right.getLatitude());
				assertEquals(left.getLongitude(), right.getLongitude());
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testDisableDefaultUI() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				boolean left = true;
				options.setDisableDefaultUi(left);
				boolean right = options.getDisableDefaultUi();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testDisableDoubleClickZoom() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				boolean left = true;
				options.setDraggable(left);
				boolean right = options.getDraggable();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testDraggable() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				boolean left = true;
				options.setDisableDoubleClickZoom(left);
				boolean right = options.getDisableDoubleClickZoom();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testDraggableCursor() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				boolean left = true;
				options.setDraggingCursor(left);
				boolean right = options.getDraggingCursor();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testHeading() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				int left = 1234;
				options.setHeading(left);
				int right = options.getHeading();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testKeyboardShortcuts() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				boolean left = true;
				options.setKeyboardShortcuts(left);
				boolean right = options.getKeyboardShortcuts();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testDraggingCursor() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				boolean left = true;
				options.setDraggableCursor(left);
				boolean right = options.getDraggableCursor();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testMapTypeControl() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				boolean left = true;
				options.setMapTypeControl(left);
				boolean right = options.getMapTypeControl();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testMapTypeControlOptions() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				MapTypeControlOptions left = MapTypeControlOptions
						.newInstance();
				options.setMapTypeControlOptions(left);
				MapTypeControlOptions right = options
						.getMapTypeControlOptions();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testMapTypeId() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();

				assertEquals(MapTypeId.ROADMAP, options.getMapTypeId());

				MapTypeId left = MapTypeId.TERRAIN;
				options.setMapTypeId(left);
				MapTypeId right = options.getMapTypeId();

				assertEquals(left.toString(), right.toString());

				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testMapTypeIdString() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();

				assertEquals(MapTypeId.ROADMAP.toString(),
						options.getMapTypeIdString());

				System.out.println(options.toString2());

				String customType = "fooType";
				options.setMapTypeId(customType);
				System.out.println(options.toString2());

				String actual = options.getMapTypeIdString();
				assertEquals(customType, actual);

				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testMaxZoom() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				int left = 10;
				options.setMaxZoom(left);
				int right = options.getMaxZoom();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testMinZoom() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				int left = 9;
				options.setMinZoom(left);
				int right = options.getMinZoom();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testNoClear() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				boolean left = true;
				options.setNoClear(left);
				boolean right = options.getNoClear();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testOverviewMapControl() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				boolean left = true;
				options.setOverviewMapControl(left);
				boolean right = options.getOverviewMapControl();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testOverviewMapControlOptions() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				OverviewMapControlOptions left = OverviewMapControlOptions
						.newInstance();
				options.setOverviewMapControlOptions(left);
				OverviewMapControlOptions right = options
						.getOverviewMapControlOptions();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testPanContro() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				boolean left = true;
				options.setPanControl(left);
				boolean right = options.getPanControl();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testPanControlOptions() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				PanControlOptions left = PanControlOptions.newInstance();
				options.setPanControlOptions(left);
				PanControlOptions right = options.getPanControlOptions();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testRotateContro() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				boolean left = true;
				options.setRotateControl(left);
				boolean right = options.getRotateControl();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testScaleControl() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				boolean left = true;
				options.setScaleControl(left);
				boolean right = options.getScaleControl();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testRotateControlOptions() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				RotateControlOptions left = RotateControlOptions.newInstance();
				options.setRotateControlOptions(left);
				RotateControlOptions right = options.getRotateControlOptions();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testScrollWheell() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				boolean left = true;
				options.setScrollWheel(left);
				boolean right = options.getScrollWheel();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testStreetViewControl() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				boolean left = true;
				options.setStreetViewControl(left);
				boolean right = options.getStreetViewControl();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	@SuppressWarnings("unused")
	public void testStreetViewControlOptions() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				StreetViewControlOptions left = StreetViewControlOptions
						.newInstance();
				left.setPosition(ControlPosition.BOTTOM_CENTER);
				options.setStreetViewControlOptions(left);
				StreetViewControlOptions right = options
						.getStreetViewControlOptions();
				// TODO
				// assertEquals(left.getPosition(), right.getPosition());
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	// TODO
	public void testMapTypeStyles() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();

				MapTypeStyle[] left = new MapTypeStyle[2];
				left[0] = MapTypeStyle.newInstance();

				MapTypeStyleElementType mapTypeStyleElementType = MapTypeStyleElementType.GEOMETRY;
				left[0].setElementType(mapTypeStyleElementType);
				MapTypeStyleFeatureType mapTypeStyleFeatureType = MapTypeStyleFeatureType.ALL;
				left[0].setFeatureType(mapTypeStyleFeatureType);

				MapTypeStyler[] mts = new MapTypeStyler[] {
						MapTypeStyler.newHueStyler("#ffff00"),
						MapTypeStyler.newInvertLightnessStyler(false),
						MapTypeStyler.newSaturationStyler(75),
						MapTypeStyler.newVisibilityStyler("on"),
						MapTypeStyler.newGammaStyler(0.01d),
						MapTypeStyler.newLightnessStyler(1) };
				left[0].setStylers(mts);

				left[1] = MapTypeStyle.newInstance();

				MapTypeStyleElementType mapTypeStyleElementType2 = MapTypeStyleElementType.LABELS;
				left[1].setElementType(mapTypeStyleElementType2);
				MapTypeStyleFeatureType mapTypeStyleFeatureType2 = MapTypeStyleFeatureType.ADMINISTRATIVE__LOCALITY;
				left[1].setFeatureType(mapTypeStyleFeatureType2);

				options.setMapTypeStyles(left);
				MapTypeStyle[] right = options.getMapTypeStyles();

				assertEquals(left[0].getElementType(),
						right[0].getElementType());
				assertEquals(left[0].getFeatureType(),
						right[0].getFeatureType());

				assertEquals(left[1].getElementType(),
						right[1].getElementType());
				assertEquals(left[1].getFeatureType(),
						right[1].getFeatureType());

				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testStreetViewControTilt() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				int left = 15;
				options.setTilt(left);
				int right = options.getTilt();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testZoom() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				int left = 10;
				options.setZoom(left);
				int right = options.getZoom();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testZoomControl() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				boolean left = true;
				options.setZoomControl(left);
				boolean right = options.getZoomControl();
				assertEquals(left, right);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	@SuppressWarnings("unused")
	public void testZoomControlOptions() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				ZoomControlOptions left = ZoomControlOptions.newInstance();

				options.setZoomControlOptions(left);
				ZoomControlOptions right = options.getZoomControlOptions();

				// assertEquals(left.getPosition(), right.getPosition()); //
				// TODO

				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

}
