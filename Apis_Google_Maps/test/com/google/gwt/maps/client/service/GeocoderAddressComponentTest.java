package com.google.gwt.maps.client.service;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.services.GeocoderAddressComponent;

public class GeocoderAddressComponentTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				GeocoderAddressComponent o = GeocoderAddressComponent
						.newInstace();
				finishTest();
			}
		});
	}

	public void testLong_Name() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				GeocoderAddressComponent o = GeocoderAddressComponent
						.newInstace();
				String left = "test";
				o.setLong_Name(left);
				String right = o.getLong_Name();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testShort_Name() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				GeocoderAddressComponent o = GeocoderAddressComponent
						.newInstace();
				String left = "test";
				o.setShort_Name(left);
				String right = o.getShort_Name();
				assertEquals(left, right);
				finishTest();
			}
		});
	}

	public void testTypes() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				GeocoderAddressComponent o = GeocoderAddressComponent
						.newInstace();
				String[] a = new String[3];
				a[0] = "0";
				a[1] = "1";
				a[2] = "2";
				JsArrayString left = ArrayHelper.toJsArrayString(a);
				o.setTypes(left);
				JsArrayString right = o.getTypes();
				assertEquals(left.length(), right.length());
				assertEquals(left.get(0), right.get(0));
				finishTest();
			}
		});
	}
}
