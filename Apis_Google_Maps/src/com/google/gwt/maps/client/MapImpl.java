package com.google.gwt.maps.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.controls.ControlPosition;
import com.google.gwt.maps.client.events.MapEventType;
import com.google.gwt.maps.client.events.MapHandlerRegistration;
import com.google.gwt.maps.client.events.bounds.BoundsChangeEventFormatter;
import com.google.gwt.maps.client.events.bounds.BoundsChangeMapHandler;
import com.google.gwt.maps.client.events.center.CenterChangeEventFormatter;
import com.google.gwt.maps.client.events.center.CenterChangeMapHandler;
import com.google.gwt.maps.client.events.click.ClickEventFormatter;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.maps.client.events.dblclick.DblClickEventFormatter;
import com.google.gwt.maps.client.events.dblclick.DblClickMapHandler;
import com.google.gwt.maps.client.events.drag.DragEventFormatter;
import com.google.gwt.maps.client.events.drag.DragMapHandler;
import com.google.gwt.maps.client.events.dragend.DragEndEventFormatter;
import com.google.gwt.maps.client.events.dragend.DragEndMapHandler;
import com.google.gwt.maps.client.events.dragstart.DragStartEventFormatter;
import com.google.gwt.maps.client.events.dragstart.DragStartMapHandler;
import com.google.gwt.maps.client.events.heading.HeadingChangeEventFormatter;
import com.google.gwt.maps.client.events.heading.HeadingChangeMapHandler;
import com.google.gwt.maps.client.events.idle.IdleEventFormatter;
import com.google.gwt.maps.client.events.idle.IdleMapHandler;
import com.google.gwt.maps.client.events.maptypeid.MapTypeIdChangeEventFormatter;
import com.google.gwt.maps.client.events.maptypeid.MapTypeIdChangeMapHandler;
import com.google.gwt.maps.client.events.mousemove.MouseMoveEventFormatter;
import com.google.gwt.maps.client.events.mousemove.MouseMoveMapHandler;
import com.google.gwt.maps.client.events.mouseout.MouseOutEventFormatter;
import com.google.gwt.maps.client.events.mouseout.MouseOutMapHandler;
import com.google.gwt.maps.client.events.mouseover.MouseOverEventFormatter;
import com.google.gwt.maps.client.events.mouseover.MouseOverMapHandler;
import com.google.gwt.maps.client.events.projection.ProjectionChangeEventFormatter;
import com.google.gwt.maps.client.events.projection.ProjectionChangeMapHandler;
import com.google.gwt.maps.client.events.resize.ResizeEventFormatter;
import com.google.gwt.maps.client.events.resize.ResizeMapHandler;
import com.google.gwt.maps.client.events.rightclick.RightClickEventFormatter;
import com.google.gwt.maps.client.events.rightclick.RightClickMapHandler;
import com.google.gwt.maps.client.events.tiles.TilesLoadedEventFormatter;
import com.google.gwt.maps.client.events.tiles.TilesLoadedMapHandler;
import com.google.gwt.maps.client.events.tilt.TiltChangeEventFormatter;
import com.google.gwt.maps.client.events.tilt.TiltChangeMapHandler;
import com.google.gwt.maps.client.events.zoom.ZoomChangeEventFormatter;
import com.google.gwt.maps.client.events.zoom.ZoomChangeMapHandler;
import com.google.gwt.maps.client.maptypes.MapTypeRegistry;
import com.google.gwt.maps.client.maptypes.Projection;
import com.google.gwt.maps.client.mvc.MVCArray;
import com.google.gwt.maps.client.mvc.MVCObject;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaImpl;

/**
 * Creates a new map inside of the given HTML container, which is typically a DIV element
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#Map}
 */
public class MapImpl extends MVCObject<MapImpl> {
  
  /**
   * Creates a new map inside of the given HTML container, which is typically a DIV element.
   */
  protected MapImpl() {}
 
  /**
   * Creates a new map inside of the given HTML container, which is typically a DIV element.
   * @param element - map dom element container, like a div
   * @param options - {@link MapOptions}
   * @return {@link MapImpl}
   */
  public final static MapImpl newInstance(Element element, MapOptions options) {
    return createJso(element, options);
  }
  
