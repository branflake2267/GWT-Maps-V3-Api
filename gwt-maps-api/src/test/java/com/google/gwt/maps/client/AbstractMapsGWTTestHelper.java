package com.google.gwt.maps.client;

/*
 * #%L
 * GWT Maps API V3 - Core API
 * %%
 * Copyright (C) 2011 - 2012 GWT Maps API V3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.util.ArrayList;
import java.util.Arrays;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.base.LatLng;

/**
 * Common actions taken when testing maps code
 * 
 * @author Joseph Lust
 * 
 */
public abstract class AbstractMapsGWTTestHelper extends GWTTestCase {

  private final String MODULE_NAME = "com.google.gwt.maps.MapsForTests";
  private int asyncDelayMs = 30000;
  private final double equalsEpsilon = 1e-3;
  private boolean sensor = false;

  /**
   * Runs the test with libraries defined by the {@link #getLibraries()} override loaded and fails if not complete by
   * {@link #getAsyncDelayMs()}.<br>
   * <br>
   * <b>NOTE:</b> You must call {@link #finishTest()} or test will fail.
   * 
   * @param test code to run
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
   * Runs the test with the given libraries loaded and fails if not complete by {@link #getAsyncDelayMs()}.<br>
   * <br>
   * <b>NOTE:</b> You must call {@link #finishTest()} or test will fail.
   * 
   * @param test code to run
   * @param libs libraries to have loaded
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
   * Returns the libraries that will be loaded before the test is run if the no library method overload is called.
   * 
   * @return
   */
  public abstract LoadLibrary[] getLibraries();

  @Override
  public String getModuleName() {
    return MODULE_NAME;
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

  public final double getEqualsEpsilon() {
    return equalsEpsilon;
  }

  /** HELPERS **/

  /**
   * Assert that two {@link LatLng} are equal within {@link #getEqualsEpsilon()} .
   * 
   * @param expected
   * @param actual
   */
  public final void assertLatLngEquals(LatLng expected, LatLng actual) {
    assert expected != null : "Point1 cannot be null in assertLatLngEquals()";
    assert actual != null : "Point2 cannot be null in assertLatLngEquals()";

    // assertEquals("Latitude not equal within epsilon", expected.getLatitude(), actual.getLatitude(),
    // getEqualsEpsilon());
    // assertEquals("Longitude not equal within epsilon", expected.getLongitude(), actual.getLongitude(),
    // getEqualsEpsilon());

    assertEquals(Double.doubleToLongBits(expected.getLatitude()), Double.doubleToLongBits(actual.getLatitude()));
    assertEquals(Double.doubleToLongBits(expected.getLongitude()), Double.doubleToLongBits(actual.getLongitude()));
  }
  
  /**
   * Assert that two (@link LatLng} are within a certain distance from each other.
   * @param expected
   * @param actual
   * @param maxDistanceMeters The maximum distance between the two points, in meters.
   */
  public final void assertLatLngDistance(LatLng expected, LatLng actual, double maxDistanceMeters) {
    double distance = computeHaversineDistance(expected.getLatitude(), expected.getLongitude(), actual.getLatitude(), actual.getLongitude());
    assertTrue(distance < maxDistanceMeters);
  }
  
  private static final double EARTH_RADIUS = 6371 * 1000;

  /*
   * Approximation of the haversine formula, but much faster (use only one
   * cosine and one square root). Works only if lat1 ~ lat2 and lon1 ~ lon2.
   * Coordinates are given in decimal DEGREES.
   */
  public static double computeHaversineDistance(double lat1, double lon1,
    double lat2, double lon2) {
    double dLat = Math.toRadians(lat2 - lat1);
    double dLon = Math.toRadians(lon2 - lon1)
    		* Math.cos(Math.toRadians((lat1 + lat2) / 2));
    return EARTH_RADIUS * Math.sqrt(dLat * dLat + dLon * dLon);
  }


}
