package com.google.gwt.maps.client.events.visible;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class VisibleChangeMapEvent extends MapEvent<VisibleChangeMapHandler, VisibleChangeMapEvent> {

  public static Type<VisibleChangeMapHandler> TYPE = new Type<VisibleChangeMapHandler>();
  
  public VisibleChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<VisibleChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(VisibleChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
