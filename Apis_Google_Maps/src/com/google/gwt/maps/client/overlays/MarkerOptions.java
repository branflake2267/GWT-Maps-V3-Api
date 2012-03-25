package com.google.gwt.maps.client.overlays;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaImpl;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaWidget;

/**
 * create Marker Options
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#MarkerOptions}
 */
public class MarkerOptions extends JavaScriptObject {

  /**
   * create Marker Options 
   * use newInstance();
   */
  protected MarkerOptions() {}
  
  /**
   * create Marker Options
   * @return
   */
  public final static MarkerOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * sets Which animation to play when marker is added to a map.
   * @param animation
   */
  public final native void setAnimation(Animation animation) /*-{
    this.animation = animation;
  }-*/;
  
  /**
   * gets Which animation to play when marker is added to a map.
   * @return
   */
  public final native Animation getAnimation() /*-{
    return this.animation;
  }-*/;
  
  /**
   * sets If true, the marker receives mouse and touch events. Default value is true.
   * @param clickable
   */
  public final native void setClickable(boolean clickable) /*-{
    this.clickable = clickable;
  }-*/;
  
  /**
   * gets If true, the marker receives mouse and touch events. Default value is true.
   * @return
   */
  public final native boolean getClickable() /*-{
    return this.clickable;
  }-*/;
  
  /**
   * sets Mouse cursor to show on hover
   * @param cursor
   */
  public final native void setCursor(String cursor) /*-{
    this.cursor = cursor;
  }-*/;
  
  /**
   * gets Mouse cursor to show on hover
   * @return
   */
  public final native String getCursor() /*-{
    return this.cursor;
  }-*/;
  
  /**
   * sets If true, the marker can be dragged. Default value is false.
   * @param draggable
   */
  public final native void setDraggable(boolean draggable) /*-{
    this.draggable = draggable;
  }-*/;
  
  /**
   * gets If true, the marker can be dragged. Default value is false.
   * @return
   */
  public final native boolean getDraggable() /*-{
    return this.draggable;
  }-*/;
  
  /**
   * sets If true, the marker shadow will not be displayed.
   * @param flat
   */
  public final native void setFlat(boolean flat) /*-{
    this.flat = flat;
  }-*/;
  
  /**
   * gets If true, the marker shadow will not be displayed.
   * @return
   */
  public final native boolean getFlat() /*-{
    return this.flat;
  }-*/;
  
  /**
   * sets Icon for the foreground
   * @param icon
   */
  public final native void setIcon(String icon) /*-{
    this.icon = icon;
  }-*/;
  
  /**
   * gets Icon for the foreground
   * @return
   */
  public final native String getIcon_String() /*-{
    return this.icon;
  }-*/;
  
  /**
   * sets Map on which to display Marker.
   * @param icon
   */
  public final native void setIcon(MarkerImage icon) /*-{
    this.icon = icon;
  }-*/;
  
  /**
   * gets Map on which to display Marker.
   * @return
   */
  public final native MarkerImage getIcon_MarkerImage() /*-{
    return this.icon;
  }-*/;

  /**
   * sets Map on which to display Polyline.
   * @param mapWidget
   */
  public final void setMap(MapWidget mapWidget) {
    setMapImpl(mapWidget.getJso());
  }

  private final native void setMapImpl(MapImpl map) /*-{
    this.map = map;
  }-*/;
  
  /**
   * gets Map on which to display Polyline.
   * @return
   */
  public final MapWidget getMapWidget() {
    return MapWidget.newInstance(getMapImpl());
  }
  
  private final native MapImpl getMapImpl() /*-{
    return this.map;
  }-*/;
  
  public final void setMap(StreetViewPanoramaWidget streetViewPanoramaWidget) {
    setMapImpl(streetViewPanoramaWidget.getJso());
  }

  private final native void setMapImpl(StreetViewPanoramaImpl map) /*-{
    this.map = map;
  }-*/;
  
