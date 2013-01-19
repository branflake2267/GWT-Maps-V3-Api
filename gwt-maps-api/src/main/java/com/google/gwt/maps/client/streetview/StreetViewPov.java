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
import com.google.gwt.maps.client.workaround.WorkAroundUtils;

/**
 * A point of view object which specifies the camera's orientation at the Street View panorama's position. The point of
 * view is defined as heading, pitch and zoom.
 */
public class StreetViewPov extends JavaScriptObject {

  /**
   * A point of view object which specifies the camera's orientation at the Street View panorama's position. The point
   * of view is defined as heading, pitch and zoom. use newInstance();
   */
  protected StreetViewPov() {
  }

  /**
   * creates A point of view object which specifies the camera's orientation at the Street View panorama's position. The
   * point of view is defined as heading, pitch and zoom.
   */
  public final static StreetViewPov newInstance() {
    JavaScriptObject jso = JavaScriptObject.createObject();
    WorkAroundUtils.removeGwtObjectId(jso);
    return jso.cast();
  }

  /**
   * sets The camera heading in degrees relative to true north. True north is 0°, east is 90°, south is 180°, west is
   * 270°.
   * 
   * @param heading
   */
  public final native void setHeading(int heading) /*-{
    this.heading = heading;
  }-*/;

  /**
   * gets The camera heading in degrees relative to true north. True north is 0°, east is 90°, south is 180°, west is
   * 270°.
   */
  public final native int getHeading() /*-{
    return this.heading;
  }-*/;

  /**
   * sets The camera pitch in degrees, relative to the street view vehicle. Ranges from 90° (directly upwards) to -90°
   * (directly downwards).
   * 
   * @param pitch
   */
  public final native void setPitch(int pitch) /*-{
    this.pitch = pitch;
  }-*/;

  /**
   * gets The camera pitch in degrees, relative to the street view vehicle. Ranges from 90° (directly upwards) to -90°
   * (directly downwards).
   */
  public final native int getPitch() /*-{
    return this.pitch;
  }-*/;

  /**
   * sets The zoom level. Fully zoomed-out is level 0, zooming in increases the zoom level.
   * 
   * @param zoom
   */
  public final native void setZoom(int zoom) /*-{
    this.zoom = zoom;
  }-*/;

  /**
   * gets The zoom level. Fully zoomed-out is level 0, zooming in increases the zoom level.
   */
  public final native int getZoom() /*-{
    return this.zoom;
  }-*/;

}
