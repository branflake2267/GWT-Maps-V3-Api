package com.google.gwt.maps.client.events.overlaycomplete;

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
    return overlay ;
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
    return overlay ;
  }
  
  public Polyline getPolyline() {
    Polyline overlay = null;
    try {
      overlay = (Polyline) properties.getObject("overlay");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return overlay ;
  }
  
  public Rectangle getRectangle() {
    Rectangle overlay = null;
    try {
      overlay = (Rectangle) properties.getObject("overlay");
    } catch (TypeException e) {
      e.printStackTrace();
    }
    return overlay ;
  }
  
}
