package com.google.gwt.maps.client.overlays;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.events.MapEventType;
import com.google.gwt.maps.client.events.MapHandlerRegistration;
import com.google.gwt.maps.client.events.click.ClickEventFormatter;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * A groundoverlay overlay. This class extends MVCObject.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#GroundOverlay}
 */
public class GroundOverlay extends MVCObject<GroundOverlay> {

  /**
   * use newInstance();
   */
  protected GroundOverlay() {}

  /**
   * Creates a ground overlay from the provided image URL and its LatLngBounds. The image is scaled to fit the current bounds, and projected using the current map projection.
   * @param url
   * @param bounds
   * @param options
   * @return
   */
  public final static GroundOverlay newInstance(String url, LatLngBounds bounds, GroundOverlayOptions options) {
    return createJso(url, bounds, options).cast();
  }

  private final static native JavaScriptObject createJso(String url, LatLngBounds bounds, GroundOverlayOptions options) /*-{
    return new $wnd.google.maps.GroundOverlay(url, bounds, options);
  }-*/;

  /**
   * Returns the bounds of this groundoverlay.
   * @return
   */
  public final native LatLngBounds getBounds() /*-{
    return this.getBounds();
  }-*/;

  /**
   * Renders the groundoverlay on the specified map. If map is set to null, the groundoverlay will be removed.
   * @param mapWidget
   */
  public final void setMap(MapWidget mapWidget) {
    setMapImpl(mapWidget.getJso());
  }

  private final native void setMapImpl(MapImpl map) /*-{
    this.map = map;
  }-*/;

  /**
   * Returns the map on which this groundoverlay is displayed.
   * @return
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }

  private final native MapImpl getMapImpl() /*-{
    return this.map;
  }-*/;
  
  /**
   * Gets the url of the projected image.
   * @return
   */
  public final native String getUrl() /*-{
    this.getUrl();
  }-*/;
 
  /**
   * This event is fired when the DOM click event is fired on the GroundOverlay.
   * @param handler
   * @return
   */
  public final HandlerRegistration addClickHandler(ClickMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.CLICK, handler, new ClickEventFormatter());
  }
  
} 
