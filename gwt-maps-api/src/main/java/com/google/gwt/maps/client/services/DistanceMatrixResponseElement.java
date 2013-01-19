package com.google.gwt.maps.client.services;

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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A single element of a response to a DistanceMatrixService request, which contains the duration and distance from one
 * origin to one destination. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#DistanceMatrixResponseElement">
 * DistanceMatrixResponseElement API Doc</a>
 */
public class DistanceMatrixResponseElement extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected DistanceMatrixResponseElement() {
  }

  /**
   * A single element of a response to a DistanceMatrixService request, which contains the duration and distance from
   * one origin to one destination.
   */
  public static final DistanceMatrixResponseElement newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * The distance for this origin-destination pairing. This property may be undefined as the distance may be unknown.
   * 
   * @param distance
   */
  public final native void setDistance(Distance distance) /*-{
    this.distance = distance;
  }-*/;

  /**
   * The distance for this origin-destination pairing. This property may be undefined as the distance may be unknown.
   */
  public final native Distance getDistance() /*-{
    return this.distance;
  }-*/;

  /**
   * The duration for this origin-destination pairing. This property may be undefined as the duration may be unknown.
   * 
   * @param duration
   */
  public final native void setDuration(Duration duration) /*-{
    this.duration = duration;
  }-*/;

  /**
   * The duration for this origin-destination pairing. This property may be undefined as the duration may be unknown.
   */
  public final native Duration getDuration() /*-{
    return this.duration;
  }-*/;

  /**
   * The status of this particular origin-destination pairing.
   * 
   * @param status
   */
  public final void setStatus(DistanceMatrixElementStatus status) {
    setStatusImpl(status.value());
  }

  private final native void setStatusImpl(String status) /*-{
    this.status = status;
  }-*/;

  /**
   * The status of this particular origin-destination pairing.
   */
  public final DistanceMatrixElementStatus getStatus() {
    return DistanceMatrixElementStatus.fromValue(getStatusImpl());
  }

  private final native String getStatusImpl() /*-{
    return this.status;
  }-*/;

}