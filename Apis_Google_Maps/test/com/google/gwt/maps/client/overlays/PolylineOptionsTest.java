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

public class PolylineOptionsTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PolylineOptions o = PolylineOptions.newInstance();
				finishTest();
			}
		});
<<<<<<< HEAD

=======
	}
	
	public void testDefaults() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PolygonOptions o = PolygonOptions.newInstance();
				
				assertFalse("Should not be editable by default", o.getEditable());
				assertTrue("Should be clickable by default", o.getClickable());
				assertTrue("Should be visible by default", o.getVisible());
				assertFalse("Should not be geodesic by default", o.getGeodesic());
				
				finishTest();
			}
		});
>>>>>>> e3ec9a7
	}

	public void testClickable() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PolylineOptions o = PolylineOptions.newInstance();
				boolean left = true;
				o.setClickable(left);
				boolean right = o.getClickable();
				assertEquals(left, right);
				finishTest();
			}
		});
<<<<<<< HEAD

=======
	}
	
	public void testVisible() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PolylineOptions o = PolylineOptions.newInstance();

				assertTrue("Should be visible by default", o.getVisible());
				
				o.setVisible(false);
				assertFalse("Should not be visible", o.getVisible());
				
				finishTest();
			}
		});
>>>>>>> e3ec9a7
	}

	public void testGeodesic() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PolylineOptions o = PolylineOptions.newInstance();
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
				PolylineOptions o = PolylineOptions.newInstance();
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

	public void testPath_MVCArray() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PolylineOptions o = PolylineOptions.newInstance();
				LatLng[] a = new LatLng[3];
				a[0] = LatLng.newInstance(35, 36);
				a[1] = LatLng.newInstance(36, 37);
				a[2] = LatLng.newInstance(38, 39);
				MVCArray<LatLng> left = MVCArray.newInstance(a);
				o.setPath(left);
				MVCArray<LatLng> right = o.getPath_MVCArray();
				assertEquals(left.get(0).getToString(), right.get(0)
						.getToString());
				finishTest();
			}
		});

	}

	/**
	 * this thows some red? not sure why. It runs ok by it self? Types?
	 */
	public void testPath_JSArray() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PolylineOptions o = PolylineOptions.newInstance();
				LatLng[] a = new LatLng[3];
				a[0] = LatLng.newInstance(35, 36);
				a[1] = LatLng.newInstance(36, 37);
				a[2] = LatLng.newInstance(38, 39);
				JsArray<LatLng> left = ArrayHelper.toJsArray(a);
				o.setPath(left);
				JsArray<LatLng> right = o.getPath_JsArray();
				assertEquals(left.get(0).getToString(), right.get(0)
						.getToString());
				finishTest();
			}
		});

	}

	public void testStrokeColor() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PolylineOptions o = PolylineOptions.newInstance();
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
				PolylineOptions o = PolylineOptions.newInstance();
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
				PolylineOptions o = PolylineOptions.newInstance();
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
				PolylineOptions o = PolylineOptions.newInstance();
				int left = 5;
				o.setZindex(left);
				int right = o.getZindex();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

}
