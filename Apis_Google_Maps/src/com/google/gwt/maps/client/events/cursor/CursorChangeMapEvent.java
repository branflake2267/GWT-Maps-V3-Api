package com.google.gwt.maps.client.events.cursor;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class CursorChangeMapEvent extends MapEvent<CursorChangeMapHandler, CursorChangeMapEvent> {

  public static Type<CursorChangeMapHandler> TYPE = new Type<CursorChangeMapHandler>();
  
  public CursorChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<CursorChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(CursorChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