  /**
   * private native method
   * @param id - dom element id
   * @param {@link MapOptions}
   * @return
   */
  private final static native MapImpl createJso(Element element, MapOptions options) /*-{
    return new $wnd.google.maps.Map(element, options);
  }-*/;
  
  /**
   * Sets the viewport to contain the given bounds.
   * @param latLngBounds {@link LatLngBounds}
   */
  public final native void fitBounds(LatLngBounds bounds) /*-{
    this.fitBounds(bounds);
  }-*/;
  
  /**
   * Returns the lat/lng bounds of the current viewport. If the map is not yet initialized (i.e. the mapType is still null), or center and zoom have not been set then the result is null or undefined.
   * @return {@link LatLngBounds}
   */
  public final native LatLngBounds getBounds() /*-{
    return this.getBounds();
  }-*/;
  
  /**
   * return map center in coordinates
   * @return
   */
  public final native LatLng getCenter() /*-{
    return this.getCenter();
  }-*/;
  
  /**
   * get Element
   * @return
   */
  public final native Element getDiv() /*-{
    return this.getDiv();
  }-*/; 
  
  /**
   * Returns the compass heading of aerial imagery. The heading value is measured in degrees (clockwise) from cardinal direction North.
   * @return int
   */
  public final native int getHeading() /*-{
    return this.getHeading() || 0;
  }-*/;
  
  /**
   * gets {@link MapTypeId}
   * @return {@link MapTypeId}
   */
  public final MapTypeId getMapTypeId() {
    return MapTypeId.fromValue(getMapTypeIdImpl());
  }
 
  private final native String getMapTypeIdImpl() /*-{
    return this.getMapTypeId();
  }-*/;
  
  /**
   * Returns the current Projection. If the map is not yet initialized (i.e. the mapType is still null) then the result is null. Listen to projection_changed and check its value to ensure it is not null.
   * @return {@link Projection}
   */
  public final native Projection getProjection() /*-{
    return this.getProjection();
  }-*/;
  
  /**
   * Returns the default StreetViewPanorama bound to the map, which may be a default panorama embedded within the map, or the panorama set using setStreetView(). Changes to the map's streetViewControl will be reflected in the display of such a bound panorama.
   * @return {@link StreetViewPanoramaImpl}
   */
  public final native StreetViewPanoramaImpl getStreetView() /*-{
    return this.getStreetView();
  }-*/;
  
  /**
   * gets Returns the angle of incidence for aerial imagery (available for SATELLITE and HYBRID map types) measured in degrees from the viewport plane to the map plane. A value of 0 indicates no angle of incidence (no tilt) while 45¡ imagery will return a value of 45.
   * @return
   */
  public final native int getTilt() /*-{
    return this.getTilt();
  }-*/;
  
  /**
   * get zoom
   * @return
   */
  public final native int getZoom() /*-{
    return this.getZoom();
  }-*/;
  
  /**
   * Changes the center of the map by the given distance in pixels. If the distance is less than both the width and height of the map, the transition will be smoothly animated. Note that the map coordinate system increases from west to east (for x values) and north to south (for y values).
   * @param x
   * @param y
   */
  public final native void panBy(int x, int y) /*-{
    this.panBy(x, y);
  }-*/;
  
  /**
   * Changes the center of the map to the given LatLng. If the change is less than both the width and height of the map, the transition will be smoothly animated.
   * @param latLng
   */
  public final native void panTo(LatLng latLng) /*-{
    this.panTo(latLng);
  }-*/;
  
  /**
   * Pans the map by the minimum amount necessary to contain the given LatLngBounds. It makes no guarantee where on the map the bounds will be, except that as much of the bounds as possible will be visible. The bounds will be positioned inside the area bounded by the map type and navigation (pan, zoom, and Street View) controls, if they are present on the map. If the bounds is larger than the map, the map will be shifted to include the northwest corner of the bounds. If the change in the map's position is less than both the width and height of the map, the transition will be smoothly animated.
   * @param latLngBounds
   */
  public final native void panToBounds(LatLngBounds latLngBounds) /*-{
    this.panToBounds(latLngBounds);
  }-*/;
  
  /**
   * set center
   * @param latlng
   */
  public final native void setCenter(LatLng latlng) /*-{
    this.setCenter(latlng);
  }-*/;
  
