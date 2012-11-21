package com.google.gwt.maps.client.base;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class LatLngTest extends AbstractMapsGWTTest {

	public static final double MOCK_LAT = 38.0d;
	public static final double MOCK_LNG = 35.5d;

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testEqualsIsEqual() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				LatLng left = LatLng.newInstance(MOCK_LAT, MOCK_LNG);
				LatLng right = LatLng.newInstance(MOCK_LAT, MOCK_LNG);
				boolean equals = left.equals(right);
				assertEquals(true, equals);
				finishTest();
			}
		});
	}

	public void testEqualsIsNotEqual() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				LatLng left = LatLng.newInstance(MOCK_LAT + 0.3d, MOCK_LNG,
						false);
				LatLng right = LatLng.newInstance(MOCK_LAT, MOCK_LNG);
				boolean equals = left.equals(right);
				assertEquals(false, equals);
				finishTest();
			}
		});
	}

	public void testGetLatitude() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				double expected = MOCK_LAT + 0.3;
				LatLng ll = LatLng.newInstance(MOCK_LAT + 0.3d, MOCK_LNG);
				double actual = ll.getLatitude();
				assertEquals(expected, actual);
				finishTest();
			}
		});
	}

	public void testGetLongitude() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				LatLng ll = LatLng.newInstance(MOCK_LAT + 0.3d, MOCK_LNG);
				double right = ll.getLongitude();
				assertEquals(MOCK_LNG, right);
				finishTest();
			}
		});
	}

	public void testGetToString() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				LatLng ll = LatLng.newInstance(MOCK_LAT + 0.3d, MOCK_LNG);
				String left = "(38.3, 35.5)";
				String right = ll.getToString();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testGetToUrlValue() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				LatLng ll = LatLng.newInstance(38.12345678901234567890d,
						35.12345678901234567890d);
				String left = "38.123456789,35.123456789";
				String right = ll.getToUrlValue(10);
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
				LatLng ll = LatLng.newInstance(MOCK_LAT, MOCK_LNG);
				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testUse2() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				LatLng ll = LatLng.newInstance(MOCK_LAT, MOCK_LNG);
				finishTest();
			}
		});
	}

	@SuppressWarnings("unused")
	public void testUse3() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				LatLng ll = LatLng.newInstance(MOCK_LAT, MOCK_LNG, true);
				finishTest();
			}
		});

	}

	public void testWrapping() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				// range overflow
				LatLng ll = LatLng.newInstance(99.4d, 184.4d);
				assertEquals(90d, ll.getLatitude());
				assertEquals(-175.60000000000002d, ll.getLongitude());

				// range underflow
				LatLng ll2 = LatLng.newInstance(-99.4d, -184.4d);
				assertEquals(-90d, ll2.getLatitude());
				assertEquals(175.60000000000002d, ll2.getLongitude()); // TODO
																		// precision
																		// issue,
				finishTest();
			}
		});
	}

}
