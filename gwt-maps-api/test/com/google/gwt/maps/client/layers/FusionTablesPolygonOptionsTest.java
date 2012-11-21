package com.google.gwt.maps.client.layers;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class FusionTablesPolygonOptionsTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testFillColor() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FusionTablesPolygonOptions o = FusionTablesPolygonOptions
						.newInstance();
				String left = "test";
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
				FusionTablesPolygonOptions o = FusionTablesPolygonOptions
						.newInstance();
				double left = .50;
				o.setFillOpacity(left);
				double right = o.getFillOpacity();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testSrokeOpacity() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FusionTablesPolygonOptions o = FusionTablesPolygonOptions
						.newInstance();
				double left = .50;
				o.setStrokeOpacity(left);
				double right = o.getStrokeOpacity();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testSrokeWeight() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FusionTablesPolygonOptions o = FusionTablesPolygonOptions
						.newInstance();
				int left = 2;
				o.setStrokeWeight(left);
				int right = o.getStrokeWeight();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testStrokeColor() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FusionTablesPolygonOptions o = FusionTablesPolygonOptions
						.newInstance();
				String left = "test";
				o.setStrokeColor(left);
				String right = o.getStrokeColor();
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
				FusionTablesPolygonOptions o = FusionTablesPolygonOptions
						.newInstance();
				finishTest();
			}
		});

	}

}
