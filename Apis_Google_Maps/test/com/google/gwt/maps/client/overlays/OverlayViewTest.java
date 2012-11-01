package com.google.gwt.maps.client.overlays;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class OverlayViewTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				OverlayView o = OverlayView.newInstance();
				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testDraw() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				OverlayView o = OverlayView.newInstance();

				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testMapWidget() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				OverlayView o = OverlayView.newInstance();

				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testProjection() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				OverlayView o = OverlayView.newInstance();

				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testOnAdd() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				OverlayView o = OverlayView.newInstance();

				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testOnRemove() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				OverlayView o = OverlayView.newInstance();

				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testOnStreetViewPanoWidget() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				OverlayView o = OverlayView.newInstance();

				finishTest();
			}
		});

	}

}
