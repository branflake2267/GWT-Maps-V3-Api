package com.google.gwt.maps.client.streetview;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class StreetViewPanoramaDataTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewPanoramaData o = StreetViewPanoramaData.newInstance();
				finishTest();
			}
		});

	}

	public void testCopyRight() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewPanoramaData o = StreetViewPanoramaData.newInstance();
				String left = "Brandon was here";
				o.setCopyright(left);
				assertEquals(left, o.getCopyright());
				finishTest();
			}
		});

	}

	public void testStreetViewLinks() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewPanoramaData o = StreetViewPanoramaData.newInstance();
				StreetViewLink a = StreetViewLink.newInstance();
				a.setDescription("hi");
				a.setHeading(10);
				a.setPano("panooo");
				StreetViewLink b = StreetViewLink.newInstance();
				b.setDescription("hi there");
				b.setHeading(12);
				b.setPano("panooooooo");
				StreetViewLink[] c = new StreetViewLink[2];
				c[0] = a;
				c[1] = b;
				JsArray<StreetViewLink> svl = ArrayHelper.toJsArray(c);
				o.setLinks(svl);
				JsArray<StreetViewLink> right = o.getLinks();
				StreetViewLink aa = right.get(0);
				StreetViewLink bb = right.get(1);
				assertEquals(a.getDescription(), aa.getDescription());
				assertEquals(b.getDescription(), bb.getDescription());
				finishTest();
			}
		});

	}

	public void testStreetViewLocation() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewPanoramaData o = StreetViewPanoramaData.newInstance();
				StreetViewLocation location = StreetViewLocation.newInstance();
				location.setDescription("desc");
				o.setLocation(location);
				assertEquals("desc", o.getLocation().getDescription());
				finishTest();
			}
		});

	}

	public void testStreetViewTileData() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				StreetViewPanoramaData o = StreetViewPanoramaData.newInstance();
				StreetViewTileData left = StreetViewTileData.newInstance();
				left.setCenterHeading(1);
				o.setTileData(left);
				StreetViewTileData right = o.getTileData();
				assertEquals(left.getCenterHeading(), right.getCenterHeading());
				finishTest();
			}
		});

	}
}
