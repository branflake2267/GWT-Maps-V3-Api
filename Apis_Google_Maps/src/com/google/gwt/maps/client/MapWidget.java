package com.google.gwt.maps.client;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.controls.ControlPosition;
import com.google.gwt.maps.client.events.MapHandlerRegistration;
import com.google.gwt.maps.client.events.MapPanel;
import com.google.gwt.maps.client.events.bounds.BoundsChangeMapHandler;
import com.google.gwt.maps.client.events.center.CenterChangeMapHandler;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.maps.client.events.dblclick.DblClickMapHandler;
import com.google.gwt.maps.client.events.drag.DragMapHandler;
import com.google.gwt.maps.client.events.dragend.DragEndMapHandler;
import com.google.gwt.maps.client.events.dragstart.DragStartMapHandler;
import com.google.gwt.maps.client.events.heading.HeadingChangeMapHandler;
import com.google.gwt.maps.client.events.idle.IdleMapHandler;
import com.google.gwt.maps.client.events.maptypeid.MapTypeIdChangeMapHandler;
import com.google.gwt.maps.client.events.mousemove.MouseMoveMapHandler;
import com.google.gwt.maps.client.events.mouseout.MouseOutMapHandler;
import com.google.gwt.maps.client.events.mouseover.MouseOverMapHandler;
import com.google.gwt.maps.client.events.projection.ProjectionChangeMapHandler;
import com.google.gwt.maps.client.events.resize.ResizeMapHandler;
import com.google.gwt.maps.client.events.rightclick.RightClickMapHandler;
import com.google.gwt.maps.client.events.tiles.TilesLoadedMapHandler;
import com.google.gwt.maps.client.events.tilt.TiltChangeMapHandler;
import com.google.gwt.maps.client.events.zoom.ZoomChangeMapHandler;
import com.google.gwt.maps.client.maptypes.MapTypeRegistry;
import com.google.gwt.maps.client.maptypes.Projection;
import com.google.gwt.maps.client.mvc.MVCArray;
import com.google.gwt.maps.client.mvc.MVCObjectWidget;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaImpl;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Widget;

public class MapWidget extends MVCObjectWidget<MapImpl> {
  
  /**
   * added controls, must remove them when finished
   */
  private HashMap<Integer, Widget> controls = null;

  /**
   * reconstruct the mapWidget from jso
   * @param impl
   * @return
   */
  public static MapWidget newInstance(MapImpl impl) {
    return new MapWidget(impl);
  }
  
  /**
   * create a new Map Widget
   * @param options {@link MapOptions}
   */
  public MapWidget(MapOptions options) {
    Element div = DOM.createDiv();
    setElement(div);
    impl = MapImpl.newInstance(div, options);
    setStyleName("gwt-map-MapWidget-div");
  }
  
  @Override
  protected void onDetach() {
    removeControls();
    super.onDetach();
  }
  
  private void removeControls() {
    if (controls == null) {
      return;
    }
    Collection<Widget> widgets = controls.values();
    Iterator<Widget> itr = widgets.iterator();
    while(itr.hasNext()) {
      Widget w = itr.next();
      w.removeFromParent();
    }
  }

  /**
   * reconstruct the mapWidget from jso
   * @param impl JavaScriptObject
   */
  private MapWidget(MapImpl impl) {
    this.impl = impl;
    setElement(impl.getDiv());
    setStyleName("gwt-map-MapWidget-div");
  }

  /**
   * get JavaScriptObject instance. 
   * @return {@link MapImpl}
   */
  public MapImpl getJso() {
    return impl;
  }

  /**
   * sets JavaScriptObject instance. 
   * @param impl {@link MapImpl}
   */
  public void setJso(MapImpl impl) {
    this.impl = impl;
  }

  /**
   * Sets the viewport to contain the given bounds.
   * @param latLngBounds {@link LatLngBounds}
   */
  public void fitBounds(LatLngBounds bounds) {
    impl.fitBounds(bounds);
  }

  /**
   * Returns the lat/lng bounds of the current viewport. If the map is not yet initialized (i.e. the mapType is still null), or center and zoom have not been set then the result is null or undefined.
   * @return {@link LatLngBounds}
   */
  public LatLngBounds getBounds() {
    return impl.getBounds();
  }

