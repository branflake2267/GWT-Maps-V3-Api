package com.google.gwt.maps.client.overlays;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class AnimationTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testUse1() {
		Animation type = Animation.BOUNCE;
		assertEquals("bounce", type.value());
	}

	public void testUse2() {
		Animation type = Animation.DROP;
		assertEquals("drop", type.value());
	}

}
