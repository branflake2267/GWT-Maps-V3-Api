package com.google.gwt.maps.client.overlays;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.mvc.MVCArray;
import com.google.gwt.user.client.ui.RootPanel;

public class PolygonOptionsTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PolygonOptions o = PolygonOptions.newInstance();
				finishTest();
			}
		});

	}

	public void testClickable() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PolygonOptions o = PolygonOptions.newInstance();
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
				PolygonOptions o = PolygonOptions.newInstance();
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
				PolygonOptions o = PolygonOptions.newInstance();
				double left = .50d;
				o.setFillOpacity(left);
				double right = o.getFillOpacity();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testGeodesic() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PolygonOptions o = PolygonOptions.newInstance();
				boolean left = true;
				o.setGeodesic(left);
				boolean right = o.getGeodesic();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testMapWidget() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PolygonOptions o = PolygonOptions.newInstance();
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

	/**
	 * this thows some red? not sure why. It runs ok by it self? Types?
	 */
	public void testPaths_JSArray() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PolygonOptions o = PolygonOptions.newInstance();
				LatLng[] a = new LatLng[3];
				a[0] = LatLng.newInstance(35, 36);
				a[1] = LatLng.newInstance(36, 37);
				a[2] = LatLng.newInstance(38, 39);
				JsArray<LatLng> left = ArrayHelper.toJsArray(a);
				o.setPaths(left);
				JsArray<LatLng> right = o.getPaths_JsArray();
				assertEquals(left.get(0).getToString(), right.get(0)
						.getToString());
				finishTest();
			}
		});

	}

	/**
	 * this thows some red? not sure why. It runs ok by it self? Types?
	 */
	public void testPathss_JSArray() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PolygonOptions o = PolygonOptions.newInstance();
				LatLng[] a = new LatLng[3];
				a[0] = LatLng.newInstance(35, 36);
				a[1] = LatLng.newInstance(36, 37);
				a[2] = LatLng.newInstance(38, 39);
				JsArray<LatLng> left1 = ArrayHelper.toJsArray(a);

				LatLng[] a2 = new LatLng[3];
				a2[0] = LatLng.newInstance(25, 26);
				a2[1] = LatLng.newInstance(26, 27);
				a2[2] = LatLng.newInstance(28, 29);
				JsArray<LatLng> left2 = ArrayHelper.toJsArray(a2);

				JsArray<JsArray<LatLng>> left = JsArray.createArray().cast();
				left.push(left1);
				left.push(left2);

				o.setPathss(left);
				JsArray<JsArray<LatLng>> right = o.getPathss_JsArray();
				assertEquals(left.get(0).get(0).getToString(), right.get(0)
						.get(0).getToString());
				finishTest();
			}
		});

	}

	public void testPaths_MVCArray() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PolygonOptions o = PolygonOptions.newInstance();
				LatLng[] a = new LatLng[3];
				a[0] = LatLng.newInstance(35, 36);
				a[1] = LatLng.newInstance(36, 37);
				a[2] = LatLng.newInstance(38, 39);
				MVCArray<LatLng> left = MVCArray.newInstance(a);
				o.setPaths(left);
				MVCArray<LatLng> right = o.getPaths_MVCArray();
				assertEquals(left.get(0).getToString(), right.get(0)
						.getToString());
				finishTest();
			}
		});

	}

	public void testPathss_MVCArray() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PolygonOptions o = PolygonOptions.newInstance();
				LatLng[] a = new LatLng[3];
				a[0] = LatLng.newInstance(35, 36);
				a[1] = LatLng.newInstance(36, 37);
				a[2] = LatLng.newInstance(38, 39);
				MVCArray<LatLng> left1 = MVCArray.newInstance(a);

				LatLng[] a2 = new LatLng[3];
				a2[0] = LatLng.newInstance(25, 26);
				a2[1] = LatLng.newInstance(26, 27);
				a2[2] = LatLng.newInstance(28, 29);
				MVCArray<LatLng> left2 = MVCArray.newInstance(a2);

				MVCArray<MVCArray<LatLng>> left = MVCArray.newInstance();
				left.push(left1);
				left.push(left2);

				o.setPathss(left);
				MVCArray<MVCArray<LatLng>> right = o.getPathss_MVCArray();

				int ileft = left.getLength();
				int iright = right.getLength();

				assertEquals(ileft, iright);

				// TODO more testcases?

				finishTest();
			}
		});

	}

	public void testStrokeColor() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PolygonOptions o = PolygonOptions.newInstance();
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
				PolygonOptions o = PolygonOptions.newInstance();
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
				PolygonOptions o = PolygonOptions.newInstance();
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
				PolygonOptions o = PolygonOptions.newInstance();
				int left = 5;
				o.setZindex(left);
				int right = o.getZindex();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

}