  /**
   * get Center
   * @return {@link LatLng}
   */
  public LatLng getCenter() {
    return impl.getCenter();
  }

  /**
   * get Element
   * @return
   */
  public Element getDiv() {
    return impl.getDiv();
  }

  /**
   * Returns the compass heading of aerial imagery. The heading value is measured in degrees (clockwise) from cardinal direction North.
   * @return int
   */
  public int getHeading() {
    return impl.getHeading();
  }

  /**
   * gets {@link MapTypeId}
   * @return {@link MapTypeId}
   */
  public final MapTypeId getMapTypeId() {
    return impl.getMapTypeId();
  }

  /**
   * Returns the current Projection. If the map is not yet initialized (i.e. the mapType is still null) then the result is null. Listen to projection_changed and check its value to ensure it is not null.
   * @return {@link Projection}
   */
  public Projection getProjection() {
    return impl.getProjection();
  }

  /**
   * Returns the default StreetViewPanorama bound to the map, which may be a default panorama embedded within the map, or the panorama set using setStreetView(). Changes to the map's streetViewControl will be reflected in the display of such a bound panorama.
   * @return {@link StreetViewPanoramaImpl}
   */
  public StreetViewPanoramaImpl getStreetView() {
    return impl.getStreetView();
  };

  /**
   * gets Returns the angle of incidence for aerial imagery (available for SATELLITE and HYBRID map types) measured in degrees from the viewport plane to the map plane. A value of 0 indicates no angle of incidence (no tilt) while 45¡ imagery will return a value of 45.
   * @return
   */
  public int getTilt() {
    return impl.getTilt();
  };

  /**
   * get zoom
   * @return
   */
  public int getZoom() {
    return impl.getZoom();
  };

  /**
   * Changes the center of the map by the given distance in pixels. If the distance is less than both the width and height of the map, the transition will be smoothly animated. Note that the map coordinate system increases from west to east (for x values) and north to south (for y values).
   * @param x
   * @param y
   */
  public void panBy(int x, int y) {
    impl.panBy(x, y);
  };

  /**
   * Changes the center of the map to the given LatLng. If the change is less than both the width and height of the map, the transition will be smoothly animated.
   * @param latLng
   */
  public void panTo(LatLng latLng) {
    impl.panTo(latLng);
  };

  /**
   * Pans the map by the minimum amount necessary to contain the given LatLngBounds. It makes no guarantee where on the map the bounds will be, except that as much of the bounds as possible will be visible. The bounds will be positioned inside the area bounded by the map type and navigation (pan, zoom, and Street View) controls, if they are present on the map. If the bounds is larger than the map, the map will be shifted to include the northwest corner of the bounds. If the change in the map's position is less than both the width and height of the map, the transition will be smoothly animated.
   * @param latLngBounds
   */
  public void panToBounds(LatLngBounds latLngBounds) {
    impl.panToBounds(latLngBounds);
  };

  /**
   * set center
   * @param latlng
   */
  public void setCenter(LatLng latlng) {
    impl.setCenter(latlng);
  };

  /**
   * Sets the compass heading for aerial imagery measured in degrees from cardinal direction North.
   * @param heading
   */
  public void setHeading(int heading) {
    impl.setHeading(heading);
  };

  /**
   * set MapTypeId
   * @param mapTypeId
   */
  public final void setMapTypeId(MapTypeId mapTypeId) { 
    impl.setMapTypeId(mapTypeId);
  }

  /**
   * set MapOptions
   * @param options
   */
  public void setOptions(MapOptions options) {
    impl.setOptions(options);
  };

  /**
   * Sets the angle of incidence for aerial imagery (available for SATELLITE and HYBRID map types) measured in degrees from the viewport plane to the map plane. The only supported values are 0, indicating no angle of incidence (no tilt), and 45 indicating a tilt of 45deg;.
   * @param panorama
   */
  public void setStreetView(StreetViewPanoramaImpl panorama) {
    impl.setStreetView(panorama);
  };

