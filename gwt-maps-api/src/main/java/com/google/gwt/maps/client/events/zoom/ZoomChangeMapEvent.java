package com.google.gwt.maps.client.events.zoom;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class ZoomChangeMapEvent extends MapEvent<ZoomChangeMapHandler, ZoomChangeMapEvent> {

  public static Type<ZoomChangeMapHandler> TYPE = new Type<ZoomChangeMapHandler>();
  
  public ZoomChangeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<ZoomChangeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(ZoomChangeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
