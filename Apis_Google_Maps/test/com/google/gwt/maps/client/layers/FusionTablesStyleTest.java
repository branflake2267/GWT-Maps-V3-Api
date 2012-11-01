package com.google.gwt.maps.client.layers;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class FusionTablesStyleTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testMarkerOptions() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FusionTablesStyle o = FusionTablesStyle.newInstance();
				FusionTablesMarkerOptions left = FusionTablesMarkerOptions
						.newInstance();
				left.setIconName("test123");
				o.setMarkerOptions(left);
				FusionTablesMarkerOptions right = o.getMarkerOptions();
				assertEquals(left.getIconName(), right.getIconName());
				finishTest();
			}
		});

	}

	public void testPolygonOptions() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FusionTablesStyle o = FusionTablesStyle.newInstance();
				FusionTablesPolygonOptions left = FusionTablesPolygonOptions
						.newInstance();
				left.setFillColor("red");
				o.setPolygonOptions(left);
				FusionTablesPolygonOptions right = o.getPolygonOptions();
				assertEquals(left.getFillColor(), right.getFillColor());
				finishTest();
			}
		});

	}

	public void testPolylineOptions() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FusionTablesStyle o = FusionTablesStyle.newInstance();
				FusionTablesPolylineOptions left = FusionTablesPolylineOptions
						.newInstance();
				left.setStrokeColor("blue");
				o.setPolylineOptions(left);
				FusionTablesPolylineOptions right = o.getPolylineOptions();
				assertEquals(left.getStrokeColor(), right.getStrokeColor());
				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FusionTablesStyle o = FusionTablesStyle.newInstance();
				finishTest();
			}
		});

	}

	public void testWhere() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FusionTablesStyle o = FusionTablesStyle.newInstance();
				String left = "where test";
				o.setWhere(left);
				String right = o.getWhere();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

}
