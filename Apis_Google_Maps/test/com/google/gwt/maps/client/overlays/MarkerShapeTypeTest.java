package com.google.gwt.maps.client.overlays;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class MarkerShapeTypeTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testUse1() {
		MarkerShapeType type = MarkerShapeType.CIRCLE;
		assertEquals("circle", type.value());
	}

	public void testUse2() {
		MarkerShapeType type = MarkerShapeType.POLY;
		assertEquals("poly", type.value());
	}

	public void testUse3() {
		MarkerShapeType type = MarkerShapeType.RECT;
		assertEquals("rect", type.value());
	}

}
