package com.google.gwt.maps.client.overlays;

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
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.events.MapEventType;
import com.google.gwt.maps.client.events.MapHandlerRegistration;
import com.google.gwt.maps.client.events.animation.AnimationChangeEventFormatter;
import com.google.gwt.maps.client.events.animation.AnimationChangeMapHandler;
import com.google.gwt.maps.client.events.click.ClickEventFormatter;
import com.google.gwt.maps.client.events.click.ClickMapHandler;
import com.google.gwt.maps.client.events.clickable.ClickableChangeEventFormatter;
import com.google.gwt.maps.client.events.clickable.ClickableChangeMapHandler;
import com.google.gwt.maps.client.events.cursor.CursorChangeEventFormatter;
import com.google.gwt.maps.client.events.cursor.CursorChangeMapHandler;
import com.google.gwt.maps.client.events.dblclick.DblClickEventFormatter;
import com.google.gwt.maps.client.events.dblclick.DblClickMapHandler;
import com.google.gwt.maps.client.events.drag.DragEventFormatter;
import com.google.gwt.maps.client.events.drag.DragMapHandler;
import com.google.gwt.maps.client.events.dragend.DragEndEventFormatter;
import com.google.gwt.maps.client.events.dragend.DragEndMapHandler;
import com.google.gwt.maps.client.events.draggable.DraggableChangeEventFormatter;
import com.google.gwt.maps.client.events.draggable.DraggableChangeMapHandler;
import com.google.gwt.maps.client.events.dragstart.DragStartEventFormatter;
import com.google.gwt.maps.client.events.dragstart.DragStartMapHandler;
import com.google.gwt.maps.client.events.flat.FlatChangeEventFormatter;
import com.google.gwt.maps.client.events.flat.FlatChangeMapHandler;
import com.google.gwt.maps.client.events.icon.IconChangeEventFormatter;
import com.google.gwt.maps.client.events.icon.IconChangeMapHandler;
import com.google.gwt.maps.client.events.mousedown.MouseDownEventFormatter;
import com.google.gwt.maps.client.events.mousedown.MouseDownMapHandler;
import com.google.gwt.maps.client.events.mouseout.MouseOutEventFormatter;
import com.google.gwt.maps.client.events.mouseout.MouseOutMapHandler;
import com.google.gwt.maps.client.events.mouseover.MouseOverEventFormatter;
import com.google.gwt.maps.client.events.mouseover.MouseOverMapHandler;
import com.google.gwt.maps.client.events.mouseup.MouseUpEventFormatter;
import com.google.gwt.maps.client.events.mouseup.MouseUpMapHandler;
import com.google.gwt.maps.client.events.projection.ProjectionChangeEventFormatter;
import com.google.gwt.maps.client.events.projection.ProjectionChangeMapHandler;
import com.google.gwt.maps.client.events.rightclick.RightClickEventFormatter;
import com.google.gwt.maps.client.events.rightclick.RightClickMapHandler;
import com.google.gwt.maps.client.events.shadow.ShadowChangeEventFormatter;
import com.google.gwt.maps.client.events.shadow.ShadowChangeMapHandler;
import com.google.gwt.maps.client.events.shape.ShapeChangeEventFormatter;
import com.google.gwt.maps.client.events.shape.ShapeChangeMapHandler;
import com.google.gwt.maps.client.events.title.TitleChangeEventFormatter;
import com.google.gwt.maps.client.events.title.TitleChangeMapHandler;
import com.google.gwt.maps.client.events.visible.VisibleChangeEventFormatter;
import com.google.gwt.maps.client.events.visible.VisibleChangeMapHandler;
import com.google.gwt.maps.client.events.zindex.ZindexChangeEventFormatter;
import com.google.gwt.maps.client.events.zindex.ZindexChangeMapHandler;
import com.google.gwt.maps.client.mvc.MVCObject;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaImpl;
import com.google.gwt.maps.client.streetview.StreetViewPanoramaWidget;

/**
 * Creates a marker with the options specified. If a map is specified, the marker is added to the map upon construction.
 * Note that the position must be set for the marker to display. This class extends MVCObject. <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#Marker">Marker API Doc</a>
 */
public class Marker extends MVCObject<Marker> {

  /**
   * Creates a marker with the options specified. If a map is specified, the marker is added to the map upon
   * construction. Note that the position must be set for the marker to display. use newInstance();
   */
  protected Marker() {
  }

