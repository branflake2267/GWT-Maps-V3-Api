package com.google.gwt.maps.client.events.idle;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class IdleMapEvent extends MapEvent<IdleMapHandler, IdleMapEvent> {

  public static Type<IdleMapHandler> TYPE = new Type<IdleMapHandler>();
  
  public IdleMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<IdleMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(IdleMapHandler handler) {
    handler.onEvent(this);
  }
  
}
