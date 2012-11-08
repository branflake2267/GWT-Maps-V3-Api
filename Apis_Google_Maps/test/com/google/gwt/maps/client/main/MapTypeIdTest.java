package com.google.gwt.maps.client.main;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapTypeId;

public class MapTypeIdTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testEnum1() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapTypeId type = MapTypeId.HYBRID;
				String left = "HYBRID";
				String right = type.value();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testEnum2() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapTypeId type = MapTypeId.ROADMAP;
				String left = "ROADMAP";
				String right = type.value();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testEnum3() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapTypeId type = MapTypeId.SATELLITE;
				String left = "SATELLITE";
				String right = type.value();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testEnum4() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapTypeId type = MapTypeId.TERRAIN;
				String left = "TERRAIN";
				String right = type.value();
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
				MapTypeId type = MapTypeId.ROADMAP;
				finishTest();
			}
		});

	}

}
