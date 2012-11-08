package com.google.gwt.maps.client.maptype;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.Point;
import com.google.gwt.maps.client.base.Size;
import com.google.gwt.maps.client.maptypes.ImageMapType;
import com.google.gwt.maps.client.maptypes.ImageMapTypeOptions;
import com.google.gwt.maps.client.maptypes.TileUrlCallBack;

public class ImageMapTypeTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testUse2() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
				ImageMapType o = ImageMapType.newInstance(options);
				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testAlt() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
				String left = "test";
				options.setAlt(left);
				String right = options.getAlt();
				assertEquals(left, right);
				ImageMapType o = ImageMapType.newInstance(options);
				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testGetUrl() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
				options.setTileUrl(new TileUrlCallBack() {
					@Override
					public String getTileUrl(Point point, int zoomLevel) {
						return "http://mt3.google.com/mapstt?zoom=" + zoomLevel
								+ "&x=" + point.getX() + "&y=" + point.getY()
								+ "&client=api";
					}
				});
				ImageMapType o = ImageMapType.newInstance(options);

				// TODO how can I trigger?

				// TODO will this work?????

				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testMaxZoom() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
				int left = 5;
				options.setMaxZoom(left);
				int right = options.getMaxZoom();
				assertEquals(left, right);
				ImageMapType o = ImageMapType.newInstance(options);
				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testMinZoom() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
				int left = 5;
				options.setMinZoom(left);
				int right = options.getMinZoom();
				assertEquals(left, right);
				ImageMapType o = ImageMapType.newInstance(options);
				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testName() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
				String left = "test";
				options.setName(left);
				String right = options.getName();
				assertEquals(left, right);
				ImageMapType o = ImageMapType.newInstance(options);
				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testOpacity() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
				double left = .51;
				options.setOpacity(left);
				double right = options.getOpacity();
				assertEquals(left, right);
				ImageMapType o = ImageMapType.newInstance(options);
				finishTest();
			}
		});

	}

	@SuppressWarnings("unused")
	public void testTileSize() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				ImageMapTypeOptions options = ImageMapTypeOptions.newInstance();
				Size left = Size.newInstance(103d, 102d);
				options.setTileSize(left);
				Size right = options.getTileSize();
				assertEquals(left.getToString(), right.getToString());
				ImageMapType o = ImageMapType.newInstance(options);
				finishTest();
			}
		});

	}

}
