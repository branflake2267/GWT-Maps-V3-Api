package com.google.gwt.maps.client.overlays;

/*
 * #%L
 * GWT Maps API V3 - Core API
 * %%
 * Copyright (C) 2011 - 2012 GWT Maps API V3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.mvc.MVCArray;
import com.google.gwt.user.client.ui.RootPanel;

public class PolylineOptionsGwtTest extends AbstractMapsGWTTestHelper {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				final PolylineOptions o = PolylineOptions.newInstance();
				finishTest();
			}
		});
	}

	public void testDefaults() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				final PolygonOptions o = PolygonOptions.newInstance();

				assertFalse("Should not be editable by default", o.getEditable());
				assertTrue("Should be clickable by default", o.getClickable());
				assertTrue("Should be visible by default", o.getVisible());
				assertFalse("Should not be geodesic by default", o.getGeodesic());

				finishTest();
			}
		});
	}

	public void testClickable() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				final PolylineOptions o = PolylineOptions.newInstance();
				final boolean left = true;
				o.setClickable(left);
				final boolean right = o.getClickable();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testVisible() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				final PolylineOptions o = PolylineOptions.newInstance();

				assertTrue("Should be visible by default", o.getVisible());

				o.setVisible(false);
				assertFalse("Should not be visible", o.getVisible());

				finishTest();
			}
		});
	}

	public void testGeodesic() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				final PolylineOptions o = PolylineOptions.newInstance();
				final boolean left = true;
				o.setGeodesic(left);
				final boolean right = o.getGeodesic();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testMapWidget() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				final PolylineOptions o = PolylineOptions.newInstance();
				final MapOptions opts = MapOptions.newInstance();
				final MapWidget left = new MapWidget(opts);
				left.setSize("500px", "500px");
				RootPanel.get().add(left);
				o.setMap(left);
				@SuppressWarnings("deprecation")
				final
				MapWidget right = o.getMapWidget();

				assertLatLngEquals(left.getCenter(), right.getCenter());

				finishTest();
			}
		});
	}

	public void testIconSequence() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {

				final SymbolPath path = SymbolPath.BACKWARD_CLOSED_ARROW;
				final double scale = 1d;
				final Symbol symbol = Symbol.newInstance(path, scale);

				final IconSequence sequence = IconSequence.newInstance();
				sequence.setIcon(symbol);
				sequence.setRepeat("10%");

				final IconSequence[] arr = new IconSequence[1];
				arr[0] = sequence;
				final JsArray<IconSequence> expected = ArrayHelper.toJsArray(arr);

				final PolylineOptions o = PolylineOptions.newInstance();
				o.setIcons(expected);

				final JsArray<IconSequence> actual = o.getIcons();

				assertEquals("Wrong icon sequence", expected, actual);

				finishTest();
			}
		});
	}

	public void testMap() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				final PolylineOptions o = PolylineOptions.newInstance();
				final MapOptions opts = MapOptions.newInstance();
				final MapWidget left = new MapWidget(opts);
				left.setSize("500px", "500px");
				RootPanel.get().add(left);
				o.setMap(left);
				final MapWidget right = o.getMap();
				assertLatLngEquals(left.getCenter(), right.getCenter());
				finishTest();
			}
		});
	}

	public void testPath_MVCArray() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				final PolylineOptions o = PolylineOptions.newInstance();
				final LatLng[] a = new LatLng[3];
				a[0] = LatLng.newInstance(35, 36);
				a[1] = LatLng.newInstance(36, 37);
				a[2] = LatLng.newInstance(38, 39);
				final MVCArray<LatLng> left = MVCArray.newInstance(a);
				o.setPath(left);
				final MVCArray<LatLng> right = o.getPath_MVCArray();
				assertEquals(left.get(0).getToString(), right.get(0).getToString());
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
				final PolylineOptions o = PolylineOptions.newInstance();
				final LatLng[] a = new LatLng[3];
				a[0] = LatLng.newInstance(35, 36);
				a[1] = LatLng.newInstance(36, 37);
				a[2] = LatLng.newInstance(38, 39);
				final JsArray<LatLng> left = ArrayHelper.toJsArray(a);
				o.setPath(left);
				final JsArray<LatLng> right = o.getPath_JsArray();
				assertEquals(left.get(0).getToString(), right.get(0).getToString());
				finishTest();
			}
		});

	}

	public void testStrokeColor() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				final PolylineOptions o = PolylineOptions.newInstance();
				final String left = "red";
				o.setStrokeColor(left);
				final String right = o.getStrokeColor();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testStrokeOpacity() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				final PolylineOptions o = PolylineOptions.newInstance();
				final double left = .50d;
				o.setStrokeOpacity(left);
				final double right = o.getStrokeOpacity();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testStrokeWeight() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				final PolylineOptions o = PolylineOptions.newInstance();
				final int left = 5;
				o.setStrokeWeight(left);
				final int right = o.getStrokeWeight();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testZindex() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				final PolylineOptions o = PolylineOptions.newInstance();
				final int left = 5;
				o.setZindex(left);
				final int right = o.getZindex();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

}
