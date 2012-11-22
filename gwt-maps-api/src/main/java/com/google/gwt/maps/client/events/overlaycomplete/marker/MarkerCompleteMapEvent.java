package com.google.gwt.maps.client.events.overlaycomplete.marker;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.ajaxloader.client.Properties.TypeException;
import com.google.gwt.maps.client.drawinglib.OverlayType;
import com.google.gwt.maps.client.events.MapEvent;
import com.google.gwt.maps.client.overlays.Marker;

public class MarkerCompleteMapEvent extends MapEvent<MarkerCompleteMapHandler, MarkerCompleteMapEvent> {

  public static Type<MarkerCompleteMapHandler> TYPE = new Type<MarkerCompleteMapHandler>();

  public MarkerCompleteMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<MarkerCompleteMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(MarkerCompleteMapHandler handler) {
    handler.onEvent(this);
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
  
}
