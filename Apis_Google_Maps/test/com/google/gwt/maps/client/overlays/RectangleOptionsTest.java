package com.google.gwt.maps.client.overlays;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.user.client.ui.RootPanel;

public class RectangleOptionsTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				RectangleOptions o = RectangleOptions.newInstance();
				finishTest();
			}
		});

	}

	public void testBounds() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				RectangleOptions o = RectangleOptions.newInstance();
				LatLng sw = LatLng.newInstance(-31.203405d, 125.244141d);
				LatLng ne = LatLng.newInstance(-25.363882d, 131.044922d);
				LatLngBounds left = LatLngBounds.newInstance(sw, ne);
				o.setBounds(left);
				LatLngBounds right = o.getBounds();
				assertEquals(left.getToString(), right.getToString());
				finishTest();
			}
		});

	}

	public void testClickable() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				RectangleOptions o = RectangleOptions.newInstance();
				boolean left = true;
				o.setClickable(left);
				boolean right = o.getClickable();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testFillColor() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				RectangleOptions o = RectangleOptions.newInstance();
				String left = "red";
				o.setFillColor(left);
				String right = o.getFillColor();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testFillOpacity() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				RectangleOptions o = RectangleOptions.newInstance();
				double left = .50d;
				o.setFillOpacity(left);
				double right = o.getFillOpacity();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testMapWidget() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				RectangleOptions o = RectangleOptions.newInstance();
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

	public void testStrokeColor() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				RectangleOptions o = RectangleOptions.newInstance();
				String left = "red";
				o.setStrokeColor(left);
				String right = o.getStrokeColor();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testStrokeOpacity() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				RectangleOptions o = RectangleOptions.newInstance();
				double left = .50d;
				o.setStrokeOpacity(left);
				double right = o.getStrokeOpacity();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testStrokeWeight() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				RectangleOptions o = RectangleOptions.newInstance();
				int left = 5;
				o.setStrokeWeight(left);
				int right = o.getStrokeWeight();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testZindex() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				RectangleOptions o = RectangleOptions.newInstance();
				int left = 5;
				o.setZindex(left);
				int right = o.getZindex();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

}
