package com.google.gwt.maps.client.layers;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class FusionTablesMarkerOptionsTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testIconName() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FusionTablesMarkerOptions o = FusionTablesMarkerOptions
						.newInstance();
				String left = "test";
				o.setIconName(left);
				String right = o.getIconName();
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
				FusionTablesMarkerOptions o = FusionTablesMarkerOptions
						.newInstance();
				finishTest();
			}
		});

	}

}
