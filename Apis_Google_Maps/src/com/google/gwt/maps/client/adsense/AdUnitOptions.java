package com.google.gwt.maps.client.adsense;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.controls.ControlPosition;

/**
 * ad unit options
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#AdUnitOptions}
 */
public class AdUnitOptions extends JavaScriptObject {

  /**
   * creates options for adunit
   * @return
   */
  public static final AdUnitOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * use newInstance();
   */
  protected AdUnitOptions() {}
  
  /**
   * The AdSense For Content channel number for tracking the performance of this AdUnit. It must be stored as a string as it will typically be a large UINT64. (Optional)
   * @return
   */
  public final native String getChannelNumber() /*-{
    return this.channelNumber;
  }-*/;
  
  /**
   * The Format of the AdUnit. See https://google.com/adsense/adformats (Optional)
   * @return
   */
  public final AdFormat getFormat() {
    return AdFormat.fromValue(getFormatImpl());
  }
  
  private final native String getFormatImpl() /*-{
    return this.format;
  }-*/;
  
  /**
   * The map associated with this AdUnit. Ads will be targeted to the location the map's viewport. (Required)
   * @return
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }
  
  private final native MapImpl getMapImpl() /*-{
    return this.map;
  }-*/;
  
  /**
   * The position of the AdUnit. If specified, the AdUnit will be displayed at this position. Otherwise, it will not be added to the map. (Optional)
   * @return
   */
  public final ControlPosition getPosition() {
    return ControlPosition.fromValue(getPositionImpl());
  }

  private final native int getPositionImpl() /*-{
    return this.position;
  }-*/;
  
  /**
   * Your AdSense for Content publisher ID. Required and must be set at the time of initialization. (Required)
   * @return
   */
  public final native String getPublisherId() /*-{
    return this.publisherId;
  }-*/;

  /**
   * set The AdSense For Content channel number for tracking the performance of this AdUnit. It must be stored as a string as it will typically be a large UINT64. (Optional)
   * @param channelNumber
   */
  public final native void setChannelNumber(String channelNumber) /*-{
    this.channelNumber = channelNumber;
  }-*/;
  
  /**
   * the Format of the AdUnit. See https://google.com/adsense/adformats (Optional)
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
   * @param mapWidget
   */
  public final void setMap(MapWidget mapWidget) {
    setMapImpl(mapWidget.getJso());
  }
  
  private final native void setMapImpl(MapImpl map) /*-{
    this.map = map;
  }-*/;
  
  /**
   * The position of the AdUnit. If specified, the AdUnit will be displayed at this position. Otherwise, it will not be added to the map. (Optional)
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
   * @param publisherId
   */
  public final native void setPublisherId(String publisherId) /*-{
    this.publisherId = publisherId;
  }-*/;

}
