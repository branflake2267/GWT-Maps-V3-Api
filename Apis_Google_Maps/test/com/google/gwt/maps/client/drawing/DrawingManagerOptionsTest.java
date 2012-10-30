package com.google.gwt.maps.client.drawing;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.drawinglib.DrawingControlOptions;
import com.google.gwt.maps.client.drawinglib.DrawingManagerOptions;
import com.google.gwt.maps.client.drawinglib.OverlayType;
import com.google.gwt.maps.client.overlays.CircleOptions;
import com.google.gwt.maps.client.overlays.MarkerOptions;
import com.google.gwt.maps.client.overlays.PolygonOptions;
import com.google.gwt.maps.client.overlays.PolylineOptions;
import com.google.gwt.maps.client.overlays.RectangleOptions;
import com.google.gwt.user.client.ui.RootPanel;

public class DrawingManagerOptionsTest extends GWTTestCase {

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
				DrawingManagerOptions o = DrawingManagerOptions.newInstance();
				finishTest();
			}
		}, loadLibraries, sensor);
		
		delayTestFinish(ASYNC_DELAY_MS);
	}
	
	public void testDefault() {
		boolean sensor = false;
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.DRAWING);
		LoadApi.go(new Runnable() {
			public void run() {
				DrawingManagerOptions o = DrawingManagerOptions.newInstance();
				
				assertTrue("Should be TRUE by default", o.getDrawingControl());
				
				finishTest();
			}
		}, loadLibraries, sensor);
		
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testCircleOptions() {
		boolean sensor = false;
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.DRAWING);
		LoadApi.go(new Runnable() {
			public void run() {
				DrawingManagerOptions o = DrawingManagerOptions.newInstance();
				CircleOptions left = CircleOptions.newInstance();
				left.setClickable(true);
				o.setCircleOptions(left);
				CircleOptions right = o.getCircleOptions();
				assertEquals(left.getClickable(), right.getClickable());
				finishTest();
			}
		}, loadLibraries, sensor);
		
		delayTestFinish(ASYNC_DELAY_MS);
	}

	@SuppressWarnings("unused")
	public void testDrawingControl() {
		boolean sensor = false;
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.DRAWING);
		LoadApi.go(new Runnable() {
			public void run() {
				DrawingManagerOptions o = DrawingManagerOptions.newInstance();
				boolean left = true;
				o.setDrawingControl(left);
				boolean right = o.getDrawingControl();
				finishTest();
			}
		}, loadLibraries, sensor);
		
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testDrawingControlOptions() {
		boolean sensor = false;
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.DRAWING);
		LoadApi.go(new Runnable() {
			public void run() {
				DrawingManagerOptions o = DrawingManagerOptions.newInstance();
				DrawingControlOptions left = DrawingControlOptions
						.newInstance();
				left.setDrawingModes(OverlayType.values());
				o.setDrawingControlOptions(left);
				DrawingControlOptions right = o.getDrawingControlOptions();
				assertEquals(left.getDrawingModes().length,
						right.getDrawingModes().length);
				finishTest();
			}
		}, loadLibraries, sensor);
		
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testMap() {
		boolean sensor = false;
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.ADSENSE);
		LoadApi.go(new Runnable() {
			public void run() {

				MapOptions optionsMap = MapOptions.newInstance();
				MapWidget left = new MapWidget(optionsMap);
				RootPanel.get().add(left);
				left.setSize("500px", "500px");

				DrawingManagerOptions options = DrawingManagerOptions
						.newInstance();
				options.setMap(left);
				MapWidget right = options.getMap();
				assertEquals(left.getCenter().getToString(), right.getCenter()
						.getToString());

				finishTest();
			}
		}, loadLibraries, sensor);
		
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testMarkerOptions() {
		boolean sensor = false;
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.DRAWING);
		LoadApi.go(new Runnable() {
			public void run() {
				
				DrawingManagerOptions o = DrawingManagerOptions.newInstance();
				MarkerOptions left = MarkerOptions.newInstance();
				left.setClickable(true);
				o.setMarkerOptions(left);
				MarkerOptions right = o.getMarkerOptions();
				assertEquals(left.getClickable(), right.getClickable());
				finishTest();
			}
		}, loadLibraries, sensor);
		
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testPolygonOptions() {
		boolean sensor = false;
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.DRAWING);
		LoadApi.go(new Runnable() {
			public void run() {
				DrawingManagerOptions o = DrawingManagerOptions.newInstance();
				PolygonOptions left = PolygonOptions.newInstance();
				left.setClickable(true);
				o.setPolygonOptions(left);
				PolygonOptions right = o.getPolygonOptions();
				assertEquals(left.getClickable(), right.getClickable());
				finishTest();
			}
		}, loadLibraries, sensor);
		
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testPolylineOptions() {
		boolean sensor = false;
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.DRAWING);
		LoadApi.go(new Runnable() {
			public void run() {
				DrawingManagerOptions o = DrawingManagerOptions.newInstance();
				PolylineOptions left = PolylineOptions.newInstance();
				left.setClickable(true);
				o.setPolylineOptions(left);
				PolylineOptions right = o.getPolylineOptions();
				assertEquals(left.getClickable(), right.getClickable());
				finishTest();
			}
		}, loadLibraries, sensor);
		
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testRectangleOptions() {
		boolean sensor = false;
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.DRAWING);
		LoadApi.go(new Runnable() {
			public void run() {
				DrawingManagerOptions o = DrawingManagerOptions.newInstance();
				RectangleOptions left = RectangleOptions.newInstance();
				left.setClickable(true);
				o.setRectangleOptions(left);
				RectangleOptions right = o.getRectangleOptions();
				assertEquals(left.getClickable(), right.getClickable());
				finishTest();
			}
		}, loadLibraries, sensor);
		
		delayTestFinish(ASYNC_DELAY_MS);
	}
}
