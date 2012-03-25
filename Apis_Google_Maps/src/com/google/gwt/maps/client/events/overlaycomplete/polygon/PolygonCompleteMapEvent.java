package com.google.gwt.maps.client.events.overlaycomplete.polygon;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.ajaxloader.client.Properties.TypeException;
import com.google.gwt.maps.client.events.MapEvent;
import com.google.gwt.maps.client.overlays.Polygon;

public class PolygonCompleteMapEvent extends MapEvent<PolygonCompleteMapHandler, PolygonCompleteMapEvent> {

  public static Type<PolygonCompleteMapHandler> TYPE = new Type<PolygonCompleteMapHandler>();

  public PolygonCompleteMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<PolygonCompleteMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(PolygonCompleteMapHandler handler) {
    handler.onEvent(this);
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
  
}
