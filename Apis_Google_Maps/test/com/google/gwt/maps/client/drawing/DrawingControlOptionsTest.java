package com.google.gwt.maps.client.drawing;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.controls.ControlPosition;
import com.google.gwt.maps.client.drawinglib.DrawingControlOptions;
import com.google.gwt.maps.client.drawinglib.OverlayType;

public class DrawingControlOptionsTest extends GWTTestCase {

	public static final int ASYNC_DELAY_MS = 5000;

	public String getModuleName() {
		return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
	}

	@SuppressWarnings("unused")
	public void testUse() {
		boolean sensor = false;
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.DRAWING);
		LoadApi.go(new Runnable() {
			public void run() {
				DrawingControlOptions o = DrawingControlOptions.newInstance();
				finishTest();
			}
		}, loadLibraries, sensor);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testDrawingModes() {
		boolean sensor = false;
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.DRAWING);
		LoadApi.go(new Runnable() {
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
		}, loadLibraries, sensor);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testPosition() {
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.ADSENSE);
		LoadApi.go(new Runnable() {
			public void run() {
				DrawingControlOptions o = DrawingControlOptions.newInstance();
				ControlPosition left = ControlPosition.TOP_CENTER;
				o.setPosition(left);
				ControlPosition right = o.getPosition();
				assertEquals(left, right);
				finishTest();
			}
		}, loadLibraries, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}
	
	public void testDefaults() {
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.ADSENSE);
		LoadApi.go(new Runnable() {
			public void run() {
				DrawingControlOptions o = DrawingControlOptions.newInstance();
				
				ControlPosition actual = o.getPosition();
				assertEquals("Should be default value", ControlPosition.TOP_LEFT, actual);
				
				OverlayType[] expected = new OverlayType[]{OverlayType.MARKER, OverlayType.POLYLINE, OverlayType.RECTANGLE, OverlayType.CIRCLE, OverlayType.POLYGON};
				OverlayType[] actualTypes = o.getDrawingModes();
				for(int n=0; n<expected.length; n++) {
					assertEquals("Value ["+n+"] should match default", expected[n], actualTypes[n]);					
				}
				assertEquals("Arrays should be same size",expected.length, actualTypes.length);
				
				finishTest();
			}
		}, loadLibraries, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}
}
