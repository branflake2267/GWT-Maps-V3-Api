package com.google.gwt.maps.client.adsense;

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
 * Implements AdSense for Content advertising on an associated map. To use an
 * AdUnit, you must obtain and specify an AdSense for Content publisher ID
 * within the AdUnit's constructor options. This class extends MVCObject.
 * {@link http
 * ://code.google.com/apis/maps/documentation/javascript/reference.html#AdUnit}
 */
public class AdUnitImpl extends MVCObject<AdUnitImpl> {

  private final static native JavaScriptObject createJso(Element container, AdUnitOptions options) /*-{
		return new $wnd.google.maps.adsense.AdUnit(container, options);
  }-*/;

  /**
   * Creates an AdSense for Content display ad on the associated map.
   * 
   * @param options
   * @return
   */
  public final static AdUnitImpl newInstance(Element container, AdUnitOptions options) {
    return createJso(container, options).cast();
  }

  /**
   * use newInstance();
   */
  protected AdUnitImpl() {}

  /**
   * This event is fired when the AdUnit's channelNumber property changes.
   * @param handler
   * @return
   */
  public final HandlerRegistration addChannelNumberChangeHandler(ChannelNumberChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.CHANNELNUMBER_CHANGED, handler, new ChannelNumberChangeEventFormatter());
  }

  /**
   * This event is fired when the AdUnit's format property changes.
   * @param handler
   * @return
   */
  public final HandlerRegistration addFormatChangeHandler(FormatChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.FORMAT_CHANGED, handler, new FormatChangeEventFormatter());
  }

  /**
   * This event is fired when the AdUnit's map property changes.
   * @param handler
   * @return
   */
  public final HandlerRegistration addMapChangeHandler(MapChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MAP_CHANGED, handler, new MapChangeEventFormatter());
  }

  /**
   * This event is fired when the AdUnit's position property changes.
   * @param handler
   * @return
   */
  public final HandlerRegistration addPositionChangeHandler(PositionChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.POSITION_CHANGED, handler, new PositionChangeEventFormatter());
  }

  /**
   * Returns the channel number in use by this AdUnit.
   * @return
   */
  public final native String getChannelNumber() /*-{
		return this.getChannelNumber();
  }-*/;

  /**
   * Returns the containing element of the AdUnit.
   * @return
   */
  public final native Element getContainer() /*-{
		return this.getContainer();
  }-*/;

  /**
   * Returns the format in use by this AdUnit.
   * @return
   */
  public final native AdFormat getFormat() /*-{
		return this.getFormat();
  }-*/;

  /**
   * Returns the map to which this AdUnit's ads are targeted.
   * @return
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }

  private final native MapImpl getMapImpl() /*-{
		return this.getMap();
  }-*/;

  /**
   * Returns the ControlPosition at which this AdUnit is displayed on the map.
   * @return
   */
  public final ControlPosition getPosition() {
    return ControlPosition.fromValue(getPositionImpl());
  }

  private final native int getPositionImpl() /*-{
    return this.getPosition();
  }-*/;
  
  /**
   * Returns the specified AdSense For Content publisher ID.
   * @return
   */
  public final native String getPublisherId() /*-{
		return this.getPublisherId();
  }-*/;
  
  /**
   * Specifies the channel number for this AdUnit. Channel numbers are optional and can be created for Google AdSense tracking.
   * @param channelNumber
   */
  public final native void setChannelNumber(String channelNumber) /*-{
		this.channelNumber = channelNumber;
  }-*/;

  /**
   * Specifies the display format for this AdUnit.
   * @param format
   */
  public final native void setFormat(AdFormat format) /*-{
		this.setFormat(format);
  }-*/;
  
  /**
   * Associates this AdUnit with the specified map. Ads will be targeted to the map's viewport. The map must be specified in order to display ads.
   * @param mapWidget
   */
  public final void setMap(MapWidget mapWidget) {
    setMapImpl(mapWidget.getJso());
  }
  
  private final native void setMapImpl(MapImpl map) /*-{
		this.setMap(map);
  }-*/;
  
  /**
   * Sets the ControlPosition at which to display the AdUnit on the map. If the position is set to null, the AdUnit is removed from the map.
   * @param controlPosition {@link ControlPosition}
   */
  public final void setPosition(ControlPosition position) {
    setPositionImpl(position.value());
  }

  private final native void setPositionImpl(int position) /*-{
    this.setPosition(position);
  }-*/;
  
}
