package com.google.gwt.maps.client.overlays;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Point;
import com.google.gwt.user.client.ui.RootPanel;

public class MapCanvasProjectionTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapCanvasProjection o = MapCanvasProjection.newInstance();

				finishTest();
			}
		});

	}

	public void testfromContainerPixelToLatLng() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapCanvasProjection o = getSampleMapCanvasProjection();

				Point pixel = Point.newInstance(100d, 110d);
				LatLng actual = o.fromContainerPixelToLatLng(pixel);

				assertEquals(10d, actual.getLatitude());

				finishTest();
			}
		});
	}

	public void testfromContainerPixelToLatLng_noWrap_true() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapCanvasProjection o = getSampleMapCanvasProjection();

				Point pixel = Point.newInstance(100d, 110d);
				LatLng actual = o.fromContainerPixelToLatLng(pixel, true);

				assertEquals(-74.221d, actual.getLatitude(), 1e-3);

				finishTest();
			}
		});
	}

	public void testfromContainerPixelToLatLng_noWrap_false() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapCanvasProjection o = getSampleMapCanvasProjection();

				Point pixel = Point.newInstance(100d, 110d);
				LatLng actual = o.fromContainerPixelToLatLng(pixel, false);

				assertEquals(-74.221d, actual.getLatitude(), 1e-3);

				finishTest();
			}
		});
	}

	public void testfromDivPixelToLatLng() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapCanvasProjection o = getSampleMapCanvasProjection();

				Point pixel = Point.newInstance(100d, 110d);
				LatLng actual = o.fromDivPixelToLatLng(pixel);

				LatLng expected = LatLng.newInstance(-74.22147d, 131.625d);
				assertLatLngEquals(expected, actual);

				finishTest();
			}
		});
	}

	public void testfromDivPixelToLatLng_noWap_true() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapCanvasProjection o = getSampleMapCanvasProjection();

				Point pixel = Point.newInstance(100d, 110d);
				LatLng actual = o.fromDivPixelToLatLng(pixel, true);

				LatLng expected = LatLng.newInstance(-74.22147d, 131.625d);
				assertLatLngEquals(expected, actual);

				finishTest();
			}
		});
	}

	public void testfromDivPixelToLatLng_noWrap_false() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapCanvasProjection o = getSampleMapCanvasProjection();

				Point pixel = Point.newInstance(100d, 110d);
				LatLng actual = o.fromDivPixelToLatLng(pixel, false);

				LatLng expected = LatLng.newInstance(-74.22147d, 131.625d);
				assertLatLngEquals(expected, actual);

				finishTest();
			}
		});
	}

	public void testfromLatLngToContainerPixel() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapCanvasProjection o = getSampleMapCanvasProjection();

				LatLng testLatLng = LatLng.newInstance(34.4344d, -89.2433d);
				Point actual = o.fromLatLngToContainerPixel(testLatLng);

				assertEquals(-57.062d, actual.getX(), 1e-2);
				assertEquals(3.366d, actual.getY(), 1e-2);

				finishTest();
			}
		});
	}

	public void testfromLatLngToDivPixel() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapCanvasProjection o = MapCanvasProjection.newInstance();

				LatLng testPt = LatLng.newInstance(34.4344d, -89.2433d);
				Point actual = o.fromLatLngToDivPixel(testPt);

				assertEquals(10d, actual.getX());

				finishTest();
			}
		});
	}

	public void testgetWorldWidth() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapCanvasProjection o = getSampleMapCanvasProjection();

				double actual = o.getWorldWidth();
				double expected = 256;

				assertEquals(expected, actual, 1e-2);

				finishTest();
			}
		});
	}

	/**
	 * Make a projection for testing
	 * 
	 * @return
	 */
	private MapCanvasProjection getSampleMapCanvasProjection() {
		// set a map
		MapOptions options = MapOptions.newInstance();
		MapWidget mapWidget = new MapWidget(options);
		mapWidget.setSize("500px", "500px");
		RootPanel.get().add(mapWidget);

		// no map - confirm null
		OverlayView o = OverlayView.newInstance();
		o.setMap(mapWidget);

		MapCanvasProjection projection = o.getProjection();

		return projection;
	}
}
