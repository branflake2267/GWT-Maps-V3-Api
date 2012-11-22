package com.google.gwt.maps.client.testutil;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Test template for testing GMaps objects.
 * 
 * @author Joseph Lust
 * 
 */
public abstract class AbstractTest extends GWTTestCase {

	public static final int ASYNC_DELAY_MS = 5000;
	public static final boolean HAS_SENSOR = false;

	public String getModuleName() {
		return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
	}

}