  /**
   * Sets the compass heading for aerial imagery measured in degrees from cardinal direction North.
   * @param heading
   */
  public final native void setHeading(int heading) /*-{
    this.setHeading(heading);
  }-*/;
  
  /**
   * set MapTypeId
   * @param mapTypeId
   */
  public final void setMapTypeId(MapTypeId mapTypeId) { 
    setMapTypeIdImpl(mapTypeId.name());
  }
  
  private final native void setMapTypeIdImpl(String mapTypeId) /*-{
    this.setMapTypeId(mapTypeId);
  }-*/;
  
  /**
   * set MapOptions
   * @param options
   */
  public final native void setOptions(MapOptions options) /*-{
    this.setOptions(options);
  }-*/;
  
  /**
   * Sets the angle of incidence for aerial imagery (available for SATELLITE and HYBRID map types) measured in degrees from the viewport plane to the map plane. The only supported values are 0, indicating no angle of incidence (no tilt), and 45 indicating a tilt of 45deg;.
   * @param panorama
   */
  public final native void setStreetView(StreetViewPanoramaImpl panorama) /*-{
    this.setStreetView(panorama);
  }-*/;
  
  /**
   * Sets the angle of incidence for aerial imagery (available for SATELLITE and HYBRID map types) measured in degrees from the viewport plane to the map plane. The only supported values are 0, indicating no angle of incidence (no tilt), and 45 indicating a tilt of 45deg;.
   * @param tilt
   */
  public final native void setTilt(int tilt) /*-{
    this.setTilt(tilt);
  }-*/; 
  
  /**
   * sets map zoom
   * @param zoom
   */
  public final native void setZoom(int zoom) /*-{
    this.setZoom(zoom);
  }-*/;
  
  /**
   * TODO
   * sets Additional controls to attach to the map. To add a control to the map, add the control's <div> to the MVCArray corresponding to the ControlPosition where it should be rendered.
   * @param controls
   */
  public final native void setControls(MVCArray<Element> controls) /*-{
    this.controls = controls;
  }-*/;
  
  /**
   * sets Additional controls to attach to the map. To add a control to the map, add the control's <div> to the MVCArray corresponding to the ControlPosition where it should be rendered.
   * @param controlPosition
   * @param element
   */
  public final void setControls(ControlPosition controlPosition, Element element) {
    setControls(controlPosition.value(), element);
  }
  
  private final native void setControls(int controlPosition, Element element) /*-{
    this.controls[controlPosition].push(element);
  }-*/;
  
  /**
   * TODO
   * gets Additional controls to attach to the map. To add a control to the map, add the control's <div> to the MVCArray corresponding to the ControlPosition where it should be rendered.
   * @return
   */
  public final native MVCArray<Element> getControls() /*-{
    return controls;
  }-*/;
  
  /**
   * TODO
   * sets A registry of MapType instances by string ID.
   * @param mapTypes
   */
  public final native void setMapTypesRegistry(MapTypeRegistry mapTypes) /*-{
    this.mapTypes = mapTypes;
  }-*/;
  
  /**
   * TODO
   * gets A registry of MapType instances by string ID.
   * @return
   */
  public final native MapTypeRegistry getMapTypesRegistry() /*-{
    return this.maptypes;
  }-*/;
  
  /**
   * TODO
   * sets Additional map types to overlay.
   * @param overlayMapTypes
   */
  public final native void setOverlayMapTypes(MVCArray<JavaScriptObject> overlayMapTypes) /*-{
    this.overlayMapTypes = overlayMapTypes;
  }-*/;
  
  /**
   * TODO
   * gets Additional map types to overlay.
   * @return
   */
  public final native MVCArray<JavaScriptObject> getOverlayMapTypes() /*-{
    return this.overlayMapTypes;
  }-*/;
  