  /**
   * Creates a marker with the options specified. If a map is specified, the marker is added to the map upon
   * construction. Note that the position must be set for the marker to display.
   * 
   * @param options {@link MarkerOptions}
   */
  public static Marker newInstance(MarkerOptions options) {
    return createJso(options).cast();
  }

  private static final native JavaScriptObject createJso(MarkerOptions options) /*-{
    return new $wnd.google.maps.Marker(options);
  }-*/;

  /**
   * get animation
   */
  public final Animation getAnimation() {
    Integer animation = getAnimationImpl();
    if (animation == null) {
      return null;
    }
    return Animation.fromValue(animation);
  }

  private final native Integer getAnimationImpl() /*-{
    return this.getAnimation();
  }-*/;

  /**
   * get Clickable
   */
  public final native boolean getClickable() /*-{
    return this.getClickable();
  }-*/;

  /**
   * get Cursor
   */
  public final native String getCursor() /*-{
    return this.getCursor();
  }-*/;

  /**
   * get Draggable
   */
  public final native boolean getDraggable() /*-{
    return this.getDraggable();
  }-*/;

  /**
   * get Flat
   */
  public final native boolean getFlat() /*-{
    return this.getFlat();
  }-*/;

  /**
   * get Icon (if its a string use this)
   */
  public final native String getIcon_String() /*-{
    return this.getIcon();
  }-*/;

  /**
   * get Icon (if it is a marker image)
   */
  public final native MarkerImage getIcon_MarkerImage() /*-{
    return this.getIcon();
  }-*/;
  