  /**
   * gets Map on which to display Marker.
   * @return
   */
  public final StreetViewPanoramaWidget getMapStreetViewPanoramaWidget() {
    return StreetViewPanoramaWidget.newInstance(getMapImpl_Street());
  }
  
  private final native StreetViewPanoramaImpl getMapImpl_Street() /*-{
    return this.map;
  }-*/;
  
  /**
   * sets Optimization renders many markers as a single static element. Optimized rendering is enabled by default. Disable optimized rendering for animated GIFs or PNGs, or when each marker must be rendered as a separate DOM element (advanced usage only).
   * @param optimized
   */
  public final native void setOptimized(boolean optimized) /*-{
    this.optimized = optimized;
  }-*/;
  
  /**
   * gets Optimization renders many markers as a single static element. Optimized rendering is enabled by default. Disable optimized rendering for animated GIFs or PNGs, or when each marker must be rendered as a separate DOM element (advanced usage only).
   * @return
   */
  public final native boolean getOptimized() /*-{
    return this.optimized;
  }-*/;
  
  /**
   * sets Marker position. Required.
   * @param position
   */
  public final native void setPosition(LatLng position) /*-{
    this.position = position;
  }-*/;
  
  /**
   * gets Marker position. Required.
   * @return
   */
  public final native LatLng getPosition() /*-{
    return this.position;
  }-*/;
  
  /**
   * sets If false, disables raising and lowering the marker on drag. This option is true by default.
   * @param raiseOnDrag
   */
  public final native void setRaiseOnDrag(boolean raiseOnDrag) /*-{
    this.raiseOnDrag = raiseOnDrag;
  }-*/;
  
  /**
   * gets If false, disables raising and lowering the marker on drag. This option is true by default.
   * @return
   */
  public final native boolean getRaiseOnDrag() /*-{
    return this.raiseOnDrag;
  }-*/;
  
  /**
   * sets Shadow image
   * @param shadow
   */
  public final native void setShadow(String shadow) /*-{
    this.shadow = shadow;
  }-*/;
  
  /**
   * gets Shadow image
   * @return
   */
  public final native String getShadow_String() /*-{
    return this.shadow;
  }-*/;
  
  /**
   * sets Shadow image
   * @param shadow
   */
  public final native void setShadow(MarkerImage shadow) /*-{
    this.shadow = shadow;
  }-*/;
  
  /**
   * gets Shadow image
   * @return
   */
  public final native MarkerImage getShadow_MarkerImage() /*-{
    return this.shadow;
  }-*/;
  
  /**
   * sets Image map region definition used for drag/click.
   * @param shape
   */
  public final native void setShape(MarkerShape shape) /*-{
    this.shape = shape;
  }-*/;
  
  /**
   * gets Image map region definition used for drag/click.
   * @return
   */
  public final native MarkerShape getShape() /*-{
    return this.shape;
  }-*/;
  
  /**
   * sets Rollover text
   * @param title
   */
  public final native void setTitle(String title) /*-{
    this.title = title;
  }-*/;
  
  /**
   * gets Rollover text
   * @return
   */
  public final native String getTitle() /*-{
    return this.title;
  }-*/;
  
  /**
   * sets If true, the marker is visible
   * @param visible
   */
  public final native void setVisible(boolean visible) /*-{
    this.visible = visible;
  }-*/;
  
  /**
   * gets If true, the marker is visible
   * @return
   */
  public final native boolean getVisible() /*-{
    return this.visible;
  }-*/;
  
  /**
   * sets All markers are displayed on the map in order of their zIndex, with higher values displaying in front of markers with lower values. By default, markers are displayed according to their vertical position on screen, with lower markers appearing in front of markers further up the screen.
   * @param zIndex
   */
  public final native void setZindex(int zIndex) /*-{
    this.zIndex = zIndex;
  }-*/;
  
  /**
   * gets All markers are displayed on the map in order of their zIndex, with higher values displaying in front of markers with lower values. By default, markers are displayed according to their vertical position on screen, with lower markers appearing in front of markers further up the screen.
   * @return
   */
  public final native int getZindex() /*-{
    return this.zIndex;
  }-*/;
  
}






