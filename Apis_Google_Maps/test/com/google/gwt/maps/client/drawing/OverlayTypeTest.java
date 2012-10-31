package com.google.gwt.maps.client.drawing;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.drawinglib.OverlayType;

public class OverlayTypeTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	private native void reverseEngineer(String type) /*-{
		var s = "$wnd.google.maps.drawing.OverlayType." + type;
		var v = eval(s);
		alert("google.maps.drawing.OverlayType." + type + " == " + v);
	}-*/;

	protected void reverseEngineer1() {
		OverlayType[] a = OverlayType.values();
		for (int i = 0; i < a.length; i++) {
			String type = a[i].value();
			reverseEngineer(type);
		}
	}

	public void testReverseEngineer() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				reverseEngineer1();
				finishTest();
			}
		});

	}

	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				OverlayType o = OverlayType.CIRCLE;
				String right = "circle";
				assertEquals(o.value(), right);
				finishTest();
			}
		});
	}

	public void testUse2() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				OverlayType o = OverlayType.MARKER;
				String right = "marker";
				assertEquals(o.value(), right);
				finishTest();
			}
		});

	}

	public void testUse3() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				OverlayType o = OverlayType.POLYGON;
				String right = "polygon";
				assertEquals(o.value(), right);
				finishTest();
			}
		});
	}

	public void testUse4() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				OverlayType o = OverlayType.POLYLINE;
				String right = "polyline";
				assertEquals(o.value(), right);
				finishTest();
			}
		});
	}

	public void testUse5() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				OverlayType o = OverlayType.RECTANGLE;
				String right = "rectangle";
				assertEquals(o.value(), right);
				finishTest();
			}
		});

	}
}
