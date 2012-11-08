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
				MapWidget right = o.getMapWidget();
				assertEquals(left.getCenter().getToString(), right.getCenter()
						.getToString());
				finishTest();
			}
		});

	}

}
