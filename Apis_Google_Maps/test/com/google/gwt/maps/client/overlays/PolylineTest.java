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

public class PolylineTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PolylineOptions options = PolylineOptions.newInstance();
				Polyline o = Polyline.newInstance(options);

				finishTest();
			}
		});

	}

	public void testEditable() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PolylineOptions options = PolylineOptions.newInstance();
				Polyline o = Polyline.newInstance(options);
				boolean left = true;
				o.setEditable(left);
				boolean right = o.getEditable();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testMap() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PolylineOptions options = PolylineOptions.newInstance();
				Polyline o = Polyline.newInstance(options);

				// test getting null map
				assertNull(o.getMap());

				MapOptions opts = MapOptions.newInstance();
				MapWidget left = new MapWidget(opts);
				left.setSize("500px", "500px");
				RootPanel.get().add(left);
				o.setMap(left);
				MapWidget right = o.getMap();
				assertEquals(left.getCenter().getToString(), right.getCenter()
						.getToString());

				// test clearing from map
				o.setMap(null);
				assertNull(o.getMap());

				finishTest();
			}
		});

	}

	public void testPath_JsArray() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PolylineOptions options = PolylineOptions.newInstance();
				Polyline o = Polyline.newInstance(options);
				LatLng[] a = new LatLng[3];
				a[0] = LatLng.newInstance(35, 36);
				a[1] = LatLng.newInstance(36, 37);
				a[2] = LatLng.newInstance(38, 39);
				JsArray<LatLng> left = ArrayHelper.toJsArray(a);
				o.setPath(left);
				// fail and it will throw
				finishTest();
			}
		});

	}

	public void testPath_MVCArray() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				PolylineOptions options = PolylineOptions.newInstance();
				Polyline o = Polyline.newInstance(options);
				LatLng[] a = new LatLng[3];
				a[0] = LatLng.newInstance(35, 36);
				a[1] = LatLng.newInstance(36, 37);
				a[2] = LatLng.newInstance(38, 39);
				MVCArray<LatLng> left = MVCArray.newInstance(a);
				o.setPath(left);
				// fail and it will throw
				finishTest();
			}
		});

	}

}
