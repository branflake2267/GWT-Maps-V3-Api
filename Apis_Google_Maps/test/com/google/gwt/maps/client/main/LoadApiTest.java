package com.google.gwt.maps.client.main;

import java.util.ArrayList;

import com.google.gwt.maps.client.AbstractMapsGWTTest;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

public class LoadApiTest extends AbstractMapsGWTTest {

	@Override
	public LoadLibrary[] getLibraries() {
		return null;
	}

	/**
	 * Must come first so that all API's are available for test suite or
	 * failures will occur
	 */
	public void testLoadWLibs3() {
		boolean sensor = true;
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.addAll(java.util.Arrays.asList(LoadLibrary.values()));

		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				finishTest();
			}
		}, loadLibraries, sensor);
		delayTest();
	}

	public void testLoad() {
		boolean sensor = false;
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				finishTest();
			}
		}, sensor);
		delayTest();
	}

	public void testLoad3() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				finishTest();
			}
		}, true);
		delayTest();
	}

	public void testLoadWLibs() {
		boolean sensor = false;
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.add(LoadLibrary.GEOMETRY);
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				finishTest();
			}
		}, loadLibraries, sensor);
		delayTest();
	}

	public void testReload2() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				LoadApi.go(new Runnable() {
					@Override
					public void run() {
						finishTest();
					}
				}, false);
			}
		}, false);
		delayTest();
	}

	public void testReload4() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				LoadApi.go(new Runnable() {
					@Override
					public void run() {
						finishTest();
					}
				}, false);
			}
		}, true);
		delayTest();
	}

	public void testReload5() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				LoadApi.go(new Runnable() {
					@Override
					public void run() {
						finishTest();
					}
				}, false, null);
			}
		}, true);

	}

	public void testReload6() {
		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				LoadApi.go(new Runnable() {
					@Override
					public void run() {
						finishTest();
					}
				}, false, "");
			}
		}, true);
		delayTest();
	}

	public void testUse1() {
		boolean sensor = false;
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadApi.LoadLibrary>();
		loadLibraries.addAll(java.util.Arrays.asList(LoadLibrary.values()));

		LoadApi.go(new Runnable() {
			@Override
			public void run() {
				finishTest();
			}
		}, loadLibraries, sensor);
		delayTest();
	}

}
