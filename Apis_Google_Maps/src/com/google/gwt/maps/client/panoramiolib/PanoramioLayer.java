package com.google.gwt.maps.client.panoramiolib;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.events.MapEventType;
import com.google.gwt.maps.client.events.MapHandlerRegistration;
import com.google.gwt.maps.client.events.panoramiomouse.PanoramioMouseEventFormatter;
import com.google.gwt.maps.client.events.panoramiomouse.PanoramioMouseMapHandler;
import com.google.gwt.maps.client.mvc.MVCObject;

/**
 * A PanoramioLayer displays photos from Panoramio as a rendered layer. This class extends MVCObject.
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#PanoramioLayer">PanoramioLayer API Doc</a>
 */
public class PanoramioLayer extends MVCObject<PanoramioLayer> {

  /**
   * use newInstance();
   */
  protected PanoramioLayer() {}
  
  /**
   * A PanoramioLayer displays photos from Panoramio as a rendered layer. This class extends MVCObject.
   * @param options
   */
  public static final PanoramioLayer newInstance(PanoramioLayerOptions options) {
    return createJso(options).cast();
  }

  private static final native JavaScriptObject createJso(PanoramioLayerOptions options) /*-{
    return new $wnd.google.maps.panoramio.PanoramioLayer(options);
  }-*/;
  
  /**
   * The map on which to display the layer.
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
   * The map on which to display the layer.
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }

  private final native MapImpl getMapImpl() /*-{
    return this.getMap();
  }-*/;
  
  /**
   * A panoramio tag used to filter the photos which are displayed. Only photos which have been tagged with the supplied string will be shown.
   */
  public final native String getTag() /*-{
    return this.getTag();
  }-*/;
  
  /**
   * A panoramio tag used to filter the photos which are displayed. Only photos which have been tagged with the supplied string will be shown.
   * @param tag
   */
  public final native void setTag(String tag) /*-{
    this.setTag(tag);
  }-*/;
  
  /**
   * A Panoramio user ID. If provided, only photos by this user will be displayed on the map. If both a tag and user ID are provided, the tag will take precedence.
   * @param userId
   */
  public final native void setUserId(String userId) /*-{
    this.setUserId(userId);
  }-*/;
  
  /**
   * A Panoramio user ID. If provided, only photos by this user will be displayed on the map. If both a tag and user ID are provided, the tag will take precedence.
   */
  public final native String getUserId() /*-{
    return this.getUserId();
  }-*/;
  
  /**
   * This object defines the properties that can be set on a PanoramioLayer object.
   * @param options
   */
  public final native void setOption(PanoramioLayerOptions options) /*-{
    this.setOptions(options);
  }-*/;
  
  /**
   * This event is fired when a feature in the layer is clicked.
   * @param handler
   */
  public final HandlerRegistration addClickHandler(PanoramioMouseMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.CLICK, handler, new PanoramioMouseEventFormatter());
  }
}
