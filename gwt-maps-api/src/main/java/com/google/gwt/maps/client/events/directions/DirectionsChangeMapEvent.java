package com.google.gwt.maps.client.events.directions;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class DirectionsChangeMapEvent extends MapEvent<DirectionsChangeMapHandler, DirectionsChangeMapEvent> {

  public static Type<DirectionsChangeMapHandler> TYPE = new Type<DirectionsChangeMapHandler>();
  
  public DirectionsChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<DirectionsChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(DirectionsChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
