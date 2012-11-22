package com.google.gwt.maps.client.events.overlaycomplete.polyline;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.ajaxloader.client.Properties.TypeException;
import com.google.gwt.maps.client.events.MapEvent;
import com.google.gwt.maps.client.overlays.Polyline;

public class PolylineCompleteMapEvent extends MapEvent<PolylineCompleteMapHandler, PolylineCompleteMapEvent> {

  public static Type<PolylineCompleteMapHandler> TYPE = new Type<PolylineCompleteMapHandler>();

  public PolylineCompleteMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<PolylineCompleteMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(PolylineCompleteMapHandler handler) {
    handler.onEvent(this);
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
  
}
