package com.google.gwt.maps.client.overlays;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Size;
import com.google.gwt.user.client.ui.Widget;

/** 
 * InfoWindow Options
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#InfoWindowOptions}
 */
public class InfoWindowOptions extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected InfoWindowOptions() {}
  
  /**
   * InfoWindow Options
   * @return
   */
  public static final InfoWindowOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * set widget to display in infoWindow
   * @param widget
   */
  public final void setContent(Widget widget) {
    setContent(widget.getElement());
  }
  
  /**
   * set Content to display in the InfoWindow. This can be an HTML element, a plain-text string, or a string containing HTML. The InfoWindow will be sized according to the content. To set an explicit size for the content, set content to be a HTML element with that size.
   * @param content
   */
  public final native void setContent(String content) /*-{
    this.content = content;
  }-*/;
  
  /**
   * get Content to display in the InfoWindow. This can be an HTML element, a plain-text string, or a string containing HTML. The InfoWindow will be sized according to the content. To set an explicit size for the content, set content to be a HTML element with that size.
   * @return
   */
  public final native String getContent_String() /*-{
    return this.content;
  }-*/;

  /**
   * set Content to display in the InfoWindow. This can be an HTML element, a plain-text string, or a string containing HTML. The InfoWindow will be sized according to the content. To set an explicit size for the content, set content to be a HTML element with that size.
   * @param content
   */
  public final native void setContent(Element content) /*-{
    this.content = content;
  }-*/;
  
  /**
   * get Content to display in the InfoWindow. This can be an HTML element, a plain-text string, or a string containing HTML. The InfoWindow will be sized according to the content. To set an explicit size for the content, set content to be a HTML element with that size.
   * @return
   */
  public final native Element getContent_Element() /*-{
    return this.content;
  }-*/;
  
  /**
   * sets Disable auto-pan on open. By default, the info window will pan the map so that it is fully visible when it opens.
   * @param disableAutoPan
   */
  public final native void setDisableAutoPan(boolean disableAutoPan) /*-{
    this.disableAutoPan = disableAutoPan;
  }-*/;
  
  /**
   * gets Disable auto-pan on open. By default, the info window will pan the map so that it is fully visible when it opens.
   * @return
   */
  public final native boolean getDisableAutoPan() /*-{
    return this.disableAutoPan;
  }-*/;
  
  /**
   * sets Maximum width of the infowindow, regardless of content's width. This value is only considered if it is set before a call to open. To change the maximum width when changing content, call close, setOptions, and then open.
   * @param width
   */
  public final native void setMaxWidth(int width) /*-{
    this.width = width;
  }-*/;
  
  /**
   * gets Maximum width of the infowindow, regardless of content's width. This value is only considered if it is set before a call to open. To change the maximum width when changing content, call close, setOptions, and then open.
   * @return
   */
  public final native int getMaxWidth() /*-{
    return this.width;
  }-*/;
  
  /**
   * sets The offset, in pixels, of the tip of the info window from the point on the map at whose geographical coordinates the info window is anchored. If an InfoWindow is opened with an anchor, the pixelOffset will be calculated from the top-center of the anchor's bounds.
   * @param size
   */
  public final native void setPixelOffet(Size size) /*-{
    this.size = size;
  }-*/;
  
  /**
   * gets The offset, in pixels, of the tip of the info window from the point on the map at whose geographical coordinates the info window is anchored. If an InfoWindow is opened with an anchor, the pixelOffset will be calculated from the top-center of the anchor's bounds.
   * @return
   */
  public final native Size getPixelOffset() /*-{
    return this.size;
  }-*/;
  
  /**
   * sets The LatLng at which to display this InfoWindow. If the InfoWindow is opened with an anchor, the anchor's position will be used instead.
   * @param position
   */
  public final native void setPosition(LatLng position) /*-{
    this.position = position;
  }-*/;
  
  /**
   * gets The LatLng at which to display this InfoWindow. If the InfoWindow is opened with an anchor, the anchor's position will be used instead.
   * @return
   */
  public final native LatLng getPosition() /*-{
    return this.position;
  }-*/;
  
  /**
   * sets All InfoWindows are displayed on the map in order of their zIndex, with higher values displaying in front of InfoWindows with lower values. By default, InfoWinodws are displayed according to their latitude, with InfoWindows of lower latitudes appearing in front of InfoWindows at higher latitudes. InfoWindows are always displayed in front of markers. 
   * @param zIndex
   */
  public final native void setZindex(int zIndex) /*-{
    this.zIndex = zIndex;
  }-*/;
  
  /**
   * gets All InfoWindows are displayed on the map in order of their zIndex, with higher values displaying in front of InfoWindows with lower values. By default, InfoWinodws are displayed according to their latitude, with InfoWindows of lower latitudes appearing in front of InfoWindows at higher latitudes. InfoWindows are always displayed in front of markers.
   * @return
   */
  public final native int getZindex() /*-{
    return this.zIndex;
  }-*/;

}
