package com.google.gwt.maps.client.overlays;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.user.client.ui.RootPanel;

public class GroundOverlayOptionsTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				GroundOverlayOptions o = GroundOverlayOptions.newInstance();
				finishTest();
			}
		});

	}

	public void testDefaults() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				GroundOverlayOptions o = GroundOverlayOptions.newInstance();

				assertNull("Should have NULL map by default", o.getMap());
				assertTrue("Should be clickable by default", o.getClickable());
				assertEquals("Should be visible by default", 1d, o.getOpacity(), 1e-3);

				finishTest();
			}
		});

	}

	public void testOpacity() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				GroundOverlayOptions o = GroundOverlayOptions.newInstance();

				assertEquals("Should be visible by default", 1d, o.getOpacity(), 1e-3);

				double expected = 0.232d;
				o.setOpacity(expected);
				assertEquals("Should have the new opacity value we set", expected, o.getOpacity(),
						1.e-3);

				finishTest();
			}
		});

	}

	public void testClickable() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				GroundOverlayOptions o = GroundOverlayOptions.newInstance();
				boolean left = true;
				o.setClickable(left);
				boolean right = o.getClickable();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testMapWidget() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				GroundOverlayOptions o = GroundOverlayOptions.newInstance();
				MapOptions opts = MapOptions.newInstance();
				MapWidget left = new MapWidget(opts);
				left.setSize("500px", "500px");
				RootPanel.get().add(left);
				o.setMap(left);
				@SuppressWarnings("deprecation")
				MapWidget right = o.getMapWidget();
				assertLatLngEquals(left.getCenter(), right.getCenter());
				finishTest();
			}
		});
	}

	public void testMap() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				GroundOverlayOptions o = GroundOverlayOptions.newInstance();
				MapOptions opts = MapOptions.newInstance();
				MapWidget left = new MapWidget(opts);
				left.setSize("500px", "500px");
				RootPanel.get().add(left);
				o.setMap(left);
				MapWidget right = o.getMap();
				assertLatLngEquals(left.getCenter(), right.getCenter());
				finishTest();
			}
		});
	}

}
