package com.google.gwt.maps.client.overlays;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class MarkerShapeTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MarkerShape o = MarkerShape.newInstance();
				finishTest();
			}
		});

	}

	public void testCoords() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MarkerShape o = MarkerShape.newInstance();
				int[] integers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
				JsArrayInteger left = ArrayHelper.toJsArrayInteger(integers);
				o.setCoordinates(left);
				JsArrayInteger right = o.getCoordinates();
				int two = right.get(2);
				assertEquals(integers[2], two);
				finishTest();
			}
		});

	}

	public void testType() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MarkerShape o = MarkerShape.newInstance();
				MarkerShapeType left = MarkerShapeType.RECT;
				o.setType(left);
				MarkerShapeType right = o.getType();
				assertEquals(left.value(), right.value());
				finishTest();
			}
		});

	}
}