  /**
   * Sets the angle of incidence for aerial imagery (available for SATELLITE and HYBRID map types) measured in degrees from the viewport plane to the map plane. The only supported values are 0, indicating no angle of incidence (no tilt), and 45 indicating a tilt of 45deg;.
   * @param tilt
   */
  public void setTilt(int tilt) {
    impl.setTilt(tilt);
  }; 

  /**
   * sets map zoom
   * @param zoom
   */
  public void setZoom(int zoom) {
    impl.setZoom(zoom);
  };

  
  
  
  
  /**
   * TODO
   * sets Additional controls to attach to the map. To add a control to the map, add the control's <div> to the MVCArray corresponding to the ControlPosition where it should be rendered.
   * @param controls
   */
  public void setControls(MVCArray<Element> controls) {
    impl.setControls(controls);
  };

  /**
   * sets Additional controls to attach to the map. To add a control to the map, add the control's <div> to the MVCArray corresponding to the ControlPosition where it should be rendered.
   * @param controlPosition
   * @param element
   */
  public void setControls(ControlPosition controlPosition, Element element) {
    impl.setControls(controlPosition, element);
  };
  
  /**
   * sets Additional controls to attach to the map. To add a control to the map, add the control's <div> to the MVCArray corresponding to the ControlPosition where it should be rendered.
   * @param controlPosition
   * @param widget
   */
  public void setControls(ControlPosition controlPosition, Widget widget) {
    
    // remove any pre-existing controls
    removePriorControlFirst(controlPosition);
    
    // use a panel that controls onAttatch
    MapPanel mapPanel = new MapPanel();
    mapPanel.add(widget);

    // add it to array for detaching
    if (controls == null) {
      controls = new HashMap<Integer, Widget>();
    }
    controls.put(controlPosition.value(), mapPanel);

    // add it to the map
    impl.setControls(controlPosition, mapPanel.getElement());
  };
  
  /**
   * remove an pre-existing control so we don't get a mem leak
   * @param controlPosition
   * @param widget
   */
  private void removePriorControlFirst(ControlPosition controlPosition) {
    if (controls == null) {
      return;
    }
    Widget w = controls.get(controlPosition.value());
    if (w == null) {
      return;
    }
    w.removeFromParent();
  }

  /**
   * TODO
   * gets Additional controls to attach to the map. To add a control to the map, add the control's <div> to the MVCArray corresponding to the ControlPosition where it should be rendered.
   * @return
   */
  public MVCArray<Element> getControls() {
    return impl.getControls();
  };

  /**
   * TODO
   * sets A registry of MapType instances by string ID.
   * @param mapTypes
   */
  public void setMapTypesRegistry(MapTypeRegistry mapTypes) {
    impl.setMapTypesRegistry(mapTypes);
  };

  /**
   * TODO
   * gets A registry of MapType instances by string ID.
   * @return
   */
  public MapTypeRegistry getMapTypesRegistry() {
    return impl.getMapTypesRegistry();
  };

  /**
   * TODO
   * sets Additional map types to overlay.
   * @param overlayMapTypes
   */
  public void setOverlayMapTypes(MVCArray<JavaScriptObject> overlayMapTypes) {
    impl.setOverlayMapTypes(overlayMapTypes);
  };

  /**
   * TODO
   * gets Additional map types to overlay.
   * @return
   */
  public MVCArray<JavaScriptObject> getOverlayMapTypes() {
    return impl.getOverlayMapTypes();
  };

  
  
  
  
