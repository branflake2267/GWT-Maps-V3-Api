package com.google.gwt.maps.client.controls;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapTypeId;

public class MapTypeControlOptionsTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	public void testPosition() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapTypeControlOptions options = MapTypeControlOptions
						.newInstance();
				ControlPosition left = ControlPosition.TOP_CENTER;
				options.setPosition(left);
				ControlPosition right = options.getPosition();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testSetMapTypeIds() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapTypeControlOptions options = MapTypeControlOptions
						.newInstance();

				// should be empty
				assertNull(options.getMapTypeIds());

				MapTypeId[] left = new MapTypeId[4];
				left[0] = MapTypeId.HYBRID; // 1
				left[1] = MapTypeId.ROADMAP; // 2
				left[2] = MapTypeId.SATELLITE; // 3
				left[3] = MapTypeId.TERRAIN; // 4

				options.setMapTypeIds(left);

				MapTypeId[] right = options.getMapTypeIds();

				MapTypeId type1 = right[0];
				assertEquals(MapTypeId.HYBRID, type1);

				MapTypeId type2 = right[1];
				assertEquals(MapTypeId.ROADMAP, type2);

				MapTypeId type3 = right[2];
				assertEquals(MapTypeId.SATELLITE, type3);

				MapTypeId type4 = right[3];
				assertEquals(MapTypeId.TERRAIN, type4);

				finishTest();
			}
		});
	}

	public void testSetMapTypeIdsString() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapTypeControlOptions options = MapTypeControlOptions
						.newInstance();

				// should be empty
				assertNull(options.getMapTypeIdsString());

				String fooType = "fooType";

				String[] left = new String[2];
				left[0] = MapTypeId.HYBRID.toString(); // 1
				left[1] = fooType; // 2
				options.setMapTypeIds(left);

				String[] right = options.getMapTypeIdsString();

				String type1 = right[0];
				assertEquals(MapTypeId.HYBRID.toString(), type1);

				String type2 = right[1];
				assertEquals(fooType, type2);

				finishTest();
			}
		});
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapTypeControlOptions options = MapTypeControlOptions
						.newInstance();
				finishTest();
			}
		});
	}
}
