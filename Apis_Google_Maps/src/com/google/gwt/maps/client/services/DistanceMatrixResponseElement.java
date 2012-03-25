package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A single element of a response to a DistanceMatrixService request, which contains the duration and distance from one origin to one destination.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#DistanceMatrixResponseElement}
 */
public class DistanceMatrixResponseElement extends JavaScriptObject {
  
  /**
   * use newInstance();
   */
  protected DistanceMatrixResponseElement() {}
  
  /**
   * A single element of a response to a DistanceMatrixService request, which contains the duration and distance from one origin to one destination.
   * @return
   */
  public static final DistanceMatrixResponseElement newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * The distance for this origin-destination pairing. This property may be undefined as the distance may be unknown.
   * @param distance
   */
  public final native void setDistance(Distance distance) /*-{
    this.distance = distance;
  }-*/;

  /**
   * The distance for this origin-destination pairing. This property may be undefined as the distance may be unknown.
   * @return
   */
  public final native Distance getDistance() /*-{
    return this.distance;
  }-*/;
  
  /**
   * The duration for this origin-destination pairing. This property may be undefined as the duration may be unknown.
   * @param duration
   */
  public final native void setDuration(Duration duration) /*-{
    this.duration = duration;
  }-*/;
  
  /**
   * The duration for this origin-destination pairing. This property may be undefined as the duration may be unknown.
   * @return
   */
  public final native Duration getDuration() /*-{
    return this.duration;
  }-*/;
  
  /**
   * The status of this particular origin-destination pairing.
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
   * @return
   */
  public final DistanceMatrixElementStatus getStatus() {
    return DistanceMatrixElementStatus.fromValue(getStatusImpl());
  }

  private final native String getStatusImpl() /*-{
    return this.status;
  }-*/;
  
}