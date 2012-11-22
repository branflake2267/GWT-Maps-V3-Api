package com.google.gwt.maps.client.maptype;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.maptypes.MapTypeStyleElementType;

public class MapTypeStyeElementTypeTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapTypeStyleElementType type = MapTypeStyleElementType.ALL;
				finishTest();
			}
		});

	}

	public void testEnum1() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapTypeStyleElementType type = MapTypeStyleElementType.ALL;
				String left = "all";
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
				MapTypeStyleElementType type = MapTypeStyleElementType.GEOMETRY;
				String left = "geometry";
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
				MapTypeStyleElementType type = MapTypeStyleElementType.LABELS;
				String left = "labels";
				String right = type.value();
				assertEquals(left, right);
				finishTest();
			}
		});

	}
}
