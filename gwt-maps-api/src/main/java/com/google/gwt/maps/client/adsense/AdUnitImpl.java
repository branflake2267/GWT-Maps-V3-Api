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
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.controls.ControlPosition;
import com.google.gwt.maps.client.events.MapEventType;
import com.google.gwt.maps.client.events.MapHandlerRegistration;
import com.google.gwt.maps.client.events.channelnumber.ChannelNumberChangeEventFormatter;
import com.google.gwt.maps.client.events.channelnumber.ChannelNumberChangeMapHandler;
import com.google.gwt.maps.client.events.format.FormatChangeEventFormatter;
import com.google.gwt.maps.client.events.format.FormatChangeMapHandler;
import com.google.gwt.maps.client.events.mapchange.MapChangeEventFormatter;
import com.google.gwt.maps.client.events.mapchange.MapChangeMapHandler;
import com.google.gwt.maps.client.events.position.PositionChangeEventFormatter;
import com.google.gwt.maps.client.events.position.PositionChangeMapHandler;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * Implements AdSense for Content advertising on an associated map. To use an AdUnit, you must obtain and specify an
 * AdSense for Content publisher ID within the AdUnit's constructor options. This class extends MVCObject. <br>
 * <br>
 * See <a href= "https://developers.google.com/maps/documentation/javascript/reference#AdUnit" >AdUnit API Doc</a>
 */
public class AdUnitImpl extends MVCObject<AdUnitImpl> {

  private final static native JavaScriptObject createJso(Element container, AdUnitOptions options) /*-{
    return new $wnd.google.maps.adsense.AdUnit(container, options);
  }-*/;

  /**
   * Creates an AdSense for Content display ad on the associated map.
   * 
   * @param options
   */
  public final static AdUnitImpl newInstance(Element container, AdUnitOptions options) {
    return createJso(container, options).cast();
  }

  /**
   * use newInstance();
   */
  protected AdUnitImpl() {
  }

  /**
   * This event is fired when the AdUnit's channelNumber property changes.
   * 
   * @param handler
   */
  public final HandlerRegistration addChannelNumberChangeHandler(ChannelNumberChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.CHANNELNUMBER_CHANGED, handler,
        new ChannelNumberChangeEventFormatter());
  }

  /**
   * This event is fired when the AdUnit's format property changes.
   * 
   * @param handler
   */
  public final HandlerRegistration addFormatChangeHandler(FormatChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.FORMAT_CHANGED, handler,
        new FormatChangeEventFormatter());
  }

  /**
   * This event is fired when the AdUnit's map property changes.
   * 
   * @param handler
   */
  public final HandlerRegistration addMapChangeHandler(MapChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MAP_CHANGED, handler, new MapChangeEventFormatter());
  }

  /**
   * This event is fired when the AdUnit's position property changes.
   * 
   * @param handler
   */
  public final HandlerRegistration addPositionChangeHandler(PositionChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.POSITION_CHANGED, handler,
        new PositionChangeEventFormatter());
  }

  /**
   * Returns the channel number in use by this AdUnit.
   */
  public final native String getChannelNumber() /*-{
    return this.getChannelNumber();
  }-*/;

  /**
   * Returns the containing element of the AdUnit.
   */
  public final native Element getContainer() /*-{
    return this.getContainer();
  }-*/;

  /**
   * Returns the format in use by this AdUnit.
   */
  public final AdFormat getFormat() {
    return AdFormat.fromValue(getFormatImpl());
  }

  public final native String getFormatImpl() /*-{
    return this.getFormat();
  }-*/;

  /**
   * Returns the map to which this AdUnit's ads are targeted.
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }

  private final native MapImpl getMapImpl() /*-{
    return this.getMap();
  }-*/;

  /**
   * Returns the ControlPosition at which this AdUnit is displayed on the map.
   */
  public final ControlPosition getPosition() {
    return ControlPosition.fromValue(getPositionImpl());
  }

  private final native int getPositionImpl() /*-{
    return this.getPosition();
  }-*/;

  /**
   * Returns the specified AdSense For Content publisher ID.
   */
  public final native String getPublisherId() /*-{
    return this.getPublisherId();
  }-*/;

  /**
   * Specifies the channel number for this AdUnit. Channel numbers are optional and can be created for Google AdSense
   * tracking.
   * 
   * @param channelNumber
   */
  public final native void setChannelNumber(String channelNumber) /*-{
    this.channelNumber = channelNumber;
  }-*/;

  /**
   * Specifies the display format for this AdUnit.
   * 
   * @param format
   */
  public final native void setFormat(AdFormat format) /*-{
    this.setFormat(format);
  }-*/;

  /**
   * Associates this AdUnit with the specified map. Ads will be targeted to the map's viewport. The map must be
   * specified in order to display ads.
   * 
   * @param mapWidget
   */
  public final void setMap(MapWidget mapWidget) {
    if (mapWidget == null) {
      setMapImpl(null);
    } else {
      setMapImpl(mapWidget.getJso());
    }
  }

  private final native void setMapImpl(MapImpl map) /*-{
    this.setMap(map);
  }-*/;

  /**
   * Sets the ControlPosition at which to display the AdUnit on the map. If the position is set to null, the AdUnit is
   * removed from the map.
   * 
   * @param position {@link ControlPosition}
   */
  public final void setPosition(ControlPosition position) {
    setPositionImpl(position.value());
  }

  private final native void setPositionImpl(int position) /*-{
    this.setPosition(position);
  }-*/;

}
