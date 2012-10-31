package com.google.gwt.maps.client;

import java.util.ArrayList;
import java.util.Arrays;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;

/**
 * Common actions taken when testing maps code
 * 
 * @author Joseph Lust
 * 
 */
public abstract class AbstractMapsGWTTest extends GWTTestCase {

	private int asyncDelayMs = 5000;

	private boolean sensor = false;

	/**
	 * Runs the test with libraries defined by the {@link #getLibraries()}
	 * override loaded and fails if not complete by {@link #getAsyncDelayMs()}.<br>
	 * <br>
	 * <b>NOTE:</b> You must call {@link #finishTest()} or test will fail.
	 * 
	 * @param test
	 *            code to run
	 */
	public final void asyncLibTest(Runnable test) {
		// handle the nulls
		LoadLibrary[] libs = getLibraries();
		if (libs == null) {
			libs = new LoadLibrary[] {};
		}
		asyncLibTest(test, libs);
	}

	/**
	 * Runs the test with the given libraries loaded and fails if not complete
	 * by {@link #getAsyncDelayMs()}.<br>
	 * <br>
	 * <b>NOTE:</b> You must call {@link #finishTest()} or test will fail.
	 * 
	 * @param test
	 *            code to run
	 * @param libs
	 *            libraries to have loaded
	 */
	public final void asyncLibTest(Runnable test, LoadLibrary... libs) {
		// pack
		ArrayList<LoadLibrary> loadLibraries = new ArrayList<LoadLibrary>();
		loadLibraries.addAll(Arrays.asList(libs));

		// run
		LoadApi.go(test, loadLibraries, isSensor());

		// ensure expiration is does not reach finishTest()
		delayTest();
	}

	public final void delayTest() {
		delayTestFinish(getAsyncDelayMs());
	}

	/**
	 * Get delay to wait until failing the test as incomplete
	 * 
	 * @return
	 */
	public final int getAsyncDelayMs() {
		return asyncDelayMs;
	}

	/**
	 * Returns the libraries that will be loaded before the test is run if the
	 * no library method overload is called.
	 * 
	 * @return
	 */
	public abstract LoadLibrary[] getLibraries();

	@Override
	public String getModuleName() {
		return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
	}

	/**
	 * Is the test with run as with a device sensor
	 * 
	 * @return
	 */
	public final boolean isSensor() {
		return sensor;
	}

	public final void setAsyncDelayMs(int asyncDelayMs) {
		this.asyncDelayMs = asyncDelayMs;
	}

	public final void setSensor(boolean sensor) {
		this.sensor = sensor;
	}

	/** In case this is called as a test **/
	public void testNoOp() {
		// NOOP
	}

}
