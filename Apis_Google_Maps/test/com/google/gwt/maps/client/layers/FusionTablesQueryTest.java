package com.google.gwt.maps.client.layers;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class FusionTablesQueryTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testFrom() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FusionTablesQuery o = FusionTablesQuery.newInstance();
				String left = "test123";
				o.setFrom(left);
				String right = o.getFrom();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testSelect() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FusionTablesQuery o = FusionTablesQuery.newInstance();
				String left = "test123";
				o.setSelect(left);
				String right = o.getSelect();
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
				FusionTablesQuery o = FusionTablesQuery.newInstance();
				finishTest();
			}
		});

	}

	public void testWhere() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FusionTablesQuery o = FusionTablesQuery.newInstance();
				String left = "test123";
				o.setWhere(left);
				String right = o.getWhere();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

}
