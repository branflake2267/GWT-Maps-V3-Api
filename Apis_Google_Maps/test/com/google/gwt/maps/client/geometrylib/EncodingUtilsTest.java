package com.google.gwt.maps.client.geometrylib;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.mvc.MVCArray;

public class EncodingUtilsTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.GEOMETRY };
	}

	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				LatLng[] array = new LatLng[3];
				array[0] = LatLng.newInstance(49.496675, -102.65625);
				array[1] = LatLng.newInstance(50.496675, -103.65625);
				array[2] = LatLng.newInstance(51.496675, -104.65625);
				JsArray<LatLng> path = ArrayHelper.toJsArray(array);
				String encodedPath = EncodingUtils.encodePath(path);
				assertEquals("gibmHp`qqR_ibE~hbE_ibE~hbE", encodedPath);

				JsArray<LatLng> array2 = EncodingUtils.decodePath(encodedPath);
				assertEquals(array.length, array2.length());

				finishTest();
			}
		});

	}

	public void testUse2() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				LatLng[] array = new LatLng[3];
				array[0] = LatLng.newInstance(49.496675, -102.65625);
				array[1] = LatLng.newInstance(50.496675, -103.65625);
				array[2] = LatLng.newInstance(51.496675, -104.65625);

				JsArray<LatLng> path = ArrayHelper.toJsArray(array);
				MVCArray<LatLng> path2 = MVCArray.newInstance(path);
				String encodedPath = EncodingUtils.encodePath(path2);
				assertEquals("gibmHp`qqR_ibE~hbE_ibE~hbE", encodedPath);

				JsArray<LatLng> array2 = EncodingUtils.decodePath(encodedPath);
				assertEquals(array.length, array2.length());

				finishTest();
			}
		});

	}

}