  /**
   * get Icon (if it is a {@link Symbol})
   */
  public final native Symbol getIcon_Symbol() /*-{
    return this.getIcon();
  }-*/;

  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }

  private final native MapImpl getMapImpl() /*-{
    return this.getMap();
  }-*/;;

  /**
   * get Map (if it is a pano)
   */
  public final StreetViewPanoramaWidget getMap_StreetViewPanorama() {
    return StreetViewPanoramaWidget.newInstance(getMap_StreetViewPanoramaImpl());
  }

  private final native StreetViewPanoramaImpl getMap_StreetViewPanoramaImpl() /*-{
    return this.getMap();
  }-*/;

  /**
   * get Position
   */
  public final native LatLng getPosition() /*-{
    return this.getPosition();
  }-*/;

  /**
   * get Shadow (if it is a String)
   */
  public final native String getShadow_String() /*-{
    return this.getShadow();
  }-*/;

  /**
   * get Shadow (if it is a MarkerImage)
   */
  public final native MarkerImage getShadow_MarkerImage() /*-{
    return this.getShadow();
  }-*/;
  
  /**
   * get Shadow (if it is a {@link Symbol})
   */
  public final native Symbol getShadow_Symbol() /*-{
    return this.getShadow();
  }-*/;

  /**
   * get Shape
   */
  public final native MarkerShape getShape() /*-{
    return this.getShape();
  }-*/;

  /**
   * get Title
   */
  public final native String getTitle() /*-{
    return this.getTitle();
  }-*/;

  /**
   * get Visible
   */
  public final native boolean getVisible() /*-{
    return this.getVisible();
  }-*/;

  /**
   * get Z Index
   */
  public final native int getZindex() /*-{
    return this.getZIndex();
  }-*/;

  /**
   * set Animation
   * 
   * @param animation
   */
  public final void setAnimation(Animation animation) {
    if (animation == null) {
    	setAnimationImpl(null);
    } else {
    	setAnimationImpl(animation.value());
    }
  }

  private final native void setAnimationImpl(Integer animation) /*-{
    this.setAnimation(animation);
  }-*/;

  /**
   * set Clickable
   * 
   * @param clickable
   */
  public final native void setClickable(boolean clickable) /*-{
    this.setClickable(clickable);
  }-*/;

  /**
   * set Cursor
   * 
   * @param cursor
   */
  public final native void setCursor(String cursor) /*-{
    this.setCursor(cursor);
  }-*/;

  /**
   * set Draggable
   * 
   * @param draggable
   */
  public final native void setDraggable(boolean draggable) /*-{
    this.setDraggable(draggable);
  }-*/;

  /**
   * set Flat
   * 
   * @param flat
   */
  public final native void setFlat(boolean flat) /*-{
    this.setFlat(flat);
  }-*/;

  /**
   * set Icon
   * 
   * @param icon
   */
  public final native void setIcon(String icon) /*-{
    this.setIcon(icon);
  }-*/;
  
  /**
   * set Icon using a {@link Symbol}
   * 
   * @param icon
   */
  public final native void setIcon(Symbol icon) /*-{
    this.setIcon(icon);
  }-*/;

  /**
   * set Icon
   * 
   * @param icon
   */
  public final native void setIcon(MarkerImage icon) /*-{
    this.setIcon(icon);
  }-*/;

  /**
   * set Map
   * 
   * @param mapWidget
   */
  public final void setMap(MapWidget mapWidget) {
    if (mapWidget == null) {
      close();
    } else {
      setMapImpl(mapWidget.getJso());
    }
  }

  private final native void setMapImpl(MapImpl map) /*-{
    this.setMap(map);
  }-*/;

  /**
   * set Map
   * 
   * @param pano
   */
  public final void setMap(StreetViewPanoramaWidget pano) {
    setMapImpl(pano.getJso());
  }

  private final native void setMapImpl(StreetViewPanoramaImpl pano) /*-{
    this.setMap(pano);
  }-*/;

  /**
   * set Options
   * 
   * @param options
   */
  public final native void setOptions(MarkerOptions options) /*-{
    this.setOptions(options);
  }-*/;

  /**
   * set Position
   * 
   * @param latlng
   */
  public final native void setPosition(LatLng latlng) /*-{
    this.setPosition(latlng);
  }-*/;

  /**
   * set Shadow
   * 
   * @param shadow
   */
  public final native void setShadow(String shadow) /*-{
    this.setShadow(shadow);
  }-*/;

  /**
   * set shadow using a {@link MarkerImage}
   * 
   * @param markerImage
   */
  public final native void setShadow(MarkerImage markerImage) /*-{
    this.setShadow(markerImage);
  }-*/;
  
  /**
   * set shadow using a {@link Symbol}
   * 
   * @param markerImage
   */
  public final native void setShadow(Symbol symbol) /*-{
    this.setShadow(markerImage);
  }-*/;

  /**
   * set Shape
   * 
   * @param shape
   */
  public final native void setShape(MarkerShape shape) /*-{
    this.setShape(shape);
  }-*/;

  /**
   * set Title
   * 
   * @param title
   */
  public final native void setTitle(String title) /*-{
    this.setTitle(title);
  }-*/;

  /**
   * set Visible
   * 
   * @param visible
   */
  public final native void setVisible(boolean visible) /*-{
    this.setVisible(visible);
  }-*/;

  /**
   * set Z index
   * 
   * @param number
   */
  public final native void setZindex(int number) /*-{
    this.setZIndex(number);
  }-*/;

  /**
   * The maximum default z-index that the API will assign to a marker. You may set a higher z-index to bring a marker to
   * the front.
   */
  public final native int getMax_Zindex() /*-{
    return $wnd.google.maps.Marker.MAX_ZINDEX;
  }-*/;

  /**
   * This event is fired when the marker's animation property changes.
   * 
   * @param handler
   */
  public final HandlerRegistration addAnimationChangeHandler(AnimationChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.ANIMATION_CHANGED, handler,
        new AnimationChangeEventFormatter());
  }

  /**
   * This event is fired when the marker icon was clicked.
   * 
   * @param handler
   */
  public final HandlerRegistration addClickHandler(ClickMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.CLICK, handler, new ClickEventFormatter());
  }

  /**
   * This event is fired when the marker's clickable property changes.
   * 
   * @param handler
   */
  public final HandlerRegistration addClickableChangeHandler(ClickableChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.CLICKABLE_CHANGED, handler,
        new ClickableChangeEventFormatter());
  }

  /**
   * This event is fired when the marker's cursor property changes.
   * 
   * @param handler
   */
  public final HandlerRegistration addCursorChangeHandler(CursorChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.CURSOR_CHANGED, handler,
        new CursorChangeEventFormatter());
  }

  /**
   * This event is fired when the marker icon was double clicked.
   * 
   * @param handler
   */
  public final HandlerRegistration addDblClickHandler(DblClickMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.DBLCLICK, handler, new DblClickEventFormatter());
  }

  /**
   * This event is repeatedly fired while the user drags the marker.
   * 
   * @param handler
   */
  public final HandlerRegistration addDragHandler(DragMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.DRAG, handler, new DragEventFormatter());
  }

  /**
   * This event is fired when the user stops dragging the marker.
   * 
   * @param handler
   */
  public final HandlerRegistration addDragEndHandler(DragEndMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.DRAGEND, handler, new DragEndEventFormatter());
  }

  /**
   * This event is fired when the marker's draggable property changes.
   * 
   * @param handler
   */
  public final HandlerRegistration addDraggableChangeHandler(DraggableChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.DRAGGABLE_CHANGED, handler,
        new DraggableChangeEventFormatter());
  }

  /**
   * This event is fired when the user starts dragging the marker.
   * 
   * @param handler
   */
  public final HandlerRegistration addDragStartHandler(DragStartMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.DRAGSTART, handler, new DragStartEventFormatter());
  }

  /**
   * This event is fired when the marker's flat property changes.
   * 
   * @param handler
   */
  public final HandlerRegistration addFlatChangeHandler(FlatChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.FLAT_CHANGED, handler, new FlatChangeEventFormatter());
  }

  /**
   * This event is fired when the marker icon property changes.
   * 
   * @param handler
   */
  public final HandlerRegistration addIconChangeHandler(IconChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.ICON_CHANGED, handler, new IconChangeEventFormatter());
  }

  /**
   * This event is fired for a mousedown on the marker.
   * 
   * @param handler
   */
  public final HandlerRegistration addMouseDownHandler(MouseDownMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEDOWN, handler, new MouseDownEventFormatter());
  }

  /**
   * This event is fired when the mouse leaves the area of the marker icon.
   * 
   * @param handler
   */
  public final HandlerRegistration addMouseOutMoveHandler(MouseOutMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEOUT, handler, new MouseOutEventFormatter());
  }

  /**
   * This event is fired when the mouse enters the area of the marker icon.
   * 
   * @param handler
   */
  public final HandlerRegistration addMouseOverHandler(MouseOverMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEOVER, handler, new MouseOverEventFormatter());
  }

  /**
   * This event is fired for a mouseup on the marker.
   * 
   * @param handler
   */
  public final HandlerRegistration addMouseUpHandler(MouseUpMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.MOUSEUP, handler, new MouseUpEventFormatter());
  }

  /**
   * This event is fired when the marker position property changes.
   * 
   * @param handler
   */
  public final HandlerRegistration addProjectionChangeHandler(ProjectionChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.PROJECTION_CHANGED, handler,
        new ProjectionChangeEventFormatter());
  }

  /**
   * This event is fired for a rightclick on the marker.
   * 
   * @param handler
   */
  public final HandlerRegistration addRightClickHandler(RightClickMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.RIGHTCLICK, handler, new RightClickEventFormatter());
  }

  /**
   * This event is fired when the marker's shadow property changes.
   * 
   * @param handler
   */
  public final HandlerRegistration addShadowChangeHandler(ShadowChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.SHADOW_CHANGED, handler,
        new ShadowChangeEventFormatter());
  }

  /**
   * This event is fired when the marker's shape property changes.
   * 
   * @param handler
   */
  public final HandlerRegistration addShapeChangeHandler(ShapeChangeMapHandler handler) {
    return MapHandlerRegistration
        .addHandler(this, MapEventType.SHAPE_CHANGED, handler, new ShapeChangeEventFormatter());
  }

  /**
   * This event is fired when the marker title property changes.
   * 
   * @param handler
   */
  public final HandlerRegistration addTitleChangeHandler(TitleChangeMapHandler handler) {
    return MapHandlerRegistration
        .addHandler(this, MapEventType.TITLE_CHANGED, handler, new TitleChangeEventFormatter());
  }

  /**
   * This event is fired when the marker's visible property changes.
   * 
   * @param handler
   */
  public final HandlerRegistration addVisibleChangeHandler(VisibleChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.VISIBLE_CHANGED, handler,
        new VisibleChangeEventFormatter());
  }

  /**
   * This event is fired when the marker's zIndex property changes.
   * 
   * @param handler
   */
  public final HandlerRegistration addZindexChangeHandler(ZindexChangeMapHandler handler) {
    return MapHandlerRegistration.addHandler(this, MapEventType.ZINDEX_CHANGED, handler,
        new ZindexChangeEventFormatter());
  }

  /**
   * Close the marker. Clear the marker from the map.
   */
  public final native void close() /*-{
    this.setMap();
  }-*/;

  /**
   * Close the marker. Clear the marker from the map.
   */
  public final native void clear() /*-{
    this.setMap();
  }-*/;

}