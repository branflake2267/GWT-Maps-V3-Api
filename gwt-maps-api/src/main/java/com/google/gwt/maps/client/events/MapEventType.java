package com.google.gwt.maps.client.events;

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

/**
 * possible observable event types
 * 
 * {@link MapHandlerRegistration} uses these events. (Also find trigger here too)
 * 
 */
public enum MapEventType {

  ANIMATION_CHANGED,

  BOUNDS_CHANGED,

  CENTER_CHANGED,

  CHANNELNUMBER_CHANGED,

  CIRCLECOMPLETE,

  CLICK,

  CLICKABLE_CHANGED,

  CLOSECLICK,

  CONTENT_CHANGED,

  CURSOR_CHANGED,

  DBLCLICK,

  DEFAULTVIEWPORT_CHANGED,

  DIRECTIONS_CHANGED,

  DOMREADY,

  DRAG,

  DRAGEND,

  DRAGGABLE_CHANGED,

  DRAGSTART,

  FLAT_CHANGED,

  FORMAT_CHANGED,

  HEADING_CHANGED,

  ICON_CHANGED,

  IDLE,

  INSERT_AT,

  LINKS_CHANGED,

  MAP_CHANGED,

  MAPTYPEID_CHANGED,

  MARKERCOMPLETE,

  MOUSEDOWN,

  MOUSEMOVE,

  MOUSEOUT,

  MOUSEOVER,

  MOUSEUP,

  OVERLAYCOMPLETE,

  PANO_CHANGED,

  PLACE_CHANGED,

  POLYGONCOMPLETE,

  POLYLINECOMPLETE,

  POSITION_CHANGED,

  POV_CHANGED,

  PROJECTION_CHANGED,

  RADIUS_CHANGED,

  RECTANGLECOMPLETE,

  REMOVE_AT,

  RESIZE,

  RIGHTCLICK,

  SET_AT,

  SHADOW_CHANGED,

  SHAPE_CHANGED,

  TILESLOADED,

  TITLE_CHANGED,

  TILT_CHANGED,

  VISIBLE_CHANGED,

  ZINDEX_CHANGED,

  ZOOM_CHANGED;

  public String value() {
    return name().toLowerCase();
  }

  public static MapEventType fromValue(String type) {
    return valueOf(type.toUpperCase());
  }

  public String toString() {
    return name().toLowerCase();
  }
  
}