package com.google.gwt.maps.client.layers;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.user.client.ui.RootPanel;

public class KmlLayerOptionsTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testClickable() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				KmlLayerOptions o = KmlLayerOptions.newInstance();
				boolean left = true;
				o.setClickable(left);
				boolean right = o.getClickable();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testMap() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				KmlLayerOptions o = KmlLayerOptions.newInstance();
				MapOptions options = MapOptions.newInstance();
				MapWidget left = new MapWidget(options);
				left.setSize("500px", "500px");
				RootPanel.get().add(left);
				o.setMap(left);
				MapWidget right = o.getMap();
				assertEquals(left.getCenter(), right.getCenter());
				finishTest();
			}
		});

	}

	public void testPreserveViewport() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				KmlLayerOptions o = KmlLayerOptions.newInstance();
				boolean left = true;
				o.setPreserveViewport(left);
				boolean right = o.getPreserveViewport();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testSupresseInfoWidnows() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				KmlLayerOptions o = KmlLayerOptions.newInstance();
				boolean left = true;
				o.setSuppressInfoWindows(left);
				boolean right = o.getSuppressInfoWindows();
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
				KmlLayerOptions o = KmlLayerOptions.newInstance();
				finishTest();
			}
		});

	}

}
