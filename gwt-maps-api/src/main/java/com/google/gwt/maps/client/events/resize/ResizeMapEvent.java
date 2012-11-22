package com.google.gwt.maps.client.events.resize;

import com.google.gwt.ajaxloader.client.Properties;
import com.google.gwt.maps.client.events.MapEvent;

public class ResizeMapEvent extends MapEvent<ResizeMapHandler, ResizeMapEvent> {

  public static Type<ResizeMapHandler> TYPE = new Type<ResizeMapHandler>();
  
  public ResizeMapEvent(Properties properties) {
    super(properties);
  }

  @Override
  public com.google.gwt.event.shared.GwtEvent.Type<ResizeMapHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(ResizeMapHandler handler) {
    handler.onEvent(this);
  }
  
}
