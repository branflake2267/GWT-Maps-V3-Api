package com.google.gwt.maps.client.events.position;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class PositionChangeMapEvent extends MapEvent<PositionChangeMapHandler, PositionChangeMapEvent> {

  public static Type<PositionChangeMapHandler> TYPE = new Type<PositionChangeMapHandler>();
  
  public PositionChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<PositionChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(PositionChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
