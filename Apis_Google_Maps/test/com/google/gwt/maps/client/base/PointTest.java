package com.google.gwt.maps.client.base;

import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;

public class PointTest extends GWTTestCase {

	public static final int ASYNC_DELAY_MS = 5000;

	public static final double MOCK_X = 2.2d;
	public static final double MOCK_Y = 3.3d;

	public String getModuleName() {
		return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
	}

	public void testWorks() {
		assertEquals(true, true);
	}

	@SuppressWarnings("unused")
	public void testUse() {
		LoadApi.go(new Runnable() {
			public void run() {
				Point p = Point.newInstance(MOCK_X, MOCK_Y);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testEquals() {
		LoadApi.go(new Runnable() {
			public void run() {
				Point p = Point.newInstance(MOCK_X, MOCK_Y);
				Point p2 = Point.newInstance(MOCK_X, MOCK_Y);
				boolean b = p.equals(p2);
				assertEquals(true, b);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testNotEquals() {
		LoadApi.go(new Runnable() {
			public void run() {
				Point p = Point.newInstance(MOCK_X, MOCK_Y);
				Point p2 = Point.newInstance(MOCK_X, MOCK_Y + 1);
				boolean b = p.equals(p2);
				assertEquals(false, b);
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testToString() {
		LoadApi.go(new Runnable() {
			public void run() {
				Point p = Point.newInstance(MOCK_X, MOCK_Y);
		    	
		        String xStr = NumberFormat.getFormat("#.#").format(MOCK_X);
		    	String yStr = NumberFormat.getFormat("#.#").format(MOCK_Y);
		        String expected = "("+xStr+", "+yStr+")"; // oddly trailing zeros are truncated in API toString
		       
				assertEquals(expected, p.getToString());
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}

	public void testXandY() {
		LoadApi.go(new Runnable() {
			public void run() {

				Point p = Point.newInstance(MOCK_X, MOCK_Y);
				assertEquals(MOCK_X, p.getX());
				assertEquals(MOCK_Y, p.getY());
				finishTest();
			}
		}, false);
		delayTestFinish(ASYNC_DELAY_MS);
	}
}