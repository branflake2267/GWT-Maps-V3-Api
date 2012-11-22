package com.google.gwt.maps.client.base;

import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class PointTest extends AbstractMapsGWTTest {

	public static final double MOCK_X = 2.2d;
	public static final double MOCK_Y = 3.3d;

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testEquals() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				Point p = Point.newInstance(MOCK_X, MOCK_Y);
				Point p2 = Point.newInstance(MOCK_X, MOCK_Y);
				boolean b = p.equals(p2);
				assertEquals(true, b);
				finishTest();
			}
		});
	}

	public void testNotEquals() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				Point p = Point.newInstance(MOCK_X, MOCK_Y);
				Point p2 = Point.newInstance(MOCK_X, MOCK_Y + 1);
				boolean b = p.equals(p2);
				assertEquals(false, b);
				finishTest();
			}
		});
	}

	public void testToString() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				Point p = Point.newInstance(MOCK_X, MOCK_Y);

				String xStr = NumberFormat.getFormat("#.#").format(MOCK_X);
				String yStr = NumberFormat.getFormat("#.#").format(MOCK_Y);
				String expected = "(" + xStr + ", " + yStr + ")"; // oddly
																	// trailing
																	// zeros are
																	// truncated
																	// in API
																	// toString

				assertEquals(expected, p.getToString());
				finishTest();
			}
		});
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				Point p = Point.newInstance(MOCK_X, MOCK_Y);
				finishTest();
			}
		});
	}

	public void testXandY() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				Point p = Point.newInstance(MOCK_X, MOCK_Y);
				assertEquals(MOCK_X, p.getX());
				assertEquals(MOCK_Y, p.getY());
				finishTest();
			}
		});
	}
}