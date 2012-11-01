package com.google.gwt.maps.client;

import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class SandboxTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.GEOMETRY, LoadLibrary.PANORAMIO,
				LoadLibrary.PLACES, LoadLibrary.WEATHER };
	}

	private final native void runJsni() /*-{
		var array = [ "BANNER", "BUTTON", "HALF_BANNER", "LARGE_RECTANGLE",
				"LEADERBOARD", "MEDIUM_RECTANGLE", "SKYSCRAPER",
				"SMALL_RECTANGLE", "SMALL_SQUARE", "SQUARE", "VERTICAL_BANNER",
				"WIDE_SKYSCRAPER" ]
		for ( var i = 0; i < array.length; i++) {
			var s = "$wnd.google.maps.adsense.AdFormat." + array[i];
			alert(array[i] + "=" + eval(s));
		}
	}-*/;

	protected void runSomething() {
		runJsni();

	}

	public void testLoadAllLibraries() {

		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				runSomething();
				finishTest();
			}
		});
	}
}