  /**
   * This event is fired when the viewport bounds have changed.
   * @param handler {@link BoundsChangeMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public HandlerRegistration addBoundsChangeHandler(BoundsChangeMapHandler handler) {
    return impl.addBoundsChangeHandler(handler);
  }

  /**
   * This event is fired when the map center property changes.
   * @param handler {@link CenterChangeMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public HandlerRegistration addCenterChangeHandler(CenterChangeMapHandler handler) {
    return impl.addCenterChangeHandler(handler);
  }

  /**
   * This event is fired when the user clicks on the map (but not when they click on a marker or infowindow).
   * @param handler {@link ClickMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public HandlerRegistration addClickHandler(ClickMapHandler handler) {
    return impl.addClickHandler(handler);
  }

  /**
   * This event is fired when the user double-clicks on the map. Note that the click event will also fire, right before this one.
   * @param handler {@link DblClickMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public HandlerRegistration addDblClickHandler(DblClickMapHandler handler) {
    return impl.addDblClickHandler(handler);
  }

  /**
   * This event is repeatedly fired while the user drags the map.
   * @param handler {@link DragMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public HandlerRegistration addDragHandler(DragMapHandler handler) {
    return impl.addDragHandler(handler);
  }

  /**
   * This event is fired when the user stops dragging the map.
   * @param handler {@link DragEndMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public HandlerRegistration addDragEndHandler(DragEndMapHandler handler) {
    return impl.addDragEndHandler(handler);
  }

  /**
   * This event is fired when the user starts dragging the map.
   * @param handler {@link DragStartMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public HandlerRegistration addDragStartHandler(DragStartMapHandler handler) {
    return impl.addDragStartHandler(handler);
  }

  /**
   * This event is fired when the map heading property changes.
   * @param handler {@link HeadingChangeMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public HandlerRegistration addHeadingChangeHandler(HeadingChangeMapHandler handler) {
    return impl.addHeadingChangeHandler(handler);
  }

  /**
   * This event is fired when the map becomes idle after panning or zooming.
   * @param handler {@link IdleMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public HandlerRegistration addIdleHandler(IdleMapHandler handler) {
    return impl.addIdleHandler(handler);
  }

  /**
   * This event is fired when the mapTypeId property changes.
   * @param handler {@link MapTypeIdChangeMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public HandlerRegistration addMapTypeIdChangeHandler(MapTypeIdChangeMapHandler handler) {
    return impl.addMapTypeIdChangeHandler(handler);
  }

  /**
   * This event is fired whenever the user's mouse moves over the map container.
   * @param handler {@link MouseMoveMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public HandlerRegistration addMouseMoveHandler(MouseMoveMapHandler handler) {
    return impl.addMouseMoveHandler(handler);
  }

  /**
   * This event is fired when the user's mouse exits the map container.
   * @param handler {@link MouseOutMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public HandlerRegistration addMouseOutMoveHandler(MouseOutMapHandler handler) {
    return impl.addMouseOutMoveHandler(handler);
  }

  /**
   * This event is fired when the user's mouse enters the map container.
   * @param handler {@link MouseOverMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public HandlerRegistration addMouseOverHandler(MouseOverMapHandler handler) {
    return impl.addMouseOverHandler(handler);
  }

  /**
   * This event is fired when the projection has changed.
   * @param handler {@link ProjectionChangeMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public HandlerRegistration addProjectionChangeHandler(ProjectionChangeMapHandler handler) {
    return impl.addProjectionChangeHandler(handler);
  }

  /**
   * Developers should trigger this event on the map when the div changes size: google.maps.event.trigger(map, 'resize') .
   * @param handler {@link ResizeMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public HandlerRegistration addResizeHandler(ResizeMapHandler handler) {
    return impl.addResizeHandler(handler);
  }

  /**
   * This event is fired when the DOM contextmenu event is fired on the map container.
   * @param handler {@link RightClickMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public HandlerRegistration addRightClickHandler(RightClickMapHandler handler) {
    return impl.addRightClickHandler(handler);
  }

  /**
   * This event is fired when the visible tiles have finished loading.
   * @param handler {@link TilesLoadedMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public HandlerRegistration addTilesLoadedHandler(TilesLoadedMapHandler handler) {
    return impl.addTilesLoadedHandler(handler);
  }

  /**
   * This event is fired when the map tilt property changes.
   * @param handler {@link TiltChangeMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public HandlerRegistration addTiltChangeHandler(TiltChangeMapHandler handler) {
    return impl.addTiltChangeHandler(handler);
  }

  /**
   * This event is fired when the map zoom property changes.
   * @param handler {@link ZoomChangeMapHandler}
   * @return {@link MapHandlerRegistration}
   */
  public HandlerRegistration addZoomChangeHandler(ZoomChangeMapHandler handler) {
    return impl.addZoomChangeHandler(handler);
  }



}
