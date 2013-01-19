package com.google.gwt.maps.client.adsense;

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
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.controls.ControlPosition;

/**
 * ad unit options <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#AdUnitOptions" >AdUnitOptions API
 * Doc</a>
 */
public class AdUnitOptions extends JavaScriptObject {

  /**
   * creates options for adunit
   */
  public static final AdUnitOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }

  /**
   * use newInstance();
   */
  protected AdUnitOptions() {
  }

  /**
   * The AdSense For Content channel number for tracking the performance of this AdUnit. It must be stored as a string
   * as it will typically be a large UINT64. (Optional)
   */
  public final native String getChannelNumber() /*-{
    return this.channelNumber;
  }-*/;

  /**
   * The Format of the AdUnit. <br>
   * <br>
   * See <a href="https://google.com/adsense/adformats">AdFormats</a>
   */
  public final AdFormat getFormat() {
    return AdFormat.fromValue(getFormatImpl());
  }

  private final native String getFormatImpl() /*-{
    return this.format;
  }-*/;

  /**
   * The map associated with this AdUnit. Ads will be targeted to the location the map's viewport. (Required)
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }

  private final native MapImpl getMapImpl() /*-{
    return this.map;
  }-*/;

  /**
   * The position of the AdUnit. If specified, the AdUnit will be displayed at this position. Otherwise, it will not be
   * added to the map. (Optional)
   */
  public final ControlPosition getPosition() {
    return ControlPosition.fromValue(getPositionImpl());
  }

  private final native int getPositionImpl() /*-{
    return this.position;
  }-*/;

  /**
   * Your AdSense for Content publisher ID. Required and must be set at the time of initialization. (Required)
   */
  public final native String getPublisherId() /*-{
    return this.publisherId;
  }-*/;

  /**
   * set The AdSense For Content channel number for tracking the performance of this AdUnit. It must be stored as a
   * string as it will typically be a large UINT64. (Optional)
   * 
   * @param channelNumber
   */
  public final native void setChannelNumber(String channelNumber) /*-{
    this.channelNumber = channelNumber;
  }-*/;

  /**
   * the Format of the AdUnit. <br>
   * <br>
   * See <a href="https://google.com/adsense/adformats">AdFormats</a>
   * 
   * @param format
   */
  public final void setFormat(AdFormat format) {
    setFormatImpl(format.value());
  };

  private final native void setFormatImpl(String format) /*-{
    this.format = format;
  }-*/;

  /**
   * The map associated with this AdUnit. Ads will be targeted to the location the map's viewport. (Required)
   * 
   * @param mapWidget
   */
  public final void setMap(MapWidget mapWidget) {
    MapImpl value = mapWidget != null ? mapWidget.getJso() : null;
    setMapImpl(value);
  }

  private final native void setMapImpl(MapImpl map) /*-{
    this.map = map;
  }-*/;

  /**
   * The position of the AdUnit. If specified, the AdUnit will be displayed at this position. Otherwise, it will not be
   * added to the map. (Optional)
   * 
   * @param position
   */
  public final void setPosition(ControlPosition position) {
    setPositionImpl(position.value());
  }

  private final native void setPositionImpl(int position) /*-{
    this.position = position;
  }-*/;

  /**
   * Your AdSense for Content publisher ID. Required and must be set at the time of initialization. (Required)
   * 
   * @param publisherId
   */
  public final native void setPublisherId(String publisherId) /*-{
    this.publisherId = publisherId;
  }-*/;

}
