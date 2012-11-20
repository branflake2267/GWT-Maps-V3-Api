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

	public void testLimit() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FusionTablesQuery o = FusionTablesQuery.newInstance();

				int expected = 234;
				o.setLimit(expected);
				assertEquals(expected, o.getLimit());

				finishTest();
			}
		});
	}

	public void testOffset() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FusionTablesQuery o = FusionTablesQuery.newInstance();

				int expected = 234;
				o.setOffset(expected);
				assertEquals(expected, o.getOffset());

				finishTest();
			}
		});
	}

	public void testOrderBy() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				FusionTablesQuery o = FusionTablesQuery.newInstance();

				String expected = "dim2 ASC";
				o.setOrderBy(expected);
				assertEquals(expected, o.getOrderBy());

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
