package com.google.gwt.maps.client.drawing;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.controls.ControlPosition;
import com.google.gwt.maps.client.drawinglib.DrawingControlOptions;
import com.google.gwt.maps.client.drawinglib.OverlayType;

public class DrawingControlOptionsTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testDefaults() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DrawingControlOptions o = DrawingControlOptions.newInstance();

				ControlPosition actual = o.getPosition();
				assertEquals("Should be default value",
						ControlPosition.TOP_LEFT, actual);

				OverlayType[] expected = new OverlayType[] {
						OverlayType.MARKER, OverlayType.POLYLINE,
						OverlayType.RECTANGLE, OverlayType.CIRCLE,
						OverlayType.POLYGON };
				OverlayType[] actualTypes = o.getDrawingModes();
				for (int n = 0; n < expected.length; n++) {
					assertEquals("Value [" + n + "] should match default",
							expected[n], actualTypes[n]);
				}
				assertEquals("Arrays should be same size", expected.length,
						actualTypes.length);

				finishTest();
			}
		});

	}

	public void testDrawingModes() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				OverlayType[] left = OverlayType.values();
				DrawingControlOptions o = DrawingControlOptions.newInstance();
				o.setDrawingModes(left);
				OverlayType[] right = o.getDrawingModes();
				assertEquals(left.length, right.length);
				assertEquals(left[0].value(), right[0].value());
				assertEquals(left[1].value(), right[1].value());
				assertEquals(left[2].value(), right[2].value());
				finishTest();
			}
		});

	}

	public void testPosition() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				DrawingControlOptions o = DrawingControlOptions.newInstance();
				ControlPosition left = ControlPosition.TOP_CENTER;
				o.setPosition(left);
				ControlPosition right = o.getPosition();
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
				DrawingControlOptions o = DrawingControlOptions.newInstance();
				finishTest();
			}
		});

	}
}
