package com.google.gwt.maps.client.events.overlaycomplete;

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

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.ajaxloader.client.Properties.TypeException;
import com.google.gwt.maps.client.drawinglib.OverlayType;
import com.google.gwt.maps.client.events.MapEvent;
import com.google.gwt.maps.client.overlays.Circle;
import com.google.gwt.maps.client.overlays.Marker;
import com.google.gwt.maps.client.overlays.Polygon;
import com.google.gwt.maps.client.overlays.Polyline;
import com.google.gwt.maps.client.overlays.Rectangle;

public class OverlayCompleteMapEvent extends MapEvent<OverlayCompleteMapHandler, OverlayCompleteMapEvent> {

  public static Type<OverlayCompleteMapHandler> TYPE = new Type<OverlayCompleteMapHandler>();

  public OverlayCompleteMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<OverlayCompleteMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(OverlayCompleteMapHandler handler) {
    handler.onEvent(this);
  }

  public OverlayType getOverlayType() {
    String type = null;
    try {
      type = properties.getString("type");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    if (type == null) {
      return null;
    }
    return OverlayType.fromValue(type);
  }

  public Circle getCircle() {
    Circle overlay = null;
    try {
      overlay = (Circle) properties.getObject("overlay");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return overlay;
  }

  public Marker getMarker() {
    Marker overlay = null;
    try {
      overlay = (Marker) properties.getObject("overlay");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return overlay;
  }

  public Polygon getPolygon() {
    Polygon overlay = null;
    try {
      overlay = (Polygon) properties.getObject("overlay");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return overlay;
  }

  public Polyline getPolyline() {
    Polyline overlay = null;
    try {
      overlay = (Polyline) properties.getObject("overlay");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return overlay;
  }

  public Rectangle getRectangle() {
    Rectangle overlay = null;
    try {
      overlay = (Rectangle) properties.getObject("overlay");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return overlay;
  }

}
