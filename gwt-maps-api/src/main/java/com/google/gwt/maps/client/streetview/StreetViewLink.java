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

/**
 * A collection of references to adjacent Street View panos. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#StreetViewLink">StreetViewLink API
 * Doc</a>
 */
public class StreetViewLink extends JavaScriptObject {

  /**
   * A collection of references to adjacent Street View panos. use newInstance();
   */
  protected StreetViewLink() {
  }

  /**
   * A collection of references to adjacent Street View panos.
   */
  public static final StreetViewLink newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * sets A localized string describing the link.
   * 
   * @param description
   */
  public final native void setDescription(String description) /*-{
    this.description = description;
  }-*/;

  /**
   * gets A localized string describing the link.
   */
  public final native String getDescription() /*-{
    return this.description;
  }-*/;

  /**
   * sets The heading of the link.
   * 
   * @param heading
   */
  public final native void setHeading(int heading) /*-{
    this.heading = heading;
  }-*/;

  /**
   * gets The heading of the link.
   */
  public final native int getHeading() /*-{
    return this.heading;
  }-*/;

  /**
   * sets A unique identifier for the panorama. This id is stable within a session but unstable across sessions.
   * 
   * @param pano
   */
  public final native void setPano(String pano) /*-{
    this.pano = pano;
  }-*/;

  /**
   * gets A unique identifier for the panorama. This id is stable within a session but unstable across sessions.
   */
  public final native String getPano() /*-{
    return this.pano;
  }-*/;

}
