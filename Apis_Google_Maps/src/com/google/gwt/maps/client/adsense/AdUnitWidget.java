package com.google.gwt.maps.client.adsense;

import com.google.gwt.dom.client.Element;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.controls.ControlPosition;
import com.google.gwt.maps.client.events.channelnumber.ChannelNumberChangeMapHandler;
import com.google.gwt.maps.client.events.format.FormatChangeMapHandler;
import com.google.gwt.maps.client.events.mapchange.MapChangeMapHandler;
import com.google.gwt.maps.client.events.position.PositionChangeMapHandler;
import com.google.gwt.maps.client.mvc.MVCObjectWidget;
import com.google.gwt.user.client.DOM;

/**
 * Implements AdSense for Content advertising on an associated map. To use an
 * AdUnit, you must obtain and specify an AdSense for Content publisher ID
 * within the AdUnit's constructor options. This class extends MVCObject.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#AdUnit}
 */
public class AdUnitWidget extends MVCObjectWidget<AdUnitImpl> {

  /**
   * jso
   */
  private AdUnitImpl impl;

  /**
   * create AdUnit widget
   * @param options
   */
  public AdUnitWidget(AdUnitOptions options) {
    Element div = DOM.createDiv();
    impl = AdUnitImpl.newInstance(div, options);
    setElement(div);
  }

  /**
   * This event is fired when the AdUnit's channelNumber property changes.
   * @param handler
   * @return
   */
  public final HandlerRegistration addChannelNumberChangeHandler(ChannelNumberChangeMapHandler handler) {
    return impl.addChannelNumberChangeHandler(handler);
  }

  /**
   * This event is fired when the AdUnit's format property changes.
   * @param handler
   * @return
   */
  public final HandlerRegistration addFormatChangeHandler(FormatChangeMapHandler handler) {
    return impl.addFormatChangeHandler(handler);
  }

  /**
   * This event is fired when the AdUnit's map property changes.
   * @param handler
   * @return
   */
  public final HandlerRegistration addMapChangeHandler(MapChangeMapHandler handler) {
    return impl.addMapChangeHandler(handler);
  }

  /**
   * This event is fired when the AdUnit's position property changes.
   * @param handler
   * @return
   */
  public final HandlerRegistration addPositionChangeHandler(PositionChangeMapHandler handler) {
    return impl.addPositionChangeHandler(handler);
  }

  /**
   * Returns the channel number in use by this AdUnit.
   * @return
   */
  public final String getChannelNumber() {
		return impl.getChannelNumber();
  };

  /**
   * Returns the containing element of the AdUnit.
   * @return
   */
  public final Element getContainer() {
		return impl.getContainer();
  };

  /**
   * Returns the format in use by this AdUnit.
   * @return
   */
  public final AdFormat getFormat() {
		return impl.getFormat();
  };

  /**
   * Returns the map to which this AdUnit's ads are targeted.
   * @return
   */
  public final MapWidget getMap() {
    return impl.getMap();
  }

  /**
   * Returns the ControlPosition at which this AdUnit is displayed on the map.
   * @return
   */
  public final ControlPosition getPosition() {
    return impl.getPosition();
  }
  
  /**
   * Returns the specified AdSense For Content publisher ID.
   * @return
   */
  public final String getPublisherId() {
		return impl.getPublisherId();
  };
  
  /**
   * Specifies the channel number for this AdUnit. Channel numbers are optional and can be created for Google AdSense tracking.
   * @param channelNumber
   */
  public final void setChannelNumber(String channelNumber) {
		impl.setChannelNumber(channelNumber);
  };

  /**
   * Specifies the display format for this AdUnit.
   * @param format
   */
  public final void setFormat(AdFormat format) {
		impl.setFormat(format);
  };
  
  /**
   * Associates this AdUnit with the specified map. Ads will be targeted to the map's viewport. The map must be specified in order to display ads.
   * @param mapWidget
   */
  public final void setMap(MapWidget mapWidget) {
    impl.setMap(mapWidget);
  }
  
  /**
   * Sets the ControlPosition at which to display the AdUnit on the map. If the position is set to null, the AdUnit is removed from the map.
   * @param controlPosition {@link ControlPosition}
   */
  public final void setPosition(ControlPosition position) {
    impl.setPosition(position);
  }
  
}
