package com.google.gwt.maps.client.service;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.services.UnitSystem;

public class UnitSystemTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.ADSENSE };
	}

	public void testReverseEngineer() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				reverseEngineer();
				finishTest();
			}
		});
	}

	private native void reverseEngineer() /*-{
		var array = [ "IMPERIAL", "METRIC" ]
		for ( var i = 0; i < array.length; i++) {
			var s = "$wnd.google.maps.UnitSystem." + array[i];
			alert(array[i] + "=" + eval(s));
		}
	}-*/;

	public void testUse1() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				UnitSystem o = UnitSystem.IMPERIAL;
				assertEquals(1, o.value());
				assertEquals(UnitSystem.IMPERIAL, UnitSystem.fromValue(1));
				finishTest();
			}
		});
	}

	public void testUse2() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				UnitSystem o = UnitSystem.METRIC;
				assertEquals(0, o.value());
				assertEquals(UnitSystem.METRIC, UnitSystem.fromValue(0));
				finishTest();
			}
		});
	}

}
