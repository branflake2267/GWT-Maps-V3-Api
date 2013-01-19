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
import com.google.gwt.core.client.JsArray;

/**
 * The representation of a panorama returned from the provider defined using registerPanoProvider. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#StreetViewPanoramaOptions">
 * StreetViewPanoramaOptions API Doc</a>
 */
public class StreetViewPanoramaData extends JavaScriptObject {

  /**
   * The representation of a panorama returned from the provider defined using registerPanoProvider. use newInstance();
   */
  protected StreetViewPanoramaData() {
  }

  /**
   * The representation of a panorama returned from the provider defined using registerPanoProvider.
   * 
   * @return {@link StreetViewPanoramaData}
   */
  public final static StreetViewPanoramaData newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * sets Specifies the copyright text for this panorama.
   * 
   * @param copyright
   */
  public final native void setCopyright(String copyright) /*-{
    this.copyright = copyright;
  }-*/;

  /**
   * gets Specifies the copyright text for this panorama.
   */
  public final native String getCopyright() /*-{
    return this.copyright;
  }-*/;

  /**
   * sets Specifies the navigational links to adjacent panoramas.
   * 
   * @param links {@link StreetViewLink}
   */
  public final native void setLinks(JsArray<StreetViewLink> links) /*-{
    this.links = links;
  }-*/;

  /**
   * gets Specifies the navigational links to adjacent panoramas.
   * 
   * @return {@link StreetViewLink}
   */
  public final native JsArray<StreetViewLink> getLinks() /*-{
    return this.links;
  }-*/;

  /**
   * sets Specifies the location meta-data for this panorama.
   * 
   * @param location {@link StreetViewLocation}
   */
  public final native void setLocation(StreetViewLocation location) /*-{
    this.location = location;
  }-*/;

  /**
   * gets Specifies the location meta-data for this panorama.
   * 
   * @return {@link StreetViewLocation}
   */
  public final native StreetViewLocation getLocation() /*-{
    return this.location;
  }-*/;

  /**
   * sets Specifies the custom tiles for this panorama.
   * 
   * @param tiles {@link StreetViewTileData}
   */
  public final native void setTileData(StreetViewTileData tiles) /*-{
    this.tiles = tiles;
  }-*/;

  /**
   * gets Specifies the custom tiles for this panorama.
   * 
   * @return {@link StreetViewTileData}
   */
  public final native StreetViewTileData getTileData() /*-{
    return this.tiles;
  }-*/;

}
