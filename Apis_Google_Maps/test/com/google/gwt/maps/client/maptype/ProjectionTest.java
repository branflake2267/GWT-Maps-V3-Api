package com.google.gwt.maps.client.maptype;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Point;
import com.google.gwt.maps.client.maptypes.Projection;

public class ProjectionTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				MapWidget wMap = new MapWidget(options);
				Projection p = wMap.getProjection();
				finishTest();
			}
		});

	}

	public void testFromLatLngToPoint() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				MapWidget wMap = new MapWidget(options);
				Projection p = wMap.getProjection();
				Point point = Point.newInstance(4d, 3d);
				LatLng latlng = LatLng.newInstance(35d, 38d);
				Point p2 = p.fromLatLngToPoint(latlng, point);
				assertEquals("(155.0222222222222, 101.40104481443532)",
						p2.getToString());
				finishTest();
			}
		});

	}

	public void testFromPointToLatLng() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				MapOptions options = MapOptions.newInstance();
				MapWidget wMap = new MapWidget(options);
				Projection p = wMap.getProjection();
				Point point = Point.newInstance(4d, 3d);
				Point p2 = p.fromPointToLatLng(point, false);
				assertEquals("(84.67351256610525, -174.375)", p2.getToString());
				finishTest();
			}
		});

	}

}
