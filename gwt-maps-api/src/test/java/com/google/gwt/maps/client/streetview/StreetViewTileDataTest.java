package com.google.gwt.maps.client.streetview;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.Size;

public class StreetViewTileDataTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewTileData o = StreetViewTileData.newInstance();
				finishTest();
			}
		});

	}

	// TODO try this after the provider call back
	// public void testTileUrl() {
	// asyncLibTest(new Runnable() {
	// public void run() {
	// StreetViewTileData o = StreetViewTileData.newInstance();
	// String pano = "panooo";
	// int tileZoom = 10;
	// int tileX = 1;
	// int tileY = 2;
	// String url = o.getTileUrl(pano, tileZoom, tileX, tileY);
	// assertEquals("", url);
	// finishTest();
	// }
	// });

	// }

	public void testCenterHeading() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewTileData o = StreetViewTileData.newInstance();
				int left = 15;
				o.setCenterHeading(left);
				int right = o.getCenterHeading();
				assertEquals(left, right);
				finishTest();
			}
		});

	}

	public void testTileSize() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewTileData o = StreetViewTileData.newInstance();
				Size tileSize = Size.newInstance(10d, 12d);
				o.setTileSize(tileSize);
				assertEquals("(10, 12)", o.getTileSize().getToString());
				finishTest();
			}
		});

	}

	public void testWorldSize() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewTileData o = StreetViewTileData.newInstance();
				Size worldSize = Size.newInstance(13d, 14d);
				o.setWorldSize(worldSize);
				assertEquals("(13, 14)", o.getWorldSize().getToString());
				finishTest();
			}
		});

	}

}
