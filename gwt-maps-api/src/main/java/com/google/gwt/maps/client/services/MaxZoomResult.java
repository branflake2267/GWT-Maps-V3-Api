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
 * A MaxZoom result in JSON format retrieved from the MaxZoomService. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#MaxZoomResult">MaxZoomResult API
 * Doc</a>
 */
public class MaxZoomResult extends JavaScriptObject {

  /**
   * generated from callback use newInstance();
   */
  protected MaxZoomResult() {
  }

  /**
   * A MaxZoom result in JSON format retrieved from the MaxZoomService.
   */
  public static final MaxZoomResult newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * Status of the request.
   * 
   * @param status
   */
  public final void setStatus(MaxZoomStatus status) {
    setStatusImpl(status.value());
  }

  private final native void setStatusImpl(String status) /*-{
    this.status = status;
  }-*/;

  /**
   * Status of the request.
   */
  public final MaxZoomStatus getStatus() {
    return MaxZoomStatus.fromValue(getStatusImpl());
  }

  private final native String getStatusImpl() /*-{
    return this.status;
  }-*/;

  /**
   * The maximum zoom level found at the given LatLng.
   * 
   * @param zoom
   */
  public final native void setZoom(int zoom) /*-{
    this.zoom = zoom;
  }-*/;

  /**
   * The maximum zoom level found at the given LatLng.
   */
  public final native int getZoom() /*-{
    return this.zoom;
  }-*/;

}
