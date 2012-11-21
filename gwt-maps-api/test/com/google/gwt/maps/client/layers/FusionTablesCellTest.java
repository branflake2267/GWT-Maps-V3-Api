package com.google.gwt.maps.client.layers;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class FusionTablesCellTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testColumnName() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FusionTablesCell o = FusionTablesCell.newInstance();
				String left = "test";
				o.setColumnName(left);
				String right = o.getColumnName();
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
				FusionTablesCell o = FusionTablesCell.newInstance();
				finishTest();
			}
		});

	}

	public void testValue() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FusionTablesCell o = FusionTablesCell.newInstance();
				String left = "test";
				o.setValue(left);
				String right = o.getValue();
				assertEquals(left, right);
				finishTest();
			}
		});

	}
}