  /**
   * This event is fired when the viewport bounds have changed.
   * @param handler {@link BoundsChangeMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public final HandlerRegistration addBoundsChangeHandler(BoundsChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.BOUNDS_CHANGED, handler, new BoundsChangeEventFormatter());
  }

  /**
   * This event is fired when the map center property changes.
   * @param handler {@link CenterChangeMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public final HandlerRegistration addCenterChangeHandler(CenterChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.CENTER_CHANGED, handler, new CenterChangeEventFormatter());
  }

  /**
   * This event is fired when the user clicks on the map (but not when they click on a marker or infowindow).
   * @param handler {@link ClickMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public final HandlerRegistration addClickHandler(ClickMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.CLICK, handler, new ClickEventFormatter());
  }

  /**
   * This event is fired when the user double-clicks on the map. Note that the click event will also fire, right before this one.
   * @param handler {@link DblClickMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public final HandlerRegistration addDblClickHandler(DblClickMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.DBLCLICK, handler, new DblClickEventFormatter());
  }

  /**
   * This event is repeatedly fired while the user drags the map.
   * @param handler {@link DragMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public final HandlerRegistration addDragHandler(DragMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.DRAG, handler, new DragEventFormatter());
  }

  /**
   * This event is fired when the user stops dragging the map.
   * @param handler {@link DragEndMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public final HandlerRegistration addDragEndHandler(DragEndMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.DRAGEND, handler, new DragEndEventFormatter());
  }

  /**
   * This event is fired when the user starts dragging the map.
   * @param handler {@link DragStartMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public final HandlerRegistration addDragStartHandler(DragStartMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.DRAGSTART, handler, new DragStartEventFormatter());
  }

  /**
   * This event is fired when the map heading property changes.
   * @param handler {@link HeadingChangeMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public final HandlerRegistration addHeadingChangeHandler(HeadingChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.HEADING_CHANGED, handler, new HeadingChangeEventFormatter());
  }

  /**
   * This event is fired when the map becomes idle after panning or zooming.
   * @param handler {@link IdleMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public final HandlerRegistration addIdleHandler(IdleMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.IDLE, handler, new IdleEventFormatter());
  }

  /**
   * This event is fired when the mapTypeId property changes.
   * @param handler {@link MapTypeIdChangeMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public final HandlerRegistration addMapTypeIdChangeHandler(MapTypeIdChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MAPTYPEID_CHANGED, handler, new MapTypeIdChangeEventFormatter());
  }

  /**
   * This event is fired whenever the user's mouse moves over the map container.
   * @param handler {@link MouseMoveMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public final HandlerRegistration addMouseMoveHandler(MouseMoveMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEMOVE, handler, new MouseMoveEventFormatter());
  }

  /**
   * This event is fired when the user's mouse exits the map container.
   * @param handler {@link MouseOutMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public final HandlerRegistration addMouseOutMoveHandler(MouseOutMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEOUT, handler, new MouseOutEventFormatter());
  }

  /**
   * This event is fired when the user's mouse enters the map container.
   * @param handler {@link MouseOverMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public final HandlerRegistration addMouseOverHandler(MouseOverMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEOVER, handler, new MouseOverEventFormatter());
  }

  /**
   * This event is fired when the projection has changed.
   * @param handler {@link ProjectionChangeMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public final HandlerRegistration addProjectionChangeHandler(ProjectionChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.PROJECTION_CHANGED, handler, new ProjectionChangeEventFormatter());
  }

  /**
   * Developers should trigger this event on the map when the div changes size: google.maps.event.trigger(map, 'resize') .
   * @param handler {@link ResizeMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public final HandlerRegistration addResizeHandler(ResizeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.RESIZE, handler, new ResizeEventFormatter());
  }

  /**
   * This event is fired when the DOM contextmenu event is fired on the map container.
   * @param handler {@link RightClickMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public final HandlerRegistration addRightClickHandler(RightClickMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.RIGHTCLICK, handler, new RightClickEventFormatter());
  }

  /**
   * This event is fired when the visible tiles have finished loading.
   * @param handler {@link TilesLoadedMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public final HandlerRegistration addTilesLoadedHandler(TilesLoadedMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.TILESLOADED, handler, new TilesLoadedEventFormatter());
  }

  /**
   * This event is fired when the map tilt property changes.
   * @param handler {@link TiltChangeMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public final HandlerRegistration addTiltChangeHandler(TiltChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.TILT_CHANGED, handler, new TiltChangeEventFormatter());
  }

  /**
   * This event is fired when the map zoom property changes.
   * @param handler {@link ZoomChangeMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public final HandlerRegistration addZoomChangeHandler(ZoomChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.ZOOM_CHANGED, handler, new ZoomChangeEventFormatter());
  }

}
