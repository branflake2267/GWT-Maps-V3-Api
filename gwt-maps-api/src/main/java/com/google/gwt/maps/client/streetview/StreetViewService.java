package com.google.gwt.maps.client.streetview;

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
import com.google.gwt.maps.client.base.LatLng;

/**
 * A StreetViewService object performs searches for Street View data. <br>
 * <br>
 * See <a
 * href="https://developers.google.com/maps/documentation/javascript/reference#StreetViewService">StreetViewService API
 * Doc</a>
 */
public class StreetViewService extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected StreetViewService() {
  }

  /**
   * A StreetViewService object performs searches for Street View data.
   */
  public static final StreetViewService newInstance() {
    return createJso().cast();
  }

  /**
   * Use newInstance(). This method has been spelled incorrectly.
   * Deprecated on 1/26/2013. Deprecate in 3.11
   */
  @Deprecated
  public static final StreetViewService newInstnace() {
    return newInstance();
  }
  
  private static final native JavaScriptObject createJso() /*-{
    return new $wnd.google.maps.StreetViewService();
  }-*/;

  /**
   * Retrieves the data for the given pano id and passes it to the provided callback as a StreetViewPanoramaData object.
   * Pano ids are unique per panorama and stable for the lifetime of a session, but are liable to change between
   * sessions.
   * 
   * @param pano
   * @param handler
   */
  public final native void getPanoramaById(String pano, PanoramaIdHandler handler) /*-{
    // 
    var callback = function(data, status) {
      $entry(@com.google.gwt.maps.client.streetview.StreetViewService::getPanoramaByIdImpl(Lcom/google/gwt/maps/client/streetview/StreetViewPanoramaData;Ljava/lang/String;Lcom/google/gwt/maps/client/streetview/PanoramaIdHandler;)(data, status, handler));
    };
    this.getPanoramaById(pano, callback);
  }-*/;

  private static final void getPanoramaByIdImpl(StreetViewPanoramaData data, String status, PanoramaIdHandler handler) {
    handler.onCallback(data, StreetViewStatus.fromValue(status));
  }

  /**
   * Retrieves the StreetViewPanoramaData for a panorama within a given radius of the given LatLng. The
   * StreetViewPanoramaData is passed to the provided callback. If the radius is less than 50 meters, the nearest
   * panorama will be returned.
   * 
   * @param latlng
   * @param radius
   * @param handler
   */
  public final native void getPanoramaByLocation(LatLng latlng, double radius, PanoramaByLocationHandler handler) /*-{
    var callback = function(data, status) {
      $entry(@com.google.gwt.maps.client.streetview.StreetViewService::getPanoramaByLocationImpl(Lcom/google/gwt/maps/client/streetview/StreetViewPanoramaData;Ljava/lang/String;Lcom/google/gwt/maps/client/streetview/PanoramaByLocationHandler;)(data, status, handler));
    };
    this.getPanoramaByLocation(latlng, radius, callback);
  }-*/;

  private static final void getPanoramaByLocationImpl(StreetViewPanoramaData data, String status,
      PanoramaByLocationHandler handler) {
    handler.onCallback(data, StreetViewStatus.fromValue(status));
  }

}
