package com.google.gwt.maps.client.events.flat;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class FlatChangeMapEvent extends MapEvent<FlatChangeMapHandler, FlatChangeMapEvent> {

  public static Type<FlatChangeMapHandler> TYPE = new Type<FlatChangeMapHandler>();
  
  public FlatChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<FlatChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(FlatChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
